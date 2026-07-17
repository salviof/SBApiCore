/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import java.util.List;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoDaFabrica;
import java.util.ArrayList;

/**
 *
 * Fabrica de tipos de comunicação reconhecidos do sistema
 *
 * ->Utilize o tipo personalizado para criar suas próprias comunicações
 *
 *
 * @see ItfCentralComunicacao
 *
 * @author salvioF
 */
public enum FabTipoComunicacao implements ComoFabrica {

    /**
     * [comunicacao] informativa, onde o [remetente] aguarda apenas a
     * confirmação de leitura do agente.
     *
     * @see FabTipoRespostaComunicacao#ENTENDIDO
     */
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoComunicacao",
            id = 1l, nomeObjeto = "Notificar", cor = "#2196F3", icone = "fa-solid fa-bell")
    NOTIFICAR,
    /**
     * [comunicacao] onde o [remetente] aguarda uma resposta SIM ou NÃO.
     *
     * @see FabTipoRespostaComunicacao#SIM
     * @see FabTipoRespostaComunicacao#NAO
     */
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoComunicacao",
            id = 2l, nomeObjeto = "Perguntar Sim ou Não", cor = "#3F51B5", icone = "fa-solid fa-circle-question")
    PERGUNTAR_SIM_OU_NAO,
    /**
     * [comunicacao] onde o [remetente] aguarda SIM, NÃO, ou permite ao agente
     * recusar-se a responder.
     *
     * @see FabTipoRespostaComunicacao#SIM
     * @see FabTipoRespostaComunicacao#NAO
     * @see FabTipoRespostaComunicacao#RECUSAR_RESPONDER
     */
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoComunicacao",
            id = 3l, nomeObjeto = "Perguntar Sim, Não ou Ignorar", cor = "#607D8B", icone = "fa-solid fa-comment-slash")
    PERGUNTAR_SIM_NAO_IGNORAR,
    /**
     * [comunicacao] onde o [remetente] aguarda SIM, NÃO, ou o adiamento da
     * resposta para mais tarde.
     *
     * @see FabTipoRespostaComunicacao#SIM
     * @see FabTipoRespostaComunicacao#NAO
     */
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoComunicacao",
            id = 4l, nomeObjeto = "Perguntar Sim, Não ou Mais Tarde", cor = "#FF9800", icone = "fa-solid fa-clock")
    PERGUNTAR_SIM_NAO_MAIS_TARDE,
    /**
     * [comunicacao] onde o [remetente] aguarda SIM, NÃO, ou o cancelamento da
     * operação.
     *
     * @see FabTipoRespostaComunicacao#SIM
     * @see FabTipoRespostaComunicacao#NAO
     */
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoComunicacao",
            id = 5l, nomeObjeto = "Perguntar Sim, Não ou Cancelar", cor = "#795548", icone = "fa-solid fa-rectangle-xmark")
    PERGUNTAR_SIM_NAO_CANCELAR,
    /**
     * [comunicacao] onde o [remetente] solicita uma autorização formal do
     * agente para prosseguir.
     *
     * @see FabTipoRespostaComunicacao#AUTORIZADO
     * @see FabTipoRespostaComunicacao#NAO_AUTORIZADO
     */
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoComunicacao",
            id = 6l, nomeObjeto = "Solicitar Autorização", cor = "#E91E63", icone = "fa-solid fa-user-shield")
    SOLICITAR_AUTORIZACAO,
    /**
     * [comunicacao] onde o [remetente] solicita o envio de informações,
     * permitindo ao agente cancelar a operação.
     */
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoComunicacao",
            id = 7l, nomeObjeto = "Enviar Informações ou Cancelar", cor = "#00BCD4", icone = "fa-solid fa-paper-plane")
    ENVIAR_INFORMACOES_CANCELAR,
    /**
     * [comunicacao] personalizada, com conjunto de respostas definido caso a
     * caso.
     *
     * @see FabTipoRespostaComunicacao
     */
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoComunicacao",
            id = 8l, nomeObjeto = "Personalizada", cor = "#9C27B0", icone = "fa-solid fa-wand-magic-sparkles")
    PERSONALIZADA,
    /**
     * [comunicacao] onde o [remetente] aguarda a confirmação ou o cancelamento
     * da operação.
     */
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoComunicacao",
            id = 9l, nomeObjeto = "Confirmar ou Cancelar", cor = "#4CAF50", icone = "fa-solid fa-circle-check")
    CONFIRMAR_CANCELAR,
    /**
     * [comunicacao] simples onde o [remetente] aguarda um OK ou o cancelamento
     * da operação.
     */
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.dialogo.tipoComunicacao",
            id = 10l, nomeObjeto = "Ok ou Cancelar", cor = "#8BC34A", icone = "fa-solid fa-thumbs-up")
    OK_CANCELAR;

    public List<FabTipoRespostaComunicacao> respostasEsperadasPadrao() {
        List<FabTipoRespostaComunicacao> respostas = new ArrayList<>();
        respostas.add(FabTipoRespostaComunicacao.ENTENDIDO);
        return respostas;
    }

    @Override
    public ComoTipoComunicacao getRegistro() {
        return (ComoTipoComunicacao) ComoFabrica.super.getRegistro(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
