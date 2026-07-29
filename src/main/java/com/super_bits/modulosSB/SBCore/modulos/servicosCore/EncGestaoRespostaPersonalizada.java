/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.servicosCore;

/**
 *
 * @author salvio
 */
public class EncGestaoRespostaPersonalizada extends Exception {

    private String urlInterfaceDeResposta;

    public EncGestaoRespostaPersonalizada(String urlInterfaceDeResposta) {
        super("Encemihamento de gestão de resposta");
        this.urlInterfaceDeResposta = urlInterfaceDeResposta;
    }

    public String getUrlInterfaceDeResposta() {
        return urlInterfaceDeResposta;
    }

    public void setUrlInterfaceDeResposta(String urlInterfaceDeResposta) {
        this.urlInterfaceDeResposta = urlInterfaceDeResposta;
    }

}
