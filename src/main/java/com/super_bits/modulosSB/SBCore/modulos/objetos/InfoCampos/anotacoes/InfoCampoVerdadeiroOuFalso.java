/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes;

/**
 *
 * @author desenvolvedor
 */
public @interface InfoCampoVerdadeiroOuFalso {

    String iconePostivio() default "fa fa-check text-success";

    String iconeNegativo() default "fa fa-check text-danger";

    String textoPositivo() default "Sim";

    String textoNegativo() default "Não";

}
