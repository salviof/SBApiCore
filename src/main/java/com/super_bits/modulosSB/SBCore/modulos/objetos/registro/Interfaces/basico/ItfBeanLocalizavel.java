package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfLocal;

public interface ItfBeanLocalizavel extends ItfBeanNormal {

    public String getTelefone();

    public ItfLocal getLocalizacao();

    public void setLocalizacao(ItfLocal pLocal);

}
