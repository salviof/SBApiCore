/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.modulo;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ItfFabricaMenu;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreFabrica;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreGeradorDeIDSimples;

/**
 *
 * @author desenvolvedor
 */
public interface ItfFabricaModulo extends ItfFabrica {

    public default ItfModuloAcaoSistema getModulo() {
        return (ItfModuloAcaoSistema) getRegistro();
    }

    @Override
    public default ItfModuloAcaoSistema getRegistro() {
        try {
            ItfModuloAcaoSistema modulo = (ItfModuloAcaoSistema) UtilSBCoreFabrica.getRegistroPorEnum(this);
            modulo.setId(UtilSBCoreGeradorDeIDSimples.gerarIdUnicoObejtoVinculadoAFabrica(modulo));
            return modulo;

        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).fatal("Erro criando informações do modulo" + this + t.getMessage(), t);

            return null;
        }
    }

    @Override
    public boolean equals(Object obj);

    public ItfFabricaMenu getMenuPadrao();

}
