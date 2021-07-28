/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coletivojava.fw.utilCoreBase;

import java.text.Normalizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        param = param.replace(" ", "I666I");
        param = param.replace("_", "I666I");
        param = param.replace(".", "I667I");
        Pattern pt = Pattern.compile("[^a-zA-Z0-9]");
        Matcher match = pt.matcher(param);
        while (match.find()) {
            String s = match.group();
            param = param.replaceAll("\\" + s, "");
        }
        param = param.replace("I666I", "_");
        param = param.replace("I667I", ".");
        return param;

    }

}
