/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.InfoComponenteVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfFabTipoComponenteVisual;

/**
 *
 * @author salvioF
 */
public enum FabCompVisualSeletorItem implements ItfFabTipoComponenteVisual {
    @InfoComponenteVisual(nome = "Carrousel", xhtmlJSF = "carrousel.xhmlt",
            classesCSS = "carrousel")
    CARROULSEL,
    @InfoComponenteVisual(nome = "Menu em Botões",
            xhtmlJSF = FabCompVisualSeletorItem.DIRETORIO_SELETOR_ITEM + "meuBotoes.xhmlt",
            classesCSS = "seletorMenuBotoes")
    BOTOES_MENU,
    @InfoComponenteVisual(nome = "Auto_Complete", xhtmlJSF = FabCompVisualSeletorItem.DIRETORIO_SELETOR_ITEM + "autoCompletar.xhmlt",
            classesCSS = "seletorItem"
    )
    AUTO_COMPLETE,
    @InfoComponenteVisual(nome = "Grade", xhtmlJSF = FabCompVisualSeletorItem.DIRETORIO_SELETOR_ITEM + "grade.xhmlt",
            classesCSS = "seletorGrade")
    GRADE,
    @InfoComponenteVisual(nome = "Combo", xhtmlJSF = FabCompVisualSeletorItem.DIRETORIO_SELETOR_ITEM + "combo.xhtml",
            classesCSS = "seletorCombo"
    )
    COMBO,
    @InfoComponenteVisual(nome = "radio", xhtmlJSF = FabCompVisualSeletorItem.DIRETORIO_SELETOR_ITEM + "radio.xhtml",
            classesCSS = "seletorRadio")
    RADIO;

    public static final String DIRETORIO_SELETOR_ITEM = "input/seletorItem/";

    @Override
    public FabFamiliaCompVisual getFamilia() {
        return FabFamiliaCompVisual.SELETOR_ITEM;
    }

}
