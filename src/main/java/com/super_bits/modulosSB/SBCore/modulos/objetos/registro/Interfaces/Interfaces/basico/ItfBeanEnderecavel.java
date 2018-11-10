/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico.cep.ItfLocalPostagem;

/**
 *
 * @author desenvolvedor
 */
public interface ItfBeanEnderecavel extends ItfBeanLocalizavel {

    @Override
    public ItfLocalPostagem getLocalizacao();

    public default String getComplemento() {
        return getLocalizacao().getComplemento();
    }

    public default void setComplemento(String pcomplemento) {
        getLocalizacao().setComplemento(pcomplemento);
    }

    public void instanciarNovoEndereco();

}
