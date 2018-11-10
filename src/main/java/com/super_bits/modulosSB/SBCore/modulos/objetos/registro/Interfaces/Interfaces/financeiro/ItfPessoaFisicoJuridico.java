/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.financeiro;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico.ItfBeanContatoPessoa;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico.cep.ItfLocal;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico.cep.ItfLocalPostagem;

/**
 *
 * @author sfurbino
 */
public interface ItfPessoaFisicoJuridico extends ItfBeanContatoPessoa {

    public String getCpf_Cnpj();

    @Override
    public ItfLocalPostagem getLocalizacao();

}
