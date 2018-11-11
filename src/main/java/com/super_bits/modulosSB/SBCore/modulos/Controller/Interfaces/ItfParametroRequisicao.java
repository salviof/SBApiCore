/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces;

import java.io.Serializable;

/**
 *
 * Um parametro de requisição identifica um parametro da requisição que será
 * interpretado por um serviço, Os parametros de requisição podem ser utilizados
 * em:
 *
 *
 *
 * A Utilização mais comum de um parametro de requisição é em servidores
 * servlets como existente em: WebPaginasServlet ServletArquivosDeEntidade e
 * outros, porém qualquer serviço que apresente uma informação através de uma
 * requisição pode utilizar este Objeto, um exemplo é o serviço de montagem de
 * tela em APPs android nativo do Framework
 *
 *
 *
 * @author desenvolvedor
 */
public interface ItfParametroRequisicao extends Serializable {

    public String getNome();

    public Class getTipoEntidade();

    public TIPO_PARTE_URL getTipoParametro();

    public Object getValorPadrao();

    public Class getClasseObjetoValor();

    public boolean isParametroObrigatorio();

    public boolean isUmParametroDeEntidade();

    public boolean isUmParametoEntidadeMBPrincipal();

    public boolean isPossuiFabricaDeObjetos();

    public String getSlugValorPadrao();

    public Object getObjetoPorNomeFabrica(String pValor);

}
