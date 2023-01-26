/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes;

import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.FabTipoAutoExecucaoAcao;

/**
 *
 * @author salvio
 */
public interface ItfAcaoControllerAutoExecucao extends ItfAcaoController {

    public FabTipoAutoExecucaoAcao getTipoAutoExecucao();

    public void setTipoAutoExecucao(FabTipoAutoExecucaoAcao pTipo);

}
