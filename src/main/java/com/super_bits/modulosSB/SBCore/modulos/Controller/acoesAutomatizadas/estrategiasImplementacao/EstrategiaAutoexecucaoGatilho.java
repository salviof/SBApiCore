/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.estrategiasImplementacao;

import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.FabTipoAutoExecucaoAcao;
import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.ItfEstrategiaAutoexecucao;
import java.util.Date;

/**
 *
 * @author salvio
 */
public class EstrategiaAutoexecucaoGatilho implements ItfEstrategiaAutoexecucao {

    private final Date dataReferencia;
    private final FabTipoAutoExecucaoAcao tipoAtuoExecucao;

    public EstrategiaAutoexecucaoGatilho(Date pDate, FabTipoAutoExecucaoAcao pTipoAutoExecucao) {
        dataReferencia = pDate;
        tipoAtuoExecucao = pTipoAutoExecucao;
    }

    @Override
    public Date getProximoHorarioAgendamento() {

        return null;

    }

}
