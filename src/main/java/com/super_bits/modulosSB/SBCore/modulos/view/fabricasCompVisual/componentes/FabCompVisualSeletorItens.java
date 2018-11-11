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
public enum FabCompVisualSeletorItens implements ItfFabTipoComponenteVisual {

    @InfoComponenteVisual(nome = "PickList",
            xhtmlJSF = FabCompVisualSeletorItens.DIRETORIO_SELETOR_ITENS + "pickList.xhtml",
            classesCSS = "seletorPickList"
    )
    PICKLIST;

    public static final String DIRETORIO_SELETOR_ITENS = FabCompVisualInputs.PASTA_CAMPOS + "seletorItens/";

    @Override
    public FabFamiliaCompVisual getFamilia() {
        return FabFamiliaCompVisual.SELETOR_ITENS;
    }

}
