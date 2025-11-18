/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.servicosCore;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfResposta;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfRespostaAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.erp.SolicitacaoControllerERP;

/**
 *
 * @author sfurbino
 */
public interface ComoServicoControllerExecucao {

    public ItfRespostaAcaoDoSistema executarAcao(SolicitacaoControllerERP pSolicitacao);

}
