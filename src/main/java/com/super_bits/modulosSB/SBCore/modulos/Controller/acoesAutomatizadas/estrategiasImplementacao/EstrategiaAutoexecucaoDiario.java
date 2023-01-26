/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.estrategiasImplementacao;

import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.FabTipoAutoExecucaoAcao;
import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.ItfEstrategiaAutoexecucao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author salvio
 */
public class EstrategiaAutoexecucaoDiario implements ItfEstrategiaAutoexecucao {

    private final Date dataReferencia;
    private final FabTipoAutoExecucaoAcao tipoAtuoExecucao;

    public EstrategiaAutoexecucaoDiario(Date pDataReferencia, FabTipoAutoExecucaoAcao tipoAtuoExecucao) {
        this.dataReferencia = pDataReferencia;
        this.tipoAtuoExecucao = tipoAtuoExecucao;
    }

    @Override
    public Date getProximoHorarioAgendamento() {

        Calendar calendarioAgendaBuilder = Calendar.getInstance();
        calendarioAgendaBuilder.setTime(dataReferencia);

        int horaReferencia = calendarioAgendaBuilder.get(Calendar.HOUR_OF_DAY);

        int horaProgramacao = 0;

        switch (tipoAtuoExecucao) {

            case DIARIO_MEIA_NOITE:
                horaProgramacao = 00;
                break;
            case DIARIO_MEIO_DIA:
                horaProgramacao = 12;
                break;
            case DIARIO_MADRUGADA_TREZ_DA_MANHA:
                horaProgramacao = 03;
                break;
            case DIARIO_MANHA_5_HORAS:
                horaProgramacao = 05;
                break;
            case DIARIO_TARDE_15_HORAS:
                horaProgramacao = 15;
                break;
            case DIARIO_TARDE_18HORRAS:
                horaProgramacao = 18;
                break;

            default:
                throw new AssertionError();
        }
        if (horaReferencia >= horaProgramacao) {
            calendarioAgendaBuilder.add(Calendar.DAY_OF_MONTH, 1);
        }
        String hora = String.format("%02d", horaProgramacao);

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        StringBuilder stringDataProximaExecucao = new StringBuilder();
        stringDataProximaExecucao.append(calendarioAgendaBuilder.get(Calendar.DAY_OF_MONTH)).append("/");
        stringDataProximaExecucao.append(calendarioAgendaBuilder.get(Calendar.MONTH) + 1).append("/");
        stringDataProximaExecucao.append(calendarioAgendaBuilder.get(Calendar.YEAR)).append(" ");
        stringDataProximaExecucao.append(hora).append(":");
        stringDataProximaExecucao.append("00");
        try {
            Date dataHoraAgendamento = formatoData.parse(stringDataProximaExecucao.toString());
            return dataHoraAgendamento;
        } catch (ParseException ex) {
            Logger.getLogger(EstrategiaAutoexecucaoDiario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
