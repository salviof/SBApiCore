/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.modulo;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfModuloAcaoSistema;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoDaFabrica;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.FabMenuAdminCore;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ItfFabricaMenu;
import org.coletivojava.fw.api.objetoNativo.controller.modulo.ModuloTransiente;

/**
 *
 * @author desenvolvedor
 */
public enum FabModuloSistemaCore implements ItfFabricaModulo {

    @InfoObjetoDaFabrica(id = 99999999, nomeObjeto = "Módulo Interno do Sistema", classeObjeto = ModuloTransiente.class)
    MODULO_SISTEMA;

    @Override
    public ItfModuloAcaoSistema getRegistro() {
        return (ItfModuloAcaoSistema) ItfFabricaModulo.super.getRegistro(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItfModuloAcaoSistema getModulo() {
        return getRegistro();
    }

    @Override
    public ItfFabricaMenu getMenuPadrao() {
        return FabMenuAdminCore.MENU_CONVIDADO;
    }

}
