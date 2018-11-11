/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.mensagem;

import com.super_bits.modulosSB.SBCore.modulos.Mensagens.FabMensagens;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.FabTipoAgenteDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.ItfCentralMensagens;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.ItfMensagem;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import org.coletivojava.fw.api.tratamentoErros.FabErro;

/**
 *
 * @author sfurbino
 */
public class Mensagem implements ItfMensagem {

    private final FabTipoAgenteDoSistema TIPOdeSTINATARIO;
    private final FabMensagens tipoMensagem;
    private final String mensagem;

    public Mensagem(FabTipoAgenteDoSistema TIPOdeSTINATARIO, FabMensagens tipoMensagem, String mensagem) {
        this.TIPOdeSTINATARIO = TIPOdeSTINATARIO;
        this.tipoMensagem = tipoMensagem;
        // -TODO formatação boas práticas, mensagem de erro
        this.mensagem = mensagem.replace("não", "NÃO");

    }

    @Override
    public FabMensagens getTipoDeMensagem() {
        return tipoMensagem;
    }

    @Override
    public FabTipoAgenteDoSistema getTipoDestinatario() {
        return TIPOdeSTINATARIO;
    }

    @Override
    public String getMenssagem() {
        return mensagem;
    }

    @Override
    public void enviarMensagem(Class<? extends ItfCentralMensagens> pCentral) {
        ItfCentralMensagens central;
        try {
            central = pCentral.newInstance();
            central.enviaMensagem(this);
        } catch (InstantiationException | IllegalAccessException ex) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro enviando mensagem" + getMenssagem() + "", ex);
        }

    }

    @Override
    public String toString() {
        return getMenssagem() + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
