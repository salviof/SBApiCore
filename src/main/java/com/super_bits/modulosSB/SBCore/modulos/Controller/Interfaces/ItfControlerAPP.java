/*
 *  Super-Bits.com CODE CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces;


import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

/**
 *
 * @author Salvio
 */
public interface ItfControlerAPP {

    public boolean possuiEstaAcao(ComoAcaoDoSistema permissao);

    public boolean isAcessoPermitido(ComoUsuario pUsuario, ComoAcaoDoSistema permissao);

}
