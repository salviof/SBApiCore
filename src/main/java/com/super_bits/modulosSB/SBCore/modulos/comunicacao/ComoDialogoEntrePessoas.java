/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoUsuario;

/**
 *
 * @author salvio
 */
public interface ComoDialogoEntrePessoas extends ComoDialogo {

    public ComoUsuario getUsuarioRemetente();

    public boolean isRemetenteAguardandoReposta();

    public String getTextoRespostaPositivaAoRemetente();

    public String getTextoRespostaNegativaAoRemetente();

    public String getObservacaoResposta();

}
