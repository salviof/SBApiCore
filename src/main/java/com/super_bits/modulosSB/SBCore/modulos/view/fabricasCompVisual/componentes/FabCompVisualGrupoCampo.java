/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.InfoComponenteVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComoFabTipoComponenteVisual;

/**
 *
 *
 *
 * @author desenvolvedor
 */
public enum FabCompVisualGrupoCampo implements ComoFabTipoComponenteVisual {

    @InfoComponenteVisual(nome = "Grpo de Campos Responsivos",
            classesCSS = "grpCampoResponsivo",
            xhtmlJSF = FabCompVisualGrupoCampo.PASTA_FORMULARIO + "grupoCampoResponsivo.xhtml"
    )
    GRUPO_DE_CAMPO_RESPONSIVO,
    @InfoComponenteVisual(nome = "Grpo de Campos Mobile",
            classesCSS = "grpCampoResponsivo",
            xhtmlJSF = FabCompVisualGrupoCampo.PASTA_FORMULARIO + "grupoCampoMobile.xhtml"
    )
    GRUPO_DE_CAMPO_MOBILE,
    @InfoComponenteVisual(nome = "Grpo de Campos Desktop",
            classesCSS = "grpCampoResponsivo",
            xhtmlJSF = FabCompVisualGrupoCampo.PASTA_FORMULARIO + "grupoCampoDesktop.xhtml"
    )
    GRUPO_DE_CAMPO_DESKTOP;

    public static final String PASTA_FORMULARIO = "grupoCampos/";

    @Override
    public FabFamiliaCompVisual getFamilia() {
        return FabFamiliaCompVisual.GRUPO_DE_CAMPOS;
    }
}
