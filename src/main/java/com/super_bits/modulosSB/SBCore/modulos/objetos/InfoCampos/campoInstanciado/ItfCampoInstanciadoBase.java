/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import java.lang.reflect.Method;
import java.util.Date;

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

    public void setValorValidando(Object pValor);

    public default Object getValorValidando() {
        return getValor();
    }

    public default double getValorComoDouble() {
        return (double) getValor();
    }

    public default ItfBeanSimples getValorComoItemSimples() {
        return (ItfBeanSimples) getValor();
    }

    public default long getValorComoLong() {
        return Long.valueOf(getValor().toString());
    }

    public default Date getValorComoDate() {
        return (Date) getValor();
    }

    public default int getValorComoInteger() {
        return (int) getValor();
    }

    public default boolean getValorComoBoolean() {
        return (boolean) getValor();
    }

    public default void setValorComLogDeAlteracao(Object pValor) {
        System.out.println("Alteração de valor com log de alteração ainda não foi implementado");
    }

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

    public void bloquearProximaAlteracao();

}
