/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComponenteVisualInputEmLayout;

/**
 *
 * @author desenvolvedor
 */
public interface ItfComponenteVisualSBEmLayout extends ItfComponenteVisualSB {

    public String getNomeIdentificador();

    public default boolean isUmComponenteAtributoDeObjeto() {
        return false;
    }

    public default ComponenteVisualInputEmLayout getComoComponenteAtributoDeObjeto() {
        if (isUmComponenteAtributoDeObjeto()) {
            return (ComponenteVisualInputEmLayout) this;
        } else {
            return null;
        }
    }
}
