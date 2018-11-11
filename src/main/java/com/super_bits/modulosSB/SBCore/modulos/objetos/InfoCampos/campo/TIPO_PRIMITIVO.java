/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import java.lang.reflect.Field;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetos.log.LogPadraoSB;

/**
 *
 * @author salvioF
 */
public enum TIPO_PRIMITIVO {
    INTEIRO, NUMERO_LONGO, LETRAS, DATAS, BOOLEAN, DECIMAL, ENTIDADE, OUTROS_OBJETOS;

    public String getDeclaracaoJava() {

        switch (this) {
            case INTEIRO:
                return "int";
            case LETRAS:
                return "String";
            case DATAS:
                return "Date";
            case BOOLEAN:
                return "boolean";
            case DECIMAL:
                return "double";
            case ENTIDADE:
                return "entidade";
            case NUMERO_LONGO:
                return "long";

            case OUTROS_OBJETOS:

            default:
                return "Outros_Objetos";
        }
    }

    public boolean isNumeral() {
        switch (this) {
            case INTEIRO:
            case DECIMAL:
            case NUMERO_LONGO:
                return true;
            case LETRAS:

            case DATAS:

            case BOOLEAN:

            case ENTIDADE:

            case OUTROS_OBJETOS:
                return false;

            default:
                return false;

        }
    }

    public static Class getClasseTipoPrimitivoByNome(String pTipoString) {
        TIPO_PRIMITIVO tipo = getTipoPrimitivoByTexto(pTipoString);
        switch (tipo) {
            case INTEIRO:
                return int.class;

            case NUMERO_LONGO:
                return long.class;
            case LETRAS:
                return String.class;
            case DATAS:
                return Date.class;
            case BOOLEAN:
                return boolean.class;
            case DECIMAL:
                return double.class;
            case ENTIDADE:
                return null;

            case OUTROS_OBJETOS:
                return null;

            default:
                throw new AssertionError(tipo.name());

        }

    }

    public static TIPO_PRIMITIVO getTipoPrimitivoByTexto(String pTipoString) {
        try {
            if (pTipoString == null) {
                throw new UnsupportedOperationException("Envinou nulo para tentar obter tipo primitivo por String");
            }

            if (pTipoString.equals("int")) {
                return INTEIRO;
            }

            if (pTipoString.equals("String")) {
                return LETRAS;
            }
            if (pTipoString.equals("Date")) {
                return DATAS;
            }
            if (pTipoString.equals("boolean")) {
                return BOOLEAN;
            }
            if (pTipoString.equals("double") || pTipoString.equals("Double")) {
                return DECIMAL;
            }
            if (pTipoString.equals("long")) {
                return NUMERO_LONGO;
            }
            return OUTROS_OBJETOS;
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro tentando obter tipo primitivo", t);
            return OUTROS_OBJETOS;
        }
    }

}
