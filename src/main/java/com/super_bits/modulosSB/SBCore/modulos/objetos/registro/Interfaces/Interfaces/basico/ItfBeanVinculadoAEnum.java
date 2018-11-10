/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.TratamentoDeErros.FabErro;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.UtilSBCoreReflexaoCaminhoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import java.lang.reflect.Field;

/**
 *
 * @author desenvolvedor
 */
public interface ItfBeanVinculadoAEnum {

    public default void setEnumVinculado(ItfFabrica pFabrica) {
        try {
            Field campo = UtilSBCoreReflexaoCaminhoCampo.getSBCampobyTipoCampo(this.getClass(), FabTipoAtributoObjeto.ENUM_FABRICA);
            campo.set(this, pFabrica);
        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro Obtendo fabrica do obeto", t);
        }
    }

    public default ItfFabrica getEnumVinculado() {
        try {
            Field campo = UtilSBCoreReflexaoCaminhoCampo.getSBCampobyTipoCampo(this.getClass(), FabTipoAtributoObjeto.ENUM_FABRICA);
            return (ItfFabrica) campo.get(this);
        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro Obtendo fabrica do obeto", t);
            return null;
        }

    }

}
