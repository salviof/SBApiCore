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
public class MensagemUsuario extends Mensagem {

    public MensagemUsuario(String mensagem) {
        super(FabTipoAgenteDoSistema.USUARIO, FabMensagens.ALERTA, mensagem);
    }

    public MensagemUsuario(String pMensagem, FabMensagens pTipoMensagem) {
        super(FabTipoAgenteDoSistema.USUARIO, pTipoMensagem, pMensagem);
    }

}
