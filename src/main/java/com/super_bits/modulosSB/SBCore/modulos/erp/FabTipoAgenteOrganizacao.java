/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.erp;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoDaFabrica;

/**
 *
 *
 *
 *
 * @author Sálvio Furbino
 */
public enum FabTipoAgenteOrganizacao implements ComoFabrica {

    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.organizacoes", id = 1L, nomeObjeto = "Atendimento", icone = "fa fa-phone", cor = "#3498DB")
    ATENDIMENTO,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.organizacoes", id = 2L, nomeObjeto = "Cliente", icone = "fa fa-user", cor = "#2ECC71")
    CLIENTE,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.organizacoes", id = 3L, nomeObjeto = "Fornecedor", icone = "fa fa-truck", cor = "#E67E22")
    FORNECEDOR,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.organizacoes", id = 4L, nomeObjeto = "Produtor", icone = "fa fa-cogs", cor = "#8E44AD")
    PRODUTOR,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.organizacoes", id = 5L, nomeObjeto = "Governo", icone = "fa fa-university", cor = "#2C3E50")
    GOVERNO,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.organizacoes", id = 6L, nomeObjeto = "Investidor", icone = "fa fa-line-chart", cor = "#F1C40F")
    INVESTIDOR,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.organizacoes", id = 7L, nomeObjeto = "Logística", icone = "fa fa-archive", cor = "#E74C3C")
    LOGISTICA,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.organizacoes", id = 8L, nomeObjeto = "Convidado", icone = "fa fa-user-plus", cor = "#1ABC9C")
    CONVIDADO,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.organizacoes", id = 9L, nomeObjeto = "Público", icone = "fa fa-users", cor = "#95A5A6")
    PUBLICO,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.organizacoes", id = 10L, nomeObjeto = "Mídia e Gestão", icone = "fa fa-bullhorn", cor = "#E91E63")
    MIDIA_GESTAO,
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.organizacoes", id = 11L, nomeObjeto = "Todo Mundo", icone = "fa fa-globe", cor = "#00BCD4")
    TODO_MUNDO,
    /**
     * Depreciado, ideal é que a governança seja realizada por todos os agentes
     * intemediada por uma ia de governança transparente.
     */
    @Deprecated
    @InfoObjetoDaFabrica(pacoteImplantacao = "com.super_bits.modulosSB.SBCore.modulos.objetos.organizacoes", id = 12L, nomeObjeto = "Governança", icone = "fa fa-balance-scale", cor = "#607D8B")
    GOVERNANCA;

    @Override
    public Object getRegistro() {
        return ComoFabrica.super.getRegistro();
    }

    public FabTipoCanalChat getTipoCanal() {
        switch (this) {
            case CLIENTE:
            case PUBLICO:
            case TODO_MUNDO:
                return FabTipoCanalChat.REDES_SOCIAIS;
            case GOVERNO:
            case FORNECEDOR:
            case ATENDIMENTO:
            case PRODUTOR:
            case INVESTIDOR:
            case LOGISTICA:
            case CONVIDADO:
            case GOVERNANCA:
            case MIDIA_GESTAO:
                return FabTipoCanalChat.INTERNO;

            default:
                throw new AssertionError();
        }

    }

}
