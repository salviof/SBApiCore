/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas;

import java.util.Date;

/**
 *
 * @author salvio
 */
public enum FabTipoAutoExecucaoAcao {

    DESATIVADO,
    SISTEMA_BOOT,
    SISTEMA_FINAL,
    DIARIO_MEIA_NOITE,
    DIARIO_MEIO_DIA,
    DIARIO_MADRUGADA_TREZ_DA_MANHA,
    DIARIO_MANHA_5_HORAS,
    DIARIO_TARDE_15_HORAS,
    DIARIO_TARDE_18HORRAS,
    MINUTOS_A_CADA_5,
    MINUTOS_A_CADA_15,
    MINUTOS_A_CADA_30,
    HORAS_A_CADA_1,
    HORAS_A_CADA_3,
    HORAS_A_CADA_6,
    HORAS_A_CADA_12,
    HORAS_A_CADA_24,
    MENSALMENTE_PRIMEIRO_DIA_MES,
    MENSALMENTE_ULTIMO_DIA_MES,
    MENSALMENTE_QUINTO_DIA_UTIL,
    MENSALMENTE_DIA_10,
    MENSALMENTE_DIA_15,
    MENSALMENTE_DIA_20,
    LOOP_INFINITO,
    LOOP_INFINITO_INTERVALO_30_SEGUNDOS;

    public FabEstrategiaAutoexecucao getEstrategia() {
        switch (this) {

            case DESATIVADO:
                return null;

            case SISTEMA_BOOT:
            case SISTEMA_FINAL:
                return FabEstrategiaAutoexecucao.GATILHO;
            case DIARIO_MEIA_NOITE:
            case DIARIO_MEIO_DIA:
            case DIARIO_MADRUGADA_TREZ_DA_MANHA:
            case DIARIO_MANHA_5_HORAS:
            case DIARIO_TARDE_15_HORAS:
            case DIARIO_TARDE_18HORRAS:
                return FabEstrategiaAutoexecucao.DIARIO;
            case MINUTOS_A_CADA_5:
            case MINUTOS_A_CADA_15:
            case MINUTOS_A_CADA_30:
                return FabEstrategiaAutoexecucao.MINUTOS;
            case HORAS_A_CADA_1:
            case HORAS_A_CADA_3:
            case HORAS_A_CADA_6:
            case HORAS_A_CADA_12:
            case HORAS_A_CADA_24:
                return FabEstrategiaAutoexecucao.HORAS;
            case MENSALMENTE_PRIMEIRO_DIA_MES:
            case MENSALMENTE_ULTIMO_DIA_MES:
            case MENSALMENTE_QUINTO_DIA_UTIL:
            case MENSALMENTE_DIA_10:
            case MENSALMENTE_DIA_15:
            case MENSALMENTE_DIA_20:
                return FabEstrategiaAutoexecucao.MENSAL;
            case LOOP_INFINITO:
            case LOOP_INFINITO_INTERVALO_30_SEGUNDOS:
                return FabEstrategiaAutoexecucao.LOOP;
            default:
                throw new AssertionError();
        }
    }

}
