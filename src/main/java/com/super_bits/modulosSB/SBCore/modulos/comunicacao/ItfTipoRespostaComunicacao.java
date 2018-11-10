/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoRespostaComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones.ItfBeanComIcone;

/**
 *
 * @author desenvolvedor
 */
public interface ItfTipoRespostaComunicacao extends ItfBeanComIcone {

    public FabTipoRespostaComunicacao getFabricaTipoResposta();

    public ItfAcaoDoSistema getBotaoResposta();

    public String getCor();

    public default boolean isRespostasPosiva() {

        return getFabricaTipoResposta().isRespostaPositiva();

    }

    public default boolean isRespostasNegativa() {

        return !getFabricaTipoResposta().isRespostaPositiva();

    }

}
