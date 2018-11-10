/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.contato;

import java.util.List;

/**
 *
 * @author SalvioF
 */
public interface ItfBeanObjetoDeContato {

    public ItfBeanContatoSimples getContatoPrincipal();

    public List< ? extends ItfBeanContatoSimples> getContatos();

}
