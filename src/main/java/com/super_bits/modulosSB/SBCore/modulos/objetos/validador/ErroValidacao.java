/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.validador;

/**
 *
 * @author desenvolvedor
 */
public class ErroValidacao extends Exception {

    private final String mensagemAoUsuario;

    public ErroValidacao(String pMensagemUsuario) {
        super(pMensagemUsuario);
        mensagemAoUsuario = pMensagemUsuario;

    }

    public String getMensagemAoUsuario() {

        return mensagemAoUsuario;
    }

}
