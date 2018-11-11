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
public class MensagemProgramador extends Mensagem {

    public MensagemProgramador(String pMensagem) {
        super(FabTipoAgenteDoSistema.DESENVOLVEDOR, FabMensagens.AVISO, pMensagem);
    }

    public MensagemProgramador(String pMensagem, FabMensagens pTipoMensagem) {
        super(FabTipoAgenteDoSistema.DESENVOLVEDOR, pTipoMensagem, pMensagem);
    }

}
