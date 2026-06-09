/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.estrutura;

import java.util.List;

/**
 *
 * @author salvio
 */
public interface ComoEstruturaEntidadeSimples {

    public String getDescricao();

    public String getIcone();

    /**
     *
     * @return Nome da Entidade class.getSimpleName()
     */
    public String getNomeEntidade();

    public String getPlural();

    public List<String> getTags();

    /**
     * -> Utilize @see #adicionarCampo(Field pCampo) para adicionar um campo,
     * NAO utilize .add
     *
     * @return
     */
    public List<ItfEstruturaCampoEntidade> getCampos();

}
