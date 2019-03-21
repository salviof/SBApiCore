/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.estrutura;

import java.util.Date;

/**
 *
 * @author vipdeveloper
 */
public interface ItfInfoStatusObjetoAplicacaoContexto {

    void atualizarInfomacoes();

    Class getClasseObjeto();

    Date getDataUltimaAtualizacao();

    ItfEstruturaDeEntidade getEstrutura();

    int getQuantidadeRegistro();

    void setDataUltimaAtualizacao(Date dataUltimaAtualizacao);

    void setQuantidadeRegistro(int quantidadeRegistro);

}
