/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.view.componente;

import static com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto.LISTA_OBJETOS_PUBLICOS;
import static com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto.TEXTO_SIMPLES;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabColunasTela;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreReflexaoAPIERP;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoStatus;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComoComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComoComponenteVisualSBEmLayout;

/**
 *
 *
 *
 *
 * @author desenvolvedor
 */
public class ComponenteVisualEmLayout implements ComoComponenteVisualSBEmLayout {

    private final ComoComponenteVisualSB tipoComponente;
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
            case OBJETO_DE_UMA_LISTA: {
                try {

                    if (ComoStatus.class.isAssignableFrom(pCampoInst.getMetodoGet().getReturnType())) {
                        return FabColunasTela.CINCO.getQuantidade();
                    }
                } catch (NoSuchMethodException ex) {

                }
                return FabColunasTela.QUATRO.getQuantidade();
            }

            default: {

                return pCampoInst.getPropriedadesRefexao().getFabTipoAtributo().getPesoLarguraEspecifico();
            }
        }
    }

    public ComponenteVisualEmLayout(
            ComoComponenteVisualSB tipoComponente,
            String pNomeIdentificador,
            int pPrioridade) {
        this(tipoComponente, pNomeIdentificador, pPrioridade, tipoComponente.getPesoLargura());

    }

    public ComponenteVisualEmLayout(
            ComoComponenteVisualSB tipoComponente,
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
        return ComoComponenteVisualSBEmLayout.super.getClasseLarguraPorPeso(); //To change body of generated methods, choose Tools | Templates.
    }
}
