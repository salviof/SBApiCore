package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.contato;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.contato.ComoContatoSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeLocalizavel;

public interface ComoContatoHumano extends ComoEntidadeLocalizavel, ComoContatoSimples {

    public String getApelido();

    public String getCelular();

}
