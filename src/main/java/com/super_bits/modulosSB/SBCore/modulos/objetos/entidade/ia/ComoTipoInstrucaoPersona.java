/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.ia;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoTemIcone;

/**
 * Assunto de uma instrução de IA (perfil do cliente, dados do produto, visão
 * de mundo, etc.).
 *
 * @author salvio
 */
public interface ComoTipoInstrucaoPersona extends ComoEntidadeSimples, ComoTemIcone {

    public String getDescricao();

    public void setDescricao(String descricao);

    @Override
    public String getIcone();

    public void setIcone(String icone);

}
