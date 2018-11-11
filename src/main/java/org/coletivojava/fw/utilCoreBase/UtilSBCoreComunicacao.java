/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.utilCoreBase;

import com.super_bits.modulosSB.SBCore.modulos.Mensagens.ItfMensagem;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoRespostaComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfRespostaComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfTipoRespostaComunicacao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.coletivojava.fw.api.objetoNativo.comunicacao.RespostaComunicacao;

/**
 *
 * @author desenvolvedor
 */
public class UtilSBCoreComunicacao {

    public static List<ItfTipoRespostaComunicacao> getTipoRespostas(FabTipoComunicacao pTipoComunicacao) {

        List<ItfTipoRespostaComunicacao> respostasDaComunicacao = new ArrayList();
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
                respostasDaComunicacao.add(FabTipoRespostaComunicacao.CONFIRMANR.getRegistro());
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

    public static List<ItfRespostaComunicacao> getRespostaCOmunicacao(ItfComunicacao pComunicacao) {
        List<ItfRespostaComunicacao> respostas = new ArrayList<>();

        for (ItfTipoRespostaComunicacao resposta : getTipoRespostas(pComunicacao.getTipoComunicacao().getFabTipoComunicacao())) {
            RespostaComunicacao resp = new RespostaComunicacao(pComunicacao, resposta);
            respostas.add(resp);
        }
        return respostas;

    }

    public static String gerarMensagem(ItfComunicacao pComunicacao) {
        return pComunicacao.getTipoComunicacao().getMensagemModeloPredefinida();
    }

    public static String gerarAssunto(ItfComunicacao pComunicacao) {
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
