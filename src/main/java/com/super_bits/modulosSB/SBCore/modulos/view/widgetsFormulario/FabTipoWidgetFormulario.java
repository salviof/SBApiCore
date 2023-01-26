/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.view.widgetsFormulario;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author salvio
 */
public enum FabTipoWidgetFormulario {

    CAMPO, FORMULARIO, COMPONENTE_PAI_RELATIVO, COMPONENTE_FILHO_RELATIVO;

    public static List<WidgetsFormulario> getCampos(ItfCampoInstanciado... pCampos) {
        List<WidgetsFormulario> lista = new ArrayList<>();
        for (ItfCampoInstanciado cp : pCampos) {
            lista.add(new WidgetFormularioCampoInputOutput(cp));
        }
        return lista;
    }
}
