package com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.contato;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeLocalizavel;

public interface ComoContatoCorporativo extends ComoEntidadeLocalizavel, ComoContatoSimples {

    public String getSite();

    public String telefone();

    public String responsavel();

}
