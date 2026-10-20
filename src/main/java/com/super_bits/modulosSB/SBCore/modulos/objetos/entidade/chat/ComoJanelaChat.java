/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.chat;

import java.util.Date;

/**
 *
 * @author salvio
 */
public interface ComoJanelaChat {

    /**
     * @return alias canônico da sala, ou null quando a sala não possui alias
     */
    public String getAliasSala();

    public String getCodigoRemetente();

    /**
     * @return código interno da sala, ex: !abcdef:dominio.com.br
     */
    public String getCodigoSala();

    /**
     * @return o e-mail do remetente quando disponível, senão o telefone
     */
    public String getContatoRemetente();

    public Date getDataHoraUltimaMensagem();

    /**
     * @return origin_server_ts da última mensagem em milissegundos
     */
    public long getDataHoraUltimaMensagemMillis();

    /**
     * @return e-mail do remetente, ou null quando não disponível
     */
    public String getEmailRemetente();

    public String getEventIdUltimaMensagem();

    /**
     * @return o alias da sala quando existir, senão o código da sala
     */
    public String getIdentificadorSala();

    /**
     * @param pUrlBaseElement ex: https://element.dominio.com.br
     * @return ex:
     * https://element.dominio.com.br/#/room/#chamadocliente169_ct:dominio.com.br
     */
    public String getLinkSala();

    public String getNomeRemetente();

    /**
     * @return nome da sala; quando a sala não tem nome, o nome do remetente
     */
    public String getNomeSala();

    /**
     * @return mensagens do contato na sala desde que a notificação foi criada
     */
    public int getQuantidadeNotificacoes();

    /**
     * @return telefone do remetente, preenchido apenas quando ele não tem
     * e-mail
     */
    public String getTelefoneRemetente();

    public String getTextoUltimaMensagem();

}
