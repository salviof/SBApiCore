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
public enum FabMenuAdminCore implements ComoFabricaMenu {

    MENU_ADMIN_PROJETO,
    MENU_DEVELOPER,
    MENU_CONVIDADO;

    @Override
    public List<ComoMenuSB> getTodosMenus() {
        return new ArrayList<>();
    }

    @Override
    public ComoMenuSB getMenuPrincipal() {
        return new MenuSBFW();
    }

    @Override
    public ComoMenuSB getMenuSecundario() {
        return new MenuSBFW();
    }

}
