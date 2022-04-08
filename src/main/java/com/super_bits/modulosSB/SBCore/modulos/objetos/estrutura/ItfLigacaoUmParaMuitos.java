/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.estrutura;

/**
 *
 * @author vipdeveloper
 */
public interface ItfLigacaoUmParaMuitos {

    String getDescricao();

    String getLabel();

    String getNomeDeclarado();

    String getOrphanRemove();

    void setDescricao(String descricao);

    void setLabel(String label);

    void setNomeDeclarado(String nomeDeclarado);

    void setOrphanRemove(String orphanRemove);

}
