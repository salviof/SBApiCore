/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.erp;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import jakarta.json.JsonObject;

/**
 *
 * @author sfurbino
 */
public interface ItfSistemaERP extends ItfBeanSimples {

    public String getChavePublica();

    public JsonObject getComoJson();

    public String getDominio();

    public String getHashChavePublica();

    @Override
    public Long getId();

    @Override
    public String getNome();

    public String getUrlPublicaEndPoint();

    public String getUrlRecepcaoCodigo();

    public String getEmailusuarioAdmin();
}
