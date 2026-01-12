/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.contato;

import java.util.List;

/**
 *
 * @author SalvioF
 */
public interface ComoObjetoComContato {

    public ComoContatoSimples getContatoPrincipal();

    public List< ? extends ComoContatoSimples> getContatos();

}
