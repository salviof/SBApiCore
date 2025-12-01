/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.view.componente;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import java.io.Serializable;
import java.util.List;
import org.coletivojava.fw.api.objetoNativo.ObjetoNativoCoreDoSistema;
import org.coletivojava.fw.utilCoreBase.UtilCRCDiretoriosSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeVinculadoAEnum;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComoComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComoFabTipoComponenteVisual;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabrica;

/**
 *
 * @author desenvolvedor
 */
@InfoObjetoSB(tags = {"Componente visual SB"}, plural = "Componentes SB")
public class ComponenteVisualBase extends ObjetoNativoCoreDoSistema implements ComoComponenteVisualSB, ComoEntidadeVinculadoAEnum, Serializable {

    @InfoCampo(tipo = FabTipoAtributoObjeto.ID, label = "Código")
    private Long id;
    @InfoCampo(tipo = FabTipoAtributoObjeto.NOME, label = "Nome")
    private String nome;
    @InfoCampo(tipo = FabTipoAtributoObjeto.DESCRITIVO, label = "Descrição")
    private String descricao;
    private List<Object> parametros;
    private String xhtmlJSF;
    private String xhtmlJsfCaminhoRelativo;
    private String xhtmlAndroid;
    private String htmlWordPress;
    private String nomeComponente;
    private FabFamiliaCompVisual familia;
    private String idHTMLObjetoPrincipal;
    private String classeCSS;
    private ComoFabTipoComponenteVisual fabricaDoComponente;
    private String caminhoFabrica;
    private int pesoLargura = 3;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public List<Object> getParametros() {
        return parametros;
    }

    public void setParametros(List<Object> parametros) {
        this.parametros = parametros;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getXhtmlJSF() {
        return xhtmlJSF;
    }

    public void setXhtmlJSF(String xhtmlJSF) {
        this.xhtmlJSF = xhtmlJSF;
    }

    @Override
    public String getXhtmlAndroid() {
        return xhtmlAndroid;
    }

    public void setXhtmlAndroid(String xhtmlAndroid) {
        this.xhtmlAndroid = xhtmlAndroid;
    }

    @Override
    public String getHtmlWordPress() {
        return htmlWordPress;
    }

    public void setHtmlWordPress(String htmlWordPress) {
        this.htmlWordPress = htmlWordPress;
    }

    @Override
    public String getNomeComponente() {
        return nomeComponente;
    }

    public void setNomeComponente(String nomeComponente) {
        this.nomeComponente = nomeComponente;
    }

    @Override
    public FabFamiliaCompVisual getFamilia() {
        return familia;
    }

    public void setFamilia(FabFamiliaCompVisual familia) {
        this.familia = familia;
    }

    @Override
    public String getIdHTMLObjetoPrincipal() {
        return idHTMLObjetoPrincipal;
    }

    public void setIdHTMLObjetoPrincipal(String idHTMLObjetoPrincipal) {
        this.idHTMLObjetoPrincipal = idHTMLObjetoPrincipal;
    }

    @Override
    public String getClasseCSS() {
        return classeCSS;
    }

    public void setClasseCSS(String ClasseCSS) {
        this.classeCSS = ClasseCSS;
    }

    public String getCaminhoPastaXHTMLJSF() {
        return UtilCRCDiretoriosSimples.getDiretorioMenosXCasas(getXhtmlJSF(), 1);
    }

    public String getNomeArquivoXHTMLJSF() {
        return UtilCRCDiretoriosSimples.getNomeArquivo(getXhtmlJSF());
    }

    public String getXhtmlJsfCaminhoRelativo() {
        return xhtmlJsfCaminhoRelativo;
    }

    public boolean isXhtmlJSFCaminhoRelativoIgualA(String pCaminhoReferencia) {
        return pCaminhoReferencia.equals(getXhtmlJsfCaminhoRelativo());
    }

    public void setXhtmlJsfCaminhoRelativo(String xhtmlJsfCaminhoRelativo) {
        this.xhtmlJsfCaminhoRelativo = xhtmlJsfCaminhoRelativo;
    }

    public ComoFabTipoComponenteVisual getFabricaDoComponente() {
        return fabricaDoComponente;
    }

    public void setFabricaDoComponente(ComoFabTipoComponenteVisual fabricaDoComponente) {
        this.fabricaDoComponente = fabricaDoComponente;
    }

    public String getCaminhoFabrica() {
        if (caminhoFabrica == null) {
            caminhoFabrica = getFabricaDoComponente().getClass().getSimpleName() + "." + getFabricaDoComponente().toString();
        }
        return caminhoFabrica;
    }

    @Override
    public int getPesoLargura() {
        return pesoLargura;
    }

    @Override
    public void setPesoLargura(int pesoLargura) {
        this.pesoLargura = pesoLargura;
    }

    @Override
    public void setEnumVinculado(ComoFabrica pFabrica) {
        setFabricaDoComponente((ComoFabTipoComponenteVisual) pFabrica);
    }

    @Override
    public ComoFabrica getEnumVinculado() {
        return (ComoFabrica) getFabricaDoComponente();
    }

    @Override
    public String getClasseLarguraPorPeso() {
        return ComoComponenteVisualSB.super.getClasseLarguraPorPeso(); //To change body of generated methods, choose Tools | Templates.
    }

}
