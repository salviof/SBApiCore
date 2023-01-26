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
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author salvio
 */
public class EstrategiaAutoexecucaoMinutosTest {

    public EstrategiaAutoexecucaoMinutosTest() {
    }

    /**
     * Test of getProximoHorarioAgendamento method, of class
     * EstrategiaAutoexecucaoMinutos.
     */
    @Test
    public void testGetProximoHorarioAgendamento() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            Date dataReferencia = formatoData.parse("25/06/1983 12:00");

            EstrategiaAutoexecucaoMinutos novaEstrategia = new EstrategiaAutoexecucaoMinutos(dataReferencia, FabTipoAutoExecucaoAcao.MINUTOS_A_CADA_5);
            assertEquals("Erro defindo proximo horário meia noite", "25/06/1983 12:05", formatoData.format(novaEstrategia.getProximoHorarioAgendamento()));
            EstrategiaAutoexecucaoMinutos novaEstrategia5DaManha = new EstrategiaAutoexecucaoMinutos(dataReferencia, FabTipoAutoExecucaoAcao.MINUTOS_A_CADA_15);
            assertEquals("Erro defindo proximo horário para 5 da manhã", "25/06/1983 12:15", formatoData.format(novaEstrategia5DaManha.getProximoHorarioAgendamento()));
            EstrategiaAutoexecucaoMinutos novaEstrategiaMeioDia = new EstrategiaAutoexecucaoMinutos(dataReferencia, FabTipoAutoExecucaoAcao.MINUTOS_A_CADA_30);
            assertEquals("Erro defindo proximo horário para meio dia", "25/06/1983 12:30", formatoData.format(novaEstrategiaMeioDia.getProximoHorarioAgendamento()));

        } catch (ParseException ex) {
            Logger.getLogger(EstrategiaAutoexecucaoDiarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
