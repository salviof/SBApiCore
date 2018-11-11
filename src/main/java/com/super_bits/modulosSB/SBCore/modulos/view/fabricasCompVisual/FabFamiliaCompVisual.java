/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVIsualInputsLayout;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualBotaoAcao;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualEndereco;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualFormularioDeAcao;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualGrupoCampo;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualGruposCampo;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualInputs;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualItem;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualItens;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualMenu;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualSeletorItem;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualSeletorItens;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualSistema;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualSubItens;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabcompVisualEnums;
import java.util.List;

/**
 *
 * @author salvioF
 */
public enum FabFamiliaCompVisual implements ItfFabFamiliaComponenteVisual {

    INPUT,
    ENDERECO,
    LAYOUT_INPUT,
    GRUPO_DE_CAMPOS,
    GRUPOS_DE_CAMPOS,
    FORMULARIO_DE_ACAO,
    MENU,
    SELETOR_ITEM,
    SELETOR_ITENS,
    ENUM_SELETOR,
    SUB_ITENS,
    ITEM_BEAN_SIMPLES,
    ITENS_BEAN_SIMPLES,
    COMPONENTE_SISTEMA,
    BOTAO_DE_ACAO;

    public ItfFabTipoComponenteVisual getComponentePadrao() {
        switch (this) {
            case INPUT:
                return FabCompVisualInputs.TEXTO_SEM_FORMATACAO;
            case MENU:
                return FabCompVisualMenu.MENU_SIMPLES_FONTANSOME;
            case SELETOR_ITEM:
                return FabCompVisualSeletorItem.COMBO;
            case SELETOR_ITENS:
                return FabCompVisualSeletorItens.PICKLIST;
            case LAYOUT_INPUT:
                break;
            case ITEM_BEAN_SIMPLES:
                return FabCompVisualItem.NOME_E_IMAGEM;

            case ITENS_BEAN_SIMPLES:
                return FabCompVisualItens.ITENS_FLUIDOS;
            case COMPONENTE_SISTEMA:
                return FabCompVisualSistema.NAO_IMPLEMENTADO;
            case BOTAO_DE_ACAO:
                return FabCompVisualBotaoAcao.ICONE_E_NOME;
            case GRUPO_DE_CAMPOS:
                return FabCompVisualGrupoCampo.GRUPO_DE_CAMPO_RESPONSIVO;

            case GRUPOS_DE_CAMPOS:
                return FabCompVisualGruposCampo.GRUPOS_DE_CAMPO_ACAO_FORMULARIO_RESPONSIVO;

            case FORMULARIO_DE_ACAO:
                return FabCompVisualFormularioDeAcao.ACAO_REGISTRO_RESPONSIVO;
            case ENUM_SELETOR:
                return FabcompVisualEnums.GRADE;
            case ENDERECO:
                return FabCompVisualEndereco.INFORMACAO_ENDERECO;
            case SUB_ITENS:
                return FabCompVisualSubItens.SUB_FORM_SIMPLES;

            default:
                return FabCompVisualItem.NOME_E_IMAGEM;

        }
        return null;
    }

    @Override
    public Class getInterfaceCompativel() {

        switch (this) {
            case INPUT:
            case MENU:
            case ENUM_SELETOR:
            case SELETOR_ITEM:
            case SELETOR_ITENS:

                return ItfCampoInstanciado.class;

            case ITEM_BEAN_SIMPLES:
                return ItfBeanSimples.class;
            case ITENS_BEAN_SIMPLES:
                return List.class;
            case BOTAO_DE_ACAO:
                return ItfAcaoDoSistema.class;

            default:
                return ItfCampoInstanciado.class;

        }

    }

    @Override
    public String getNomeFAmilia() {
        return this.toString();
    }

    @Override
    public Class getFabricaCamposPadrao() {
        switch (this) {
            case INPUT:
                return FabCompVisualInputs.class;
            case LAYOUT_INPUT:

                return FabCompVIsualInputsLayout.class;
            case ENUM_SELETOR:
                return FabcompVisualEnums.class;
            case MENU:
                return FabCompVisualMenu.class;
            case SELETOR_ITEM:
                return FabCompVisualItem.class;
            case SELETOR_ITENS:
                return FabCompVisualItens.class;
            case ITEM_BEAN_SIMPLES:
                return FabCompVisualItem.class;
            case ITENS_BEAN_SIMPLES:
                return FabCompVisualItens.class;
            case ENDERECO:
                return FabCompVisualEndereco.class;

            case GRUPO_DE_CAMPOS:
                return FabCompVisualGrupoCampo.class;

            case GRUPOS_DE_CAMPOS:
                return FabCompVisualGruposCampo.class;

            case FORMULARIO_DE_ACAO:
                return FabCompVisualFormularioDeAcao.class;

            case COMPONENTE_SISTEMA:
                return FabCompVisualSistema.class;

            case BOTAO_DE_ACAO:
                return FabCompVisualBotaoAcao.class;

            default:
                throw new AssertionError(this.name());

        }
    }
}
