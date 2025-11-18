/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabrica;

/**
 *
 * @author desenvolvedor
 */
public interface ComoEntidadeVinculadoAEnum {

    public void setEnumVinculado(ComoFabrica pFabrica);

    public ComoFabrica getEnumVinculado();

}
