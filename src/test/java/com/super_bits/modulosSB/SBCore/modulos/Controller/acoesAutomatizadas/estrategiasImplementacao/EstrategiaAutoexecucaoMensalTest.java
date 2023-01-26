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
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author salvio
 */
public class EstrategiaAutoexecucaoMensalTest {

    public EstrategiaAutoexecucaoMensalTest() {
    }

    @Test
    public void testGetProximoHorarioAgendamento() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            Date dataReferencia = formatoData.parse("15/06/2022 12:00");

            EstrategiaAutoexecucaoMensal novaEstrategia = new EstrategiaAutoexecucaoMensal(dataReferencia, FabTipoAutoExecucaoAcao.MENSALMENTE_PRIMEIRO_DIA_MES);
            assertEquals("Erro defindo proximo horário meia noite", "01/07/2022 00:00", formatoData.format(novaEstrategia.getProximoHorarioAgendamento()));

            EstrategiaAutoexecucaoMensal novaEstrategia5DaManha = new EstrategiaAutoexecucaoMensal(dataReferencia, FabTipoAutoExecucaoAcao.MENSALMENTE_DIA_10);
            assertEquals("Erro defindo proximo horário para 5 da manhã", "10/07/2022 00:00", formatoData.format(novaEstrategia5DaManha.getProximoHorarioAgendamento()));

            EstrategiaAutoexecucaoMensal novaEstrategiaMeioDia = new EstrategiaAutoexecucaoMensal(dataReferencia, FabTipoAutoExecucaoAcao.MENSALMENTE_DIA_15);
            assertEquals("Erro defindo proximo horário para meio dia", "15/07/2022 00:00", formatoData.format(novaEstrategiaMeioDia.getProximoHorarioAgendamento()));

            EstrategiaAutoexecucaoMensal novaEstrategia15Horas = new EstrategiaAutoexecucaoMensal(dataReferencia, FabTipoAutoExecucaoAcao.MENSALMENTE_DIA_20);
            assertEquals("Erro defindo proximo horário para 5 da manhã", "20/06/2022 00:00", formatoData.format(novaEstrategia15Horas.getProximoHorarioAgendamento()));

            EstrategiaAutoexecucaoMensal novaEstrategia18Horas = new EstrategiaAutoexecucaoMensal(dataReferencia, FabTipoAutoExecucaoAcao.MENSALMENTE_ULTIMO_DIA_MES);
            assertEquals("Erro defindo proximo horário para 5 da manhã", "30/06/2022 00:00", formatoData.format(novaEstrategia18Horas.getProximoHorarioAgendamento()));

            EstrategiaAutoexecucaoMensal quintoDiaUtil = new EstrategiaAutoexecucaoMensal(dataReferencia, FabTipoAutoExecucaoAcao.MENSALMENTE_QUINTO_DIA_UTIL);
            assertEquals("Erro defindo proximo horário para 5 da manhã", "07/07/2022 00:00", formatoData.format(quintoDiaUtil.getProximoHorarioAgendamento()));
            dataReferencia = formatoData.parse("02/06/2022 12:00");
            EstrategiaAutoexecucaoMensal teste2QuintoDiaUTil = new EstrategiaAutoexecucaoMensal(dataReferencia, FabTipoAutoExecucaoAcao.MENSALMENTE_QUINTO_DIA_UTIL);
            assertEquals("Erro defindo proximo horário para 5 da manhã", "07/06/2022 00:00", formatoData.format(teste2QuintoDiaUTil.getProximoHorarioAgendamento()));

        } catch (ParseException ex) {
            Logger.getLogger(EstrategiaAutoexecucaoDiarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
