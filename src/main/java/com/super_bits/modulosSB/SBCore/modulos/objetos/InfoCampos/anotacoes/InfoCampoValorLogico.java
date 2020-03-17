/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.calculos.ParametroCalculo;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 ** Indica que o valor do atributo deve ser definido programaticamente <br>
 * Esta anotação por padrão implica somente leitura
 *
 * @author desenvolvedor
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface InfoCampoValorLogico {

    public String nomeCalculo();

    public String descricao() default "Descrição desnescessária";

    public ParametroCalculo[] parametros() default {};

    public boolean atualizarSempreQueSalvar() default true;

    public Class classePrincipal() default void.class;

    public boolean somenteLeitura() default true;
}
