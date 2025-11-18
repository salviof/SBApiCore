/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabrica;

/**
 *
 * Um Bean estático é um Objeto que será criado a apartir de uma fábrica, desta
 * forma é possível retornar o enum do objeto atravéz do método getFabricaObjeto
 *
 * -> Este tipo de objeto deve ser estático no quesito quantidade de registro,
 * pois o método getFabricaObjeto normalmente é utilizado para programação de
 * regra de negocio de acorodo com enum vinculado
 *
 * @author desenvolvedor
 */
public interface ComoTemFabricaEstatica extends ComoEntidadeSimplesSomenteLeitura {

    /**
     * ->A Fabrica deve ser informada em:
     * @link InfoObjetoSB
     *
     * @return Enum referente ao Objeto
     */
    public ComoFabrica getFabricaObjeto();

}
