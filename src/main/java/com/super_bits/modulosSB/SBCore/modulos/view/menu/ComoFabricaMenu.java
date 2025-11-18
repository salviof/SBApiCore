/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.menu;

import java.util.ArrayList;

import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabrica;

/**
 *
 * @author desenvolvedor
 */
public interface ComoFabricaMenu extends ComoFabrica {

    public default List<ComoMenuSB> getTodosMenus() {
        List<ComoMenuSB> menus = new ArrayList<>();
        for (ComoFabricaMenu menu : this.getClass().getEnumConstants()) {
            menus.add((ComoMenuSB) menu.getRegistro());
        }
        return menus;
    }

    public ComoMenuSB getMenuPrincipal();

    public ComoMenuSB getMenuSecundario();

}
