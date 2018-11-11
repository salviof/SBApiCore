/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coletivojava.fw.utilCoreBase;

import java.text.Normalizer;

/**
 *
 * @author desenvolvedor
 */
public class UtilSBCoreStringFiltrosSimples {

    public static String gerarUrlAmigavel(String param) {
        if (param == null) {
            return null;
        }
        String resposta = removeCaracteresEspeciais(param);
        resposta = resposta.replace(" ", "_");
        resposta = resposta.replace(":", "-");
        return resposta;
    }

    public static String removeCaracteresEspeciais(String param) {
        if (param == null) {
            return null;
        }
        param = Normalizer.normalize(param, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        param = param.replace("/", "_");

        param = param.replace("\\", "_");
        param = param.replaceAll("[^\\p{ASCII}]", "");
        return param;

    }

}
