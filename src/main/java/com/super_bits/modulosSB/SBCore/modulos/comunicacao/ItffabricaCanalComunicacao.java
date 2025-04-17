/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.erp.ItfApiErpSuperBits;

/**
 *
 * @author desenvolvedor
 * @param <ItfDisparoComunicacao>
 */
public interface ItffabricaCanalComunicacao<ItfDisparoComunicacao> extends ItfApiErpSuperBits<ItfDisparoComunicacao> {

    @Override
    public default ItfTipoCanalComunicacao getRegistro() {
        return (ItfTipoCanalComunicacao) ItfApiErpSuperBits.super.getRegistro();
    }

    @Override
    public ItfDisparoComunicacao getImplementacaoDoContexto();

}
