/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.ErroValidacao;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetos.log.LogPadraoSB;

/**
 *
 * @author desenvolvedor
 */
public interface ItfValidacao<T> {

    public default Object validar(Object pValor) throws ErroValidacao {
        try {
            throw new UnsupportedOperationException("Ainda não implementado");
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("O validador deste campo não foi impplementado", t);
            if (LogManager.getLogger(LogPadraoSB.class).isDebugEnabled()) {
                LogManager.getLogger(LogPadraoSB.class).error("Falta implmentar o validador para o campo", t);
            }
            return null;
        }

    }

    public ItfCampoInstanciado getCampoInstanciado();

    public default Object validarModoNovo(Object pValor) throws ErroValidacao {
        return validar(pValor);
    }

    public default Object validarModoEdicao(Object pValor) throws ErroValidacao {
        return validar(pValor);
    }

    public default T getObjetoDoAtributo() {
        return (T) getCampoInstanciado().getObjetoDoAtributo();
    }

}
