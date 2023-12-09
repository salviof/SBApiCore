/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.view.widgetsFormulario;

/**
 *
 * @author salvio
 */
public abstract class WidgetsFormulario {

    private final FabTipoWidgetFormulario tipoWidget;

    private String PFExpression;

    private String clientID;

    public WidgetsFormulario(FabTipoWidgetFormulario pTipo, String pExpresaoOuClienteId) {
        tipoWidget = FabTipoWidgetFormulario.CAMPO;
        switch (pTipo) {
            case CAMPO:
                PFExpression = pExpresaoOuClienteId;
                break;
            case FORMULARIO:
                PFExpression = pExpresaoOuClienteId;
                break;
            case COMPONENTE_PAI_RELATIVO:
                PFExpression = pExpresaoOuClienteId;
                break;
            case COMPONENTE_FILHO_RELATIVO:

                break;
            default:
                throw new AssertionError(pTipo.name());

        }

    }

    public WidgetFormularioCampoInputOutput getComoWidgetCampoInstanciado() {
        return (WidgetFormularioCampoInputOutput) this;
    }

    public FabTipoWidgetFormulario getTipoWidget() {
        return tipoWidget;
    }

    public boolean isTemExpressaoPrimefaces() {
        return PFExpression != null;
    }

    public boolean isTemId() {
        return clientID != null;
    }

    public String getPFExpression() {
        return PFExpression;
    }

    public String getClientID() {
        return clientID;
    }

}
