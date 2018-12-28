/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coletivojava.fw.api.objetoNativo;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoSecundaria;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoGerenciarEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.ItfMensagem;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCaminhoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCaminhoCampoInvalido;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.TipoOrganizacaoDadosEndereco;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import org.coletivojava.fw.api.tratamentoErros.ErroPreparandoObjeto;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreReflexaoObjetoSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfAssistenteDeLocalizacao;

/**
 *
 * @author desenvolvedor
 */
public abstract class ObjetoNativoCoreDoSistema implements ItfBeanSimples {

    @Override
    public String getNomeUnicoSlug() {
        String nomeunico = this.getClass().getSimpleName() + "_" + removeCaracteresEspeciais(getNome()) + "_" + getId();
        return nomeunico;
    }

    @Override
    public int hashCode() {
        return getNomeUnicoSlug().hashCode();
    }

    @Override
    public boolean validar() {
        return true;
    }

    @Override
    public List<ItfMensagem> validarComMensagens() {
        LogManager.getLogger(LogPadraoSB.class).debug("Este tipo de objeto não possui validação" + getNomeUnicoSlug());
        return new ArrayList<>();

    }

    private String removeCaracteresEspeciais(String param) {
        if (param == null) {
            return null;
        }
        param = Normalizer.normalize(param, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        param = param.replace("/", "_");

        param = param.replace("\\", "_");
        param = param.replaceAll("[^\\p{ASCII}]", "");
        return param;

    }

    @Override
    public boolean uploadArquivoDeEntidade(ItfCampoInstanciado prcampo, byte[] pStream, String pNomeArquivo) {
        LogManager.getLogger(LogPadraoSB.class).debug("Um objeto de sistem não possui arquivo vinculado");
        return false;
    }

    @Override
    public boolean isTemImagemPequenaAdicionada() {
        LogManager.getLogger(LogPadraoSB.class).debug(getSlugIdentificador() + "Um objeto de sistem não possui imagem associada");
        return false;
    }

    @Override
    public String getSlugIdentificador() {
        return getNomeUnicoSlug();
    }

    @Override
    public String getNomeCurto() {
        return getNome();
    }

    @Override
    @Deprecated
    public String getIconeDaClasse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Deprecated
    public String getXhtmlVisao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Deprecated
    public String getXhtmlVisaoMobile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Deprecated
    public String getXhtmlVisao(int numeroColunas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Deprecated
    public int configIDPeloNome() {
        LogManager.getLogger(LogPadraoSB.class).debug("Um objeto Nativo de sistem não configura id pelo nome, ");
        return getNome().hashCode();
    }

    @Override
    public String getNomeDoObjeto() {
        return UtilSBCoreReflexaoObjetoSimples.getNomeObjeto(this.getClass());
    }

    @Override

    public String getNomeDoObjetoPlural() {
        return UtilSBCoreReflexaoObjetoSimples.getInfoClasseObjeto(this.getClass()).plural();
    }

    @Override
    @Deprecated
    public void adicionarItemNaLista(String nomeDaLista) {
        LogManager.getLogger(LogPadraoSB.class).debug("Um objeto Nativo de sistem suporta adição de subitens de maneira dinamica ");
    }

    @Override
    @Deprecated
    public boolean isTemCampoAnotado(FabTipoAtributoObjeto pCampo) {
        LogManager.getLogger(LogPadraoSB.class).debug("O recurso tem campo anotado não está disponível em objetos nativos do sistema");
        return false;
    }

    @Override
    @Deprecated
    public String getImgPequena() {
        LogManager.getLogger(LogPadraoSB.class).debug("O recurso imagem pequna não está disponível em objetos nativos do sistema");
        return "";
    }

    @Override
    @Deprecated
    public void adicionarJustificativaExecucaoAcao(ItfAcaoDoSistema pAcao, String pJustificativa) {
        LogManager.getLogger(LogPadraoSB.class).debug("O recurso Justificativa não está disponível em objetos nativos do sistema");
    }

    @Override
    @Deprecated
    public String getJustificativa(ItfAcaoDoSistema pAcao) {
        LogManager.getLogger(LogPadraoSB.class).debug("O recurso Justificativa não está disponível em objetos nativos do sistema");
        return "";
    }

    @Override
    @Deprecated
    public void prepararNovoObjeto(Object... parametros) throws ErroPreparandoObjeto {
        LogManager.getLogger(LogPadraoSB.class).debug("O recurso construtor dinamico não é incado para objetos nativos do sistema");
    }

    @Override
    @Deprecated
    public List<ItfCampoInstanciado> getCamposInstanciados() {
        LogManager.getLogger(LogPadraoSB.class).debug("O recurso campo instanciado não é incado para objetos nativos do sistema");
        return new ArrayList<>();
    }

    @Override
    @Deprecated
    public void adicionarSubItem(String pNomeCampo) {
        LogManager.getLogger(LogPadraoSB.class).debug("Um objeto Nativo de sistem suporta adição de subitens de maneira dinamica ");
    }

    @Override
    @Deprecated
    public ItfAssistenteDeLocalizacao getAssistenteLocalizacao(ItfCampoInstanciado pCampoInst, TipoOrganizacaoDadosEndereco pTipo) {
        LogManager.getLogger(LogPadraoSB.class).debug("O recursos assistente de localização não é suportado  por objetos nativos do sistema");
        return null;
    }

    @Override
    @Deprecated
    public void adicionarAssitenteLocalizacao(ItfAssistenteDeLocalizacao pLocalizacao) {
        LogManager.getLogger(LogPadraoSB.class).debug("O recursos assistente de localização não é suportado  por objetos nativos do sistema");
    }

    @Override
    @Deprecated
    public void copiaDados(Object pObjetoReferencia) {
        LogManager.getLogger(LogPadraoSB.class).debug("O recurso cópia não está disponível em objetos do sistema");
    }

    @Override
    @Deprecated
    public List<ItfCampoInstanciado> getCamposInstaciadosInvalidos() {
        LogManager.getLogger(LogPadraoSB.class).debug("o recurso campo instanciado não esta disponível para objetos nativos do sistema");
        return new ArrayList<>();
    }

    @Override
    @Deprecated
    public ItfCampoInstanciado getCampoByNomeOuAnotacao(String pNome) {
        LogManager.getLogger(LogPadraoSB.class).debug("o recurso campo instanciado não esta disponível para objetos nativos do sistema");
        return null;
    }

    @Override
    @Deprecated
    public ItfCampoInstanciado getCampoInstanciadoByNomeOuAnotacao(String pNome) {
        LogManager.getLogger(LogPadraoSB.class).debug("o recurso campo instanciado não esta disponível para objetos nativos do sistema");
        return null;
    }

    @Override
    @Deprecated
    public ItfCampoInstanciado getCampoInstanciadoByAnotacao(FabTipoAtributoObjeto pTipocampo) {
        LogManager.getLogger(LogPadraoSB.class).debug("o recurso campo instanciado não esta disponível para objetos nativos do sistema");
        return null;
    }

    @Override
    @Deprecated
    public ItfCampoInstanciado getCampoByCaminhoCampo(ItfCaminhoCampo pNome) {
        LogManager.getLogger(LogPadraoSB.class).debug("o recurso campo instanciado não esta disponível para objetos nativos do sistema");
        return null;

    }

    @Override
    @Deprecated
    public Object getValorCampoByCaminhoCampo(ItfCaminhoCampo pNome) {
        LogManager.getLogger(LogPadraoSB.class).debug("o recurso campo instanciado não esta disponível para objetos nativos do sistema");
        return null;
    }

    @Override
    @Deprecated
    public List<ItfCaminhoCampo> getEntidadesVinculadas() {
        LogManager.getLogger(LogPadraoSB.class).debug("o recurso campo instanciado não esta disponível para objetos nativos do sistema");
        return new ArrayList<>();
    }

    @Override
    public ItfBeanSimples getBeanSimplesPorNomeCampo(String pNomeCampo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItfBeanSimples getItemPorCaminhoCampo(ItfCaminhoCampo pCaminho) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItfBeanSimples> getListaPorCaminhoCampo(ItfCaminhoCampo pCaminho) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItfCaminhoCampoInvalido> getCamposInvalidos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Field getCampoReflexaoByAnotacao(FabTipoAtributoObjeto pInfoCampo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Deprecated
    public String getNomeCampo(FabTipoAtributoObjeto pInfocampo) {
        LogManager.getLogger(LogPadraoSB.class).debug("o recurso nome Campo por tipo não esta disponível para objetos nativos do sistema");
        return null;
    }

    @Override
    @Deprecated
    public boolean uploadFotoTodosFormatos(InputStream pStream) {
        LogManager.getLogger(LogPadraoSB.class).debug("o recurso Imangens do Objetos não esta disponível para objetos nativos do sistema");
        return false;
    }

    @Override
    @Deprecated
    public boolean uploadFotoTamanhoGrande(InputStream pStream) {
        LogManager.getLogger(LogPadraoSB.class).debug("o recurso Imangens do Objetos não esta disponível para objetos nativos do sistema");
        return false;
    }

    @Override
    @Deprecated
    public boolean uploadFotoTamanhoPequeno(InputStream pStream) {
        LogManager.getLogger(LogPadraoSB.class).debug("o recurso Imangens do Objetos não esta disponível para objetos nativos do sistema");
        return false;
    }

    @Override
    @Deprecated
    public boolean uploadFotoTamanhoMedio(InputStream pStream) {
        LogManager.getLogger(LogPadraoSB.class).debug("o recurso Imangens do Objetos não esta disponível para objetos nativos do sistema");
        return false;
    }

    @Override
    @Deprecated
    public ItfCampoInstanciado getCPinst(String pNomeOuANotacao) {
        LogManager.getLogger(LogPadraoSB.class).debug("o recurso campo instanciado não esta disponível para objetos nativos do sistema");
        return null;
    }

    @Override
    public List<ItfAcaoSecundaria> getAcoesDoContexto(ItfAcaoGerenciarEntidade pGestao) {
        return ItfBeanSimples.super.getAcoesDoContexto(pGestao); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return getSlugIdentificador();
    }

    @Override
    public String getClassePontoIdentificador() {
        return getSlugIdentificador();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ObjetoNativoCoreDoSistema other = (ObjetoNativoCoreDoSistema) obj;
        return true;
    }

}
