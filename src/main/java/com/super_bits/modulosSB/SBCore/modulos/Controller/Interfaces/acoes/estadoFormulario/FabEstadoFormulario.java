/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.estadoFormulario;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoDaFabrica;

/**
 *
 * @author desenvolvedor
 */
public enum FabEstadoFormulario implements ItfFabrica {

    @InfoObjetoDaFabrica(id = 1, nomeObjeto = "Criação")
    NOVO,
    @InfoObjetoDaFabrica(id = 2, nomeObjeto = "Edição")
    EDITAR,
    @InfoObjetoDaFabrica(id = 3, nomeObjeto = "Visualização")
    VISUALIZAR,
    @InfoObjetoDaFabrica(id = 4, nomeObjeto = "Indefinido")
    INDEFINIDO;

}
