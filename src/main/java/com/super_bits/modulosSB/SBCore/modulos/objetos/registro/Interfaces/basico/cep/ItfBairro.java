/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfBairro extends ItfBeanSimples {

    public List<Long> getCordenadas();

    public ItfCidade getCidade();

    public void setCidade(ItfCidade pCidade);

}
