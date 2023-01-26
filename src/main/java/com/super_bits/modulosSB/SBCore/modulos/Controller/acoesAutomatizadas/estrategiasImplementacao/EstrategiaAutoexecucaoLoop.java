/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.estrategiasImplementacao;

import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.FabTipoAutoExecucaoAcao;
import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.ItfEstrategiaAutoexecucao;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author salvio
 */
public class EstrategiaAutoexecucaoLoop implements ItfEstrategiaAutoexecucao {

    private final Date dataReferencia;
    private final FabTipoAutoExecucaoAcao tipoAtuoExecucao;

    public EstrategiaAutoexecucaoLoop(Date dataReferencia, FabTipoAutoExecucaoAcao tipoAtuoExecucao) {
        this.dataReferencia = dataReferencia;
        this.tipoAtuoExecucao = tipoAtuoExecucao;
    }

    @Override
    public Date getProximoHorarioAgendamento() {
        Calendar calendarioAgendaBuilder = Calendar.getInstance();
        calendarioAgendaBuilder.setTime(dataReferencia);
        calendarioAgendaBuilder.add(Calendar.SECOND, 5);
        int segundos = 5;
        switch (tipoAtuoExecucao) {

            case LOOP_INFINITO_INTERVALO_30_SEGUNDOS:
                segundos = 30;
                break;

            default:
                throw new AssertionError();
        }
        calendarioAgendaBuilder.add(Calendar.SECOND, segundos);
        return calendarioAgendaBuilder.getTime();
    }

}
