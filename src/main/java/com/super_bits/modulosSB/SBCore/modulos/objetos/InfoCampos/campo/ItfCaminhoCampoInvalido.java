/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo;

/**
 *
 * @author desenvolvedor
 */
public interface ItfCaminhoCampoInvalido {

    public String getMensagemCampoInvalido();

    public String getNomeCampo();

    public String getProblemaInvalidou();

    public void setNomeCampo(String nomeCampo);

    public void setProblemaInvalidou(String problemaInvalidou);

}
