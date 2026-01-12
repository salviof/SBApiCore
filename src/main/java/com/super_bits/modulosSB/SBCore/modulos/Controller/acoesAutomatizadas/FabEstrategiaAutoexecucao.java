package com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas;

import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesProgramadas.estrategiasImplementacao.EstrategiaAutoexecucaoDiario;

import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesProgramadas.estrategiasImplementacao.EstrategiaAutoexecucaoHorario;

import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesProgramadas.estrategiasImplementacao.EstrategiaAutoexecucaoGatilho;
import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesProgramadas.estrategiasImplementacao.EstrategiaAutoexecucaoLoop;
import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesProgramadas.estrategiasImplementacao.EstrategiaAutoexecucaoMensal;
import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesProgramadas.estrategiasImplementacao.EstrategiaAutoexecucaoMinutos;
import java.util.Date;

/**
 *
 * @author salvio
 *
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
