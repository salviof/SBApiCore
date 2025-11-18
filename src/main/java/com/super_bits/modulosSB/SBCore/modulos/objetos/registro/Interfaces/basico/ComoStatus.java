/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabricaStatus;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabrica;

/**
 *
 * @author desenvolvedor
 */
public interface ComoStatus extends ComoEntidadeVinculadoAEnum, ComoEntidadeSimples {

    public ComoFabricaStatus getStatusEnum();

    public void setStatusEnum(ComoFabricaStatus pFab);

    @Override
    public default ComoFabricaStatus getEnumVinculado() {
        return getStatusEnum();
    }

    @Override
    public default void setEnumVinculado(ComoFabrica pFabrica) {
        setStatusEnum((ComoFabricaStatus) pFabrica);
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
