/*
 *  Super-Bits.com CODE CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabricaAcoes;
import java.util.List;

/**
 *
 * @author Salvio
 */
public interface ComoGrupoUsuario extends ComoEntidadeSimplesSomenteLeitura, ComoDominio {

    public String getDescricao();

    public List<? extends ComoUsuario> getUsuarios();

    public ComoFabricaAcoes getPaginaInicial();

    public boolean isAtivo();

    public ItfModuloAcaoSistema getModuloPrincipal();

    public String getNomeUnico();

    public String getEmail();

    public boolean isGrupoNativoSistema();

}
