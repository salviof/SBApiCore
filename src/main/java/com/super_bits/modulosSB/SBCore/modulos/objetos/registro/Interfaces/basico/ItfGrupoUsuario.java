/*
 *  Super-Bits.com CODE CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import java.lang.reflect.Field;
import java.util.List;

/**
 *
 * @author Salvio
 */
public interface ItfGrupoUsuario extends ItfBeanSimplesSomenteLeitura, ItfBeanInstanciado {

    public String getDescricao();

    public List<? extends ItfUsuario> getUsuarios();

    public ItfFabricaAcoes getPaginaInicial();

    public boolean isAtivo();

    public ItfModuloAcaoSistema getModuloPrincipal();

    public String getNomeUnico();

    public String getEmail();
}
