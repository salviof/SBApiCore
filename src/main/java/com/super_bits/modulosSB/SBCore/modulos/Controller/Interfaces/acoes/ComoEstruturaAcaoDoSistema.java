/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.fabricas.FabTipoAcaoSistema;

/**
 *
 * @author salvio
 */
public interface ComoEstruturaAcaoDoSistema {

    /**
     * ícone que representa a ação, os icones do answameFonts devem ser
     * configurados com um fa espaço, o nome do icone, ex: [fa fa-iconeLegal]
     *
     * @return icone da ação
     */
    public String getIconeAcao();

    /**
     *
     * Em alguns casos as açoes devem conter cores e os valores devem ser
     * setados em RGB Hexadecimal
     *
     * @return Cor da ação
     */
    public String getCor();

    /**
     *
     * Descrição detalhada da ação
     *
     * @return uma descrição detalhada da ação
     */
    public String getDescricao();

    public ItfModuloAcaoSistema getModulo();

    /**
     * Tipo de ação é um tipo de ação conhecida do sistema
     *
     * @return
     */
    public FabTipoAcaoSistema getTipoAcaoSistema();

    /**
     *
     * @return Boolean informando se a ação tem um formulário vinculado
     */
    public boolean isUmaAcaoFormulario();

    /**
     *
     * @return Boolean informando se esta ação possui uma ação principal
     * configurada, normalmente uma ação principal refere-se a ação de gestão de
     * dominio da ação
     */
    public boolean isTemAcaoPrincipal();

    /**
     *
     * @return Boolean, informando se é uma ação Generica conhecida do sistema
     */
    public boolean isUmaAcaoGenerica();

    /**
     *
     * @return Informa se a ação é uma ação de gestão de dominio
     */
    public boolean isUmaAcaoGestaoDominio();

    /**
     *
     * @return
     */
    public boolean isUmaAcaoDeEntidade();

    /**
     *
     * Retorna se é uma uma ação da camada de cotnroler (que executa alguma
     * alteração no banco de dados) os enuns das ações de controleer devem
     * conter _CTR_
     *
     * @return é Uma ação controller?
     */
    public boolean isUmaAcaoController();

    /**
     *
     * O nome do dominio é referente a primeira parte do nome da ação, antes das
     * palavras de marcação, como CTR, ou frm
     *
     * @return
     */
    public String getNomeDominio();
}
