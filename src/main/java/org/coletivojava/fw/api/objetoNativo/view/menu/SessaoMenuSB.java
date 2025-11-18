/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.view.menu;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoController;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoControllerEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoSecundaria;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoSessaoCategoria;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoGerenciarEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.fabricas.FabTipoAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.fabricas.FabTipoAcaoSistemaGenerica;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.ItfMensagem;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabricaAcoes;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCaminhoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCaminhoCampoInvalido;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfAssistenteDeLocalizacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.acao.AcaoTransient;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.TipoOrganizacaoDadosEndereco;

import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ComoSessaoDeMenuSB;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

/**
 *
 * Aramezena uma sessaão do sistema, contendo ações e outras sessoes
 *
 * @author <a href="mailto:salviof@gmail.com">Salvio Furbino</a>
 * @since 08/01/2016
 * @version 1.0
 *
 */
public class SessaoMenuSB implements ComoSessaoDeMenuSB, Serializable {

    private ComoAcaoDoSistema acaoSessao;
    private final List<ComoAcaoDoSistema> acoes;
    private List<SessaoMenuSB> sessoes = new ArrayList<>();

    @Override
    public List<ComoAcaoDoSistema> getAcoes() {
        return (List) acoes;
    }

    public void addAcao(ComoFabricaAcoes pAcao) {
        this.addAcao(pAcao.getRegistro());
    }

    public void addAcao(ComoAcaoDoSistema pAcao) {
        if (pAcao == null) {
            throw new UnsupportedOperationException("A ação adicionada na sessao não pode ser nula");
        }
        if (pAcao instanceof SessaoMenuSB) {
            sessoes.add((SessaoMenuSB) pAcao);
        } else {
            acoes.add(pAcao);

        }
    }

    public SessaoMenuSB(String pnomeSessao, String icone) {
        acaoSessao = new AcaoTransient();
        acaoSessao.setNome(pnomeSessao);
        acaoSessao.setIconeAcao(icone);

        if (acaoSessao.getIconeAcao() == null) {
            acaoSessao.setIconeAcao("fa fa-list-alt");
        }
        acoes = new ArrayList<>();
    }

    public SessaoMenuSB(ComoAcaoDoSistema pAcaoSessao) {
        acaoSessao = new AcaoTransient();
        acaoSessao.setNome(pAcaoSessao.getNomeAcao());
        acaoSessao.setIconeAcao(pAcaoSessao.getIconeAcao());

        if (acaoSessao.getIconeAcao() == null) {
            acaoSessao.setIconeAcao("fa fa-list-alt");
        }
        acoes = new ArrayList<>();
    }

    @Override
    public String getNomeAcao() {
        return acaoSessao.getNomeAcao();
    }

    @Override
    public String getIconeAcao() {
        return acaoSessao.getIconeAcao();
    }

    @Override
    public String getCor() {
        return acaoSessao.getCor();
    }

    @Override
    public String getDescricao() {
        return acaoSessao.getDescricao();
    }

    @Override
    public ItfModuloAcaoSistema getModulo() {
        return acaoSessao.getModulo();
    }

    @Override
    public boolean isPrecisaPermissao() {
        return acaoSessao.isPrecisaPermissao();
    }

    @Override
    public void setId(Long pId) {
        acaoSessao.setId(pId);
    }

    public void setIdMetodo(Long pID) {
        acaoSessao.setId(pID);
    }

    @Override
    public void setModuloAcaoSistema(ItfModuloAcaoSistema pmodulo) {
        acaoSessao.setModuloAcaoSistema(pmodulo);
    }

    @Override
    public String getImgPequena() {
        return acaoSessao.getImgPequena();
    }

    @Override
    public String getNomeCurto() {
        return acaoSessao.getNomeCurto();
    }

    @Override
    public Long getId() {
        return acaoSessao.getId();
    }

    @Override
    public String getNomeCampo(FabTipoAtributoObjeto pInfocampo) {
        return null;
    }

    public Field getCampo(FabTipoAtributoObjeto pInfoCampo) {
        return null;
    }

    @Override
    public void setIconeAcao(String pIcone) {
        acaoSessao.setIconeAcao(pIcone);
    }

    @Override
    public boolean isConfigurado() {
        return acaoSessao.isConfigurado();
    }

    public ComoAcaoDoSistema getAcaoPrincipal() {
        if (acaoSessao.isTemAcaoPrincipal()) {
            return ((ComoAcaoSecundaria) acaoSessao).getAcaoPrincipal();
        }
        return null;
    }

    public void validarAcao(boolean pValidarSeNaoConfigurado) {
        boolean resultado = true;
    }

    public void setIsAcaoPrincipal(boolean pisAcaoPrincipal) {
        System.out.println("Nada a fazer, tentativa de setar ação pricipal em uma sessao");
    }

    public void setAcaoPrincipal(ComoAcaoDoSistema pAcaoPrincipal) {
        System.out.println("Nada a fazer, tentativa de setar ação pricipal em uma sessao");
    }

    public ComoAcaoDoSistema getAcaoSessao() {
        return acaoSessao;
    }

