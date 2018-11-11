package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import java.util.List;

public interface ItfBeanNormal extends ItfBeanSimples,
        ItfBeanComImagemMedio, ItfBeanComImagemGrande {

    public String getNomeLongo();

    public void setNomeLongo(String pnomeLongo);

    public String getDescritivo();

    public void setDescritivo(String pDescritivo);

    public List<String> getGaleria();

    public boolean isAtivo();

    public void setAtivo(boolean pAtivo);

}
