/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.erp;

/**
 *
 * @author sfurbino
 */
public class ErroJsonInterpredador extends Exception {

    private int linhaArquivo;
    private int coluna;
    private String trecho;

    public ErroJsonInterpredador(String erro) {
        super(erro);
    }

    public ErroJsonInterpredador(ItfApiErpSuperBits pContexto, Class itfPojo, String json, String mensagem) {

    }

    public ErroJsonInterpredador(ItfApiErpSuperBits pContexto, Class itfPojo, String json, Throwable mensagem) {

    }

}
