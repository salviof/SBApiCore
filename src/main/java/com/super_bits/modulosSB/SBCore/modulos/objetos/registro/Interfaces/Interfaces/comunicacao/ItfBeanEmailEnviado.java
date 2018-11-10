/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.comunicacao;

import java.util.Date;

/**
 *
 * @author SalvioF
 */
public interface ItfBeanEmailEnviado extends ItfBeanEmailSimples {

    public Date getDataHoraMensagemRecebida();

    public boolean isEmailEnviadoUsuario();

    public boolean isEmailRecebidoUsuario();

}
