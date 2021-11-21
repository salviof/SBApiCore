/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.erp;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimplesSomenteLeitura;

/**
 *
 * @author sfurbino
 */
public interface ItfServicoLinkDeEntidadesERP {

    public String getCodigoApiExterna(Class pEntidade, int pCodigoInterno);

    public String getCodigoSistemaInterno(Class pEntidade, int pCodigoapiExterno);

    public boolean registrarCodigoLigacaoApi(Class pEntidade, int codigoInterno, String codigoAPIExterna);

    @Deprecated
    public <T extends ItfBeanSimplesSomenteLeitura> T getObjetoDTOFromJson(Class<? extends T> pClass, String Json);

}
