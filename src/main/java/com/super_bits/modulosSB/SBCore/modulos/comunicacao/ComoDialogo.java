/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeReflexivel;
import java.util.Date;
import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimplesSomenteLeitura;

/**
 *
 * @author salvioF
 */
public interface ComoDialogo extends ComoEntidadeSimplesSomenteLeitura, ComoEntidadeReflexivel {

    public ItfDestinatario getDestinatario();

    public ComoTipoComunicacao getTipoComunicacao();

    public ItfRespostaComunicacao getRespostaEscolhida();

    public void setRespostaEscolhida(ItfRespostaComunicacao pResposta);

    public List<ItfRespostaComunicacao> getRepostasPossiveis();

    public String getAssunto();

    public void setAssunto(String pAssunto);

    public void setNome(String pAssunto);

    public String getMensagem();

    public void setMensagem(String pMensagem);

    public boolean isFoiSelado();

    public String getCodigoSelo();

    public void setCodigoSelo(String codigoSelo);

    public String getPaginaInstanciaID();

    /**
     *
     * @return Tempo em Minutos aceitável para resposta
     */
    public long getTempoAceitavelResposta();

    public void setTempoAceitavelResposta(long pTempo);

    public FabStatusComunicacao getStatusComunicacao();

    public void setStatusComunicacao(FabStatusComunicacao pStatus);

    public Date getDataHoraDisparo();

    public Date getDataHoraResposta();

    public default boolean isAssuntoIgualMensagem() {
        if (getMensagem() == null) {
            return false;
        }
        return getMensagem().equals(getNome());
    }

    public List<ERPTipoCanalComunicacao> getCanais();

    public void setCanais(List<ERPTipoCanalComunicacao> pCanais);

    public default boolean isUmDialogoEntrePessoas() {
        return this instanceof ComoDialogoEntrePessoas;
    }

    public default ComoDialogoEntrePessoas getComoDialogoEntrePesoas() {
        return (ComoDialogoEntrePessoas) this;
    }

}
