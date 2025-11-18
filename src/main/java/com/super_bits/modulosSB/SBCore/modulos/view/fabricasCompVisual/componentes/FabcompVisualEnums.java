/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.InfoComponenteVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComoFabTipoComponenteVisual;

/**
 *
 * @author SalvioF
 */
public enum FabcompVisualEnums implements ComoFabTipoComponenteVisual {

    @InfoComponenteVisual(nome = "Enum AtutoComplete",
            xhtmlJSF = FabcompVisualEnums.PASTA_ENUM_ESTATICO + "enumAutoComplete.xhtml", classesCSS = "enumFabrica")
    TEXTO_AUTO_COMPLETE,
    @InfoComponenteVisual(nome = "Enum Grade",
            xhtmlJSF = FabcompVisualEnums.PASTA_ENUM_ESTATICO + "enumGrade.xhtml", classesCSS = "enumFabrica")
    GRADE;

    public static final String PASTA_ENUM_ESTATICO = "input/enumEstatico/";

    @Override
    public FabFamiliaCompVisual getFamilia() {
        return FabFamiliaCompVisual.ENUM_SELETOR;
    }

}
