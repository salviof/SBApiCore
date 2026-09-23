/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90
 */
package com.super_bits.modulosSB.SBCore.modulos.Mensagens;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfResposta;
import java.util.Arrays;
import java.util.List;
import org.coletivojava.fw.api.objetoNativo.mensagem.MensagemProgramador;
import org.coletivojava.fw.api.objetoNativo.mensagem.MensagemSistema;
import org.coletivojava.fw.api.objetoNativo.mensagem.MensagemUsuario;

/**
 *
 * @author sfurbino
 */
public enum FabMensagens {

    /**
     * Uma mensagem informativa.
     */
    AVISO,
    /**
     * Uma mensagem importante.
     */
    ALERTA,
    /**
     * Um erro.
     */
    ERRO,
    /**
     * Um erro impossível de ignorar.
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

    /**
     * Indica se este tipo representa uma falha (ERRO ou ERRO_FATAL).
     */
    public boolean isErro() {
        return this == ERRO || this == ERRO_FATAL;
    }

    /**
     * Código ANSI de cor deste tipo. Aplicar somente em saída para terminal.
     */
    public String getCorTerminal() {
        switch (this) {
            case AVISO:
                return "\033[36m";        // ciano
            case ALERTA:
                return "\033[33m";        // amarelo
            case ERRO:
                return "\033[31m";        // vermelho
            case ERRO_FATAL:
                return "\033[1;97;41m";   // branco negrito / fundo vermelho
            default:
                return "";
        }
    }

    /**
     * Classe CSS correspondente, para destaque em tela. Ex.: log-aviso,
     * log-erro-fatal.
     */
    public String getClasseCss() {
        return "log-" + name().toLowerCase().replace('_', '-');
    }

    public static boolean isSucesso(List<ItfMensagem> pMensagens) {
        if (pMensagens == null || pMensagens.isEmpty()) {
            return true;
        }
        return pMensagens.stream().noneMatch(msg -> msg.getTipoDeMensagem().isErro());
    }

    public static ItfResposta.Resultado getResultado(List<ItfMensagem> pMensagens) {
        if (pMensagens == null || pMensagens.isEmpty()) {
            return ItfResposta.Resultado.SUCESSO;
        }
        if (pMensagens.stream().anyMatch(msg -> msg.getTipoDeMensagem().isErro())) {
            return ItfResposta.Resultado.FALHOU;
        }
        if (pMensagens.stream().anyMatch(msg -> msg.getTipoDeMensagem() == ALERTA)) {
            return ItfResposta.Resultado.ALERTA;
        }
        return ItfResposta.Resultado.SUCESSO;
    }

    public static FabMensagens getTipoMensagemByTexto(String pTexto) {
        if (pTexto == null) {
            return null;
        }
        return Arrays.stream(values())
                .filter(tp -> tp.name().equals(pTexto))
                .findFirst()
                .orElse(null);
    }
}
