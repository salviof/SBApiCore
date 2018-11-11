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
 *
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
public @interface InfoTipoAcaoFormCamposAtualizaComponentePeloId {

    /**
     *
     * Id, ou parte do id que deve ser atualizado, exemplo
     * jdl123:jdl1234:meucomponenteQueDeveSerAtualizado
     *
     * Basta especificar o nomeID como: meucomponenteQueDeveSerAtualizado
     *
     * @return
     */
    public String nomeID();

    /**
     *
     * Lista de cmapos que devem atualizar este id
     *
     * @return
     */
    public String[] campos();

}
