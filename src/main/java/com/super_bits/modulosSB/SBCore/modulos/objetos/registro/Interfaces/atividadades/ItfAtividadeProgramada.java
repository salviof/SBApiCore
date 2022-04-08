/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.atividadades;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanNormal;
import java.util.Date;

/**
 *
 * @author sfurbino
 */
public interface ItfAtividadeProgramada extends ItfBeanNormal {

    public default String getTitulo() {
        return getNome();
    }

    public Date getDataHoraInicioAtividade();

    public Date getDataHoraPrevisaoExecucao();

    public Date getDataHoraConclusao();

    public String getUrlAtividade();

}
