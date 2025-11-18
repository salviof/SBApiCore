package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.contato;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeLocalizavel;

public interface ComoContatoCorporativo extends ComoEntidadeLocalizavel, ComoContatoSimples {

    public String getSite();

    public String telefone();

    public String responsavel();

}
