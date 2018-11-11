/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import org.coletivojava.fw.utilCoreBase.UtilSBFabricaComponenteVisual;

/**
 *
 * @author salvioF
 */
public interface ItfFabTipoComponenteVisual extends ItfFabrica {

    public static final String PASTA_TAG_LIBS = "resources/tagLib/tags/com/sb/";
    public static final String PASTA_TAG_LIB_ANDROID = "resources/tagLib/tags/com/sb/";
    public static final String PASTA_WORDPRESS = "resources/tagLib/tags/com/sb/";

    ;


    @Override
    public default ItfComponenteVisualSB getRegistro() {
        try {
            return UtilSBFabricaComponenteVisual.getComponenteVisual(this);
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro criando componente visual " + this, t);
            return null;
        }
    }

    public FabFamiliaCompVisual getFamilia();

}
