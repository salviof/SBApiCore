/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coletivojava.fw.utilCoreBase;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public class UtilSBCoreContextoSimples {

    private static Boolean contextoJunit;

    private static boolean detectaContextoJunit() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        List<StackTraceElement> list = Arrays.asList(stackTrace);
        for (StackTraceElement element : list) {
            if (element.getClassName().startsWith("org.junit.")) {
                contextoJunit = true;
                return contextoJunit;
            }
        }
        contextoJunit = false;
        return false;
    }

    public static boolean isContextoExecucaoJunit() {

        if (contextoJunit != null) {
            return contextoJunit;
        }
        return detectaContextoJunit();
    }

}
