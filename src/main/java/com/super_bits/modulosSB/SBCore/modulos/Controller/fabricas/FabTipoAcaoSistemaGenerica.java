/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.fabricas;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfTipoAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.estadoFormulario.FabEstadoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.TipoAcaoPadrao;
import com.super_bits.modulosSB.SBCore.modulos.Controller.UtilFabricaDeAcoesBasico;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones.FabIconeFontAwesome;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfFabTipoComponenteVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualFormularioDeAcao;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;

/**
 *
 * @author desenvolvedor
 */
public enum FabTipoAcaoSistemaGenerica implements ItfFabrica {

    /**
     * Formulário novo Registro, tags identificadoras: FRM NOVO
     */
    FORMULARIO_NOVO_REGISTRO,
    /**
     * Formulário Edição, tags identificadoras: FRM EDITAR
     */
    FORMULARIO_EDITAR,
    /**
     * Forumulário , tags identificadoras: FRM
     */
    FORMULARIO_PERSONALIZADO,
    /**
     * Formulário visualização de registro: FRM VISUALIZAR
     */
    FORMULARIO_VISUALIZAR,
    /**
     * Formulario listagem de Itens: FRM LISTAR
     */
    FORMULARIO_LISTAR,
    /**
     * Formulario modal, FRM MODAL
     */
    FORMULARIO_MODAL,
    SELECAO_DE_ACAO,
    CONTROLLER_SALVAR_EDICAO,
    CONTROLLER_SALVAR_NOVO,
    CONTROLLER_SALVAR_MODO_MERGE,
    CONTROLLER_PERSONALIZADO,
    /**
     * Ação do tipo alterar status, tags identificadoras CTR ALTERAR STATUS
     */
    CONTROLLER_ATIVAR_DESATIVAR,
    CONTROLLER_ATIVAR,
    CONTROLLER_REMOVER,
    CONTROLLER_DESATIVAR,
    GERENCIAR_DOMINIO;

    public String getnomeXHTMLPadrao(ItfFabricaAcoes pFabAcao) {
        String slugInicial = UtilFabricaDeAcoesBasico.getNomeDominio(pFabAcao);
        slugInicial = slugInicial.toLowerCase();
        switch (this) {
            case FORMULARIO_NOVO_REGISTRO:
                String descritivoFormularionovo = UtilFabricaDeAcoesBasico.getNomeAcaoPosSlugTipoAcao(pFabAcao);
                descritivoFormularionovo = descritivoFormularionovo.replace("NOVO", "");
                if (descritivoFormularionovo.length() > 1) {
                    return slugInicial + "_" + UtilFabricaDeAcoesBasico.getNomeAcaoPosSlugTipoAcao(pFabAcao).toLowerCase() + ".xhtml";
                } else {
                    return slugInicial + "_novo.xhtml";
                }
            case FORMULARIO_EDITAR:
                String descritivoFormularioEdicao = UtilFabricaDeAcoesBasico.getNomeAcaoPosSlugTipoAcao(pFabAcao);
                descritivoFormularioEdicao = descritivoFormularioEdicao.replace("EDITAR", "");
                descritivoFormularioEdicao = descritivoFormularioEdicao.replace("NOVO", "");
                descritivoFormularioEdicao = descritivoFormularioEdicao.replace("VISUALIZAR", "");
                if (descritivoFormularioEdicao.length() > 1) {
                    return slugInicial + "_" + UtilFabricaDeAcoesBasico.getNomeAcaoPosSlugTipoAcao(pFabAcao).toLowerCase() + ".xhtml";
                } else {
                    return slugInicial + "_editar.xhtml";
                }
            case FORMULARIO_PERSONALIZADO:
                String descritivoFormularioPersonalizado = UtilFabricaDeAcoesBasico.getNomeAcaoPosSlugTipoAcao(pFabAcao);
                descritivoFormularioPersonalizado = descritivoFormularioPersonalizado.toLowerCase();
                return slugInicial + "_" + descritivoFormularioPersonalizado + ".xhtml";
            case FORMULARIO_VISUALIZAR:
                return slugInicial + "_visualizar.xhtml";
            case FORMULARIO_LISTAR:
                return slugInicial + "_listar.xhtml";
            case FORMULARIO_MODAL:
                String descritivoModal = UtilFabricaDeAcoesBasico.getNomeAcaoPosSlugTipoAcao(pFabAcao);
                descritivoModal = descritivoModal.toLowerCase();
                return slugInicial + "_modal" + descritivoModal + ".xhtml";
            case SELECAO_DE_ACAO:
                String descritivoSelecao = UtilFabricaDeAcoesBasico.getNomeAcaoPosSlugTipoAcao(pFabAcao);
                descritivoSelecao = descritivoSelecao.toLowerCase();
                return slugInicial + "_selecao" + descritivoSelecao + ".xhtml";
            case GERENCIAR_DOMINIO:
                String descritivoMB = UtilFabricaDeAcoesBasico.getNomeAcaoPosSlugTipoAcao(pFabAcao);
                if (descritivoMB != null && !descritivoMB.isEmpty()) {

                    String caminho = slugInicial + "_" + descritivoMB.toLowerCase() + ".xhtml";

                    return caminho;
                } else {
                    return slugInicial + "_gerenciar.xhtml";
                }

        }
        return null;
    }

