/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coletivojava.fw.utilCoreBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.reflections.Reflections;

/**
 *
 * @author desenvolvedor
 */
public class UtilSBCoreReflexaoSimples {

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
        while (!classeAtual.getSimpleName().equals(Object.class.getSimpleName())) {

            if (classeAtual.getSimpleName().equals(pClassePesquisada.getSimpleName())) {
                return true;
            }
            classeAtual = classeAtual.getSuperclass();
        }
        return false;

    }
}
