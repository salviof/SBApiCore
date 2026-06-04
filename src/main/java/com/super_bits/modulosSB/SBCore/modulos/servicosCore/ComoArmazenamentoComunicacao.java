/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.servicosCore;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ERPTipoCanalComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfDialogo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoUsuario;
import java.util.List;

/**
 *
 * @author SalvioF
 */
public interface ComoArmazenamentoComunicacao {

    public boolean registrarDialogoAtivo(ItfDialogo pComunicacao) throws ErroRegistrandoDialogo;

    public boolean removerDialogoAtivo(String pCodigoSelo);

    public List<ItfDialogo> getDialogos(ComoUsuario pUsuario, ERPTipoCanalComunicacao pCanal);

    public boolean atualizarNotificacoesAtivas();

    public ItfDialogo getDialogoAtivoByCodigoSelo(String pCodigoSelo);

}
