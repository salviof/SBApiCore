/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.erp;

/**
 *
 * @author salvio
 */
public interface ItfServicoLinkEntreEntidadesErpRestfull extends ItfServicoLinkDeEntidadesERP {

    public String getCodigoApiExterna(ItfSistemaERP pSistema, Class pEntidade, String pCodigoInterno);

    public String getCodigoSistemaInterno(ItfSistemaERP pSistema, Class pEntidade, String pCodigoapiExterno);

    public boolean registrarCodigoLigacaoApi(ItfSistemaERP pSistema, Class pEntidade, String codigoInterno, String codigoAPIExterna);

}
