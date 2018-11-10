/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoDestinatario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfGrupoUsuario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfDestinatario {

    public FabTipoDestinatario getTipoDestinatario();

    public List<ItfUsuario> getUsuarios();

    public ItfUsuario getUsuario();

    public ItfGrupoUsuario getGrupoUsuario();

    public List<ItfGrupoUsuario> getGruposUsuario();

    public String getEmailsConcatenados();

}
