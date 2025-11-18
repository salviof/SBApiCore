/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.token;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;
import java.util.Date;

/**
 *
 * @author desenvolvedorninja01
 * @since 14/10/2019
 * @version 1.0
 */
public interface ItfTokenAcesso extends ComoEntidadeSimples {

    public String getCodigo();

    public Date getDataHoraCriacao();

    public Date getValidade();

    public void setCodigo(String codigo);

    public void setDataHoraCriacao(Date dataHoraCriacao);

    public void setValidade(Date validade);

}
