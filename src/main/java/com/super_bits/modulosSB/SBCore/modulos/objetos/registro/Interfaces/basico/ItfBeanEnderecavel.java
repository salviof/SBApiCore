/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfLocalPostagem;

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

    public default boolean isPossuiEnderecoPostavelDefinido() {

        if (getLocalizacao() == null) {
            return false;
        }
        if (getLocalizacao().getBairro() == null) {
            return false;
        }
        if (getLocalizacao().getLogradouro() == null) {
            return false;
        }

        if (getLocalizacao().getLogradouro().length() < 4) {
            return false;
        }

        if (getLocalizacao().getCep() == null) {
            return false;
        }
        if (getLocalizacao().getCep().length() < 6) {
            return false;
        }
        if (getLocalizacao().getBairro() == null) {
            return false;
        }

        return true;
    }

}
