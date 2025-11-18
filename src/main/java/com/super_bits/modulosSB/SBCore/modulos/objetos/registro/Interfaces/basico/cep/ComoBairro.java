/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ComoBairro extends ComoEntidadeSimples {

    public List<Long> getCordenadas();

    public ComoCidade getCidade();

    public void setCidade(ComoCidade pCidade);

}
