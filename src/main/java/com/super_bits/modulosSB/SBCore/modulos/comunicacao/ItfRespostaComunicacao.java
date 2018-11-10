/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;

/**
 *
 * @author desenvolvedor
 */
public interface ItfRespostaComunicacao {

    public ItfComunicacao getComunicacao();

    public ItfTipoRespostaComunicacao getTipoResposta();

    public ItfAcaoDoSistema getBotaoAcao();

}
