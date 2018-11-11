/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes;

/**
 *
 * @author desenvolvedor
 */
public @interface InfoCampoArquivoDeEntidade {

    /**
     * Utilize This para referir ao próprio Objeto
     *
     * @return
     */
    String[] objetosMapeados();

    int tamanhoHorizontal();

    int tamanhoVertical();

}
