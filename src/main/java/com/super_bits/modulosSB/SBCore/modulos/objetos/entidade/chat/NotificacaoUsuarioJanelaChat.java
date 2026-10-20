/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.chat;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author salvio
 */
public class NotificacaoUsuarioJanelaChat {

    private List<ComoJanelaChat> janelas = new ArrayList<>();

    private int totalNotificacoes = 0;
    private boolean temNotificaoes = false;
    private String urlChat;

    public NotificacaoUsuarioJanelaChat(String pUrl) {
        urlChat = pUrl;
    }

    public void atualizarNotificacoes() {
        totalNotificacoes = getJanelas().stream().mapToInt(jne -> jne.getQuantidadeNotificacoes()).sum();
        temNotificaoes = getJanelas().isEmpty();

    }

    public String getUrlChat() {
        return urlChat;
    }

    public int getTotalNotificacoes() {
        return totalNotificacoes;
    }

    public boolean isTemNotificaoes() {
        return temNotificaoes;
    }

    public synchronized List<ComoJanelaChat> getJanelas() {
        return janelas;
    }

    public void setJanelas(List<ComoJanelaChat> janelas) {
        this.janelas = janelas;
    }

}