    @Override
    public ItfTipoAcaoDoSistema getRegistro() {

        TipoAcaoPadrao acaoPadrao = new TipoAcaoPadrao();

        acaoPadrao.setNomePadrao(this.getNomePadrao());
        acaoPadrao.setDescricaoPadrao(this.getDescricaoPadrao());
        acaoPadrao.setIconePadrao(this.getIconePadrao());

        return acaoPadrao;
    }

    public String getIconePadrao() {

        switch (this) {
            case FORMULARIO_NOVO_REGISTRO:
                return FabIconeFontAwesome.REG_NOVO.getIcone().getTagHtml();
            case FORMULARIO_EDITAR:
                return FabIconeFontAwesome.REG_EDITAR.getIcone().getTagHtml();
            case FORMULARIO_PERSONALIZADO:
                break;
            case FORMULARIO_VISUALIZAR:
                return FabIconeFontAwesome.REG_VISUALIZAR.getIcone().getTagHtml();
            case FORMULARIO_LISTAR:
                return FabIconeFontAwesome.REG_LISTAR.getIcone().getTagHtml();
            case FORMULARIO_MODAL:
                return "fa fa-gear";
            case SELECAO_DE_ACAO:
                return "fa fa-map-signs";
            case CONTROLLER_SALVAR_EDICAO:
                return FabIconeFontAwesome.REG_SALVAR.getIcone().getTagHtml();
            case CONTROLLER_SALVAR_NOVO:
                return FabIconeFontAwesome.REG_SALVAR.getIcone().getTagHtml();
            case CONTROLLER_SALVAR_MODO_MERGE:
                return FabIconeFontAwesome.REG_SALVAR.getIcone().getTagHtml();
            case CONTROLLER_PERSONALIZADO:
                return "fa fa-gear";
            case CONTROLLER_ATIVAR_DESATIVAR:
                return "fa fa-retweet";
            case CONTROLLER_ATIVAR:
                return "fa fa-check";
            case CONTROLLER_REMOVER:
                return "fa fa-minus";
            case CONTROLLER_DESATIVAR:
                return "fa fa-close";
            case GERENCIAR_DOMINIO:
                break;
            default:
                return "fa fa-gear";

        }
        return null;
    }

    public String getNomeFormularioPadrao() {
        switch (this.getAcaoBase()) {
            case FORMULARIO:
                return "formulario";
            case GESTAO:
                return "gestao";
            case CONTROLLER:
                return "modal";
            default:
                throw new AssertionError(this.getAcaoBase().name());

        }

    }

