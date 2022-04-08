/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.estrutura;

import com.super_bits.modulosSB.SBCore.modulos.objetos.estrutura.ItfEstruturaDeEntidade;

/**
 *
 * @author vipdeveloper
 */
public interface ItfLigacaoMuitosParaUm extends ItfEstruturaDeEntidade {

    public String getNomeDeclarado();

    public Class getClasseObjetoVinculado();

}
