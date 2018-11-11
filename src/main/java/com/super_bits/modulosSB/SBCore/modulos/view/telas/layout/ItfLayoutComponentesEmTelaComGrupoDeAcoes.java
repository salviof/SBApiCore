/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.telas.layout;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import java.util.Map;

/**
 *
 * @author desenvolvedor
 */
public interface ItfLayoutComponentesEmTelaComGrupoDeAcoes extends ItfLayoutComponentesEmTela {

    Map<Integer, ItfAcaoDoSistema> getGrupoDeAcoes();

    String getNomeGrupoDeAcoes();

    int getPixelPorNumeroDeAcoes();

}
