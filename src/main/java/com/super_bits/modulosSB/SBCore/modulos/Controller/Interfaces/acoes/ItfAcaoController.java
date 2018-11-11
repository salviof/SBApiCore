/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfTipoComunicacao;
import java.lang.reflect.Method;
import java.util.List;

/**
 *
 *
 * @author desenvolvedor
 */
public interface ItfAcaoController extends ItfAcaoDoSistema {

    public int getIdMetodo();

    public boolean isTemParametroExtra();

    public void setIdMetodo(Method pMetodo);

    public List<ItfParametroAcaoController> getParametros();

    public boolean isTemLogExecucao();

    public void setTemLogExecucao(boolean pPrecisaJustificativa);

    public boolean isPrecisaJustificativa();

    public void setPrecisaJustificativa(boolean pPrecisaJustificativa);

    public boolean isPrecisaComunicacao();

    public void setPrecisaComunicacao(boolean pPrecisaComunicacao);

    public String getXhtmlModalVinculado();

    public void setXhtmlModalVinculado(String pModal);

    public boolean isTemXHTMLModalVinculado();

    public void setTipoComunicacao(ItfTipoComunicacao pTipoComunicacao);

    public ItfTipoComunicacao getTipoComunicacao();

    public String getTextoComunicacaoPersonalizadado();

    public void setTextoComunicacaoPersonalizadado(String pTextocomunicacaoPersonalizado);

    public String getCampoJustificativa();

    public void setCampoJustificativa(String pCampoJustificativa);

    public default boolean isTemComunicacaoTransiente() {
        return isPrecisaComunicacao() || isPrecisaJustificativa();
    }

}
