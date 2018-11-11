/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import java.util.List;
import org.coletivojava.fw.api.objetoNativo.comunicacao.TipoComunicacao;

/**
 *
 * Fabrica de tipos de comunicação reconhecidos do sistema
 *
 * ->Utilize o tipo personalizado para criar suas próprias comunicações
 *
 *
 * @see ItfCentralComunicacao
 *
 * @author salvioF
 */
public enum FabTipoComunicacao implements ItfFabrica {

    /**
     *
     *
     * [comunicacao] onde o [remetente] aguardará uma a confirmação de leitura
     * do agente
     *
     * @see FabTipoRespostaComunicacao#ENTENDIDO
     */
    NOTIFICAR,
    /**
     *
     *
     * [comunicacao] onde o [remetente] aguarda um SIM ou não
     *
     *
     * @see FabTipoRespostaComunicacao#SIM
     * @see FabTipoRespostaComunicacao#NAO
     */
    PERGUNTAR_SIM_OU_NAO,
    /**
     * [comunicacao] onde o [remetente] aguarda um SIM ou NÃO, ou ignorar
     *
     * @see FabTipoRespostaComunicacao#SIM
     * @see FabTipoRespostaComunicacao#NAO
     * @see FabTipoRespostaComunicacao#RECUR SAR_RESPONDER
     */
    PERGUNTAR_SIM_NAO_IGNORAR,
    /**
     ** [comunicacao] onde o [remetente] aguarda um SIM ou não ou Mais tarde
     */
    PERGUNTAR_SIM_NAO_MAIS_TARDE,
    PERGUNTAR_SIM_NAO_CANCELAR,
    /**
     *
     *
     * @see FabTipoRespostaComunicacao#AUTORIZADO
     * @see FabTipoRespostaComunicacao#NAO_AUTORIZADO
     */
    SOLICITAR_AUTORIZACAO,
    /**
     *
     */
    ENVIAR_INFORMACOES_CANCELAR,
    /**
     * Uma comunicação personalizada
     *
     * @see FabTipoRespostaComunicacao
     */
    PERSONALIZADA,
    /**
     *
     */
    CONFIRMAR_CANCELAR,
    /**
     *
     */
    OK_CANCELAR;

    public List<FabTipoRespostaComunicacao> respostasEsperadasPadrao() {

        return null;
    }

    @Override
    public TipoComunicacao getRegistro() {
        TipoComunicacao tipoComunicacao = new TipoComunicacao(this);

        return tipoComunicacao;
    }

}
