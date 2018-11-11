/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

/**
 *
 * @author desenvolvedor
 */
public interface ItfBeanIDUnicoSomenteLeitura extends ItfBeanGenericoSomenteLeitura {

    public int getId();

    public default String getClassePontoIdentificador() {
        return this.getClass().getSimpleName() + "." + getId();
    }

}
