/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.InfoComponenteVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfFabTipoComponenteVisual;

/**
 *
 * @author desenvolvedor
 */
public enum FabCompVisualSubItens implements ItfFabTipoComponenteVisual {
    @InfoComponenteVisual(nome = "subFormSimples",
            xhtmlJSF = FabCompVisualSubItens.PATA_SUB_ITENS + "subForm.xhtml",
            classesCSS = "subFormSimples"
    )
    SUB_FORM_SIMPLES;

    private static final String PATA_SUB_ITENS = "input/subItens/";

    @Override
    public FabFamiliaCompVisual getFamilia() {
        return FabFamiliaCompVisual.SUB_ITENS;
    }

}
