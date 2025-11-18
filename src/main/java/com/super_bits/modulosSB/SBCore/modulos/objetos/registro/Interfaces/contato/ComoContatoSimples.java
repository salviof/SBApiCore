/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.contato;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoTemEmail;

/**
 *
 * @author sfurbino
 */
public interface ComoContatoSimples extends ComoTemEmail, ComoEntidadeSimples {

    public String getTelefonePrincipal();

}
