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
public class EstrategiaAutoexecucaoMensal implements ItfEstrategiaAutoexecucao {

    private final Date dataReferencia;
    private final FabTipoAutoExecucaoAcao tipoAtuoExecucao;

    public EstrategiaAutoexecucaoMensal(Date dataReferencia, FabTipoAutoExecucaoAcao tipoAtuoExecucao) {
        this.dataReferencia = dataReferencia;
        this.tipoAtuoExecucao = tipoAtuoExecucao;
    }

    @Override
    public Date getProximoHorarioAgendamento() {
        Calendar calendarioAgendaBuilder = Calendar.getInstance();
        calendarioAgendaBuilder.setTime(dataReferencia);

        int diadoMesREferencia = calendarioAgendaBuilder.get(Calendar.DAY_OF_MONTH);

        int diaDoMes = 0;

        switch (tipoAtuoExecucao) {

            case MENSALMENTE_PRIMEIRO_DIA_MES:
                diaDoMes = 01;
                break;
            case MENSALMENTE_DIA_10:
                diaDoMes = 10;
                break;
            case MENSALMENTE_DIA_15:
                diaDoMes = 15;
                break;
            case MENSALMENTE_DIA_20:
                diaDoMes = 20;
                break;
            case MENSALMENTE_ULTIMO_DIA_MES:
                diaDoMes = calendarioAgendaBuilder.getActualMaximum(Calendar.DAY_OF_MONTH);

                break;
            case MENSALMENTE_QUINTO_DIA_UTIL:
                diaDoMes = 01;
                break;

            default:
                throw new AssertionError();
        }

        switch (tipoAtuoExecucao) {
            default:
                if (diaDoMes <= diadoMesREferencia) {
                    calendarioAgendaBuilder.add(Calendar.MONTH, 1);
                }
                break;
            case MENSALMENTE_QUINTO_DIA_UTIL:
                int diasuteis = 1;
                calendarioAgendaBuilder.set(Calendar.DAY_OF_MONTH, 1);
                while (diasuteis < 5) {

                    int diaDaSeman = calendarioAgendaBuilder.get(Calendar.DAY_OF_WEEK);
                    if (diaDaSeman != 1 && diaDaSeman != 7) {
                        diasuteis++;
                    }
                    calendarioAgendaBuilder.add(Calendar.DAY_OF_MONTH, 1);
                }
                diaDoMes = calendarioAgendaBuilder.get(Calendar.DAY_OF_MONTH);
                if (diaDoMes <= diadoMesREferencia) {
                    calendarioAgendaBuilder.add(Calendar.MONTH, 1);
                    calendarioAgendaBuilder.set(Calendar.DAY_OF_MONTH, 1);
                    diasuteis = 1;
                    while (diasuteis < 5) {
                        int diaDaSeman = calendarioAgendaBuilder.get(Calendar.DAY_OF_WEEK);
                        if (diaDaSeman != 1 && diaDaSeman != 7) {
                            diasuteis++;
                        }
                        calendarioAgendaBuilder.add(Calendar.DAY_OF_MONTH, 1);
                    }

                }
                diaDoMes = calendarioAgendaBuilder.get(Calendar.DAY_OF_MONTH);
                break;

        }

        String diadoMEsStr = String.format("%02d", diaDoMes);
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        StringBuilder stringDataProximaExecucao = new StringBuilder();
        stringDataProximaExecucao.append(diadoMEsStr).append("/");
        stringDataProximaExecucao.append(calendarioAgendaBuilder.get(Calendar.MONTH) + 1).append("/");
        stringDataProximaExecucao.append(calendarioAgendaBuilder.get(Calendar.YEAR)).append(" ");
        stringDataProximaExecucao.append("00").append(":");
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
