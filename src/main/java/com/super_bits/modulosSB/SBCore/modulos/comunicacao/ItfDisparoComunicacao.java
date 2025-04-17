/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

/**
 *
 * @author desenvolvedor
 */
public interface ItfDisparoComunicacao {

    /**
     *
     * @param pComunicacao
     * @return O Código do recibo
     */
    public String dispararInicioComunicacao(ItfDialogo pComunicacao);

    /**
     *
     *
     * @param pComunicacao
     */
    public void dispararRespostaComunicacao(ItfDialogo pComunicacao);

}
