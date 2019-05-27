/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces;

import javax.persistence.EntityManager;

/**
 *
 * @author desenvolvedor
 */
public interface ItfParametroRequisicaoInstanciado extends ItfParametroRequisicao {

    /**
     *
     * @return O Valor Do parametro De Url instanciado
     */
    public Object getValor();

    public void setValor(Object valor);

    /**
     *
     * Transforma um valor texto Slug, em um objeto, caso seja um objeto de
     * Persistencia, utiliza o EntityManager para buscar o valor, Caso seja um
     * objeto de fabrica o objeto pode ser localizado pelo nome, caso a fabrica
     * seja declarada na anotação InfoParametroURL encontra também o bean pelo
     * nome
     *
     * @param pParteEnviada
     * @param pEm
     * @throws Throwable
     */
    public void aplicarParteURLenviada(String pParteEnviada, EntityManager pEm) throws Throwable;

    public boolean isValorDoParametroFoiConfigurado();

    public String getSlugValorParametro();

    public String getTextoEnviadoUrl();

}
