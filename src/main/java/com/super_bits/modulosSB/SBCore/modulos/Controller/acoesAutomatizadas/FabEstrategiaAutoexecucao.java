/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas;

import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.estrategiasImplementacao.EstrategiaAutoexecucaoDiario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.estrategiasImplementacao.EstrategiaAutoexecucaoGatilho;
import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.estrategiasImplementacao.EstrategiaAutoexecucaoHorario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.estrategiasImplementacao.EstrategiaAutoexecucaoLoop;
import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.estrategiasImplementacao.EstrategiaAutoexecucaoMensal;
import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.estrategiasImplementacao.EstrategiaAutoexecucaoMinutos;
import java.util.Date;

/**
 *
 * @author salvio
 */
public enum FabEstrategiaAutoexecucao {

    GATILHO,
    DIARIO,
    MENSAL,
    LOOP,
    MINUTOS,
    HORAS;

    public ItfEstrategiaAutoexecucao getEstrategiaImplementacao(Date pDataReferencia, FabTipoAutoExecucaoAcao pTipo) {
        switch (this) {
            case GATILHO:
                return new EstrategiaAutoexecucaoGatilho(pDataReferencia, pTipo);

            case DIARIO:
                return new EstrategiaAutoexecucaoDiario(pDataReferencia, pTipo);

            case MENSAL:
                return new EstrategiaAutoexecucaoMensal(pDataReferencia, pTipo);

            case LOOP:
                return new EstrategiaAutoexecucaoLoop(pDataReferencia, pTipo);

            case MINUTOS:
                return new EstrategiaAutoexecucaoMinutos(pDataReferencia, pTipo);

            case HORAS:
                return new EstrategiaAutoexecucaoHorario(pDataReferencia, pTipo);

            default:
                throw new AssertionError(this.name());

        }
    }

}
