/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaStatus;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoDaFabrica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author novy
 */
public enum FabStatusComunicacao implements ItfFabricaStatus {

    @InfoObjetoDaFabrica(classeObjeto = StatusNotificacao.class, id = 1, nomeObjeto = "Selado")
    SELADO,
    @InfoObjetoDaFabrica(classeObjeto = StatusNotificacao.class, id = 2, nomeObjeto = "Enviado")
    ENVIADO,
    @InfoObjetoDaFabrica(classeObjeto = StatusNotificacao.class, id = 3, nomeObjeto = "Recebido")
    RECEBIDO,
    @InfoObjetoDaFabrica(classeObjeto = StatusNotificacao.class, id = 4, nomeObjeto = "Respondido")
    RESPONDIDO;

    @Override
    public List<ItfAcaoDoSistema> opcoesPorStatus() {
        return new ArrayList<>();
    }

}
