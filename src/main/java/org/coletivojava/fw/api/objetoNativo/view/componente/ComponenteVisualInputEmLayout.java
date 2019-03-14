/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.view.componente;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCampoExibicaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfComponenteVisualSBCampoEmLayout;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreLayoutComponenteEmTelaBasico;

/**
 *
 * @author desenvolvedor
 */
public class ComponenteVisualInputEmLayout extends ComponenteVisualEmLayout implements ItfComponenteVisualSBCampoEmLayout {

    private static int getPesoLargura(ItfCampoInstanciado pCampoInst) {
        switch (pCampoInst.getPropriedadesRefexao().getFabTipoAtributo()) {
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

    private final ItfCampoExibicaoFormulario campoExibicaoFormulario;

    public ComponenteVisualInputEmLayout(ItfCampoInstanciado pCampoInstanciado, ItfCampoExibicaoFormulario pCaminhoCampo) {
        super(pCampoInstanciado.getComponenteVisualPadrao(),
                pCaminhoCampo.getCaminhoCompletoComGrupoCampo(),
                UtilSBCoreLayoutComponenteEmTelaBasico.getPrioridadePadraoPorTipoCampo(pCampoInstanciado.getFabricaTipoAtributo()),
                getPesoLargura(pCampoInstanciado)
        );
        campoExibicaoFormulario = pCaminhoCampo;
    }

    @Deprecated()
    public ItfCampoExibicaoFormulario getCaminhoCampo() {

        return campoExibicaoFormulario;
    }

    @Override
    public ItfCampoExibicaoFormulario getCampoExibicaoFormulario() {
        return campoExibicaoFormulario;
    }

    @Override
    public boolean isUmComponenteAtributoDeObjeto() {
        return true;
    }

}
