/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.estrutura;

/**
 *
 * @author vipdeveloper
 */
public interface ItfLigacaoMuitosParaMuitos {

    String getInverseJoinColumName();

    String getJoinColumName();

    String getJoinTableName();

    String getNomeDeclarado();

    void setInverseJoinColumName(String inverseJoinColumName);

    void setJoinColumName(String joinColumName);

    void setJoinTableName(String joinTableName);

    void setNomeDeclarado(String nomeDeclarado);

}
