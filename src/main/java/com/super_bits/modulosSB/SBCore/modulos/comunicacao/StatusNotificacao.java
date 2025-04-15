/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import javax.persistence.Id;

/**
 *
 * @author novy
 */
@InfoObjetoSB(tags = {"Status comunicação"}, plural = "Status de comunicação")
public class StatusNotificacao {

    @Id
    private Long id;
    @InfoCampo(label = "Status Msg")
    private String nome;

}
