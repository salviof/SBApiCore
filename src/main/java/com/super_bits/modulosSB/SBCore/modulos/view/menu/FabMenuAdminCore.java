/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.menu;

import java.util.ArrayList;
import java.util.List;
import org.coletivojava.fw.api.objetoNativo.view.menu.MenuSBFW;

/**
 *
 * @author SalvioF
 */
public enum FabMenuAdminCore implements ItfFabricaMenu {

    MENU_ADMIN_PROJETO,
    MENU_DEVELOPER,
    MENU_CONVIDADO;

    @Override
    public List<ItfMenuSB> getTodosMenus() {
        return new ArrayList<>();
    }

    @Override
    public ItfMenuSB getMenuPrincipal() {
        return new MenuSBFW();
    }

    @Override
    public ItfMenuSB getMenuSecundario() {
        return new MenuSBFW();
    }

}
