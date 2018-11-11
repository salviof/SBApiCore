
/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import org.coletivojava.fw.api.objetoNativo.comunicacao.TipoRespostaComunicacao;

/**
 *
 * Tipos de resposta conhecidos do sistema,
 *
 * Destaques para as seguintes respostas:
 *
 * @see #CRIAR_NOVA_COMUNICACAO
 * @see #RESPONDER_COM_TEXTO
 * @author salvioF
 */
public enum FabTipoRespostaComunicacao implements ItfFabrica {

    /**
     *
     */
    NAO,
    /**
     *
     */
    SIM,
    /**
     *
     */
    TALVEZ,
    /**
     *
     */
    CANCELAR,
    ENVIAR_INFORMACAO,
    /**
     *
     */
    FECHAR,
    /**
     *
     */
    AQUARDE_A_RESPOSTA,
    /**
     *
     */
    PERGUNTE_MAIS_TARDE,
    /**
     *
     */
    RECURSAR_RESPONDER,
    /**
     *
     */
    AUTORIZADO,
    /**
     *
     */
    NAO_AUTORIZADO,
    /**
     *
     */
    ENTENDIDO,
    CONFIRMANR,
    OK,
    /**
     *
     */
    PERSONALIZADA,
    /**
     * Permite que a resposta seja realizada através de um texto pelo
     * [destinatário]
     */
    RESPONDER_COM_TEXTO,
    NAO_ENTENDIDO,
    /**
     * Inicia uma nova comunicação com o remetente, e aguarda uma resposta
     * criando um [dialogo]
     *
     */
    CRIAR_NOVA_COMUNICACAO;

    public String getIconePadrao() {
        switch (this) {
            case NAO:
                return "fa fa-thumbs-o-down";

            case SIM:
                return "fa fa-thumbs-o-up";

            case TALVEZ:
                return "fa fa-question-circle-o";

            case CANCELAR:
                return "fa fa-times";

            case FECHAR:
                return "fa fa-times";

            case AQUARDE_A_RESPOSTA:
                return "fa fa-coffee";

            case PERGUNTE_MAIS_TARDE:
                return "fa fa-repeat";

            case RECURSAR_RESPONDER:
                return "fa fa-hand-scissors-o";

            case AUTORIZADO:
                return "fa fa-gavel";

            case NAO_AUTORIZADO:
                return "fa fa-hand-scissors-o";

            case ENTENDIDO:
                return "fa fa-thumbs-o-up";

            case PERSONALIZADA:
                return "fa fa-exclamation-circle";

            case RESPONDER_COM_TEXTO:
                return "fa fa-pencil";

            case NAO_ENTENDIDO:
                return "fa fa-question-circle-o";

            case CRIAR_NOVA_COMUNICACAO:
                return "fa fa-bullhorn";

            case ENVIAR_INFORMACAO:
                return "fa fa-reply";

            case CONFIRMANR:
                return "fa fa-check";

            default:
                throw new AssertionError(this.name());

        }
    }

    public boolean isRespostaPositiva() {
        switch (this) {
            case NAO:
            case CANCELAR:
            case FECHAR:
            case PERGUNTE_MAIS_TARDE:
            case RECURSAR_RESPONDER:
            case NAO_ENTENDIDO:
                return false;
            case SIM:
            case TALVEZ:
            case ENVIAR_INFORMACAO:
            case AQUARDE_A_RESPOSTA:
            case AUTORIZADO:
            case NAO_AUTORIZADO:
            case ENTENDIDO:
            case CONFIRMANR:
            case OK:
            case PERSONALIZADA:
            case RESPONDER_COM_TEXTO:
            case CRIAR_NOVA_COMUNICACAO:
                return true;

            default:
                throw new AssertionError(this.name());

        }
    }

    @Override
    public TipoRespostaComunicacao getRegistro() {

        TipoRespostaComunicacao respCM = new TipoRespostaComunicacao(this);
        respCM.setNome(this.toString());
        respCM.setId(this.ordinal() + 1);
        respCM.setIcone(getIconePadrao());

        return respCM;

    }

}
