/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.ia;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;

/**
 * Bloco de conhecimento reutilizável entre personas e execuções de IA.
 *
 * @author salvio
 */
public interface ComoInstrucaoIA extends ComoEntidadeSimples {

    public ComoTipoInstrucaoPersona getTipoInstrucao();

    public String getConteudo();

    public void setConteudo(String conteudo);

    public boolean isAtivo();

    public void setAtivo(boolean ativo);

    public String getTipoEntidade();

    public boolean isInformarPlaceHoldersDisponiveis();

    public void setInformarPlaceHoldersDisponiveis(boolean informarPlaceHoldersDisponiveis);

}
