/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.view.componente;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfComponenteVisualSBEmLayout;
import java.util.List;

/**
 *
 *
 *
 *
 * @author desenvolvedor
 */
public class ComponenteVisualEmLayout implements ItfComponenteVisualSBEmLayout {

    private final ItfComponenteVisualSB tipoComponente;
    private final String nomeIdentificador;
    private final int prioridade;
    private final int peso;

    protected static int getPesoLarguraByCampoInstanciado(ItfCampoInstanciado pCampoInst) {
        switch (pCampoInst.getPropriedadesRefexao().getFabTipoAtributo()) {
            case LISTA_OBJETOS_PUBLICOS:
                if (pCampoInst.isSomenteLeitura()) {
                    return 3;

                }
            case TEXTO_SIMPLES:
                if (pCampoInst.getMascara() == null || pCampoInst.getMascara().isEmpty()) {
                    return pCampoInst.getComponenteVisualPadrao().getPesoLargura();
                } else {
                    int numCaracteres = pCampoInst.getMascara().length();
                    if (numCaracteres > 40) {
                        return 5;
                    }

                    if (numCaracteres > 20) {
                        return 4;
                    }
                    if (numCaracteres > 9) {
                        return 3;
                    }

                    return pCampoInst.getPropriedadesRefexao().getFabTipoAtributo().getPesoLarguraEspecifico();
                }
            default:
                return pCampoInst.getPropriedadesRefexao().getFabTipoAtributo().getPesoLarguraEspecifico();
        }
    }

    public ComponenteVisualEmLayout(
            ItfComponenteVisualSB tipoComponente,
            String pNomeIdentificador,
            int pPrioridade) {
        this(tipoComponente, pNomeIdentificador, pPrioridade, tipoComponente.getPesoLargura());

    }

    public ComponenteVisualEmLayout(
            ItfComponenteVisualSB tipoComponente,
            String pNomeIdentificador,
            int pPrioridade,
            int pPeso) {
        this.tipoComponente = tipoComponente;
        nomeIdentificador = pNomeIdentificador;
        prioridade = pPrioridade;
        peso = pPeso;
    }

    @Override
    public String getIdHTMLObjetoPrincipal() {
        return tipoComponente.getIdHTMLObjetoPrincipal();
    }

    @Override
    public String getDescricao() {
        return tipoComponente.getDescricao();
    }

    @Override
    public FabFamiliaCompVisual getFamilia() {
        return tipoComponente.getFamilia();
    }

    @Override
    public String getHtmlWordPress() {
        return tipoComponente.getHtmlWordPress();
    }

    @Override
    public String getNomeComponente() {
        return tipoComponente.getNomeComponente();
    }

    @Override
    public List<Object> getParametros() {
        return tipoComponente.getParametros();
    }

    @Override
    public String getXhtmlAndroid() {
        return tipoComponente.getXhtmlAndroid();
    }

    @Override
    public String getXhtmlJSF() {
        return tipoComponente.getXhtmlJSF();
    }

    @Override
    public String getClasseCSS() {
        return tipoComponente.getClasseCSS();
    }

    @Override
    public int getPesoLargura() {
        return peso;
    }

    @Override
    public void setPesoLargura(int pesoLargura) {
        tipoComponente.setPesoLargura(pesoLargura);
    }

    @Override
    public String getNomeIdentificador() {
        return nomeIdentificador;
    }

    @Override
    public boolean isUmComponenteAtributoDeObjeto() {
        return false;
    }

    @Override
    public String getCaminhoFabrica() {
        return tipoComponente.getCaminhoFabrica();
    }

    @Override
    public String getClasseLarguraPorPeso() {
        return ItfComponenteVisualSBEmLayout.super.getClasseLarguraPorPeso(); //To change body of generated methods, choose Tools | Templates.
    }
}
