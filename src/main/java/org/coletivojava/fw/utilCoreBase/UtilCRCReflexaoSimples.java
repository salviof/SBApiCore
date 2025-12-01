/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coletivojava.fw.utilCoreBase;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.reflections.Reflections;

/**
 *
 * @author desenvolvedor
 */
public class UtilCRCReflexaoSimples {

    /**
     *
     * @param pAnotacao
     * @param pCaminhoPacote
     * @return
     */
    public static List<Class> getClassesComEstaAnotacao(Class pAnotacao, String pCaminhoPacote) {

        List<Class> lista = new ArrayList<>();

        Reflections reflections = new Reflections(pCaminhoPacote);

        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(pAnotacao);

        //exibe a lista classes
        annotated.forEach((c) -> {
            lista.add(c);
        });
        return lista;
    }

    public static boolean isClasseIgualOuExetende(Class pClasseReferencia, Class pClassePesquisada) {

        if (pClasseReferencia.getSimpleName().equals(pClassePesquisada.getSimpleName())) {
            return true;
        }
        Class classeAtual = pClasseReferencia.getSuperclass();
        if (classeAtual == null) {
            return false;
        }
        while (!classeAtual.getSimpleName().equals(Object.class.getSimpleName())) {

            if (classeAtual.getSimpleName().equals(pClassePesquisada.getSimpleName())) {
                return true;
            }
            classeAtual = classeAtual.getSuperclass();
        }
        return false;

    }

    public static boolean isInterfaceIgualOuExetende(Class pClasseReferencia, Class pClassePesquisada) {

        if (pClasseReferencia.getSimpleName().equals(pClassePesquisada.getSimpleName())) {
            return true;
        }

        return isInterfaceIgualOuExetendeRecursivo(pClasseReferencia, pClassePesquisada);

    }

    private static boolean isInterfaceIgualOuExetendeRecursivo(Class pClasseReferencia, Class pClassePesquisada) {
        Class[] interfaces = pClasseReferencia.getInterfaces();
        if (pClasseReferencia.getSimpleName().equals(pClassePesquisada.getSimpleName())) {
            return true;
        }
        if (interfaces.length == 0) {
            return false;
        }
        if (pClasseReferencia.getSimpleName().equals("Object")) {
            return false;
        }

        for (Class itfAtual : interfaces) {
            boolean encontrou = isInterfaceIgualOuExetendeRecursivo(itfAtual, pClassePesquisada);
            if (encontrou) {
                return true;
            }

        }
        return false;
    }

}
