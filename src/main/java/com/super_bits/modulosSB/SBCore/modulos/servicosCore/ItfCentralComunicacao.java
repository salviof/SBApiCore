/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.servicosCore;

import com.super_bits.modulosSB.SBCore.modulos.Mensagens.FabTipoAgenteDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoRespostaComunicacao;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfDestinatario;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfModeloMensagem;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfRespostaComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfTipoTransporteComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItffabricaTrasporteComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;
import java.util.List;

/**
 *
 *
 * ############################################################# <br/>
 * Esta Interface assina um dos serviços do núcleo SBCore
 * <br/>
 * Veja todos os serviços disponíveis digitando SBCore.getServico...
 * ############################################################# <br/>
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
 * @see ItfServicoCoreSB
 * @see FabTipoAgenteDoSistema
 *
 * @author Salviof@gmail.com
 *
 */
public interface ItfCentralComunicacao extends ItfServicoCoreSB {

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
    public ItfComunicacao iniciarComunicacaoSistema_Usuairo(
            FabTipoComunicacao tipocomunicacao,
            ItfUsuario pUsuario,
            String mensagem,
            ItffabricaTrasporteComunicacao... tiposTransporte
    );

    public ItfComunicacao iniciarComunicacaoSistema_Usuairo(
            FabTipoComunicacao tipocomunicacao,
            ItfUsuario pUsuario,
            String pAssunto,
            String mensagem,
            ItffabricaTrasporteComunicacao... tiposTransporte
    );

    public ItfComunicacao gerarComunicacaoSistema_UsuairoLogado(
            FabTipoComunicacao tipocomunicacao,
            String pAssunto,
            String mensagem,
            ItffabricaTrasporteComunicacao... tiposTransporte
    );

    public ItfComunicacao gerarComunicacaoSistema_UsuairoLogado(
            FabTipoComunicacao tipocomunicacao,
            String mensagem,
            ItffabricaTrasporteComunicacao... tiposTransporte
    );

    public ItffabricaTrasporteComunicacao getFabricaTransportePadrao();

    /**
     * 1
     *
     * Inicia uma comunicacao entre usuários do sistema
     *
     *
     * @param tipocomunicacao O tipo de comnunicação
     * @param pRemetente
     * @param pDestinatario
     * @param mensagem Mensagem do [remetente] ao [destinatário]
     * @param tiposTransporte
     * @return
     * @see FabTipoComunicacao
     * @see FabTipoRespostaComunicacao
     * @see FabTipoRespostaComunicacao#AQUARDE_A_RESPOSTA
     */
    public ItfComunicacao gerarComunicacaoEntre_Usuairos(
            FabTipoComunicacao tipocomunicacao,
            ItfUsuario pRemetente,
            ItfDestinatario pDestinatario,
            String mensagem,
            ItffabricaTrasporteComunicacao... tiposTransporte
    );

    /**
     *
     * @param tipocomunicacao
     * @param pRemetente
     * @param pDestinatario
     * @param mensagem
     * @param tiposTransporte
     * @return
     */
    public ItfComunicacao iniciarComunicacaoEntre_Usuairos(
            FabTipoComunicacao tipocomunicacao,
            ItfUsuario pRemetente,
            ItfDestinatario pDestinatario,
            ItfModeloMensagem mensagem,
            ItffabricaTrasporteComunicacao... tiposTransporte
    );

    public List<ItfComunicacao> getComunicacoesAguardandoRespostaDoDestinatario(ItfUsuario pDestinatario);

    public List<ItfComunicacao> getComunicacoesAguardandoRespostaDoRemetente(ItfUsuario pRemetente);

    public boolean responderComunicacao(ItfComunicacao pComunicacao, ItfRespostaComunicacao pResposta);

    public FabTipoRespostaComunicacao aguardarRespostaComunicacao(
            ItfTipoTransporteComunicacao pTransporte,
            ItfComunicacao pComunicacao, int pTempoAguardar, FabTipoRespostaComunicacao pTipoRespostaTempoFinal);

    public ItfComunicacao getComnunicacaoRegistrada(String codigoComunicacao);

    public ItfArmazenamentoComunicacao getAramazenamento();

    public String getTokenDispositivoNotificacao(ItfUsuario pUsuario);

    public boolean selarComunicacao(ItfComunicacao pcomunicacao);

}
