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
}
