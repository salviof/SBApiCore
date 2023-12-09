/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.coletivojava.fw.utilCoreBase;

import com.super_bits.modulosSB.SBCore.modulos.erp.ItfSistemaERP;

/**
 *
 * @author salvio
 */
public class UtilSBCoreReflexaoAPIERPRestFull {

    private static final String CAMINHO_PACOTES = "org.coletivoJava.fw.projetos.integracao.implemetation.model.conversao";

    public static String getNomeClasseToJson(ItfSistemaERP pSistema, Class pClasse) {
        String nomeClasse = pClasse.getSimpleName() + "ToJson";
        nomeClasse = UtilSBCoreStringsMaiuculoMinusculoSimples.getPrimeiraLetraMaiusculo(nomeClasse);
        return nomeClasse;
    }

    public static String getNomeClasseToObject(ItfSistemaERP pSistema, Class pClasse) {
        String nomeClasse = pClasse.getSimpleName() + "ToObjeto";
        nomeClasse = UtilSBCoreStringsMaiuculoMinusculoSimples.getPrimeiraLetraMaiusculo(nomeClasse);
        return nomeClasse;
    }

    public static String getPacoteClassesConversao(ItfSistemaERP pSistema, Class pClasse) {
        String nomeAplicacao = getSlugAplicacao(pSistema);
        nomeAplicacao = UtilSBCoreStringsMaiuculoMinusculoSimples.getPrimeiraLetraMinuscula(nomeAplicacao);
        return CAMINHO_PACOTES + "." + nomeAplicacao;
    }

    public static String gerarCaminhoCompletoClasseObjetoToJson(ItfSistemaERP pSistema, Class pClasse) {
        String nome = getPacoteClassesConversao(pSistema, pClasse) + "." + getNomeClasseToJson(pSistema, pClasse);
        return nome;
    }

    public static String gerarCaminhoCompletoClasseJsonToObjeto(ItfSistemaERP pSistema, Class pClasse) {
        String nome = getPacoteClassesConversao(pSistema, pClasse) + "." + getNomeClasseToObject(pSistema, pClasse);
        return nome;
    }

    /**
     *
     * TODO: buscar o nome da aplicação via chamada webservice, considerar um
     * registro de DNS com informações básicas da aplicação
     *
     * @param pSistema
     * @return
     */
    public static String getSlugAplicacao(ItfSistemaERP pSistema) {
        String nomeaplicacao = "mktFaturamento";

        if (pSistema.getDominio() != null) {
            if (pSistema.getDominio().contains("fatura")) {
                nomeaplicacao = "mktFaturamento";
            }
            if (pSistema.getDominio().contains("crm")) {
                nomeaplicacao = "Intranet_Marketing_Digital";
            }
            if (pSistema.getDominio().contains("contabil") || pSistema.getDominio().contains("fluxocaixa")) {
                nomeaplicacao = "fluxoDeCaixa";
            }
        }

        return nomeaplicacao;

    }
}
