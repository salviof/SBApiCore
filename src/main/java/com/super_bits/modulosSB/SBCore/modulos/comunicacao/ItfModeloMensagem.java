/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import org.coletivojava.fw.api.analiseDados.ItfMapaSubstituicao;

/**
 *
 * @author desenvolvedor
 */
public interface ItfModeloMensagem {

    public ItfMapaSubstituicao getMapaSubstituicao();

    /**
     *
     * Quando true, processa cada mensagem separadamente Quando false, processa
     * uma mensagem única para todos os destinatários
     *
     * @return
     */
    public boolean isProcessamentoMultiploDeTexto();

}
