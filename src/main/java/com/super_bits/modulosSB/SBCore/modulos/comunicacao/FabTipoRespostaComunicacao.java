
/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import org.coletivojava.fw.utilCoreBase.UtilCRCStringEnumECaixaAlta;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoDaFabrica;

/**
 *
 * Tipos de resposta conhecidos do sistema,
 *
 * Destaques para as seguintes respostas:
 *
 * @see #CRIAR_NOVA_COMUNICACAO
 * @see #RESPONDER_COM_TEXTO
 * @author salvioF
 */
public enum FabTipoRespostaComunicacao implements ComoFabrica {

    /**
     *
     */
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 1, nomeObjeto = "Não", icone = "fa fa-thumbs-o-down", cor = "#F44336")
    NAO,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 2, nomeObjeto = "Sim", icone = "fa fa-thumbs-o-up", cor = "#4CAF50")
    SIM,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 3, nomeObjeto = "Talvez", icone = "fa fa-question-circle", cor = "#FF9800")
    TALVEZ,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 4, nomeObjeto = "Cancelar", icone = "fa fa-times-circle", cor = "#9E9E9E")
    CANCELAR,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 5, nomeObjeto = "Enviar informação", icone = "fa fa-paper-plane", cor = "#2196F3")
    ENVIAR_INFORMACAO,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 6, nomeObjeto = "Fechar", icone = "fa fa-times", cor = "#607D8B")
    FECHAR,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 7, nomeObjeto = "Aguarde a resposta", icone = "fa fa-clock-o", cor = "#9C27B0")
    AQUARDE_A_RESPOSTA,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 8, nomeObjeto = "Pergunte mais tarde", icone = "fa fa-hourglass-half", cor = "#FF5722")
    PERGUNTE_MAIS_TARDE,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 9, nomeObjeto = "Recusar responder", icone = "fa fa-ban", cor = "#795548")
    RECURSAR_RESPONDER,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 10, nomeObjeto = "Autorizado", icone = "fa fa-check-circle", cor = "#4CAF50")
    AUTORIZADO,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 11, nomeObjeto = "Não autorizado", icone = "fa fa-lock", cor = "#F44336")
    NAO_AUTORIZADO,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 12, nomeObjeto = "Entendido", icone = "fa fa-check", cor = "#00BCD4")
    ENTENDIDO,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 13, nomeObjeto = "Confirmar", icone = "fa fa-check-square", cor = "#3F51B5")
    CONFIRMAR,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 14, nomeObjeto = "Ok", icone = "fa fa-check-circle-o", cor = "#009688")
    OK,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 15, nomeObjeto = "Personalizada", icone = "fa fa-paint-brush", cor = "#E91E63")
    PERSONALIZADA,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 16, nomeObjeto = "Responder com texto", icone = "fa fa-comment", cor = "#2196F3")
    RESPONDER_COM_TEXTO,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 17, nomeObjeto = "Não entendido", icone = "fa fa-exclamation-triangle", cor = "#FF5722")
    NAO_ENTENDIDO,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoResposta", id = 18, nomeObjeto = "Criar nova comunicação", icone = "fa fa-plus-circle", cor = "#8BC34A")
    CRIAR_NOVA_COMUNICACAO;

    public boolean isRespostaPositiva() {
        switch (this) {
            case NAO:
            case CANCELAR:
            case FECHAR:
            case PERGUNTE_MAIS_TARDE:
            case RECURSAR_RESPONDER:
            case NAO_ENTENDIDO:
                return false;
            case SIM:
            case TALVEZ:
            case ENVIAR_INFORMACAO:
            case AQUARDE_A_RESPOSTA:
            case AUTORIZADO:
            case NAO_AUTORIZADO:
            case ENTENDIDO:
            case CONFIRMAR:
            case OK:
            case PERSONALIZADA:
            case RESPONDER_COM_TEXTO:
            case CRIAR_NOVA_COMUNICACAO:
                return true;

            default:
                throw new AssertionError(this.name());

        }
    }

    @Override
    public ComoTipoRespostaComunicacao getRegistro() {
        return (ComoTipoRespostaComunicacao) ComoFabrica.super.getRegistro(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
