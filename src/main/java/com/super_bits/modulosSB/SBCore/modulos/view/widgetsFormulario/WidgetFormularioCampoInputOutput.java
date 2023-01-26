/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.view.widgetsFormulario;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;

/**
 *
 * @author salvio
 */
public class WidgetFormularioCampoInputOutput extends WidgetsFormulario {

    private final String campoCanonico;
    private final String nomeAtributo;
    private final String entidade;

    public WidgetFormularioCampoInputOutput(ItfCampoInstanciado pCampoInstanciado) {
        super(FabTipoWidgetFormulario.CAMPO, "@parent:@(." + pCampoInstanciado.getNomeClasseAtributoDeclarado() + pCampoInstanciado.getNomeCamponaClasse() + ":first)");
        campoCanonico = pCampoInstanciado.toString();
        nomeAtributo = pCampoInstanciado.getNomeCamponaClasse();
        entidade = pCampoInstanciado.getNomeClasseAtributoDeclarado();
    }

    public String getCampoCanonico() {
        return campoCanonico;
    }

    public String getNomeAtributo() {
        return nomeAtributo;
    }

    public String getEntidade() {
        return entidade;
    }

}
