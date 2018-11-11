/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo;

/**
 *
 *
 *
 * TODO: Analizar desacoblar BeanSimples E criar uma Entidade Campo com
 * decorator
 *
 * @author sfurbino
 */
public interface ItfTipoAtributoSB extends ItfTipoAtributoSBSomenteLeitura, ItfAtributoComListaDeOpcoes {

    public void setLabelPadrao(String pLabel);

    public void setDescricao(String pDescricao);

    public void setFraseValidacao(String pFraseValidacao);

    public void setMascara(String pMaskara);

    public void setValorMaximo(int pValorMaximo);

    public void setValorMinimo(int pValorMinimo);

    public void setValidacaoRegex(String pValidacaoRegex);

    public void setNome(String pNome);

    public void setSeparadorDecimal(char pSeparadorDecimal);

    public void setSeparadorMilhar(char pSeparadorMilhar);

    public void setNumeroDeCasasDecimais(int pNumeroCasasDecimais);

    public void setSomenteLeitura(boolean pSomenteLeitura);

    public void setObrigatorio(boolean pObrigatorio);

    public void setFabricaTipoAtributo(FabTipoAtributoObjeto pTipoCampo);

}
