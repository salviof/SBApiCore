/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * #TODO ainda não implementado
 *
 * @author desenvolvedor
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Deprecated()
public @interface InfoTipoAcaoFormCamposAtualizaGrupoEspecifico {

    public String nomeDoGrupo();

    public String[] campos();

}