    public void setAcaoSessao(ComoAcaoDoSistema acaoSessao) {
        this.acaoSessao = acaoSessao;
    }

    public void setSessoes(List<SessaoMenuSB> sessoes) {
        this.sessoes = sessoes;
    }

    @Override
    public String getNomeUnico() {
        return acaoSessao.getNomeUnico();
    }

    @Override
    public String getNomeEnumOriginal() {
        return acaoSessao.getNomeEnumOriginal();
    }

    public boolean isCaminhoAutomaticoXHTML() {
        return false;

    }

    @Override
    public List<ComoAcaoSessaoCategoria> getSessoes() {
        return (List) sessoes;

    }

    @Override
    public void setDescricao(String pDescricao) {
        acaoSessao.setDescricao(pDescricao);
    }

    @Override
    public void configurarPropriedadesBasicas(ComoAcaoDoSistema pAcaoDoSistema) {
        acaoSessao.configurarPropriedadesBasicas(pAcaoDoSistema);
    }

    @Override
    public boolean isUmaAcaoFormulario() {
        return acaoSessao.isUmaAcaoFormulario();
    }

    @Override
    public void setNomeAcao(String pNome) {
        acaoSessao.setNomeAcao(pNome);
    }

    @Override
    public FabTipoAcaoSistema getTipoAcaoSistema() {
        return acaoSessao.getTipoAcaoSistema();
    }

    @Override
    public ComoFabricaAcoes getEnumAcaoDoSistema() {
        return acaoSessao.getEnumAcaoDoSistema();
    }

    @Override
    public boolean isTemAcaoPrincipal() {
        return acaoSessao.isTemAcaoPrincipal();
    }

    @Override
    public String getIdDescritivoJira() {
        return acaoSessao.getIdDescritivoJira();
    }

    @Override
    public void setIdDescritivoJira(String pIdJira) {
        acaoSessao.setIdDescritivoJira(pIdJira);
    }

    @Override
    public void setPrecisaPermissao(boolean pPermissao) {
        acaoSessao.setPrecisaPermissao(pPermissao);
    }

    @Override
    public FabTipoAcaoSistemaGenerica getTipoAcaoGenerica() {
        return acaoSessao.getTipoAcaoGenerica();
    }

    @Override
    public boolean isUmaAcaoGenerica() {
        return acaoSessao.isUmaAcaoGenerica();
    }

    @Override
    public boolean isUmaAcaoGestaoDominio() {
        return acaoSessao.isUmaAcaoGestaoDominio();
    }

    @Override
    public String getNome() {
        return acaoSessao.getNome();
    }

    @Override
    public Long configIDPeloNome() {
        return acaoSessao.configIDPeloNome();
    }

    @Override
    public String getNomeDoObjeto() {
        return acaoSessao.getNomeDoObjeto();
    }

    @Override
    public void setNome(String pNome) {
        acaoSessao.setNome(pNome);
    }

    @Override
    public List<ItfCampoInstanciado> getCamposInstaciadosInvalidos() {
        return acaoSessao.getCamposInstaciadosInvalidos();
    }

    @Override
    public ItfCampoInstanciado getCampoByNomeOuAnotacao(String pNome) {
        return acaoSessao.getCampoByNomeOuAnotacao(pNome);
    }

    @Override
    public ItfCampoInstanciado getCampoInstanciadoByNomeOuAnotacao(String pNome) {
        return acaoSessao.getCampoByNomeOuAnotacao(pNome);
    }

    @Override
    public List<ItfCaminhoCampo> getEntidadesVinculadas() {
        return acaoSessao.getEntidadesVinculadas();
    }

    @Override
    public ComoEntidadeSimples getBeanSimplesPorNomeCampo(String pNomeCampo) {
        return acaoSessao.getBeanSimplesPorNomeCampo(pNomeCampo);
    }

    @Override
    public ComoEntidadeSimples getItemPorCaminhoCampo(ItfCaminhoCampo pCaminho) {
        return acaoSessao.getItemPorCaminhoCampo(pCaminho);
    }

    @Override
    public List<ItfCaminhoCampoInvalido> getCamposInvalidos() {
        return acaoSessao.getCamposInvalidos();
    }

    @Override
    public Field getCampoReflexaoByAnotacao(FabTipoAtributoObjeto pInfoCampo) {
        return acaoSessao.getCampoReflexaoByAnotacao(pInfoCampo);
    }

    @Override
    public boolean isUmaAcaoDeEntidade() {
        return acaoSessao.isUmaAcaoDeEntidade();
    }

    @Override
    public boolean isUmaAcaoSessaoMenu() {
        return true;
    }

    @Override
    public String getNomeUnicoSlug() {
        return getNomeCurto() + "-" + getId();
    }

    @Override
    public boolean isUmaAcaoController() {
        return acaoSessao.isUmaAcaoController();
    }

    @Override
    public String getNomeDominio() {
        return acaoSessao.getNomeDominio();
    }

