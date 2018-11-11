/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author desenvolvedor
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface InfoCampoDinamico {

    public String campoValorReflection() default "";

    public Class classeValorDeclarado() default void.class;

    public Class classeDadoGenerico() default void.class;

    public Class classeInjecaoDeValorDireto() default void.class;

}
