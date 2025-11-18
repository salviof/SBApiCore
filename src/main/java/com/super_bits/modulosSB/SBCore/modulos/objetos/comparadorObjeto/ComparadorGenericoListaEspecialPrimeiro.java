/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.comparadorObjeto;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;

import java.util.List;

/**
 *
 * @author salvio
 */
public class ComparadorGenericoListaEspecialPrimeiro extends ComparadorGenerico {

    private final List<ComoEntidadeSimples> listaEspecial;

    public ComparadorGenericoListaEspecialPrimeiro(FabTipoAtributoObjeto pCampo, List<ComoEntidadeSimples> pListaEspecial, boolean pUsarordemREversa) {
        super(pCampo, pUsarordemREversa);
        listaEspecial = pListaEspecial;
    }

    @Override
    public int compare(ComoEntidadeSimples o1, ComoEntidadeSimples o2) {
        if (o1 != null && o2 != null) {

            if (listaEspecial.contains(o1) && listaEspecial.contains(o2)) {
                return super.compare(o1, o2);
            }
            if (listaEspecial.contains(o1)) {
                return valorPrimentoMenor;
            }

            if (listaEspecial.contains(o2)) {
                return valorPrimeiroMaior;
            }
        }
        return super.compare(o1, o2); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
