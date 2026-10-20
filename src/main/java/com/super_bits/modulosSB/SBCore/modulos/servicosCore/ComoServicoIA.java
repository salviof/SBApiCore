/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.servicosCore;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.ia.ComoFabricaExecucaoIA;

/**
 *
 * @author salvio
 */
public interface ComoServicoIA {

    public ComoFabricaExecucaoIA getFabricaExecucaoPorEntidade(ComoEntidadeSimples pEntidade);

}
