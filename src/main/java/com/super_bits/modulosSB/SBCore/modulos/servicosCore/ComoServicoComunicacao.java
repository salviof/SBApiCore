/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.servicosCore;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.FabTipoAgenteDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ERPTipoCanalComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoRespostaComunicacao;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfRespostaComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItffabricaCanalComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfTipoCanalComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ComoDialogo;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ComoDialogoEntrePessoas;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ComoTipoComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoUsuario;
import java.util.Date;
import java.util.List;

/**
 *
 *
 * ############################################################# <br/>
 * Esta Interface assina um dos serviços do núcleo SBCore
 * <br/>
 * Veja todos os serviços disponíveis digitando
 * SBCore.getServico...#############################################################
 * <br/>
 *
 * A [central de comunicação] permite gerenciar a comunicação entre os [agentes
 * do sistema]
 *
 * Entendemos como comunicação no sistema, o ato de enviar uma mensagem atravez
 * de um agente [remetente], a mensagem ser lida delo [destinatário] o
 * destinatário [responder ao remetente], e o remetente ler a resposta,
 * finalizando o ciclo da comunicação completa
 *
 *
 * O sistema possui alguns [tipos de comunicação] padrão, assim como Respostas
 * pré determinadas para sistemas de comunicação
 *
 *
 *
 *
 *
 *
 * @see FabTipoComunicacao
 * @see FabTipoRespostaComunicacao
 * @see SBCore
 * @see ComoServicoCoreSB
 * @see FabTipoAgenteDoSistema
 *
 * @author Salviof@gmail.com
 *
 */
public interface ComoServicoComunicacao extends ComoServicoCoreSB, ComoServicoComunicacaoUI {

    /**
     *
     * Inicia uma nova [comunicacao] do sistema para o usuário logado no
     * [contexto]
     *
     * @param tipocomunicacao
     * @param pUsuario
     * @param mensagem Mensagem ao [destinatário]
     * @param tiposTransporte
     *
     * @return A resposta do remetente, (caso não responda na hora, uma resposta
     * automática do tipo AQUARDE_A_RESPOSTA
     * @see FabTipoComunicacao
     * @see FabTipoRespostaComunicacao
     * @see FabTipoRespostaComunicacao#AQUARDE_A_RESPOSTA
     */
    public ComoDialogo gerarComunicacaoSistema_Usuario(FabTipoComunicacao tipocomunicacao,
            ComoUsuario pUsuario,
            String mensagem,
            String pAssunto
    );

    public ComoDialogo gerarComunicacaoSistema_Usuario(FabTipoComunicacao tipocomunicacao,
            ComoUsuario pUsuario,
            String mensagem
    );

    public ComoDialogo gerarComunicacaoSistema_UsuarioLogado(FabTipoComunicacao tipocomunicacao,
            String mensagem
    );

    public ComoDialogo gerarComunicacaoSistema_UsuarioLogado(FabTipoComunicacao tipocomunicacao,
            String mensagem,
            String pAssunto
    );

    /**
     *
     * @param tipocomunicacao
     * @param pUsuarioRemetente
     * @param pUsuarioDestinatario
     * @param pAssunto
     * @param mensagem
     * @return
     */
    public ComoDialogo gerarComunicacaoUsuario_Usuario(FabTipoComunicacao tipocomunicacao,
            ComoUsuario pUsuarioRemetente,
            ComoUsuario pUsuarioDestinatario,
            String pAssunto,
            String mensagem
    );

    public String dispararComunicacao(
            ComoDialogo pComunicacao,
            ItffabricaCanalComunicacao tiposTransporte
    ) throws ErroAcessandoCanalComunicacao;

    public boolean selarComunicacao(ComoDialogo pcomunicacao) throws ErroSelandoDialogo;

    public ItffabricaCanalComunicacao getCanalPadrao();

    public boolean responderComunicacao(String codigoSeloComunicacao, ItfRespostaComunicacao pResposta, ERPTipoCanalComunicacao pErpCanal) throws EncGestaoRespostaPersonalizada;

    public FabTipoRespostaComunicacao aguardarRespostaComunicacao(
            ItfTipoCanalComunicacao pCanal,
            ComoDialogo pComunicacao, int pTempoAguardar, FabTipoRespostaComunicacao pTipoRespostaTempoFinal) throws ErroDetectandoTelaBloqueio;

    public List<ComoDialogo> getNotificacoesAtivasMenu();

    public List<ComoDialogoEntrePessoas> getMsgColaboradorAguarandoMinhaResposta();

    public List<ComoDialogoEntrePessoas> getMsgQueEnvieiSemResposta();

    public List<ComoDialogo> getNotificacoesAtivasBloqueioTela();

    public ComoArmazenamentoComunicacao getArmazenamento();

    public String getTokenDispositivoNotificacao(ComoUsuario pUsuario);

    public List<ComoDialogo> dispararNotificacaoAcaoSucesso(ComoAcaoDoSistema pAcao, ComoEntidadeSimples pEntidadeRetorno) throws ErroRegistrandoDialogo;

    public void atualizarGatilhosDeNotificacaoPorAcao();

    public boolean agendarNovoDisparo(String codigoSeloComunicacao, Date pDataAgendamento);

}
