/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.calculos;

/**
 *
 * @author desenvolvedor
 */
public interface ItfCalculos {

    public Object getValor(Object... pEntidade);

    public default void atualizarValor() {
        getValor();
    }

    public default Long getSomaPadrao(Object... pParametros) {
        throw new UnsupportedOperationException("a soma padrão de calculos ainda não foi implementada");
    }

}
