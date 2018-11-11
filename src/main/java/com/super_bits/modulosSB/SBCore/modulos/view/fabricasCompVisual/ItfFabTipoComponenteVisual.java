/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual;

import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.TratamentoDeErros.FabErro;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.UtilSBFabricaComponenteVisual;

/**
 *
 * @author salvioF
 */
public interface ItfFabTipoComponenteVisual extends ItfFabrica {

    public static final String PASTA_TAG_LIBS = "resources/tagLib/tags/com/sb/";
    public static final String PASTA_TAG_LIB_ANDROID = "resources/tagLib/tags/com/sb/";
    public static final String PASTA_WORDPRESS = "resources/tagLib/tags/com/sb/";

    ;

    public FabFamiliaCompVisual getFamilia();

    @Override
    public default ItfComponenteVisualSB getRegistro() {
        try {
            return UtilSBFabricaComponenteVisual.getComponenteVisual(this);
        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro criando componente visual " + this, t);
            return null;
        }
    }

    public default ItfComponenteVisualSB getComponente() {
        return getRegistro();
    }

}
