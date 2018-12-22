/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoController;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoControllerEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoSecundaria;
import com.super_bits.modulosSB.SBCore.modulos.Controller.fabricas.FabTipoAcaoSistemaGenerica;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanGenerico;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import org.coletivojava.fw.api.tratamentoErros.FabErro;

/**
 *
 *
 *
 *
 * @author desenvolvedor
 */
public interface ItfAcaoGerenciarEntidade extends ItfAcaoEntidade, ItfAcaoFormulario {

    public default ItfAcaoDoSistema getPrimeiraAcaoDesteTipo(FabTipoAcaoSistemaGenerica pTipoAcao) {
        try {
            Optional<ItfAcaoSecundaria> acaoEncontrada
                    = getAcoesVinculadas().stream().filter(acao -> acao.getTipoAcaoGenerica().equals(pTipoAcao)).findFirst();

            if (!acaoEncontrada.isPresent()) {
                return null;
            } else {
                return (ItfAcaoFormularioEntidade) acaoEncontrada.get();
            }
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).fatal("Erro pesquisando ação do tipo " + pTipoAcao, t);

            return null;
        }
    }

    public default List<ItfAcaoDoSistema> getAcoesVinculadasDesteTipo(FabTipoAcaoSistemaGenerica pTipoAcao) {
        try {
            List<ItfAcaoSecundaria> acoesEncontradas = new ArrayList<>();
            getAcoesVinculadas().stream().filter(
                    (acao) -> (acao.getTipoAcaoGenerica().equals(pTipoAcao))).
                    forEach(acoesEncontradas::add);
            return (List) acoesEncontradas;
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).fatal("Erro pesquisando ação do tipo " + pTipoAcao, t);
            return null;
        }
    }

    public default List getAcoesVinculadasDesteTipoComEstaEntidade(FabTipoAcaoSistemaGenerica pTipoAcao, Class pTipoBean) {
        try {
            String classeBeanSelecionado = pTipoBean.getSimpleName();
            List<ItfAcaoSecundaria> acoesEncontradas = new ArrayList<>();
            getAcoesVinculadas().stream().filter(
                    (acao) -> ((acao.isUmaAcaoDeEntidade() && acao.getTipoAcaoGenerica().equals(pTipoAcao)
                    && acao.getComoAcaoDeEntidade().
                            getClasseRelacionada().
                            getSimpleName().equals(classeBeanSelecionado)))).
                    forEach(acoesEncontradas::add);
            return acoesEncontradas;
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).fatal("Erro pesquisando ação do tipo " + pTipoAcao, t);
            return null;
        }
    }

    public default List<ItfAcaoSecundaria> getAcoesVinculadas() {
        try {
            List<ItfAcaoSecundaria> acoesVinculadas = new ArrayList<>();
            if (!getEnumAcoesVinculadas().isEmpty()) {
                getEnumAcoesVinculadas().stream().filter(fab -> fab.getRegistro().isTemAcaoPrincipal()).
                        forEach(fab -> {
                            acoesVinculadas.add(fab.getRegistro().getComoSecundaria());
                        });
            }

            return acoesVinculadas;
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).fatal("Erro criando ações secundárias para+" + getNomeUnico(), t);
            return new ArrayList<>();
        }
    }

    @Deprecated
    public List<ItfAcaoSecundaria> getAcoesVinculadasDoContexto(ItfBeanGenerico pBean);

    public void setAcoesVinculadas(List<ItfAcaoSecundaria> acoesVinculadas);

    public ItfAcaoDoSistema[] getAcoesVinculadasExcetoListarEnovoArray();

    public default List<ItfAcaoSecundaria> getAcoesVinculadasExcetoListarEnovo() {
        List<ItfAcaoSecundaria> acoesVinculadasExcetoListarEnovo = new ArrayList<>();

        getAcoesVinculadas().stream().filter((ac) -> (ac.isAcaoDeRegistroExistente()
                && !ac.getTipoAcaoGenerica().equals(FabTipoAcaoSistemaGenerica.FORMULARIO_NOVO_REGISTRO)
                && !ac.getTipoAcaoGenerica().equals(FabTipoAcaoSistemaGenerica.FORMULARIO_LISTAR)
                && !ac.getTipoAcaoGenerica().equals(FabTipoAcaoSistemaGenerica.CONTROLLER_SALVAR_MODO_MERGE)
                && !ac.getTipoAcaoGenerica().equals(FabTipoAcaoSistemaGenerica.CONTROLLER_SALVAR_EDICAO)
                && !ac.getTipoAcaoGenerica().equals(FabTipoAcaoSistemaGenerica.CONTROLLER_SALVAR_NOVO))).
                forEachOrdered(acoesVinculadasExcetoListarEnovo::add);

        return acoesVinculadasExcetoListarEnovo;

    }

    public default List<ItfAcaoSecundaria> getAcoesVinculadasAObjetoExistente() {
        return getAcoesVinculadasExcetoListarEnovo();
    }

    public default List<ItfAcaoSecundaria> getAcoesVinculadasAObjetoExistenteSemRepetirTipo() {
        List<ItfAcaoSecundaria> lista = new ArrayList<>();
        final List<FabTipoAcaoSistemaGenerica> mapaAdicionado = new ArrayList<>();

        getAcoesVinculadasAObjetoExistente().forEach(ac -> {
            if (!mapaAdicionado.contains(ac.getTipoAcaoGenerica())) {
                lista.add(ac);
                mapaAdicionado.add(ac.getTipoAcaoGenerica());
            }
        });
        return lista;
    }

    public default List<ItfAcaoFormularioEntidade> getAcoesFormularioListagem() {

        return (List) getAcoesVinculadasDesteTipo(FabTipoAcaoSistemaGenerica.FORMULARIO_LISTAR);
    }

    public default List<ItfAcaoFormulario> getAcoesFormulario() {
        try {
            List lista = new ArrayList();
            getAcoesVinculadas().stream().filter(acao -> acao.isUmaAcaoFormulario()).forEach(lista::add);
            return lista;
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro Gerando ações de formulário da gestao" + getNomeUnico(), t);
            return null;
        }
    }

    /**
     *
     * @return O Primeiro formulário do tipo Listagem
     * @see FabTipoAcaoSistemaGenerica#FORMULARIO_LISTAR
     */
    public default ItfAcaoFormularioEntidade getAcaoFormularioListarPadrao() {
        List<ItfAcaoFormularioEntidade> acoesForm = getAcoesFormularioListagem();
        if (acoesForm.isEmpty()) {
            return null;
        } else {
            return acoesForm.get(0);
        }
    }

    public default ItfAcaoFormularioEntidade getAcaoFormularioNovo() {
        try {
            Optional<ItfAcaoSecundaria> acaoEncontrada
                    = getAcoesVinculadas().stream().filter(
                            acao -> acao.getTipoAcaoGenerica().equals(FabTipoAcaoSistemaGenerica.FORMULARIO_NOVO_REGISTRO)).
                            findFirst();

            if (!acaoEncontrada.isPresent()) {
                return null;
            } else {
                return (ItfAcaoFormularioEntidade) acaoEncontrada.get();
            }
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro Obtendo ação de formulário novo", t);
            return null;
        }

    }

    public default ItfAcaoFormularioEntidade getAcaoFormularioEditar() {
        return (ItfAcaoFormularioEntidade) getPrimeiraAcaoDesteTipo(FabTipoAcaoSistemaGenerica.FORMULARIO_EDITAR);
    }

    public default ItfAcaoFormularioEntidade getAcaoFormularioVisualizar() {
        return (ItfAcaoFormularioEntidade) getPrimeiraAcaoDesteTipo(FabTipoAcaoSistemaGenerica.FORMULARIO_VISUALIZAR);
    }

    public default ItfAcaoControllerEntidade getAcaoSalvarMerge() {

        try {
            Optional<ItfAcaoSecundaria> acaoEncontrada
                    = getAcoesVinculadas().stream().filter(acao
                            -> (acao.getTipoAcaoGenerica().equals(FabTipoAcaoSistemaGenerica.CONTROLLER_SALVAR_MODO_MERGE))
                    ).findFirst();

            if (!acaoEncontrada.isPresent()) {
                return null;
            } else {
                return (ItfAcaoControllerEntidade) acaoEncontrada.get();
            }
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro Obtendo ação de formulário novo", t);
            return null;
        }

    }

    public default ItfAcaoControllerEntidade getAcaoSalvarNovo() {

        try {
            Optional<ItfAcaoSecundaria> acaoEncontrada
                    = getAcoesVinculadas().stream().filter(acao
                            -> (acao.getTipoAcaoGenerica().equals(FabTipoAcaoSistemaGenerica.CONTROLLER_SALVAR_NOVO))
                    ).findFirst();

            if (!acaoEncontrada.isPresent()) {
                return null;
            } else {
                return (ItfAcaoControllerEntidade) acaoEncontrada.get();
            }
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro Obtendo ação de formulário novo", t);
            return null;
        }

    }

    public default ItfAcaoController getAcaoAlterarStatus() {
        return (ItfAcaoController) getPrimeiraAcaoDesteTipo(FabTipoAcaoSistemaGenerica.CONTROLLER_ATIVAR_DESATIVAR);
    }

    public default ItfAcaoController getAcaoRemover() {
        return (ItfAcaoController) getPrimeiraAcaoDesteTipo(FabTipoAcaoSistemaGenerica.CONTROLLER_REMOVER);
    }

    public List<ItfFabricaAcoes> getEnumAcoesVinculadas();

    public ItfAcaoDoSistema getSubAcaoByString(String pString);

    public default boolean isTemNovo() {
        return getAcaoFormularioNovo() != null;
    }

    @Deprecated
    public boolean isTemPesquisa();

    public boolean isTemEditar();

    public boolean isTemVisualizar();

    public default boolean isTemAlterarStatus() {
        return !getAcoesVinculadasDesteTipo(FabTipoAcaoSistemaGenerica.CONTROLLER_ATIVAR_DESATIVAR).isEmpty();
    }

    public default boolean isPossuiSubAcaoComPermissao() {
        Optional<ItfAcaoSecundaria> acaoEncontrada
                = getAcoesVinculadas().stream().filter(acao -> acao.isPrecisaPermissao()).findFirst();

        return acaoEncontrada.isPresent();
    }

    public ItfAcaoDoSistema getAcaoCompativelEntidadeDivergente(final ItfAcaoDoSistema pAcao, Class pEntidade);

}
