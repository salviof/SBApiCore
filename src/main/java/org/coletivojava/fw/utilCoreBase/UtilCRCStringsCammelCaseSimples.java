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
public class UtilCRCStringsCammelCaseSimples {

    public static String getTextoByCammel(String pString) {
        if (pString == null) {
            return null;
        }
        return pString.replaceAll(
                String.format("%s|%s|%s",
                        "(?<=[A-Z])(?=[A-Z][a-z])",
                        "(?<=[^A-Z])(?=[A-Z])",
                        "(?<=[A-Za-z])(?=[^A-Za-z])"
                ),
                " "
        );

    }
}
