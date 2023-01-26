/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.estrategiasImplementacao;

import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.FabTipoAutoExecucaoAcao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 *
 * @author salvio
 */
public class EstrategiaAutoexecucaoHorarioTest {

    @Test
    public void testGetProximoHorarioAgendamento() {

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            Date dataReferencia = formatoData.parse("25/06/1983 12:00");

            EstrategiaAutoexecucaoHorario novaEstrategia = new EstrategiaAutoexecucaoHorario(dataReferencia, FabTipoAutoExecucaoAcao.HORAS_A_CADA_1);
            assertEquals("Erro defindo proximo horário meia noite", "25/06/1983 13:00", formatoData.format(novaEstrategia.getProximoHorarioAgendamento()));
            EstrategiaAutoexecucaoHorario novaEstrategia5DaManha = new EstrategiaAutoexecucaoHorario(dataReferencia, FabTipoAutoExecucaoAcao.HORAS_A_CADA_3);
            assertEquals("Erro defindo proximo horário para 5 da manhã", "25/06/1983 15:00", formatoData.format(novaEstrategia5DaManha.getProximoHorarioAgendamento()));
            EstrategiaAutoexecucaoHorario novaEstrategiaMeioDia = new EstrategiaAutoexecucaoHorario(dataReferencia, FabTipoAutoExecucaoAcao.HORAS_A_CADA_6);
            assertEquals("Erro defindo proximo horário para meio dia", "25/06/1983 18:00", formatoData.format(novaEstrategiaMeioDia.getProximoHorarioAgendamento()));
            EstrategiaAutoexecucaoHorario novaEstrategia15Horas = new EstrategiaAutoexecucaoHorario(dataReferencia, FabTipoAutoExecucaoAcao.HORAS_A_CADA_12);
            assertEquals("Erro defindo proximo horário para 5 da manhã", "26/06/1983 00:00", formatoData.format(novaEstrategia15Horas.getProximoHorarioAgendamento()));
            EstrategiaAutoexecucaoHorario novaEstrategia18Horas = new EstrategiaAutoexecucaoHorario(dataReferencia, FabTipoAutoExecucaoAcao.HORAS_A_CADA_24);
            assertEquals("Erro defindo proximo horário para 5 da manhã", "26/06/1983 00:00", formatoData.format(novaEstrategia18Horas.getProximoHorarioAgendamento()));

            Date dataReferencia2 = formatoData.parse("25/06/1983 00:00");
            EstrategiaAutoexecucaoHorario novaEstrategia24Horas = new EstrategiaAutoexecucaoHorario(dataReferencia2, FabTipoAutoExecucaoAcao.HORAS_A_CADA_24);
            assertEquals("Erro defindo proximo horário para 5 da manhã", "26/06/1983 00:00", formatoData.format(novaEstrategia24Horas.getProximoHorarioAgendamento()));

        } catch (ParseException ex) {
            Logger.getLogger(EstrategiaAutoexecucaoDiarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
