/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.estrutura;

/**
 *
 * @author vipdeveloper
 */
public interface ItfListaDeEntidade {

    ItfEstruturaDeEntidade getEstrutura();

    int getId();

    String getJavaDoc();

    String getNomeDeclaracao();

    String getNomeEntidade();

    String getNomeEnum();

    String getNomeObjetoListado();

    void setEstrutura(ItfEstruturaDeEntidade estrutura);

    void setJavaDoc(String javaDoc);

    void setNomeDeclaracao(String nomeDeclaracao);

    void setNomeEntidade(String nomeEntidade);

    void setNomeEnum(String nomeEnum);

    void setNomeObjetoListado(String nomeObjetoListado);

}
