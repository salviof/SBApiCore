/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.servicosCore;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ERPTipoCanalComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ComoDialogo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoUsuario;
import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ComoDialogoEntrePessoas;

/**
 *
 * @author SalvioF
 */
public interface ComoArmazenamentoComunicacao {

    public boolean registrarDialogoAtivo(ComoDialogo pComunicacao) throws ErroRegistrandoDialogo;

    public boolean removerDialogoAtivo(String pCodigoSelo);

    public boolean removerBloqueioDeTelaDoDialogo(String pCodigoSelo);

    public List<ComoDialogo> getDialogos(ComoUsuario pUsuario, ERPTipoCanalComunicacao pCanal);

    public List<ComoDialogoEntrePessoas> getMensagemAguardandoMinhaResposta(ComoUsuario pUsuario, ERPTipoCanalComunicacao pCanal);

    public List<ComoDialogoEntrePessoas> getMensagemAguardandoRespostaDeOutra(ComoUsuario pUsuario, ERPTipoCanalComunicacao pCanal);

    public boolean atualizarNotificacoesAtivas();

    public ComoDialogo getDialogoAtivoByCodigoSelo(String pCodigoSelo);

}
