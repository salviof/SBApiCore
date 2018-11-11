/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfRespostaComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfTipoRespostaComunicacao;

/**
 *
 * @author desenvolvedor
 */
public class RespostaComunicacao implements ItfRespostaComunicacao {

    private final ItfComunicacao comunicacaoVinculada;
    private final ItfTipoRespostaComunicacao tipoResposta;
    private final BotaoResposta botaoResposta;

    public RespostaComunicacao(ItfComunicacao comunicacaoVinculada,
            ItfTipoRespostaComunicacao tipoResposta) {

        this.comunicacaoVinculada = comunicacaoVinculada;
        this.tipoResposta = tipoResposta;
        botaoResposta = new BotaoResposta(tipoResposta, tipoResposta.getBotaoResposta());

    }

    @Override
    public ItfComunicacao getComunicacao() {
        return comunicacaoVinculada;
    }

    @Override
    public ItfTipoRespostaComunicacao getTipoResposta() {
        return tipoResposta;
    }

    @Override
    public ItfAcaoDoSistema getBotaoAcao() {
        return botaoResposta;
    }

}
