/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.fabrica;


import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

/**
 *
 * @author desenvolvedor
 */
public interface ComoFabricaStatus extends ComoFabrica {

    public List<ComoAcaoDoSistema> opcoesPorStatus();

}
