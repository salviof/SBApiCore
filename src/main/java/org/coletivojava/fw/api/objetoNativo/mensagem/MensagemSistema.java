/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.mensagem;

import com.super_bits.modulosSB.SBCore.modulos.Mensagens.FabMensagens;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.FabTipoAgenteDoSistema;

/**
 *
 * @author sfurbino
 */
public class MensagemSistema extends Mensagem {

    public MensagemSistema(String mensagem) {
        super(FabTipoAgenteDoSistema.SISTEMA, FabMensagens.AVISO, mensagem);
    }

    public MensagemSistema(String pMensagem, FabMensagens pTipoMensagem) {
        super(FabTipoAgenteDoSistema.SISTEMA, pTipoMensagem, pMensagem);
    }
}
