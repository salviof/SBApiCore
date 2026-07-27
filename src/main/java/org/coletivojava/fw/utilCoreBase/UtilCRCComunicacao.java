/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.utilCoreBase;

import com.super_bits.modulosSB.SBCore.modulos.Mensagens.ItfMensagem;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoRespostaComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfRespostaComunicacao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ComoDialogo;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ComoTipoRespostaComunicacao;

/**
 *
 * @author desenvolvedor
 */
public class UtilCRCComunicacao {

    public static List<ComoTipoRespostaComunicacao> getTipoRespostas(FabTipoComunicacao pTipoComunicacao) {

        List<ComoTipoRespostaComunicacao> respostasDaComunicacao = new ArrayList();
        switch (pTipoComunicacao) {
            case NOTIFICAR:
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.ENTENDIDO.getRegistro());
                break;
            case PERGUNTAR_SIM_OU_NAO:
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.SIM.getRegistro());
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.NAO.getRegistro());
                break;
            case PERGUNTAR_SIM_NAO_IGNORAR:
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.SIM.getRegistro());
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.NAO.getRegistro());
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.RECURSAR_RESPONDER.getRegistro());
                break;
            case PERGUNTAR_SIM_NAO_MAIS_TARDE:
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.SIM.getRegistro());
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.NAO.getRegistro());
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.PERGUNTE_MAIS_TARDE.getRegistro());

                break;
            case SOLICITAR_AUTORIZACAO:
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.CRIAR_NOVA_COMUNICACAO.getRegistro());

                break;
            case PERSONALIZADA:
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.SOLUCIONAR_AGORA.getRegistro());
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.NOTIFIQUE_AMANHA.getRegistro());
                break;
            case ENVIAR_INFORMACOES_CANCELAR:
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.ENVIAR_INFORMACAO.getRegistro());
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.CANCELAR.getRegistro());
                break;
            case PERGUNTAR_SIM_NAO_CANCELAR:
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.SIM.getRegistro());
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.NAO.getRegistro());
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.CANCELAR.getRegistro());
                break;
            case CONFIRMAR_CANCELAR:
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.CONFIRMAR.getRegistro());
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.CANCELAR.getRegistro());
                break;
            case OK_CANCELAR:
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.OK.getRegistro());
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.CANCELAR.getRegistro());
                break;
            default:
                throw new AssertionError(pTipoComunicacao.name());

        }
        return respostasDaComunicacao;

    }

    public static String gerarMensagem(ComoDialogo pComunicacao) {
        return pComunicacao.getTipoComunicacao().getMensagemModeloPredefinida();
    }

    public static String gerarAssunto(ComoDialogo pComunicacao) {
        return pComunicacao.getTipoComunicacao().getAssuntoModeloPredefinido();
    }

    public static String getSaudacao() {
        long horario = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if (horario > 0 && horario < 4) {
            return "Boa Madrugada";
        }
        if (horario > 5 & horario < 12) {
            return "Bom dia";
        }
        if (horario >= 12 & horario < 18) {
            return "Boa tarde";
        }
        if (horario >= 18) {
            return "Boa Noite";
        }
        return "Olá";
    }

    public static boolean isTemMensagemComErro(List<ItfMensagem> pMensagens) {

        for (ItfMensagem msg : pMensagens) {
            switch (msg.getTipoDeMensagem()) {
                case ERRO:
                case ERRO_FATAL:
                    return true;

            }
        }
        return false;
    }

}
