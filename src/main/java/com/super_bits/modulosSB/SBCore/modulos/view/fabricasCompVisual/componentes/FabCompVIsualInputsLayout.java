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
public enum FabCompVIsualInputsLayout implements ItfFabTipoComponenteVisual {

    @InfoComponenteVisual(nome = "Resumido",
            descricao = "Exibe o campo, exibindo o label como marca-dagua, e tooltip",
            xhtmlJSF = FabCompVIsualInputsLayout.PASTA_LAYOUT_INPUTS + "resumido.xhtml",
            classesCSS = "campoResumido"
    )
    LABEL_RESUMIDO,
    @InfoComponenteVisual(nome = "Superior",
            descricao = "Exibe o nome do campo (label) acima do campo",
            xhtmlJSF = FabCompVIsualInputsLayout.PASTA_LAYOUT_INPUTS + "superior.xhtml",
            classesCSS = "campoSuperior"
    )
    LABEL_SUPERIOR,
    @InfoComponenteVisual(nome = "Esquerda",
            descricao = "Exibe o nome do campo (label) em frente ao campo",
            xhtmlJSF = FabCompVIsualInputsLayout.PASTA_LAYOUT_INPUTS + "esquerda.xhtml",
            classesCSS = "campoEsquerda"
    )
    LABEL_ESQUEDA,
    @InfoComponenteVisual(nome = "Automático",
            descricao = "Exibe o campo com layout automático, em geral o automático utiliza o superior para desktop, e resumido para mobilie",
            xhtmlJSF = FabCompVIsualInputsLayout.PASTA_LAYOUT_INPUTS + "automatico.xhtml",
            classesCSS = "campoAutomatico"
    )
    AUTOMATICO,
    @InfoComponenteVisual(nome = "Sem Label", classesCSS = "inputSemLabel", xhtmlJSF = FabCompVIsualInputsLayout.PASTA_LAYOUT_INPUTS + "inputSemLabel.xhtml")
    INPUTSEM_LABEL;
    public static final String PASTA_LAYOUT_INPUTS = "../layouts/";

    @Override
    public FabFamiliaCompVisual getFamilia() {
        return FabFamiliaCompVisual.LAYOUT_INPUT;
    }

    public String estiloTabela() {
        switch (this) {
            case LABEL_RESUMIDO:

            case LABEL_SUPERIOR:

            case LABEL_ESQUEDA:

            case AUTOMATICO:

            case INPUTSEM_LABEL:
                return "";
            default:
                return "";
        }
    }

    public String estiloColunasLeitura() {
        switch (this) {
            case LABEL_RESUMIDO:

            case LABEL_SUPERIOR:

            case LABEL_ESQUEDA:
                return "InputSBEsquerdaLabel,InputSBEsquerdaConteudoSomenteLeitura,InputSBEsquerdaMensagem";
            case AUTOMATICO:

            case INPUTSEM_LABEL:
                return "";
            default:
                return "";
        }
    }

    public String estiloColunas() {
        switch (this) {
            case LABEL_RESUMIDO:

            case LABEL_SUPERIOR:

            case LABEL_ESQUEDA:
                return "InputSBEsquerdaLabel,InputSBEsquerdaConteudo,InputSBEsquerdaMensagem";

            case AUTOMATICO:

            case INPUTSEM_LABEL:
                return "";
            default:
                return "";
        }
    }

    public String estiloLinhasLeitura() {
        switch (this) {
            case LABEL_RESUMIDO:
                return "";
            case LABEL_SUPERIOR:
                return "InputColunaSuperiorLabel,InputColunaSuperiorConteudoLeitura,InputColunaSuperiorMensagem";

            case LABEL_ESQUEDA:

            case AUTOMATICO:

            case INPUTSEM_LABEL:
                return "";
            default:
                return "";
        }
    }

    public String estiloLinhas() {
        switch (this) {
            case LABEL_RESUMIDO:
                return "";
            case LABEL_SUPERIOR:
                return "InputColunaSuperiorLabel,InputColunaSuperiorConteudo,InputColunaSuperiorMensagem";

            case LABEL_ESQUEDA:

            case AUTOMATICO:

            case INPUTSEM_LABEL:
                return "";
            default:
                return "";
        }
    }

}
