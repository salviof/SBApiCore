/*
 *  Super-Bits.com CODE CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfPermissao;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ItfMenusDeSessao;
import com.super_bits.modulosSB.SBCore.modulos.view.telas.ItfTelaUsuario;

import java.util.Date;
import java.util.List;

/**
 *
 * Interface que representa uma sesao de usuário
 *
 * @author Salvio
 */
public interface ItfSessao {

    public int getIdSessao();

    public ItfUsuario getUsuario();

    public ItfMenusDeSessao getMenusDaSessao();

    public Date getInicio();

    public Date getFim();

    public List<ItfPermissao> getAcoesRealizadas();

    public void setUsuario(ItfUsuario pUsuario);

    public boolean isIdentificado();

    public ItfTelaUsuario getTelaUsuario();

    public boolean isTipoViewDefinido();

    public String getPastaTempDeSessao();

    public void encerrarSessao();

    public boolean isAcessoPermitido(ItfAcaoDoSistema pAcao);

}
