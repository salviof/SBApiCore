/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.comunicacao;


import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfRespostaComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfTipoRespostaComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfDialogo;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

/**
 *
 * @author desenvolvedor
 */
public class RespostaComunicacao implements ItfRespostaComunicacao {

    private final ItfDialogo comunicacaoVinculada;
    private final ItfTipoRespostaComunicacao tipoResposta;
    private final BotaoResposta botaoResposta;

    public RespostaComunicacao(ItfDialogo comunicacaoVinculada,
            ItfTipoRespostaComunicacao tipoResposta) {

        this.comunicacaoVinculada = comunicacaoVinculada;
        this.tipoResposta = tipoResposta;
        botaoResposta = new BotaoResposta(tipoResposta, tipoResposta.getBotaoResposta());

    }

    @Override
    public ItfDialogo getComunicacao() {
        return comunicacaoVinculada;
    }

    @Override
    public ItfTipoRespostaComunicacao getTipoResposta() {
        return tipoResposta;
    }

    @Override
    public ComoAcaoDoSistema getBotaoAcao() {
        return botaoResposta;
    }

}
