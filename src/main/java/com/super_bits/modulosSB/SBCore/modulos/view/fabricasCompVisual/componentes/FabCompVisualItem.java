/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.InfoComponenteVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComoFabTipoComponenteVisual;

/**
 *
 * @author salvioF
 */
public enum FabCompVisualItem implements ComoFabTipoComponenteVisual {

    /**
     *
     */
    @InfoComponenteVisual(nome = "Texto Com Formatacao",
            xhtmlJSF = FabCompVisualItem.PATA_ITEM + "nomeEImagem",
            classesCSS = "nome_e_imagem"
    )
    NOME_E_IMAGEM;

    /**
     *
     */
    public static final String PATA_ITEM = "item/";

    /**
     *
     * @return
     */
    @Override
    public FabFamiliaCompVisual getFamilia() {
        return FabFamiliaCompVisual.ITEM_BEAN_SIMPLES;
    }

}
