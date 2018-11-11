/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import java.lang.reflect.Method;

/**
 *
 * @author SalvioF
 */
public interface ItfCampoInstanciadoBase {

    public Method getMetodoGet() throws NoSuchMethodException;

    public Method getMetodoSet() throws NoSuchMethodException;

    /**
     *
     * @return O valor deste campo
     */
    public Object getValor();

    /**
     *
     * @param pValor Modifica o valor do campo
     */
    public void setValor(Object pValor);

    /**
     *
     * Retorna o objeto onde o atributo está instanciado
     *
     * @return
     */
    public ItfBeanSimples getObjetoDoAtributo();

    /**
     *
     *
     *
     * @see #getObjetoDoAtributo()
     * @return O Objeto pai deste objeto
     */
    @Deprecated
    public Object getParent();

}
