/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.listas;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ParametroLista;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author desenvolvedor
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface InfoLista {

    public String nomeParametro();

    public String descricao();

    public ParametroLista[] parametros() default {};

    public Class tipoObjetoListado() default void.class;

}
