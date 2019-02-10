/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfGrupoCampos;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfTipoAtributoSB;

/**
 *
 * @author SalvioF
 */
public interface ItfAtributoObjetoEditavel extends ItfAtributoObjetoSB, ItfTipoAtributoSB {

    public void setLabel(String pLabel);

    public void setTextoNegativo(String pTextoNegativo);

    public void setIconePositivo(String pIconePositivo);

    public void setIconeNegativo(String pIconeNegativo);

    public void setTextoPositivo(String pTextoPositivo);

    public void setGrupoSubCamposExibicao(ItfGrupoCampos pGrupo);

    public void setValorCampoUnico(boolean pValor);

    public void setUmValorLogico(boolean pValor);

    public void setUmaListaDinamica(boolean pValor);

    public void setTemValidacaoLogica(boolean pValor);

}
