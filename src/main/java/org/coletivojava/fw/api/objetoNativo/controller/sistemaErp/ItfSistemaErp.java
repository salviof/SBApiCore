/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coletivojava.fw.api.objetoNativo.controller.sistemaErp;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import jakarta.json.JsonObject;

/**
 *
 * @author sfurbino
 */
public interface ItfSistemaErp extends ItfBeanSimples {

    public String getDominio();

    public String getChavePublica();

    public String getHashChavePublica();

    public String getUrlRecepcaoCodigo();

    public JsonObject getComoJson();

}
