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
public class EstrategiaAutoexecucaoHorario implements ItfEstrategiaAutoexecucao {

    private final Date dataReferencia;
    private final FabTipoAutoExecucaoAcao tipoAtuoExecucao;

    public EstrategiaAutoexecucaoHorario(Date dataReferencia, FabTipoAutoExecucaoAcao tipoAtuoExecucao) {
        this.dataReferencia = dataReferencia;
        this.tipoAtuoExecucao = tipoAtuoExecucao;
    }

    @Override
    public Date getProximoHorarioAgendamento() {

        Calendar calendarioAgendaBuilder = Calendar.getInstance();
        calendarioAgendaBuilder.setTime(dataReferencia);

        int horaReferencia = calendarioAgendaBuilder.get(Calendar.HOUR_OF_DAY);
        int multiploHorario = 0;

        switch (tipoAtuoExecucao) {

            case HORAS_A_CADA_1:
                multiploHorario = 1;
                break;
            case HORAS_A_CADA_3:
                multiploHorario = 3;
                break;
            case HORAS_A_CADA_6:
                multiploHorario = 6;
                break;
            case HORAS_A_CADA_12:
                multiploHorario = 12;
                break;
            case HORAS_A_CADA_24:
                multiploHorario = 24;
                break;

            default:
                throw new AssertionError();
        }
        int resto = horaReferencia % multiploHorario;

        if (resto > 0) {
            calendarioAgendaBuilder.add(Calendar.HOUR_OF_DAY, resto);
        } else {
            calendarioAgendaBuilder.add(Calendar.HOUR_OF_DAY, multiploHorario);
        }

        int novaHora = calendarioAgendaBuilder.get(Calendar.HOUR_OF_DAY);

        String hora = String.format("%02d", novaHora);

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        StringBuilder stringDataProximaExecucao = new StringBuilder();
        stringDataProximaExecucao.append(calendarioAgendaBuilder.get(Calendar.DAY_OF_MONTH)).append("/");
        stringDataProximaExecucao.append(calendarioAgendaBuilder.get(Calendar.MONTH) + 1).append("/");
        stringDataProximaExecucao.append(calendarioAgendaBuilder.get(Calendar.YEAR)).append(" ");
        stringDataProximaExecucao.append(novaHora).append(":");
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
