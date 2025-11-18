/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoDestinatario;
import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoGrupoUsuario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;

/**
 *
 * @author desenvolvedor
 */
public interface ItfDestinatario {

    public FabTipoDestinatario getTipoDestinatario();

    public List<ComoUsuario> getUsuarios();

    public ComoUsuario getUsuario();

    public ComoGrupoUsuario getGrupoUsuario();

    public List<ComoGrupoUsuario> getGruposUsuario();

    public String getEmailsConcatenados();

}
