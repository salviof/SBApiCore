/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.erp;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

/**
 *
 * @author sfurbino
 */
public class SolicitacaoControllerERP {

    private final String nomeUnicoAcao;
    private final String codigoEntidade;
    private final String atributoEntidade;
    private final String corpoParametros;

    private final String erpServico;
    private final String erpCliente;
    private final JsonObjectBuilder jsonBuilder = Json.createObjectBuilder();
    private final ItfUsuario usuarioSolicitante;
    private final boolean autenticadoComSucesso;
    private final String metodo;

    public SolicitacaoControllerERP(String pMetodoRestful, String pHashIdentificadorServico, String pHashIdentificadorCliente,
            String pNomeUnicoAcao, ItfUsuario pUsuario, String pCodigo, String pAtributo, JsonObject pParametros) {
        erpServico = pHashIdentificadorServico;
        if (pParametros == null) {
            corpoParametros = "";
        } else {
            corpoParametros = pParametros.toString();
        }
        erpCliente = pHashIdentificadorCliente;
        nomeUnicoAcao = pNomeUnicoAcao;
        usuarioSolicitante = pUsuario;

        autenticadoComSucesso = usuarioSolicitante != null;
        metodo = pMetodoRestful;
        codigoEntidade = pCodigo;
        atributoEntidade = pAtributo;
    }

    public String getAcaoStrNomeUnico() {
        return nomeUnicoAcao;
    }

    public String getCorpoParametros() {
        return corpoParametros;
    }

    public String getErpServico() {
        return erpServico;
    }

    public String getErpCliente() {
        return erpCliente;
    }

    public ItfUsuario getUsuarioSolicitante() {
        return usuarioSolicitante;
    }

    public JsonObject getSolicitacaoJson() {
        jsonBuilder.add("nomeUnicoAcao", nomeUnicoAcao);
        jsonBuilder.add("corpoParametros", corpoParametros);
        jsonBuilder.add("erpServico", erpServico);
        jsonBuilder.add("erpCliente", erpCliente);
        return jsonBuilder.build();
    }

    public boolean isAutenticadoComSucesso() {
        return autenticadoComSucesso;
    }

    public String getMetodo() {
        return metodo;
    }

    public String getCodigoEntidade() {
        return codigoEntidade;
    }

    public String getAtributoEntidade() {
        return atributoEntidade;
    }

}
