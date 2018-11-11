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
public enum FabCompVisualBotaoAcao implements ItfFabTipoComponenteVisual {

    @InfoComponenteVisual(nome = "Icone",
            classesCSS = "btnIcone",
            xhtmlJSF = FabCompVisualBotaoAcao.PASTA_BOTOES + "btnIcone.xhtml"
    )
    ICONE,
    @InfoComponenteVisual(nome = "Icone e Nome",
            classesCSS = "btnIconeENome",
            xhtmlJSF = FabCompVisualBotaoAcao.PASTA_BOTOES + "btnIconeENome.xhtml")
    ICONE_E_NOME,
    @InfoComponenteVisual(nome = "Nome",
            classesCSS = "btnNome",
            xhtmlJSF = FabCompVisualBotaoAcao.PASTA_BOTOES + "btnNome.xhtml"
    )
    NOME,
    @InfoComponenteVisual(nome = "Icone Gigante",
            classesCSS = "iconeGrande",
            xhtmlJSF = FabCompVisualBotaoAcao.PASTA_BOTOES + "btnIconeGrande.xhtml")
    ICONE_GIGANTE,
    @InfoComponenteVisual(nome = "Botao Card Responsivo",
            classesCSS = "btnCardResoponsivo",
            xhtmlJSF = FabCompVisualBotaoAcao.PASTA_BOTOES + "btnCardResoponsivo.xhtml")
    BOTAO_CARD_RESPONSIVO;
    public static final String PASTA_BOTOES = "botaoAcao/";

    @Override
    public FabFamiliaCompVisual getFamilia() {
        return FabFamiliaCompVisual.BOTAO_DE_ACAO;
    }

}
