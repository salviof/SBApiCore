/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.view.componente;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanVinculadoAEnum;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfFabTipoComponenteVisual;
import java.io.Serializable;
import java.util.List;
import org.coletivojava.fw.api.objetoNativo.ObjetoNativoCoreDoSistema;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreDiretoriosSimples;

/**
 *
 * @author desenvolvedor
 */
@InfoObjetoSB(tags = {"Componente visual SB"}, plural = "Componentes SB")
public class ComponenteVisualBase extends ObjetoNativoCoreDoSistema implements ItfComponenteVisualSB, ItfBeanVinculadoAEnum, Serializable {

    @InfoCampo(tipo = FabTipoAtributoObjeto.ID, label = "Código")
    private int id;
    @InfoCampo(tipo = FabTipoAtributoObjeto.AAA_NOME, label = "Nome")
    private String nome;
    @InfoCampo(tipo = FabTipoAtributoObjeto.AAA_DESCRITIVO, label = "Descrição")
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
    private ItfFabTipoComponenteVisual fabricaDoComponente;
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
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
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
        return UtilSBCoreDiretoriosSimples.getDiretorioMenosXCasas(getXhtmlJSF(), 1);
    }

    public String getNomeArquivoXHTMLJSF() {
        return UtilSBCoreDiretoriosSimples.getNomeArquivo(getXhtmlJSF());
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

    public ItfFabTipoComponenteVisual getFabricaDoComponente() {
        return fabricaDoComponente;
    }

    public void setFabricaDoComponente(ItfFabTipoComponenteVisual fabricaDoComponente) {
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
    public void setEnumVinculado(ItfFabrica pFabrica) {
        setFabricaDoComponente((ItfFabTipoComponenteVisual) pFabrica);
    }

    @Override
    public ItfFabrica getEnumVinculado() {
        return (ItfFabrica) getFabricaDoComponente();
    }

    @Override
    public String getClasseLarguraPorPeso() {
        return ItfComponenteVisualSB.super.getClasseLarguraPorPeso(); //To change body of generated methods, choose Tools | Templates.
    }

}
