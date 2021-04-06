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
     * @Deprecated Utilize InfoCampoModeloDocumento
     * @return
     */
    @Deprecated
    public String[] objetosMapeados() default {};

    public String nomeCategoria() default "";

    public long tamanhoMaximo() default 0l;

    public int tamanhoHorizontal() default 0;

    public int tamanhoVertical() default 0;

}
