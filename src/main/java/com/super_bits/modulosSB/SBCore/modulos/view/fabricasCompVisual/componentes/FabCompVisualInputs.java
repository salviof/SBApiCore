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
 * @author salvioF
 */
public enum FabCompVisualInputs implements ComoFabTipoComponenteVisual {

    @InfoComponenteVisual(nome = "Texto Com FOrmatacao",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "inputMascara.xhtml",
            classesCSS = "campoMascara",
            idHTMLObjetoPrincipal = "inputMaskara",
            pesoLargura = FabColunasTela.TRES
    )
    TEXTO_COM_FORMATACAO,
    @InfoComponenteVisual(nome = "Texto Sem Formatacao",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "inputSimples.xhtml",
            classesCSS = "campoSimples",
            idHTMLObjetoPrincipal = "inputTexto",
            pesoLargura = FabColunasTela.TRES
    )
    TEXTO_SEM_FORMATACAO,
    @InfoComponenteVisual(nome = "Texto Grande com Formatacao",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "minimoEMaximo.xhtml",
            classesCSS = "campoGrande",
            pesoLargura = FabColunasTela.QUATRO
    )
    TEXTO_GRANDE_COM_FORMATACAO,
    @InfoComponenteVisual(nome = "Texto multiplas Linhas",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "descritivo.xhtml",
            classesCSS = "campoMultiplasLinhas",
            pesoLargura = FabColunasTela.TRES
    )
    TEXTMO_MULTIPLAS_LINHAS,
    @InfoComponenteVisual(nome = "Valor com mínimo e Maximo",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "minimoEMaximo.xhtml",
            classesCSS = "camoMinimoEMaximo",
            pesoLargura = FabColunasTela.TRES
    )
    NUMERO_MINIMO_MAXIMO,
    @InfoComponenteVisual(nome = "Senha",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "senha.xhtml",
            classesCSS = "campoSenha",
            pesoLargura = FabColunasTela.DOIS
    )
    SENHA,
    @InfoComponenteVisual(nome = "Cor",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "cor.xhtml",
            classesCSS = "campoCor",
            pesoLargura = FabColunasTela.UM)
    COR,
    @InfoComponenteVisual(nome = "HTML",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "html.xhtml",
            classesCSS = "campoHTML",
            pesoLargura = FabColunasTela.DOZE)
    HTML,
    @InfoComponenteVisual(nome = "HTML Template",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "htmlTemplate.xhtml",
            classesCSS = "campoHTMLTemplate",
            pesoLargura = FabColunasTela.DOZE)
    HTML_TEMPLATE,
    @InfoComponenteVisual(nome = "Quantidade",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "quantidade.xhtml",
            classesCSS = "campoQuantidade",
            pesoLargura = FabColunasTela.DOIS)
    QUANTIDADE,
    @InfoComponenteVisual(nome = "Moeda",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "moeda.xhtml",
            classesCSS = "campoMoeda",
            pesoLargura = FabColunasTela.DOIS)
    MOEDA,
    @InfoComponenteVisual(nome = "Email",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "email.xhtml",
            classesCSS = "campoEmail",
            pesoLargura = FabColunasTela.DOIS)
    EMAIL,
    @InfoComponenteVisual(nome = "Data",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "data.xhtml",
            classesCSS = "campoData",
            pesoLargura = FabColunasTela.UM)
    DATA,
    @InfoComponenteVisual(nome = "Data Hora",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "dataHora.xhtml",
            classesCSS = "campoDataHora",
            pesoLargura = FabColunasTela.TRES)
    DATA_HORA,
    @InfoComponenteVisual(nome = "Data Hora",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "hora.xhtml",
            classesCSS = "campoDataHora",
            pesoLargura = FabColunasTela.UM)
    HORA,
    @InfoComponenteVisual(nome = "Ligado ou Desligado",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "verdadeiroOuFalso.xhtml",
            classesCSS = "campoLigadoDesligado",
            pesoLargura = FabColunasTela.UM)
    LIGADO_DESLIGADO,
    @InfoComponenteVisual(nome = "Entidade Simples",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "entidadeSimples.xhtml",
            classesCSS = "campoEntidadeSimples", pesoLargura = FabColunasTela.TRES)
    ENTIDADE_SIMPLES,
    @InfoComponenteVisual(nome = "Arquivo de Entidade",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "arquivoDeEntidade.xhtml", classesCSS = "arquivoEntidade",
            pesoLargura = FabColunasTela.QUATRO
    )
    ARQUIVO_DE_ENTIDADE,
    @InfoComponenteVisual(nome = "Imagem pequena Entidade",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "imagemDeEntidadePequeno.xhtml", classesCSS = "imagemPequeno",
            pesoLargura = FabColunasTela.UM)
    IMAGEM_PEQUENA_DE_ENTIDADE,
    @InfoComponenteVisual(nome = "Imagem medio de Entidade",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "imagemDeEntidadeMedio.xhtml", classesCSS = "imagemMedio",
            pesoLargura = FabColunasTela.DOIS
    )
    IMAGEM_MEDIO_DE_ENTIDADE,
    @InfoComponenteVisual(nome = "Imagem grande de Entidade",
            xhtmlJSF = FabCompVisualInputs.PASTA_CAMPOS + "imagemDeEntidadeGrande.xhtml", classesCSS = "imagemGrande",
            pesoLargura = FabColunasTela.TRES)
    IMAGEM_GRANDE_DE_ENTIDADE;

    public static final String PASTA_CAMPOS = "input/campo/";
    public static final String PASTA_SELETOR_ITENS = "input/seletorItens/";
    public static final String PASTA_SELETOR_ITEM = "input/seletorItem/";

    @Override
    public FabFamiliaCompVisual getFamilia() {
        return FabFamiliaCompVisual.INPUT;
    }

}
