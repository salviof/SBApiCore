/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import java.io.Serializable;

/**
 *
 * @author sfurbino
 */
public interface ItfDadoDinamico extends Serializable {

    public String getNome();

    public FabTipoAtributoObjeto getTipoCampo();

    public ItfTipoAtributoSB getCampoPropriedades();

    public void setNome(String nome);

    public ItfCampoInstanciado getCampoInstanciado();

    public String getValorEnpacotado();

    public void setValorEmpacotado(String pValor);

}
