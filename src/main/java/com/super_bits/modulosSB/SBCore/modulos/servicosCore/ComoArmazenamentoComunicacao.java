/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.servicosCore;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfRespostaComunicacao;
import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfDialogo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;

/**
 *
 * @author SalvioF
 */
public interface ComoArmazenamentoComunicacao {

    public boolean registrarDialogo(ItfDialogo pComunicacao) throws ErroRegistrandoDialogo;

    public boolean regsitrarRespostaDialogo(String pCodigoComunicacao, ItfRespostaComunicacao pResposta);

    public boolean limparComunicacaoExpirada();

    public ItfDialogo getDialogoByCodigoSelo(String pCodigoSelo);

    public boolean removerDialogoByCodigoSelo(String pCodigoSelo);

    public List<ItfDialogo> getComunicacoesAguardandoRespostaDoDestinatario(ComoUsuario pDestinatario);

    public List<ItfDialogo> getComunicacoesAguardandoRespostaDoRemetente(ComoUsuario pRemetente);

}
