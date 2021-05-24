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

    public String caminhoCampoReferencia() default "";

    /**
     *
     * Uso de parametros transients como data inicial e final, foi considerado
     * má pŕatica
     *
     * Caso esteja pensando em criar um paramêtro Transient para calcular um
     * valor a boa prática é criar uma Classe contendo todos os parametros que
     * serão usados no campo dinamico, este design promove a especificação do
     * inputs que na maioria dos casos será preenchido pelo usuário onde a
     * especificação do atributo é nescessária
     *
     * Exemplo: RelatorioCliente.datainicial RelatorioCliente.datafinal
     * RelatorioCliente.getBoletos();
     *
     * @return
     * @deprecated
     */
    @Deprecated
    public ParametroCalculo[] parametros() default {};

    public boolean atualizarSempreQueSalvar() default true;

    public Class classePrincipal() default void.class;

    public boolean somenteLeitura() default true;
}
