/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual;

/**
 *
 * @author desenvolvedor
 */
public interface ItfComponenteVisualSBEmLayout extends ItfComponenteVisualSB {

    public String getNomeIdentificador();

    public default boolean isUmComponenteAtributoDeObjeto() {
        return false;
    }

    public default ItfComponenteVisualSBCampoEmLayout getComoComponenteAtributoDeObjeto() {
        if (isUmComponenteAtributoDeObjeto()) {
            return (ItfComponenteVisualSBCampoEmLayout) this;
        } else {
            return null;
        }
    }
}
