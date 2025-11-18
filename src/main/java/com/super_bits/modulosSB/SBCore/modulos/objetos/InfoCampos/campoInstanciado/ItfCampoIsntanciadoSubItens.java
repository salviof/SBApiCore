/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores.listagemItem.ItflistagemItemEditavel;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;

/**
 *
 * @author desenvolvedor
 */
public interface ItfCampoIsntanciadoSubItens {

    public ItflistagemItemEditavel<ComoEntidadeSimples> getSubItens();

}
