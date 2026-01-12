/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.erp;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;

/**
 *
 * @author salvio
 */
public enum FabPacotesCRCBase implements ComoFabricaPacotesBaseCarameloCode {

    IMPLEMENTACAO_SERVICOS,
    BASE,
    MODULOS_ERP,
    MODULOS_ERP_API_LEGADO,
    MODULOS_ERP_IMPLEMENTACAO_LEGADO,
    FRAMEWORK,
    PROJETOS;
    public static final String NOME_PACOTE_PROJETO_ERP = "br.org.carameloCode.erp";
    //br.org.coletivoJava.fw.api.erp.ia.escopo;

    @Override

    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String geCaminhoCompletoSourceCode() {
        return null;
    }

    @Override
    public String getCaminhoRelativoSourceCode() {
        return null;
    }

    @Override
    public String getPacoteCanonico() {

        switch (this) {

            case IMPLEMENTACAO_SERVICOS:
                return FRAMEWORK.getPacoteCanonico() + ".servico";

            case BASE:
                //TODO: trocar para br.org.carameloCode.
                return "br.org.coletivoJava";
            case FRAMEWORK:

                return BASE.getPacoteCanonico() + ".fw";
            case PROJETOS:
                //TODO: trocar FRAMEWORK, por BASE
                return FRAMEWORK.getPacoteCanonico() + "projetos";
            case MODULOS_ERP:
                return NOME_PACOTE_PROJETO_ERP + ".modulo";
            case MODULOS_ERP_API_LEGADO:
                return "br.org.coletivoJava.fw.api.erp";
            case MODULOS_ERP_IMPLEMENTACAO_LEGADO:
                return "br.org.coletivoJava.fw.erp.implementacao";

            default:
                throw new AssertionError(this.name());

        }

    }

}