    public String getNomePadrao() {
        switch (this) {
            case FORMULARIO_NOVO_REGISTRO:
                return "Novo ";
            case FORMULARIO_EDITAR:
                return "Editar";
            case FORMULARIO_PERSONALIZADO:
                return "?????";
            case FORMULARIO_VISUALIZAR:
                return "visualizar";
            case FORMULARIO_LISTAR:
                return "Listar";
            case FORMULARIO_MODAL:
                return "????";
            case SELECAO_DE_ACAO:
                return "Escolha";
            case CONTROLLER_SALVAR_EDICAO:
                return "Salvar Alterações";
            case CONTROLLER_SALVAR_NOVO:
                return "Criar Registro";
            case CONTROLLER_SALVAR_MODO_MERGE:
                return "Salvar";
            case CONTROLLER_PERSONALIZADO:
                return "??????";
            case CONTROLLER_ATIVAR_DESATIVAR:
                return "Alterar Status";
            case CONTROLLER_ATIVAR:
                return "Ativar";
            case CONTROLLER_REMOVER:
                return "Remover";
            case CONTROLLER_DESATIVAR:
                return "Desativar";
            case GERENCIAR_DOMINIO:
                return "Gerenciar";
            default:
                throw new AssertionError(this.name());

        }

    }

    public String getDescricaoPadrao() {
        switch (this) {
            case FORMULARIO_NOVO_REGISTRO:
                return "Abre um formulário para criação";
            case FORMULARIO_EDITAR:
                return "Abre um formulário para editar";
            case FORMULARIO_PERSONALIZADO:
                return "?????";
            case FORMULARIO_VISUALIZAR:
                return "Abre um formulário para visualizar ";
            case FORMULARIO_LISTAR:
                return "Abre um formulário listando";
            case FORMULARIO_MODAL:
                return "????";
            case SELECAO_DE_ACAO:
                return "Escolha entre as opções disponíveis";
            case CONTROLLER_SALVAR_EDICAO:
                return "Salvar Alterações";
            case CONTROLLER_SALVAR_NOVO:
                return "Criar Registro";
            case CONTROLLER_SALVAR_MODO_MERGE:
                return "Salva ou cria um registro caso não exista um com este id";
            case CONTROLLER_PERSONALIZADO:
                return "??????";
            case CONTROLLER_ATIVAR_DESATIVAR:
                return "Alterar Status entre Ativo e Inativo";
            case CONTROLLER_ATIVAR:
                return "Marca o registro como ativo";
            case CONTROLLER_REMOVER:
                return "Remove o registro de maneira irreversível";
            case CONTROLLER_DESATIVAR:
                return "Marca o registro como desativado";
            case GERENCIAR_DOMINIO:
                return "Gerencia os registros";
            default:
                throw new AssertionError(this.name());

        }
    }

    public FabTipoAcaoBase getAcaoBase() {
        switch (this) {
            case FORMULARIO_NOVO_REGISTRO:
            case FORMULARIO_EDITAR:
            case FORMULARIO_PERSONALIZADO:
            case FORMULARIO_VISUALIZAR:
            case FORMULARIO_LISTAR:
            case FORMULARIO_MODAL:
            case SELECAO_DE_ACAO:
                return FabTipoAcaoBase.FORMULARIO;
            case CONTROLLER_SALVAR_EDICAO:
            case CONTROLLER_SALVAR_NOVO:
            case CONTROLLER_SALVAR_MODO_MERGE:
            case CONTROLLER_PERSONALIZADO:
            case CONTROLLER_ATIVAR_DESATIVAR:
            case CONTROLLER_ATIVAR:
            case CONTROLLER_REMOVER:
            case CONTROLLER_DESATIVAR:
                return FabTipoAcaoBase.CONTROLLER;
            case GERENCIAR_DOMINIO:
                return FabTipoAcaoBase.GESTAO;
            default:
                throw new AssertionError(this.name());

        }
    }

