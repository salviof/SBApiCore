/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

/**
 *
 * @author desenvolvedor
 */
public interface ItfRespostaComunicacao {

    public ItfDialogo getComunicacao();

    public ItfTipoRespostaComunicacao getTipoResposta();

    public ComoAcaoDoSistema getBotaoAcao();

}
