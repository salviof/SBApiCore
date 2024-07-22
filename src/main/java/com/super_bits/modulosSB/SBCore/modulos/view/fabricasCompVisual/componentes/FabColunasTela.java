/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes;

/**
 *
 * @author desenvolvedor
 */
public enum FabColunasTela {

    UM,
    DOIS,
    TRES,
    QUATRO,
    CINCO,
    SEIS,
    SETE,
    OITO,
    NOVE,
    DEZ,
    ONZE,
    DOZE;

    public static int tamanhoPxColunaPadraoDesejaval = 120;

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getQuantidade() {
        switch (this) {
            case UM:
                return 2;
            case DOIS:
                return 3;
            case TRES:
                return 4;
            case QUATRO:
                return 5;
            case CINCO:
                return 6;
            case SEIS:
                return 7;
            case SETE:
                return 8;

            case OITO:
                return 8;
            case NOVE:
                return 9;
            case DEZ:
                return 10;
            case ONZE:
                return 11;
            case DOZE:
                return 12;
            default:
                throw new AssertionError(this.name());

        }
    }

}
