/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.erp;

/**
 *
 *
 *
 *
 * @author Sálvio Furbino
 */
public enum FabTipoAgenteOrganizacao {

    ATENDIMENTO,
    CLIENTE,
    FORNECEDOR,
    PRODUTOR,
    GOVERNO,
    INVESTIDOR,
    LOGISTICA,
    CONVIDADO,
    PUBLICO,
    COMUNICACAO,
    /**
     * Depreciado, idal é que a governança seja realizada por todos os agentes
     * intemediada por uma ia de governança transparente.
     */
    @Deprecated
    GOVERNANCA;

    public FabTipoCanalChat getTipoCanal() {
        switch (this) {
            case CLIENTE:
            case PUBLICO:
                return FabTipoCanalChat.REDES_SOCIAIS;
            case GOVERNO:
            case FORNECEDOR:
            case ATENDIMENTO:
            case PRODUTOR:
            case INVESTIDOR:
            case LOGISTICA:
            case CONVIDADO:
            case GOVERNANCA:
            case COMUNICACAO:
                return FabTipoCanalChat.INTERNO;

            default:
                throw new AssertionError();
        }

    }

}
