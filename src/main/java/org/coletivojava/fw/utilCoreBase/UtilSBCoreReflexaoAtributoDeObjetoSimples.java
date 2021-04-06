/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coletivojava.fw.utilCoreBase;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.TIPO_PRIMITIVO;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author desenvolvedor
 */
public class UtilSBCoreReflexaoAtributoDeObjetoSimples {

    /**
     *
     * Retorna a classe do campo, se for uma lista, retorna o tipo Generico
     * declarado
     *
     * @param pCampo Campo Obtido via reflexao
     * @return A classe vinculada a declaracao
     */
    public static Class getClassePrincipalDoCampo(Field pCampo) {
        Class classeDoCampo = pCampo.getType();

        InfoCampo infoCampo = pCampo.getAnnotation(InfoCampo.class);
        if (infoCampo != null) {
            if (infoCampo.entidadeOpcoesDisponiveis() != void.class) {
                return infoCampo.entidadeOpcoesDisponiveis();
            }
        }
        try {
            //nem sempre a classe manyToone estará presente no projeto, caso não esteja, ignorar o targetEntuty
            ManyToOne muitosParaUm = pCampo.getAnnotation(ManyToOne.class);
            if (muitosParaUm != null) {
                if (muitosParaUm.targetEntity() != void.class) {
                    return muitosParaUm.targetEntity();
                }
            }

            OneToMany umParaMuitos = pCampo.getAnnotation(OneToMany.class);
            if (umParaMuitos != null) {
                if (umParaMuitos.targetEntity() != void.class) {
                    return umParaMuitos.targetEntity();
                }
            }
        } catch (Throwable t) {

        }

        if (pCampo.getType().isEnum()) {
            return pCampo.getType();
        }
        if (pCampo.getType()
                .getSimpleName().equals("List")) {
            ParameterizedType genericoTipo = (ParameterizedType) pCampo.getGenericType();
            Class tipoDaLista = (Class<?>) genericoTipo.getActualTypeArguments()[0];
            return tipoDaLista;
        }

        if (infoCampo != null) {
            String textoClasse = infoCampo.tipo().getTipoPrimitivo().getDeclaracaoJava();
            Class classePrimitiva = TIPO_PRIMITIVO.getClasseTipoPrimitivoByNome(textoClasse);
            if (classePrimitiva == null) {
                return pCampo.getType();
            } else {
                return classePrimitiva;
            }

        }
        return pCampo.getType();

    }

}
