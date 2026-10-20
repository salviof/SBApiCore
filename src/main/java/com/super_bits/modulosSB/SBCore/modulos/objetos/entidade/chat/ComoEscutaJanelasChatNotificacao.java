/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.chat;

import java.util.List;

/**
 *
 * @author salvio
 */
public interface ComoEscutaJanelasChatNotificacao {

    /**
     * Chamado sempre que uma sala do atendente muda de estado, depois que
     * {@link #getJanelasChat()} já foi atualizada. Serve para avisar a tela
     * (ex: push).
     *
     * NOVA_INTERACAO: a janela da sala foi incluída.
     *
     * NOVA_MENSAGEM: outra mensagem do contato em uma sala que já tinha janela;
     * a janela foi atualizada (quantidade e última mensagem) e passou para o
     * início da lista.
     *
     * {@link AtualizacaoSalaAtendente#isRemoverNotificacao()}: a janela da sala
     * foi retirada.
     */
    void atualizacaoSalaSessaoUsuario();

    void encerrar();

    /**
     * @return código do usuário no Matrix, ex: @joao.at:dominio.com.br, ou null
     * antes de {@link #iniciar()}
     */
    String getCodigoAtendente();

    String getEmailAtendente();

    /**
     * Janelas de chat com notificação pendente, da mensagem mais recente para a
     * mais antiga.Retorna sempre a mesma lista, mantida atualizada pela
     * central: antes de cada {@link #atualizacaoSalaSessaoUsuario} a janela da
     * sala já foi incluída, atualizada ou retirada.
     *
     * A lista pode ser percorrida enquanto é atualizada.
     *
     * Na primeira chamada monta as janelas das notificações pendentes, e pode
     * consultar o Matrix (e-mail e telefone dos remetentes).
     */
    List<ComoJanelaChat> getJanelasChat();

    /**
     * Notificações pendentes do atendente, com os dados da última mensagem de
     * cada sala. Útil para uma sessão nova do mesmo usuário, que não recebe
     * novamente as notificações já enviadas.
     */
    //List<AtualizacaoSalaAtendente> getNotificacoesPendentes();
    /**
     * Localiza o usuário do Matrix pelo e-mail e registra a escuta. Na primeira
     * escuta da JVM, também inicia a sincronização com o Matrix.
     *
     * @return false quando o e-mail não corresponde a um usuário do Matrix
     */
    boolean iniciar();

    boolean isAtivo();

    /**
     * @return true se o atendente já foi notificado da sala e ainda não leu nem
     * respondeu
     */
    boolean isNotificadoNaSala(String pCodigoSala);

}
