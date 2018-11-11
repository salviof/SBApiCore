/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Mensagens;

import org.coletivojava.fw.api.objetoNativo.mensagem.MensagemProgramador;
import org.coletivojava.fw.api.objetoNativo.mensagem.MensagemSistema;
import org.coletivojava.fw.api.objetoNativo.mensagem.MensagemUsuario;

/**
 *
 * @author sfurbino
 */
public enum FabMensagens {

    /**
     * Uma menságem Legal.
     */
    AVISO,
    /**
     * Uma mensagem Importante
     */
    ALERTA,
    /**
     * Um erro
     */
    ERRO,
    /**
     * Um erro impossível de ignorar
     */
    ERRO_FATAL;

    public ItfMensagem getMsgUsuario(String pMensagem) {
        return new MensagemUsuario(pMensagem, this);
    }

    public ItfMensagem getMsgDesenvolvedor(String pMensagem) {
        return new MensagemProgramador(pMensagem, this);
    }

    public ItfMensagem getMsgSistema(String pMensagem) {
        return new MensagemSistema(pMensagem, this);
    }
}
