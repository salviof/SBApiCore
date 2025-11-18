/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.Mensagens;

import com.super_bits.modulosSB.SBCore.modulos.servicosCore.ComoServicoCoreSB;

/**
 * ############################################################# <br/>
 * Esta Interface assina um dos serviços do núcleo SBCore
 * <br/>
 * Veja todos os serviços disponíveis digitando SBCore.getServico...
 * ############################################################# <br/>
 *
 *
 * * A Central de menssagens permite Enviar Mensagens para os principais
 * [Agentes de sistema]: [usuários], [desenvolvedores], e [sistema] <br>
 *
 * A principal diferença da [central de mensagens], para a [central de
 * comunicação], é que na a central de mensagens não existe resposta a mensagem
 * enviada, muito menos garantia de recebimento do destinatário.
 *
 *
 * @see FabTipoAgenteDoSistema
 *
 *
 **
 * De acordo com o ambiente de execução (Desenvolvimento, Homlogação, ou
 * Produção) o comportamento do envio de mensagem podem ser diferentes
 *
 * @author Salvio
 */
public interface ItfCentralMensagens extends ComoServicoCoreSB {

    /**
     *
     * Envia uma mensagem do tipo MensagemSB, destinada ao Usuario,
     * Desenvolvedor, ou sistema
     *
     * Envia Mensagem
     *
     * @param pMensagem
     */
    public void enviaMensagem(ItfMensagem pMensagem);

    /**
     *
     * Envia uma mensagem do tipo aviiso ao usuário
     *
     * @param pMensagem Mensagem que será enviada
     */
    public void enviarMsgAvisoAoUsuario(String pMensagem);

    /**
     *
     * Envia uma mensagem do tipo alerta ao usuário
     *
     * @param pMensagem
     */
    public void enviarMsgAlertaAoUsuario(String pMensagem);

    /**
     *
     * Envia uma mensagem de erro ao usuário
     *
     * @param pMensagem
     */
    public void enviarMsgErroAoUsuario(String pMensagem);

    /**
     *
     * Envia um aviso ao Desenvolvedor
     *
     * @param pMensagem
     */
    public void enviarMsgAvisoAoDesenvolvedor(String pMensagem);

    /**
     *
     * Envia uma mensagem de alerta ao DEsenvolvedor
     *
     * @param pMensagem Mensagem enviada
     */
    public void enviarMsgAlertaAoDesenvolvedor(String pMensagem);

    /**
     * Envia uma mensagem de erro ao desenvolvedor
     *
     * @param pMensagem Mensagem enviada
     */
    public void enviarMsgErroAoDesenvolvedor(String pMensagem);

}
