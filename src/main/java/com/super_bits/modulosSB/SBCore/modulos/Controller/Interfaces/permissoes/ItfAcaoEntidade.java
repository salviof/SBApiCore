/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;

/**
 *
 * @author desenvolvedor
 */
public interface ItfAcaoEntidade extends ItfAcaoDoSistema {

    public Class getClasseRelacionada();

    public void setClasseRelacionada(Class classeRelacionada);

    public String getNomeTipoObjetoClasseRelacionada();

    public String getNomeTipoObjetoClasseRelacionadaPlural();

    public default boolean isAcaoDeRegistroExistente() {
        switch (getTipoAcaoGenerica()) {
            case FORMULARIO_NOVO_REGISTRO:

            case SELECAO_DE_ACAO:
            case CONTROLLER_SALVAR_EDICAO:
            case CONTROLLER_SALVAR_NOVO:
            case GERENCIAR_DOMINIO:
            case CONTROLLER_SALVAR_MODO_MERGE:
                return false;

            default:
                return true;

        }
    }

}
