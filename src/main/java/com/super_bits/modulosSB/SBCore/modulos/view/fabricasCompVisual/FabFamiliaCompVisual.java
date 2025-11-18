/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;

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
import org.coletivojava.fw.api.objetoNativo.view.componente.FamiliaComponente;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreStringEnumECaixaAlta;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreStringsCammelCaseSimples;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

/**
 *
 * @author salvioF
 */
public enum FabFamiliaCompVisual implements ComoFabFamiliaComponenteVisual, ComoFabrica {

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

    @Override
    public FamiliaComponente getRegistro() {
        FamiliaComponente familia = new FamiliaComponente();
        familia.setId((long) this.ordinal());
        familia.setNome(UtilSBCoreStringsCammelCaseSimples.getTextoByCammel(getNomeFAmilia()));
        familia.setFabrica(this);
        return familia;

    }

    public ComoComponenteVisualSB getComponentePadrao() {
        switch (this) {
            case INPUT:
                return FabCompVisualInputs.TEXTO_SEM_FORMATACAO.getRegistro();
            case MENU:
                return FabCompVisualMenu.MENU_SIMPLES_FONTANSOME.getRegistro();
            case SELETOR_ITEM:
                return FabCompVisualSeletorItem.COMBO.getRegistro();
            case SELETOR_ITENS:
                return FabCompVisualSeletorItens.PICKLIST.getRegistro();
            case LAYOUT_INPUT:
                break;
            case ITEM_BEAN_SIMPLES:
                return FabCompVisualItem.NOME_E_IMAGEM.getRegistro();

            case ITENS_BEAN_SIMPLES:
                return FabCompVisualItens.ITENS_FLUIDOS.getRegistro();
            case COMPONENTE_SISTEMA:
                return FabCompVisualSistema.NAO_IMPLEMENTADO.getRegistro();
            case BOTAO_DE_ACAO:
                return FabCompVisualBotaoAcao.ICONE_E_NOME.getRegistro();
            case GRUPO_DE_CAMPOS:
                return FabCompVisualGrupoCampo.GRUPO_DE_CAMPO_RESPONSIVO.getRegistro();

            case GRUPOS_DE_CAMPOS:
                return FabCompVisualGruposCampo.GRUPOS_DE_CAMPO_ACAO_FORMULARIO_RESPONSIVO.getRegistro();

            case FORMULARIO_DE_ACAO:
                return FabCompVisualFormularioDeAcao.ACAO_REGISTRO_RESPONSIVO.getRegistro();
            case ENUM_SELETOR:
                return FabcompVisualEnums.GRADE.getRegistro();
            case ENDERECO:
                return FabCompVisualEndereco.INFORMACAO_ENDERECO.getRegistro();
            case SUB_ITENS:
                return FabCompVisualSubItens.SUB_FORM_SIMPLES.getRegistro();

            default:
                return FabCompVisualItem.NOME_E_IMAGEM.getRegistro();

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
                return ComoEntidadeSimples.class;
            case ITENS_BEAN_SIMPLES:
                return List.class;
            case BOTAO_DE_ACAO:
                return ComoAcaoDoSistema.class;

            default:
                return ItfCampoInstanciado.class;

        }

    }

    @Override
    public String getNomeFAmilia() {
        return UtilSBCoreStringEnumECaixaAlta.getCamelCaseDoEnumPrimeiraLetraMaiusucula(this);
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
