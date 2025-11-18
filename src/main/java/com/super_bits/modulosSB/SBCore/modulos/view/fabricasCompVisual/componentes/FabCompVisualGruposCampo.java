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
public enum FabCompVisualGruposCampo implements ComoFabTipoComponenteVisual {
    @InfoComponenteVisual(nome = "Grpo de Campos Responsivos",
            classesCSS = "grpsCampoResponsivo",
            xhtmlJSF = FabCompVisualGrupoCampo.PASTA_FORMULARIO + "gruposCampoMobile.xhtml"
    )
    GRUPOS_DE_CAMPO_ACAO_FORMULARIO_RESPONSIVO,
    @InfoComponenteVisual(nome = "Grpo de Campos Mobile",
            classesCSS = "grpsCampoMobile",
            xhtmlJSF = FabCompVisualGrupoCampo.PASTA_FORMULARIO + "gruposCampoMobile.xhtml"
    )
    GRUPOS_DE_CAMPO_ACAO_FORMULARIO_MOBILE,
    @InfoComponenteVisual(nome = "Grpo de Campos Desktop",
            classesCSS = "grpsCampoDesktop",
            xhtmlJSF = FabCompVisualGrupoCampo.PASTA_FORMULARIO + "gruposCampoDesktop.xhtml"
    )
    GRUPOS_DE_CAMPO_ACAO_FORMULARIO_DESKTOP;
    public static final String PASTA_FORMULARIO = "gruposCampos/";

    @Override
    public FabFamiliaCompVisual getFamilia() {
        return FabFamiliaCompVisual.GRUPOS_DE_CAMPOS;
    }
}
