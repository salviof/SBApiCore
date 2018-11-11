/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import java.util.Date;

/**
 *
 * @author SalvioF
 */
public interface ItfBeanEmailSimples extends ItfBeanSimples {

    public String getAssunto();

    public String getTextoMensagem();

    public String getEmailsDestinatarios();

    public String getEmailRemetente();

    public Date getDataHoraEmailArmazenado();

}