    public static FabTipoAcaoSistemaGenerica getAcaoGenericaByNome(String nome) {
        FabTipoAcaoSistemaGenerica fabrica = null;

        double porcentagemCoicidencias = 0;
        int numeroDePalavras = 0;

        if (nome.contains("CTR_SALVAR_MERGE")) {
            return CONTROLLER_SALVAR_MODO_MERGE;
        }

        for (FabTipoAcaoSistemaGenerica acaoGenerica : FabTipoAcaoSistemaGenerica.values()) {

            List<String> palavrasChave = acaoGenerica.palavrasChaveIdentificadoras();
            //cd de que? de concidencias!
            int cd = 0;

            for (String plavra : palavrasChave) {
                if (nome.contains("_" + plavra)) {
                    cd++;
                }
            }

            // calculando porcentagem coincidencias:
            if (cd > 0) {
                Double valorPorcentagem = 100D / palavrasChave.size() * cd;
                Double porcentagem = Math.floor(valorPorcentagem.doubleValue());

                switch (acaoGenerica) {

                    case FORMULARIO_PERSONALIZADO:

                    case CONTROLLER_PERSONALIZADO:
                        if (porcentagem >= porcentagemCoicidencias && numeroDePalavras <= cd) {
                            porcentagemCoicidencias = porcentagem;
                            numeroDePalavras = cd;
                            fabrica = acaoGenerica;
                        }
                        break;

                    default:
                        if (porcentagem >= porcentagemCoicidencias && numeroDePalavras < cd) {
                            porcentagemCoicidencias = porcentagem;
                            numeroDePalavras = cd;
                            fabrica = acaoGenerica;
                        }

                }

            }
        }

        if (fabrica == null) {
            throw new UnsupportedOperationException("Não foi possível encontar o Tipo da ação para:" + nome + " certifique que está usando a nomeclatura estabelecida CTR para controller FRM, para formulario, e MB para gestão de ações");
        }

        switch (fabrica) {
            case FORMULARIO_NOVO_REGISTRO:
                if (!nome.contains("FRM_NOVO")) {
                    return FORMULARIO_PERSONALIZADO;
                }
                break;
            case FORMULARIO_EDITAR:
                if (!nome.contains("FRM_EDITAR")) {
                    return FORMULARIO_PERSONALIZADO;
                }
                break;
            case FORMULARIO_VISUALIZAR:
                if (!nome.contains("FRM_VISUALIZAR")) {
                    return FORMULARIO_PERSONALIZADO;
                }
                break;
            case FORMULARIO_LISTAR:
                if (!nome.contains("FRM_LISTAR")) {
                    return FORMULARIO_PERSONALIZADO;
                }
                break;
            case FORMULARIO_MODAL:
                if (nome.contains("_MB")) {
                    return GERENCIAR_DOMINIO;
                }
                if (!nome.contains("FRM_MODAL")) {
                    return FORMULARIO_PERSONALIZADO;
                }
                break;

        }

        return fabrica;

    }

    public List<String> palavrasChaveIdentificadoras() {
        List<String> palavrasChave = new ArrayList<>();
        String PALAVRA_CHAVE_FORMULARIO = FabTipoAcaoSistema.ACAO_FORMULARIO.getStringIdentificadora();
        String PALAVRA_CHAVE_CONTROLLER = FabTipoAcaoSistema.ACAO_CONTROLLER.getStringIdentificadora();
        String PALAVRA_CHAVE_GESTAO = FabTipoAcaoSistema.ACAO_ENTIDADE_GERENCIAR.getStringIdentificadora();
        switch (this) {
            case FORMULARIO_NOVO_REGISTRO:
                palavrasChave.add(PALAVRA_CHAVE_FORMULARIO);
                palavrasChave.add("NOVO");
                break;
            case FORMULARIO_EDITAR:
                palavrasChave.add(PALAVRA_CHAVE_FORMULARIO);
                palavrasChave.add("EDITAR");

                break;
            case FORMULARIO_PERSONALIZADO:
                palavrasChave.add(PALAVRA_CHAVE_FORMULARIO);
                break;
            case FORMULARIO_VISUALIZAR:
                palavrasChave.add(PALAVRA_CHAVE_FORMULARIO);
                palavrasChave.add("VISUALIZAR");
                break;
            case FORMULARIO_LISTAR:
                palavrasChave.add(PALAVRA_CHAVE_FORMULARIO);
                palavrasChave.add("LISTAR");
                break;
            case FORMULARIO_MODAL:
                palavrasChave.add(PALAVRA_CHAVE_FORMULARIO);
                palavrasChave.add("MODAL");
                break;
            case SELECAO_DE_ACAO:
                palavrasChave.add(PALAVRA_CHAVE_FORMULARIO);
                palavrasChave.add("SELECAO_DE_ACAO");

                break;
            case CONTROLLER_SALVAR_EDICAO:
                palavrasChave.add(PALAVRA_CHAVE_CONTROLLER);
                palavrasChave.add("SALVAR");
                palavrasChave.add("EDICAO");
                break;
            case CONTROLLER_SALVAR_NOVO:
                palavrasChave.add(PALAVRA_CHAVE_CONTROLLER);
                palavrasChave.add("NOVO");
                break;
            case CONTROLLER_SALVAR_MODO_MERGE:
                palavrasChave.add(PALAVRA_CHAVE_CONTROLLER);
                palavrasChave.add("MERGE");
                break;
            case CONTROLLER_PERSONALIZADO:
                palavrasChave.add(PALAVRA_CHAVE_CONTROLLER);

                break;
            case CONTROLLER_ATIVAR_DESATIVAR:
                palavrasChave.add(PALAVRA_CHAVE_CONTROLLER);
                palavrasChave.add("STATUS");
                palavrasChave.add("ALTERAR");
                break;
            case CONTROLLER_ATIVAR:
                palavrasChave.add(PALAVRA_CHAVE_CONTROLLER);
                palavrasChave.add("ATIVAR");
                break;
            case CONTROLLER_REMOVER:
                palavrasChave.add(PALAVRA_CHAVE_CONTROLLER);
                palavrasChave.add("REMOVER");
                break;
            case CONTROLLER_DESATIVAR:
                palavrasChave.add(PALAVRA_CHAVE_CONTROLLER);
                palavrasChave.add("DESATIVAR");
                break;
            case GERENCIAR_DOMINIO:
                palavrasChave.add(PALAVRA_CHAVE_GESTAO);
                break;
            default:
                throw new AssertionError(this.name());

        }
        return palavrasChave;
    }

