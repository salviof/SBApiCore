/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.erp;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreReflexaoAPIERP;

/**
 *
 * Deve extender os enuns das apis conhecidas
 *
 * @author desenvolvedor
 * @param <T> Iterface de Implementação
 */
public interface ItfApiErpSuperBits<T> extends ItfFabrica {

    public Class<? extends T> getInterface();

    @Override
    public default Object getRegistro() {
        return ItfFabrica.super.getRegistro();
    }

    public default Class getAnotacao() {
        try {
            if (!this.getClass().isEnum()) {
                throw new UnsupportedOperationException(
                        "Esta interface deve estar   presente em umenum, ");
            }
            Class classeApi = UtilSBCoreReflexaoAPIERP.getAnotacaoApi(this);

            if (classeApi == null) {
                throw new UnsupportedOperationException(
                        "A anotação da api " + this.toString() + " não foi encontrada");
            }
            return classeApi;
        } catch (Throwable t) { //
            LogManager.getLogger(LogPadraoSB.class).error("Erro obtendo Anotação da      api                        " + this.toString(), t);
            return null;
        }

    }

    /**
     * public default T getImplementacaoDoContexto() {
     *
     * return (T) UtilSBCoreReflexaoAPIERP.getImplementacaoDoContexto(this); }
     */
    public T getImplementacaoDoContexto();

    public T getClasseImplementacaoPadrao();

    public T getClasseImplementacaoTestes();
    /**
     * public default T getClasseImplementacaoPadrao() { return (T)
     * UtilSBCoreReflexaoAPIERP.getImplementacaoDoContexto(this); }
     */
    /**
     * public default T getClasseImplementacaoTestes() { return (T)
     * UtilSBCoreReflexaoAPIERP.getImplementacaoDoContexto(this); }
     */

}
