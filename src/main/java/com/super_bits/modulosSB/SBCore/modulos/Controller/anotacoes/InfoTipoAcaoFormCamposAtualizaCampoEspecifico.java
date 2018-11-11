/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * #TODO ainda não especificado
 *
 * Os campos listados nesta anotação irão atualizar um Id de componente
 * encontrado na tela, Apenas parte do nome completo do id bastará para que a
 * atualização aconteça
 *
 *
 * @author Salvio Furbino
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Deprecated
public @interface InfoTipoAcaoFormCamposAtualizaCampoEspecifico {

    /**
     *
     *
     * Nome de declaração do campo que deve ser atualizado
     *
     * @return
     */
    public String campoAtualizarAposAlterar();

    /**
     *
     * Lista de cmapos que devem atualizar este campo
     *
     * @return
     */
    public String[] campos();

}
