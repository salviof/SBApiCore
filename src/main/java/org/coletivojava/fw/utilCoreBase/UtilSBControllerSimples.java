/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coletivojava.fw.utilCoreBase;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import java.lang.reflect.Method;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;

/**
 *
 * @author desenvolvedor
 */
public class UtilSBControllerSimples {

    /**
     *
     * Cria um id para o metodo basado no nome da classe, nome do metodo e
     * HaschCode
     *
     * @param pMeThod O Metodo que criará a identificação
     * @return O hash da String Classe+nomeMetodo
     */
    public static Long gerarIDMetodoAcaoDoSistema(Method pMeThod) {
        try {
            if (pMeThod == null) {
                throw new UnsupportedOperationException("Enviou metodo nulo para gerar Id do método");
            }
            String classe = pMeThod.getDeclaringClass().getName();
            String metodo = pMeThod.getName();
            return (long) (classe + metodo).hashCode();
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro gerando id do metodo", t);
            return null;
        }
    }

    public static Long gerarIDAcaoDoSistema(ItfFabricaAcoes pAcao) {
        Long codigo = (long) gerarNomeUnicoAcaoDoSistema(pAcao).hashCode();

        return codigo;
    }

    public static String gerarNomeUnicoAcaoDoSistema(ItfFabricaAcoes pAcao) {

        if (pAcao == null) {
            throw new UnsupportedOperationException("Erro tentando obter nome único de ação nula");
        }

        String nomeModulo = pAcao.getClass().getSimpleName();
        String nomeAcao = pAcao.toString();
        return nomeModulo + "." + nomeAcao;
    }
}
