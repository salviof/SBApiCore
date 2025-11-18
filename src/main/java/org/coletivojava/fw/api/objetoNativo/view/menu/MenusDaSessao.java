/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.view.menu;

import com.super_bits.modulosSB.SBCore.modulos.view.menu.ComoMenuSB;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ComoFabricaMenu;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ComoMenusDeSessao;

/**
 *
 * @author desenvolvedor
 */
public class MenusDaSessao implements ComoMenusDeSessao {

    private ComoMenuSB menuPrincipal;

    private ComoMenuSB menuAvancado;

    /**
     *
     * @param menuPrincipal Menu com atalhos principais
     * @param menuSecundario Menu avançado
     */
    public MenusDaSessao(ComoMenuSB menuPrincipal, ComoMenuSB menuSecundario) {

        this.menuPrincipal = menuPrincipal;
        this.menuAvancado = menuSecundario;

    }

    public MenusDaSessao(ComoFabricaMenu pFabrica) {
        this.menuPrincipal = (MenuSBFW) pFabrica.getMenuPrincipal();
        MenuSBFW avancado = (MenuSBFW) pFabrica.getMenuSecundario();
        if (avancado != null && avancado.isTemMenu()) {
            this.menuAvancado = (MenuSBFW) pFabrica.getMenuSecundario();
        }
    }

    public MenusDaSessao(MenuSBFW menuPrincipal) {

        this.menuPrincipal = menuPrincipal;

    }

    @Override
    public boolean isTemMenuAvancado() {
        return menuAvancado != null;
    }

    @Override
    public MenuSBFW getMenuPrincipal() {
        return (MenuSBFW) menuPrincipal;
    }

    public void setMenuPrincipal(MenuSBFW menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }

    @Override
    public MenuSBFW getMenuAvancado() {

        return (MenuSBFW) menuAvancado;
    }

    public void setMenuAvancado(MenuSBFW menuAvancado) {
        this.menuAvancado = menuAvancado;
    }

}
