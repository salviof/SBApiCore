/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual;

/**
 *
 * @author desenvolvedor
 */
public interface ComoComponenteVisualSBEmLayout extends ComoComponenteVisualSB {

    public String getNomeIdentificador();

    public default boolean isUmComponenteAtributoDeObjeto() {
        return false;
    }

    public default ComoComponenteVisualSBCampoEmLayout getComoComponenteAtributoDeObjeto() {
        if (isUmComponenteAtributoDeObjeto()) {
            return (ComoComponenteVisualSBCampoEmLayout) this;
        } else {
            return null;
        }
    }
}
