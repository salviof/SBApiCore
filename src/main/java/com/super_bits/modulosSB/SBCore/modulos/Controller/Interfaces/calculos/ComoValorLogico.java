/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.calculos;

/**
 *
 * @author desenvolvedor
 */
public interface ComoValorLogico {

    public Object getValor(Object... pEntidade);

    public default void atualizarValor() {
        getValor();
    }

    public default Long getSomaPadrao(Object... pParametros) {

        throw new UnsupportedOperationException("Não implementado");

    }
}
