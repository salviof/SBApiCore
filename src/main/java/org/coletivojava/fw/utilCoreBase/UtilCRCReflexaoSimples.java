/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coletivojava.fw.utilCoreBase;

import com.super_bits.modulosSB.SBCore.modulos.erp.ComoFabricaPacoteDeEntidade;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.reflections.Reflections;
import com.super_bits.modulosSB.SBCore.modulos.erp.ComoFabricaPacotesBaseCarameloCode;
import com.super_bits.modulosSB.SBCore.modulos.objetos.estrutura.ItfEstruturaDeEntidade;
import java.util.Collections;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author desenvolvedor
 */
public class UtilCRCReflexaoSimples {

    private final static Map<Class, List<Class>> classesComAnotacao = new ConcurrentHashMap<>();

    public static List<Class> getClassesComEstaAnotacao(Class pAnotacao, ComoFabricaPacotesBaseCarameloCode pEstrutura) {
        return getClassesComEstaAnotacao(pAnotacao, pEstrutura.getPacoteCanonico(), false);
    }

    public static List<Class> getClassesComEstaAnotacao(Class pAnotacao, ComoFabricaPacoteDeEntidade pPAcote, ItfEstruturaDeEntidade pEstrutura) {
        return getClassesComEstaAnotacao(pAnotacao, pPAcote.getPacoteCanonicoDeEntidade(pEstrutura), false);
    }

    /**
     *
     * @param pAnotacao
     * @param pCaminhoPacote
     * @return
     */
    public static List<Class> getClassesComEstaAnotacao(Class pAnotacao, String pCaminhoPacote, boolean pIgnorarCache) {

        if (!pIgnorarCache) {
            if (classesComAnotacao.containsKey(pAnotacao)) {
                List<Class> classesDoPacote = Optional.ofNullable(classesComAnotacao.get(pAnotacao))
                        .orElse(Collections.emptyList()) // ← aqui é emptyList()
                        .stream()
                        .filter(cl -> cl.getName().contains(pCaminhoPacote))
                        .collect(Collectors.toList());
                if (!classesDoPacote.isEmpty()) {
                    return classesDoPacote;
                }
            }
        }

        // ReflectionUtils.withAnnotation(pAnotacao); <- CUIDADO ISSO NÃO FUNCION
        // withAnnotation apenas cria um predicado de filtragem e não executa varredura, não interage com o ClassLoader e não descobre classes anotadas no classpath.
        List<Class> lista = new ArrayList<>();
        Reflections reflections = new Reflections(pCaminhoPacote);
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(pAnotacao);

        //exibe a lista classes
        if (!classesComAnotacao.containsKey(pAnotacao)) {
            classesComAnotacao.put(pAnotacao, new CopyOnWriteArrayList<>());
        }
        annotated.forEach((c) -> {

            if (!classesComAnotacao.get(pAnotacao).contains(c)) {
                classesComAnotacao.get(pAnotacao).add(c);
            }
        });

        return classesComAnotacao.get(pAnotacao);
    }

    public static boolean isClasseIgualOuExetende(Class pClasseReferencia, Class pClassePesquisada) {

        if (pClasseReferencia.getSimpleName().equals(pClassePesquisada.getSimpleName())) {
            return true;
        }
        Class classeAtual = pClasseReferencia.getSuperclass();
        if (classeAtual == null) {
            return false;

        }
        while (!classeAtual.getSimpleName().equals(Object.class
                .getSimpleName())) {

            if (classeAtual.getSimpleName()
                    .equals(pClassePesquisada.getSimpleName())) {
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
