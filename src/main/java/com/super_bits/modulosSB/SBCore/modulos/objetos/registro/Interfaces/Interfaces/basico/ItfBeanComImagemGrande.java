/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import java.io.File;

/**
 *
 * @author desenvolvedor
 */
public interface ItfBeanComImagemGrande extends ItfBeanSimplesSomenteLeitura {

    public String getImgGrande();

    public default boolean isTemImagemGrandeAdicionada() {
        return new File(SBCore.getCentralDeArquivos().getEndrLocalImagem(this, FabTipoAtributoObjeto.IMG_GRANDE)).exists();
    }

}
