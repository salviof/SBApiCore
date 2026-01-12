package com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.cep.ComoLocal;

public interface ComoEntidadeLocalizavel extends ComoEntidadeNormal {

    public String getTelefone();

    public ComoLocal getLocalizacao();

    public void setLocalizacao(ComoLocal pLocal);

}
