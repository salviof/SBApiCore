/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.acao;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoController;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoControllerEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoSecundaria;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoGerenciarEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.fabricas.FabTipoAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.fabricas.FabTipoAcaoSistemaGenerica;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.ItfMensagem;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabricaAcoes;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCaminhoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCaminhoCampoInvalido;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfAssistenteDeLocalizacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.TipoOrganizacaoDadosEndereco;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.coletivojava.fw.utilCoreBase.UtilCRCStringFiltrosSimples;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

/**
 *
 * @author desenvolvedor
 */
public class AcaoTransient implements ComoAcaoDoSistema {

    @InfoCampo(tipo = FabTipoAtributoObjeto.NOME)
    private String nomeAcao;
    @InfoCampo(tipo = FabTipoAtributoObjeto.ICONE)
    private String iconeAcao;
    @InfoCampo(tipo = FabTipoAtributoObjeto.COR)
    private String cor;
    private String descricao;

    public AcaoTransient() {
    }

    public AcaoTransient(String nomeAcao, String iconeAcao) {
        this.nomeAcao = nomeAcao;
        this.iconeAcao = iconeAcao;

    }

    public AcaoTransient(String nomeAcao, String iconeAcao, String descricao) {
        this.nomeAcao = nomeAcao;
        this.iconeAcao = iconeAcao;

        this.descricao = descricao;
    }

    public AcaoTransient(String nomeAcao, String iconeAcao, String cor, String descricao) {
        this.nomeAcao = nomeAcao;
        this.iconeAcao = iconeAcao;
        this.cor = cor;
        this.descricao = descricao;
    }

    @Override
    public void setNomeAcao(String pNome) {
        nomeAcao = pNome;

    }

    @Override
    public String getNomeAcao() {
        return nomeAcao;
    }

    @Override
    public String getIconeAcao() {
        return iconeAcao;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String pDescricao) {
        descricao = pDescricao;
    }

    @Override
    public boolean isPrecisaPermissao() {
        return false;
    }

    @Override
    public void setId(Long pId) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setIconeAcao(String pIcone) {
        iconeAcao = pIcone;
    }

    @Override
    public void setModuloAcaoSistema(ItfModuloAcaoSistema pmodulo) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItfModuloAcaoSistema getModulo() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isConfigurado() {
        return true;
    }

    @Override
    public String getNomeUnico() {

        String nomeModulo = UtilCRCStringFiltrosSimples.gerarUrlAmigavel(getModulo().getNome());
        String nomeAcao = toString();
        return nomeModulo + "." + nomeAcao;

    }

    @Override
    public String getNomeEnumOriginal() {
        return null;
    }

    @Override
    public FabTipoAcaoSistema getTipoAcaoSistema() {
        return FabTipoAcaoSistema.ACAO_DO_SISTEMA;
    }

    @Override
    public ComoFabricaAcoes getEnumAcaoDoSistema() {
        return null;
    }

    @Override
    public void configurarPropriedadesBasicas(ComoAcaoDoSistema pAcaoDoSistema) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getIdDescritivoJira() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setIdDescritivoJira(String pIdJira) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrecisaPermissao(boolean pPermissao) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FabTipoAcaoSistemaGenerica getTipoAcaoGenerica() {
        return null;
    }

    @Override
    public boolean isUmaAcaoFormulario() {
        return false;
    }

    @Override
    public boolean isTemAcaoPrincipal() {
        return false;
    }

    @Override
    public boolean isUmaAcaoGenerica() {
        return false;
    }

    @Override
    public boolean isUmaAcaoGestaoDominio() {
        return false;
    }

    @Override
    public boolean isUmaAcaoSessaoMenu() {
        return false;
    }

    @Override
    public boolean isUmaAcaoDeEntidade() {
        return false;
    }

    @Override
    public boolean isUmaAcaoController() {
        return false;
    }

    @Override
    public String getNomeDominio() {
        return null;
    }

