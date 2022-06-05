/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.erp;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;

/**
 *
 * @author salvio
 */
public interface ItfServicoLinkEntreEntidadesErpRestfull extends ItfServicoLinkDeEntidadesERP {

    public String getCodigoApiExterna(ItfSistemaERP pSistema, ItfBeanSimples pBeanSimples);

    public String getCodigoSistemaInterno(ItfSistemaERP pSistema, Class pEntidade, String pCodigoapiExterno);

    public boolean registrarCodigoLigacaoApi(ItfSistemaERP pSistema, ItfBeanSimples pEntidade, String codigoAPIExterna);

}
