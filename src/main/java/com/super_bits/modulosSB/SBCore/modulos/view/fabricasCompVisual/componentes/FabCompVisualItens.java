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
public enum FabCompVisualItens implements ItfFabTipoComponenteVisual {

    /**
     * Permite listar, com um botão para dicionar um novo item
     */
    @InfoComponenteVisual(nome = "itensFluidos",
            xhtmlJSF = FabCompVisualItens.PATA_ITENS + "itensFluidos.xhtml",
            classesCSS = "itensFluidos"
    )
    ITENS_FLUIDOS,;
    private static final String PATA_ITENS = "listaItem/";

    @Override
    public FabFamiliaCompVisual getFamilia() {
        return FabFamiliaCompVisual.ITENS_BEAN_SIMPLES;
    }

}
