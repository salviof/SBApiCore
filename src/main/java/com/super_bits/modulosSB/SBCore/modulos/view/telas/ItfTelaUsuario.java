/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.telas;

/**
 *
 * @author sfurbino
 */
public interface ItfTelaUsuario {

    public String getDispositivo();

    public String getAplicativo();

    public String getVersaoAplicativo();

    public int getX();

    public int getY();

    public int getNumeroMaximoColunas();

    public int getNumeroMaximoColunasTamanhoDobro();

    public int getNumeroMaximoColunasTamanhoTriplo();

    public int getNumeroMaximoColunasAteSeis();

    public int getNumeroMaximoColunasAteTres();

    public int getNumeroMaximoColunasAteCinco();

    public int getNumeroMaximoColunasAteNove();

    public int getNumeroMaximoColunasAtedoze();

    public boolean isUmMobile();

    public ItfTipoTela getTipoTela();

}
