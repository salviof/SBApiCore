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
public class WidgetsFormulario {

    private final FabTipoWidgetFormulario tipoWidget;
    private final String valor;

    public WidgetsFormulario(ItfCampoInstanciado pCampo) {
        tipoWidget = FabTipoWidgetFormulario.CAMPO;
        valor = pCampo.toString();
    }

    public FabTipoWidgetFormulario getTipoWidget() {
        return tipoWidget;
    }

    public String getValor() {
        return valor;
    }

}
