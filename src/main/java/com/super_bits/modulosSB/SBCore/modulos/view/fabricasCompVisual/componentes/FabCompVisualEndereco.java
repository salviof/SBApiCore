/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.InfoComponenteVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComoFabTipoComponenteVisual;

/**
 *
 * @author desenvolvedor
 */
public enum FabCompVisualEndereco implements ComoFabTipoComponenteVisual {
    @InfoComponenteVisual(nome = "Endereco",
            xhtmlJSF = FabCompVisualEndereco.PASTA_CAMPO_ENDERECO + "endereco.xhtml", classesCSS = "endereco")
    INFORMACAO_ENDERECO,
    @InfoComponenteVisual(nome = "Bairro",
            xhtmlJSF = FabCompVisualEndereco.PASTA_CAMPO_ENDERECO + "bairro.xhtml", classesCSS = "endereco")
    BAIRRO,
    @InfoComponenteVisual(nome = "Cidade",
            xhtmlJSF = FabCompVisualEndereco.PASTA_CAMPO_ENDERECO + "cidade.xhtml", classesCSS = "endereco")
    CIDADE,
    @InfoComponenteVisual(nome = "Unidade federativa Estado",
            xhtmlJSF = FabCompVisualEndereco.PASTA_CAMPO_ENDERECO + "estado.xhtml", classesCSS = "endereco")
    UNIDADE_FEDERATIVA,
    @InfoComponenteVisual(nome = "Nação País",
            xhtmlJSF = FabCompVisualEndereco.PASTA_CAMPO_ENDERECO + "nacao.xhtml", classesCSS = "endereco")
    NACAO,
    @InfoComponenteVisual(nome = "Cep",
            xhtmlJSF = FabCompVisualEndereco.PASTA_CAMPO_ENDERECO + "cep.xhtml",
            classesCSS = "campoCEP"
    )
    CEP;

    public final static String PASTA_CAMPO_ENDERECO = "input/campo/endereco/";

    @Override
    public FabFamiliaCompVisual getFamilia() {
        return FabFamiliaCompVisual.ENDERECO;
    }
}
