/*
 *  Super-Bits.com CODE CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfPermissao;
import com.super_bits.modulosSB.SBCore.modulos.view.telas.ItfTelaUsuario;

import java.util.Date;
import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ComoMenusDeSessao;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.chat.ComoEscutaJanelasChatNotificacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.chat.ComoJanelaChat;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.chat.NotificacaoUsuarioJanelaChat;

/**
 *
 * Interface que representa uma sesao de usuário
 *
 * @author Salvio
 */
public interface ComoSessao {

    public String getIdSessao();

    public ComoUsuario getUsuario();

    public ComoMenusDeSessao getMenusDaSessao();

    public Date getInicio();

    public Date getFim();

    public List<ItfPermissao> getAcoesRealizadas();

    public void setUsuario(ComoUsuario pUsuario);

    public boolean isIdentificado();

    public ItfTelaUsuario getTelaUsuario();

    public boolean isTipoViewDefinido();

    public String getPastaTempDeSessao();

    public void encerrarSessao();

    public boolean isAcessoPermitido(ComoAcaoDoSistema pAcao);

    public NotificacaoUsuarioJanelaChat getNotificacoesJanelasChat();

    public void atualizarJanelasChat(ComoEscutaJanelasChatNotificacao pEscuta);

}
