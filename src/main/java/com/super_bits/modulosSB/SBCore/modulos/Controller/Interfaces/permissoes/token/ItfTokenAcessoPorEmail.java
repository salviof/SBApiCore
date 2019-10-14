/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.token;

/**
 * @author desenvolvedorninja01
 * @since 14/10/2019
 * @version 1.0
 */
public interface ItfTokenAcessoPorEmail extends ItfTokenAcesso {

    public String getEmail();

    public void setEmail(String pEmail);
}
