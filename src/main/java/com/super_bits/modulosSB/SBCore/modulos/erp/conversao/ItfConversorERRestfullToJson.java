/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.erp.conversao;

import com.super_bits.modulosSB.SBCore.modulos.erp.ItfSistemaERP;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import jakarta.json.JsonObject;

/**
 *
 * @author salvio
 */
public interface ItfConversorERRestfullToJson {

    public JsonObject getJson(ItfBeanSimples pJson);

    public ItfSistemaERP getSistemaRemoto();
}
