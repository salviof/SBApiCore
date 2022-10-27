/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.menu;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfFabricaMenu extends ItfFabrica {

    public default List<ItfMenuSB> getTodosMenus() {
        List<ItfMenuSB> menus = new ArrayList<>();
        for (ItfFabricaMenu menu : this.getClass().getEnumConstants()) {
            menus.add((ItfMenuSB) menu.getRegistro());
        }
        return menus;
    }

    public ItfMenuSB getMenuPrincipal();

    public ItfMenuSB getMenuSecundario();

}
