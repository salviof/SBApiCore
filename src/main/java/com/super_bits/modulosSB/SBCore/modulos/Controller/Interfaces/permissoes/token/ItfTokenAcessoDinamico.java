/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.token;

/**
 *
 * @author sfurbino
 */
public interface ItfTokenAcessoDinamico extends ItfTokenAcesso {

    public String getSlugAcaoFormulario();

    public void setSlugAcaoFormulario(String slugAcaoFormulario);

    public String getCodigoEntidade();

    public void setCodigoEntidade(String codigoEntidade);

    public String getEntidadeDoAcesso();

    public void setEntidadeDoAcesso(String entidadeDoAcesso);
}
