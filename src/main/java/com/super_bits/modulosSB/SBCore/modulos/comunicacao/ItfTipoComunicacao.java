/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;
import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones.ComoTemIcone;

/**
 *
 * @author desenvolvedor
 */
public interface ItfTipoComunicacao extends ComoEntidadeSimples, ComoTemIcone {

    public FabTipoComunicacao getFabTipoComunicacao();

    public String getMensagemModeloPredefinida();

    public String getAssuntoModeloPredefinido();

    public void setMensagemPersonalizada(String pMensagemPersonalizada);

    public List<ItfTipoRespostaComunicacao> getTipoRespostasPossiveis();

}
