/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.fabrica;

import com.super_bits.modulosSB.SBCore.modulos.view.telas.ItfTipoTela;

/**
 *
 * @author desenvolvedor
 */
public interface ComoFabricaTipoTelas extends ComoFabrica {

    @Override
    public ItfTipoTela getRegistro();

}
