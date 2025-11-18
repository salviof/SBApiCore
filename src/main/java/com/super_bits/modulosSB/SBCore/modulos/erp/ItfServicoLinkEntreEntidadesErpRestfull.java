/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.erp;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;

/**
 *
 * @author salvio
 */
public interface ItfServicoLinkEntreEntidadesErpRestfull extends ItfServicoLinkDeEntidadesERP {

    public String getCodigoApiExterna(ItfSistemaERP pSistema, ComoEntidadeSimples pBeanSimples);

    public String getCodigoSistemaInterno(ItfSistemaERP pSistema, Class pEntidade, String pCodigoapiExterno);

    public boolean registrarCodigoLigacaoApi(ItfSistemaERP pSistema, ComoEntidadeSimples pEntidade, String codigoAPIExterna);

}
