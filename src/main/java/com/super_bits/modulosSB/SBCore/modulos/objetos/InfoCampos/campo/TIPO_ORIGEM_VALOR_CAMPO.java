/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo;

/**
 *
 * @author salvioF
 */
public enum TIPO_ORIGEM_VALOR_CAMPO {

    /**
     * Indica que haverá uma lista de valoes possíveis para o usuário escolher
     */
    /**
     * Indica que haverá uma lista de valoes possíveis para o usuário escolher
     */
    VALOR_COM_LISTA,
    /**
     * Indica que o valor é um conjunto de valores, que poderão ser selecionados
     * a partir de outra lista
     */
    VALORES_COM_LISTA,
    /**
     * Indica que o usuário poderá escrever "livrimente" (desde que atenda ao
     * requisito de validação)
     */
    VALOR_LIVRE,
    /**
     * Indica que o usuário poderá cadastrar mais de um valor livrimente (desde
     * que atenda aos requisitos de validação)
     */
    VALORES_LIVRE,
    /**
     * Indica um valor especifico de uma lista ex: entidade.listaderivada[0])
     */
    REGISTRO_ESTATICO_DA_LISTA,
    /**
     * Indica que o valor sera buscado em alguma url ou local
     */
    ARQUIVO;

    public boolean isUmValorLivre() {
        switch (this) {
            case VALOR_LIVRE:

            case VALORES_LIVRE:
                return true;
            case VALOR_COM_LISTA:

            case VALORES_COM_LISTA:

            case REGISTRO_ESTATICO_DA_LISTA:

            case ARQUIVO:
                return false;
            default:
                return false;
        }
    }
}
