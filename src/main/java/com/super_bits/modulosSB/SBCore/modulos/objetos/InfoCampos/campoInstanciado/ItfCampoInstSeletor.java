/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfGrupoCampos;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores.ItfSeletorGenerico;

/**
 *
 * @author desenvolvedor
 */
public interface ItfCampoInstSeletor extends ItfSeletorGenerico {

    public ItfSeletorGenerico getSeletor();

    public ItfGrupoCampos getGrupoCampoExibicao();

}
