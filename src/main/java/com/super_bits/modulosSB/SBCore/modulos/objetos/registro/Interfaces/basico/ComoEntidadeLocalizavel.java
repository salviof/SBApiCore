package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ComoLocal;

public interface ComoEntidadeLocalizavel extends ComoEntidadeNormal {

    public String getTelefone();

    public ComoLocal getLocalizacao();

    public void setLocalizacao(ComoLocal pLocal);

}
