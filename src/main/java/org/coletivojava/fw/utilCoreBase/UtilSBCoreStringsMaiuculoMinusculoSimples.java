/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coletivojava.fw.utilCoreBase;

/**
 *
 * @author desenvolvedor
 */
public class UtilSBCoreStringsMaiuculoMinusculoSimples {

    public static String getPrimeiraLetraMaiusculo(String parametro) {
        return String.valueOf(parametro.charAt(0)).toUpperCase() + parametro.substring(1);
    }

    /**
     *
     * Retorna a String convertendo a primeira letra para minusculo
     *
     * @param parametro
     * @return
     */
    public static String getPrimeiraLetraMinuscula(String parametro) {
        return String.valueOf(parametro.charAt(0)).toLowerCase() + parametro.substring(1);
    }
}
