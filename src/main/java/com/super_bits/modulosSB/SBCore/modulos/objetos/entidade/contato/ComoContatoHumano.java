package com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.contato;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.contato.ComoContatoSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeLocalizavel;

public interface ComoContatoHumano extends ComoEntidadeLocalizavel, ComoContatoSimples {

    public String getApelido();

    public String getCelular();

}
