/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.comparadorObjeto;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;

/**
 *
 * @author sfurbino
 */
public class ComparadorPorId extends ComparadorGenerico {
    
    public ComparadorPorId(boolean pOrdemReversa) {
        super(FabTipoAtributoObjeto.ID, pOrdemReversa);
    }

    @Override
    public int compare(ItfBeanSimples o1, ItfBeanSimples o2) {
        if (o1==null && o2==null){
            return 0;
        }
        if (o1==null && o2!=null){
            return valorPrimentoMenor;
        }
        if (o1!=null && o2==null){
            return valorPrimeiroMaior;
        }
        if (o1.getId()>o2.getId()){
            return valorPrimeiroMaior;
        }
        if (o1.getId()<o2.getId()){
            return valorPrimentoMenor;
        }
        return 0;
    }
    
}
