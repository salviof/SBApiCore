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
public enum FabCompVisualFormularioDeAcao implements ComoFabTipoComponenteVisual {

    @InfoComponenteVisual(nome = "Formulário de ação registro Responsiva",
            classesCSS = "frm_registro_responsivo",
            xhtmlJSF = FabCompVisualFormularioDeAcao.PASTA_FORMULARIO + "formRegistroResponsivo.xhtml"
    )
    ACAO_REGISTRO_RESPONSIVO,
    @InfoComponenteVisual(nome = "Formulário de ação registro Mobile",
            classesCSS = "grpCampoResponsivo",
            xhtmlJSF = FabCompVisualFormularioDeAcao.PASTA_FORMULARIO + "formRegistroDesktop.xhtml"
    )
    ACAO_REGISTRO_DESKTOP,
    @InfoComponenteVisual(nome = "Formulário de ação registro Desktop",
            classesCSS = "grpCampoResponsivo",
            xhtmlJSF = FabCompVisualFormularioDeAcao.PASTA_FORMULARIO + "formRegistroMobile.xhtml"
    )
    ACAO_REGISTRO_MOBILE,
    @InfoComponenteVisual(nome = "Formulário de ação Listagem Responsiva",
            classesCSS = "grpCampoResponsivo",
            xhtmlJSF = FabCompVisualFormularioDeAcao.PASTA_FORMULARIO + "formListagemResponsiva.xhtml"
    )
    ACAO_LISTAGEM_RESPONSIVA,
    @InfoComponenteVisual(nome = "Formulário de ação listagem Mobile",
            classesCSS = "grpCampoResponsivo",
            xhtmlJSF = FabCompVisualFormularioDeAcao.PASTA_FORMULARIO + "formListagemMobile.xhtml"
    )
    ACAO_LISTAGEM_MOBILE,
    @InfoComponenteVisual(nome = "Formulário de ação listagem Desktop",
            classesCSS = "grpCampoResponsivo",
            xhtmlJSF = FabCompVisualFormularioDeAcao.PASTA_FORMULARIO + "formListagemDesktop.xhtml"
    )
    ACAO_LISTAGEM_DESKTOP,
    @InfoComponenteVisual(nome = "Formulário de ação listagem Card Full",
            classesCSS = "grpCampoResponsivo",
            xhtmlJSF = FabCompVisualFormularioDeAcao.PASTA_FORMULARIO + "formListagemCardFull.xhtml"
    )
    ACAO_LISTAGEM_CARD_FULL;

    public static final String PASTA_FORMULARIO = "formularioDeAcao/";

    @Override
    public FabFamiliaCompVisual getFamilia() {
        return FabFamiliaCompVisual.FORMULARIO_DE_ACAO;
    }

}
