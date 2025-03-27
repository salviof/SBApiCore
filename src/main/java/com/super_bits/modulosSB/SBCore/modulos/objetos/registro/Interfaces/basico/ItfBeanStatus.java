/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaStatus;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;

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

    public default boolean isPossuiCor() {
        return this.isTemCampoAnotado(FabTipoAtributoObjeto.COR);
    }

    public default boolean isPossuiIcone() {
        return this.isTemCampoAnotado(FabTipoAtributoObjeto.ICONE);
    }

    public default String getIcone() {
        return getCampoInstanciadoByAnotacao(FabTipoAtributoObjeto.ICONE).getValor().toString();
    }

    public default String getCor() {
        return getCampoInstanciadoByAnotacao(FabTipoAtributoObjeto.COR).getValor().toString();
    }
}
