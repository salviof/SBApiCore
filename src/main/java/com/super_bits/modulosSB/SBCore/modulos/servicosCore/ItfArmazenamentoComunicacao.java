/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.servicosCore;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfRespostaComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;
import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfDialogo;

/**
 *
 * @author SalvioF
 */
public interface ItfArmazenamentoComunicacao {

    public boolean registrarDialogo(ItfDialogo pComunicacao) throws ErroRegistrandoDialogo;

    public boolean regsitrarRespostaDialogo(String pCodigoComunicacao, ItfRespostaComunicacao pResposta);

    public boolean limparComunicacaoExpirada();

    public ItfDialogo getDialogoByCodigoSelo(String pCodigoSelo);

    public boolean removerDialogoByCodigoSelo(String pCodigoSelo);

    public List<ItfDialogo> getComunicacoesAguardandoRespostaDoDestinatario(ItfUsuario pDestinatario);

    public List<ItfDialogo> getComunicacoesAguardandoRespostaDoRemetente(ItfUsuario pRemetente);

}
