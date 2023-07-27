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
public class EstrategiaAutoexecucaoMinutos implements ItfEstrategiaAutoexecucao {

    private final Date dataReferencia;
    private final FabTipoAutoExecucaoAcao tipoAtuoExecucao;

    public EstrategiaAutoexecucaoMinutos(Date dataReferencia, FabTipoAutoExecucaoAcao tipoAtuoExecucao) {
        this.dataReferencia = dataReferencia;
        this.tipoAtuoExecucao = tipoAtuoExecucao;
    }

    @Override
    public Date getProximoHorarioAgendamento() {

        Calendar calendarioAgendaBuilder = Calendar.getInstance();
        calendarioAgendaBuilder.setTime(dataReferencia);

        int minutosReferencia = calendarioAgendaBuilder.get(Calendar.MINUTE);
        int multiploMinuto = 0;

        switch (tipoAtuoExecucao) {

            case MINUTOS_A_CADA_5:
                multiploMinuto = 5;
                break;
            case MINUTOS_A_CADA_15:
                multiploMinuto = 15;
                break;
            case MINUTOS_A_CADA_30:
                multiploMinuto = 30;
                break;
            default:
                throw new AssertionError();
        }
        int resto = minutosReferencia % multiploMinuto;
        int minutosacrecimo = multiploMinuto;

        if (resto > 0) {
            int diferenca = multiploMinuto - resto;
            //minutosacrecimo = multiploMinuto + diferenca;
            minutosacrecimo = diferenca;
        }
        calendarioAgendaBuilder.add(Calendar.MINUTE, minutosacrecimo);

        int novaHora = calendarioAgendaBuilder.get(Calendar.HOUR_OF_DAY);
        int novoMinuto = calendarioAgendaBuilder.get(Calendar.MINUTE);

        String horaFormatada = String.format("%02d", novaHora);
        String minutoFormatado = String.format("%02d", novoMinuto);

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        StringBuilder stringDataProximaExecucao = new StringBuilder();
        stringDataProximaExecucao.append(calendarioAgendaBuilder.get(Calendar.DAY_OF_MONTH)).append("/");
        stringDataProximaExecucao.append(calendarioAgendaBuilder.get(Calendar.MONTH) + 1).append("/");
        stringDataProximaExecucao.append(calendarioAgendaBuilder.get(Calendar.YEAR)).append(" ");
        stringDataProximaExecucao.append(horaFormatada).append(":");
        stringDataProximaExecucao.append(minutoFormatado);
        try {
            Date dataHoraAgendamento = formatoData.parse(stringDataProximaExecucao.toString());
            return dataHoraAgendamento;
        } catch (ParseException ex) {
            Logger.getLogger(EstrategiaAutoexecucaoDiario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

}
