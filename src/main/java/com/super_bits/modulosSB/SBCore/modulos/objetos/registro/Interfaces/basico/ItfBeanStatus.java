/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaStatus;

/**
 *
 * @author desenvolvedor
 */
public interface ItfBeanStatus extends ItfBeanVinculadoAEnum, ItfBeanSimples {

    public ItfFabricaStatus getStatusEnum();

    public void setStatusEnum(ItfFabricaStatus pFab);

    @Override
    public default ItfFabricaStatus getEnumVinculado() {
        return getStatusEnum();
    }

    @Override
    public default void setEnumVinculado(ItfFabrica pFabrica) {
        setStatusEnum((ItfFabricaStatus) pFabrica);
    }

}
