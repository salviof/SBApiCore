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
public interface ItfUnidadeFederativa extends ItfBeanSimples {

    public List<ItfCidade> getCidades();

    public void setCidades(List<ItfCidade> pCidades);

    public String getSigla();

    public void setSigla(String pSigla);

}
