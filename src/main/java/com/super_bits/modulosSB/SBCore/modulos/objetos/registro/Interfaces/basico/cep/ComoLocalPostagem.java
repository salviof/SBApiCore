/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep;

/**
 *
 * @author desenvolvedor
 */
public interface ComoLocalPostagem extends ComoLocal {

    public String getLogradouro();

    public String getCep();

    public void setCep(String pCep);

    public void setLogradouro(String pLogradouro);
}
