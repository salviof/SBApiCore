/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.TratamentoDeErros.FabErro;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaStatus;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.UtilSBCoreReflexaoCaminhoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import java.lang.reflect.Field;

/**
 *
 * @author desenvolvedor
 */
public interface ItfBeanStatus extends ItfBeanVinculadoAEnum, ItfBeanSimples {

    public default ItfFabricaStatus getStatusEnum() {
        try {
            Field campo = UtilSBCoreReflexaoCaminhoCampo.getSBCampobyTipoCampo(this.getClass(), FabTipoAtributoObjeto.STATUS_ENUM);
            campo.setAccessible(true);
            return (ItfFabricaStatus) campo.get(this);
        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro Obtendo fabrica do obeto", t);
            return null;
        }
    }

    public default void setStatusEnum(ItfFabricaStatus pFab) {
        try {
            Field campo = UtilSBCoreReflexaoCaminhoCampo.getSBCampobyTipoCampo(this.getClass(), FabTipoAtributoObjeto.STATUS_ENUM);
            campo.setAccessible(true);
            campo.set(this, pFab);
        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro Obtendo fabrica do obeto", t);
        }
    }

    @Override
    public default ItfFabricaStatus getEnumVinculado() {
        return getStatusEnum();
    }

    @Override
    public default void setEnumVinculado(ItfFabrica pFabrica) {
        setStatusEnum((ItfFabricaStatus) pFabrica);
    }

}
