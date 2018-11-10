/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones.ItfBeanComIcone;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfTipoComunicacao extends ItfBeanSimples, ItfBeanComIcone {

    public FabTipoComunicacao getFabTipoComunicacao();

    public String getMensagemModeloPredefinida();

    public String getAssuntoModeloPredefinido();

    public void setMensagemPersonalizada(String pMensagemPersonalizada);

    public List<ItfTipoRespostaComunicacao> getTipoRespostasPossiveis();

}
