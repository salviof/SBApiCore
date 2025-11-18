/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.financeiro;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampoValidadorLogico;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ComoLocalPostagem;

/**
 *
 * @author sfurbino
 */
public interface ComoPessoaFisicoJuridico extends ComoPessoa {

    @InfoCampoValidadorLogico(descricao = "Validador lógico é CPF/CNPJ")
    public String getCpfCnpj();

    @Override
    public ComoLocalPostagem getLocalizacao();

    public default boolean isUmaPessaFisica() {
        if (getCpfCnpj() == null || getCpfCnpj().isEmpty()) {
            return false;
        }
        if (getCpfCnpj().length() == 11) {
            return true;
        }
        return false;

    }

    public default boolean isUmaPessoaJuridica() {
        if (getCpfCnpj() == null || getCpfCnpj().isEmpty()) {
            return false;
        }
        if (getCpfCnpj().length() == 13) {
            return true;
        }
        return false;
    }

}
