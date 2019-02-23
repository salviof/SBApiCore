/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoDaFabrica;

/**
 *
 * @author novy
 */
public enum FabStatusComunicacao implements ItfFabrica {

    @InfoObjetoDaFabrica(classeObjeto = StatusComunicacao.class, id = 1, nomeObjeto = "Selado")
    SELADO,
    @InfoObjetoDaFabrica(classeObjeto = StatusComunicacao.class, id = 2, nomeObjeto = "Enviado")
    ENVIADO,
    @InfoObjetoDaFabrica(classeObjeto = StatusComunicacao.class, id = 3, nomeObjeto = "Recebido")
    RECEBIDO,
    @InfoObjetoDaFabrica(classeObjeto = StatusComunicacao.class, id = 4, nomeObjeto = "Respondido")
    RESPONDIDO;

}
