/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

/**
 *
 * @author desenvolvedor
 */
public interface ItfBeanVinculadoAEnum {

    public void setEnumVinculado(ItfFabrica pFabrica);

    public ItfFabrica getEnumVinculado();

}
