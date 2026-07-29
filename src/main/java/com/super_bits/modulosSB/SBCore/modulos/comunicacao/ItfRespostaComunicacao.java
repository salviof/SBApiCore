/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;

/**
 *
 * @author desenvolvedor
 */
public interface ItfRespostaComunicacao extends ComoEntidadeSimples {

    public ComoDialogo getComunicacao();

    public ComoTipoRespostaComunicacao getTipoResposta();

    public ComoAcaoDoSistema getBotaoAcao();

    public default boolean isRespostaEmTelaPersonalizada() {
        if (getComunicacao() == null) {
            return false;
        }
        return getComunicacao().isUmaComunicacaoPersonalizada();
    }
}
