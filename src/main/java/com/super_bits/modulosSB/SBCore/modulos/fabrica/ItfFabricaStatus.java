/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.fabrica;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;

import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfFabricaStatus extends ItfFabrica {

    public List<ItfAcaoDoSistema> opcoesPorStatus();

}
