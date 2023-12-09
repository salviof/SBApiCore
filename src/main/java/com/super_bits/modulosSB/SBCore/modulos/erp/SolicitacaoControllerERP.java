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
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sfurbino
 */
public class SolicitacaoControllerERP {

    private final String nomeUnicoAcao;
    private final String codigoEntidade;
    private final String atributoEntidade;
    private final String corpoParametros;
    private JsonObject corpoParametroJson;

    private final String erpServico;
    private final String erpCliente;
    private final JsonObjectBuilder jsonBuilder = Json.createObjectBuilder();
    private final ItfUsuario usuarioSolicitante;
    private final boolean autenticadoComSucesso;
    private final String metodo;
    private final Map<String, String> parametrosDeUrl;
    private final boolean solicitarComoAdmin;

    public SolicitacaoControllerERP(String pMetodoRestful, String pHashIdentificadorServico, String pHashIdentificadorCliente,
            String pNomeUnicoAcao, ItfUsuario pUsuario, boolean pLoginComoAdmin, String pCodigo, String pAtributo, JsonObject pParametros, Map<String, String> pParametrosDeUrl) {
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
        parametrosDeUrl = pParametrosDeUrl;
        solicitarComoAdmin = pLoginComoAdmin;
    }

    public SolicitacaoControllerERP(String pMetodoRestful, String pHashIdentificadorServico, String pHashIdentificadorCliente,
            String pNomeUnicoAcao, ItfUsuario pUsuario, String pCodigo, String pAtributo, JsonObject pParametros, Map<String, String> pParametrosDeUrl) {
        this(pMetodoRestful, pHashIdentificadorServico, pHashIdentificadorCliente, pNomeUnicoAcao, pUsuario, false, pCodigo, pAtributo, pParametros, pParametrosDeUrl);
    }

    public SolicitacaoControllerERP(String pMetodoRestful, String pHashIdentificadorServico, String pHashIdentificadorCliente,
            String pNomeUnicoAcao, ItfUsuario pUsuario, boolean pAdmin, String pCodigo, String pAtributo, JsonObject pParametros) {
        this(pMetodoRestful, pHashIdentificadorServico, pHashIdentificadorCliente, pNomeUnicoAcao, pUsuario, pAdmin, pCodigo, pAtributo, pParametros, null);
    }

    public SolicitacaoControllerERP(String pMetodoRestful, String pHashIdentificadorServico, String pHashIdentificadorCliente,
            String pNomeUnicoAcao, ItfUsuario pUsuario, String pCodigo, String pAtributo, JsonObject pParametros) {
        this(pMetodoRestful, pHashIdentificadorServico, pHashIdentificadorCliente, pNomeUnicoAcao, pUsuario, pCodigo, pAtributo, pParametros, null);
    }

    public String getAcaoStrNomeUnico() {
        return nomeUnicoAcao;
    }

    public String getCorpoParametros() {
        return corpoParametros;
    }

    /**
     *
     * @return Código identificador chave pública do Servidor
     */
    public String getErpServico() {
        return erpServico;
    }

    /**
     *
     * @return Código identificador chave pública do cliente
     */
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

    public Map<String, String> getParametrosDeUrl() {
        return parametrosDeUrl;
    }

    public boolean isSolicitarComoAdmin() {
        return solicitarComoAdmin;
    }

}
