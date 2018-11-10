/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import erp.comunicacao.transporte.ItfTipoTransporteComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimplesSomenteLeitura;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;
import java.util.List;

/**
 *
 * @author salvioF
 */
public interface ItfComunicacao extends ItfBeanSimplesSomenteLeitura {

    public ItfDestinatario getDestinatario();

    public ItfUsuario getUsuarioRemetente();

    public ItfTipoComunicacao getTipoComunicacao();

    public ItfRespostaComunicacao getRespostaEscolhida();

    public void setRespostaEscolhida(ItfRespostaComunicacao pResposta);

    public List<ItfRespostaComunicacao> getRepostasPossiveis();

    public List<ItfTipoTransporteComunicacao> getTransportes();

    public String getAssunto();

    public void setNome(String pAssunto);

    public String getMensagem();

    public void setMensagem(String pMensagem);

    public void selarComunicacao();

    public boolean isFoiSelado();

    public String getCodigoSelo();

    public long getTempoAceitavelResposta();

    public void setTempoAceitavelResposta(long pTempo);
}