    public ItfFabTipoComponenteVisual getComponentePadrao() {
        try {
            switch (this) {
                case FORMULARIO_NOVO_REGISTRO:

                case FORMULARIO_EDITAR:

                case FORMULARIO_VISUALIZAR:
                case FORMULARIO_PERSONALIZADO:
                case FORMULARIO_MODAL:
                    return FabCompVisualFormularioDeAcao.ACAO_REGISTRO_RESPONSIVO;
                case FORMULARIO_LISTAR:
                    return FabCompVisualFormularioDeAcao.ACAO_LISTAGEM_RESPONSIVA;

                case SELECAO_DE_ACAO:
                //
                case CONTROLLER_SALVAR_EDICAO:

                case CONTROLLER_SALVAR_NOVO:

                case CONTROLLER_SALVAR_MODO_MERGE:

                case CONTROLLER_PERSONALIZADO:

                case CONTROLLER_ATIVAR_DESATIVAR:

                case CONTROLLER_ATIVAR:

                case CONTROLLER_REMOVER:

                case CONTROLLER_DESATIVAR:

                case GERENCIAR_DOMINIO:
                    throw new UnsupportedOperationException("A ação enviada não possui um componente de visualização padrão");
                default:
                    throw new AssertionError(this.name());

            }
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro determinando componente padrão para exibição de ação d eformulario", t);
            return null;
        }

    }

    public FabEstadoFormulario getEstadoFormularioPadrao() {

        switch (this) {

            case FORMULARIO_NOVO_REGISTRO:

                return FabEstadoFormulario.NOVO;

            case FORMULARIO_EDITAR:
            case FORMULARIO_PERSONALIZADO:
            case FORMULARIO_MODAL:
            case SELECAO_DE_ACAO:

                return FabEstadoFormulario.EDITAR;

            case FORMULARIO_VISUALIZAR:
            case FORMULARIO_LISTAR:
            case CONTROLLER_SALVAR_EDICAO:
            case CONTROLLER_SALVAR_NOVO:
            case CONTROLLER_SALVAR_MODO_MERGE:
            case CONTROLLER_PERSONALIZADO:
            case CONTROLLER_ATIVAR_DESATIVAR:
            case CONTROLLER_ATIVAR:
            case CONTROLLER_REMOVER:
            case CONTROLLER_DESATIVAR:
            case GERENCIAR_DOMINIO:

                return FabEstadoFormulario.VISUALIZAR;

            default:
                throw new AssertionError(this.name());

        }

    }

}
