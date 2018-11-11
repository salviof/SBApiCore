/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes;

/**
 *
 * @author desenvolvedor
 */
public @interface InfoCampoLocalizacao {

    public boolean permitirCadastroCepNaoEncontrado() default false;

    public boolean permitirCadstroNovoBairro() default true;

    public boolean permitirCadastroNovaCidade() default false;

}
