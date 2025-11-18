/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoRespostaComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones.ComoTemIcone;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

/**
 *
 * @author desenvolvedor
 */
public interface ItfTipoRespostaComunicacao extends ComoTemIcone {

    public FabTipoRespostaComunicacao getFabricaTipoResposta();

    public ComoAcaoDoSistema getBotaoResposta();

    public String getCor();

    public default boolean isRespostasPosiva() {

        return getFabricaTipoResposta().isRespostaPositiva();

    }

    public default boolean isRespostasNegativa() {

        return !getFabricaTipoResposta().isRespostaPositiva();

    }

}