    @Override
    public ItfAcaoFormulario getComoFormulario() {
        return acaoSessao.getComoFormulario();
    }

    @Override
    public ItfAcaoGerenciarEntidade getComoGestaoEntidade() {
        return acaoSessao.getComoGestaoEntidade();
    }

    @Override
    public ComoAcaoController getComoController() {
        return acaoSessao.getComoController();
    }

    @Override
    public ComoAcaoSecundaria getComoSecundaria() {
        return acaoSessao.getComoSecundaria();

    }

    @Override
    public ItfAcaoFormularioEntidade getComoFormularioEntidade() {
        return acaoSessao.getComoFormularioEntidade();
    }

    @Override
    public ComoAcaoControllerEntidade getComoControllerEntidade() {
        return acaoSessao.getComoControllerEntidade();
    }

    @Override
    public List<ComoEntidadeSimples> getListaPorCaminhoCampo(ItfCaminhoCampo pCaminho) {
        return acaoSessao.getListaPorCaminhoCampo(pCaminho);
    }

    @Override
    public ItfCampoInstanciado getCampoByCaminhoCampo(ItfCaminhoCampo pNome) {
        return acaoSessao.getCampoByCaminhoCampo(pNome);
    }

    @Override
    public Object getValorCampoByCaminhoCampo(ItfCaminhoCampo pNome) {
        return acaoSessao.getValorCampoByCaminhoCampo(pNome);
    }

    @Override
    public ItfAcaoGerenciarEntidade getAcaoDeGestaoEntidade() {
        return acaoSessao.getAcaoDeGestaoEntidade();
    }

    @Override
    public void adicionarItemNaLista(String nomeDaLista) {
        throw new UnsupportedOperationException("O método adicionar item em listas do item não foi implementado para sessão de menu "); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getIconeDaClasse() {
        return "fa fa-sitemap";
    }

    @Override
    public String getXhtmlVisao() {
        return acaoSessao.getXhtmlVisao();
    }

    @Override
    public boolean isTemCampoAnotado(FabTipoAtributoObjeto pCampo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validar() {
        return acaoSessao.validar();
    }

    @Override
    public List<ItfMensagem> validarComMensagens() {
        return acaoSessao.validarComMensagens();

    }

    @Override
    public boolean uploadFotoTodosFormatos(InputStream pStream) {
        return acaoSessao.uploadFotoTodosFormatos(pStream);
    }

    @Override
    public boolean uploadFotoTamanhoPequeno(InputStream pStream) {
        return acaoSessao.uploadFotoTamanhoPequeno(pStream);
    }

    @Override
    public boolean uploadFotoTamanhoMedio(InputStream pStream) {
        return acaoSessao.uploadFotoTamanhoMedio(pStream);
    }

    @Override
    public boolean uploadFotoTamanhoGrande(InputStream pStream) {
        return acaoSessao.uploadFotoTamanhoGrande(pStream);
    }

    @Override
    public boolean uploadArquivoDeEntidade(ItfCampoInstanciado prcampo, byte[] pStream, String pNomeArquivo) {
        return acaoSessao.uploadArquivoDeEntidade(prcampo, pStream, pNomeArquivo);
    }

    @Override
    public void adicionarJustificativaExecucaoAcao(ComoAcaoDoSistema pAcao, String pJustificativa) {
        acaoSessao.adicionarJustificativaExecucaoAcao(pAcao, pJustificativa);

    }

    @Override
    public String getJustificativa(ComoAcaoDoSistema pAcao) {
        return acaoSessao.getJustificativa(pAcao);

    }

    @Override
    public void prepararNovoObjeto(Object... parametros) {
        try {
            acaoSessao.prepararNovoObjeto();
        } catch (Throwable t) {
            // SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro preparando objeto de sessão do menu", t);
        }
    }

    @Override
    public String getSlugIdentificador() {
        return acaoSessao.getSlugIdentificador();
    }

    @Override
    public boolean isAcaoTemModal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getIcone() {
        return getIconeAcao();
    }

    @Override
    public List<ItfCampoInstanciado> getCamposInstanciados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionarSubItem(String pNomeCampo) {
        acaoSessao.adicionarItemNaLista(pNomeCampo);
    }

    @Override
    public String getNomeDoObjetoPlural() {
        return "Sessões do menu";
    }

    @Override
    public void adicionarAssitenteLocalizacao(ItfAssistenteDeLocalizacao pLocalizacao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItfAssistenteDeLocalizacao getAssistenteLocalizacao(ItfCampoInstanciado pCampoInst, TipoOrganizacaoDadosEndereco pTipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void copiaDados(Object pObjetoReferencia) {
        acaoSessao.copiaDados(pObjetoReferencia);
    }

    @Override
    public ItfCampoInstanciado getCampoInstanciadoByAnotacao(FabTipoAtributoObjeto pTipocampo) {
        return acaoSessao.getCampoInstanciadoByAnotacao(pTipocampo);
    }

    @Override
    public boolean isTemImagemPequenaAdicionada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getXhtmlVisaoMobile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getXhtmlVisao(int numeroColunas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
