/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.estrutura;

/**
 *
 * @author vipdeveloper
 */
public interface ItfListaDeEntidade {

    public ItfEstruturaDeEntidade getEstrutura();

    public Long getId();

    public String getJavaDoc();

    public String getNomeDeclaracao();

    public String getNomeEntidade();

    public String getNomeEnum();

    public String getNomeObjetoListado();

    public void setEstrutura(ItfEstruturaDeEntidade estrutura);

    public void setJavaDoc(String javaDoc);

    public void setNomeDeclaracao(String nomeDeclaracao);

    public void setNomeEntidade(String nomeEntidade);

    public void setNomeEnum(String nomeEnum);

    public void setNomeObjetoListado(String nomeObjetoListado);

}
