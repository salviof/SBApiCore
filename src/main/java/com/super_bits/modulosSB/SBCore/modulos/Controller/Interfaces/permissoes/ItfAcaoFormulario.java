/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.estadoFormulario.FabEstadoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCaminhoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfGrupoCampos;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfComponenteVisualSB;

import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfAcaoFormulario extends ItfAcaoDoSistema {

    public ItfAcaoDoSistema getAcaoExectarFormulario();

    public List<ItfCaminhoCampo> getCampos();

    public void setAcaoExectarFormulario(ItfAcaoDoSistema acaoExectarFormulario);

    public void setCampos(List<ItfCaminhoCampo> campos);

    public String getXhtml();

    public String getPastaXhtml();

    public void setXhtml(String pXhtml);

    public List<ItfGrupoCampos> getGruposDeCampos();

    public ItfGrupoCampos getGrupoCampoByID(int pID);

    public FabEstadoFormulario getEstadoFormulario();

    public void setEstadoFormulario(FabEstadoFormulario pEstadoFormulario);

    public ItfComponenteVisualSB getComponenteFormularioPadrao();
}
