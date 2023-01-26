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
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 *
 * @author salvio
 */
public class EstrategiaAutoexecucaoDiarioTest {

    public EstrategiaAutoexecucaoDiarioTest() {
    }

    @Test
    public void testGetProximoHorarioAgendamento() {

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            Date dataReferencia = formatoData.parse("25/06/1983 12:00");

            EstrategiaAutoexecucaoDiario novaEstrategia = new EstrategiaAutoexecucaoDiario(dataReferencia, FabTipoAutoExecucaoAcao.DIARIO_MEIA_NOITE);
            assertEquals("Erro defindo proximo horário meia noite", "26/06/1983 00:00", formatoData.format(novaEstrategia.getProximoHorarioAgendamento()));
            EstrategiaAutoexecucaoDiario novaEstrategia5DaManha = new EstrategiaAutoexecucaoDiario(dataReferencia, FabTipoAutoExecucaoAcao.DIARIO_MANHA_5_HORAS);
            assertEquals("Erro defindo proximo horário para 5 da manhã", "26/06/1983 05:00", formatoData.format(novaEstrategia5DaManha.getProximoHorarioAgendamento()));
            EstrategiaAutoexecucaoDiario novaEstrategiaMeioDia = new EstrategiaAutoexecucaoDiario(dataReferencia, FabTipoAutoExecucaoAcao.DIARIO_MEIO_DIA);
            assertEquals("Erro defindo proximo horário para meio dia", "26/06/1983 12:00", formatoData.format(novaEstrategiaMeioDia.getProximoHorarioAgendamento()));
            EstrategiaAutoexecucaoDiario novaEstrategia15Horas = new EstrategiaAutoexecucaoDiario(dataReferencia, FabTipoAutoExecucaoAcao.DIARIO_TARDE_15_HORAS);
            assertEquals("Erro defindo proximo horário para 5 da manhã", "25/06/1983 15:00", formatoData.format(novaEstrategia15Horas.getProximoHorarioAgendamento()));
            EstrategiaAutoexecucaoDiario novaEstrategia18Horas = new EstrategiaAutoexecucaoDiario(dataReferencia, FabTipoAutoExecucaoAcao.DIARIO_TARDE_18HORRAS);
            assertEquals("Erro defindo proximo horário para 5 da manhã", "25/06/1983 18:00", formatoData.format(novaEstrategia18Horas.getProximoHorarioAgendamento()));

        } catch (ParseException ex) {
            Logger.getLogger(EstrategiaAutoexecucaoDiarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
