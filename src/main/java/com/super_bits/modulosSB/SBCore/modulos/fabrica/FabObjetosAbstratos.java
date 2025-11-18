/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.fabrica;

/**
 *
 * @author desenvolvedor
 */
public enum FabObjetosAbstratos implements ComoFabrica {

    VALOR_NAO_SELECIONADO,
    VALOR_PADRAO;

    @Override
    public Object getRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