    @Override
    public ItfAcaoFormulario getComoFormulario() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItfAcaoFormularioEntidade getComoFormularioEntidade() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItfAcaoGerenciarEntidade getComoGestaoEntidade() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ComoAcaoController getComoController() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ComoAcaoSecundaria getComoSecundaria() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ComoAcaoControllerEntidade getComoControllerEntidade() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItfAcaoGerenciarEntidade getAcaoDeGestaoEntidade() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAcaoTemModal() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNomeUnicoSlug() {
        return getNomeUnico();
    }

    @Override
    public boolean validar() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNome(String pNome) {
        nomeAcao = pNome;
    }

    @Override
    public List<ItfMensagem> validarComMensagens() {
        return new ArrayList<>();
    }

    @Override
    public boolean uploadFotoTodosFormatos(InputStream pStream) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean uploadFotoTamanhoPequeno(InputStream pStream) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean uploadFotoTamanhoMedio(InputStream pStream) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean uploadFotoTamanhoGrande(InputStream pStream) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean uploadArquivoDeEntidade(ItfCampoInstanciado prcampo, byte[] pStream, String pNomeArquivo) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSlugIdentificador() {
        return getNomeUnico();
    }

    @Override
    public String getNomeCurto() {
        return nomeAcao;
    }

    @Override
    public String getNome() {
        return nomeAcao;
    }

    @Override
    public String getIconeDaClasse() {
        return iconeAcao;

    }

    @Override
    public String getXhtmlVisao() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Long getId() {
        return -1l;
    }

    @Override
    public String getImgPequena() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Long configIDPeloNome() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNomeDoObjeto() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNomeDoObjetoPlural() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionarItemNaLista(String nomeDaLista) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isTemCampoAnotado(FabTipoAtributoObjeto pCampo) {
        return false;
    }

    @Override
    public void adicionarJustificativaExecucaoAcao(ComoAcaoDoSistema pAcao, String pJustificativa) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getJustificativa(ComoAcaoDoSistema pAcao) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void prepararNovoObjeto(Object... parametros) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItfCampoInstanciado> getCamposInstanciados() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionarSubItem(String pNomeCampo) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItfAssistenteDeLocalizacao getAssistenteLocalizacao(ItfCampoInstanciado pCampoInst, TipoOrganizacaoDadosEndereco pTipo) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionarAssitenteLocalizacao(ItfAssistenteDeLocalizacao pLocalizacao) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void copiaDados(Object pObjetoReferencia) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItfCampoInstanciado> getCamposInstaciadosInvalidos() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItfCampoInstanciado getCampoByNomeOuAnotacao(String pNome) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItfCampoInstanciado getCampoInstanciadoByNomeOuAnotacao(String pNome) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItfCampoInstanciado getCampoByCaminhoCampo(ItfCaminhoCampo pNome) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValorCampoByCaminhoCampo(ItfCaminhoCampo pNome) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItfCaminhoCampo> getEntidadesVinculadas() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ComoEntidadeSimples getBeanSimplesPorNomeCampo(String pNomeCampo) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ComoEntidadeSimples getItemPorCaminhoCampo(ItfCaminhoCampo pCaminho) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ComoEntidadeSimples> getListaPorCaminhoCampo(ItfCaminhoCampo pCaminho) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItfCaminhoCampoInvalido> getCamposInvalidos() {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Field getCampoReflexaoByAnotacao(FabTipoAtributoObjeto pInfoCampo) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNomeCampo(FabTipoAtributoObjeto pInfocampo) {
        throw new UnsupportedOperationException("A Ação transient, não suporta este método"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getIcone() {
        return iconeAcao;
    }

    @Override
    public ItfCampoInstanciado getCampoInstanciadoByAnotacao(FabTipoAtributoObjeto pTipocampo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isTemImagemPequenaAdicionada() {
        return false;
    }

    @Override
    public String getXhtmlVisaoMobile() {
        return "";
    }

    @Override
    public String getXhtmlVisao(int numeroColunas) {
        return "";
    }

}
