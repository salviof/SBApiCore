/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.fabrica;

import java.io.Serializable;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreFabrica;

/**
 *
 *
 * Uma interface do tipo Fabrica, generaliza os enuns de criação de registro.
 *
 * é utilizado por exemplo para Salvar todos os registros de determinada fabrica
 * de um tipo no banco
 *
 * @author sfurbino
 */
public interface ItfFabrica extends Serializable {

    /**
     *
     *
     * Este método deve ser declarado como abstrado na fabrica do tipo enum.
     * Desta forma, cada
     *
     *
     * @return
     */
    public default Object getRegistro() {
        return UtilSBCoreFabrica.getRegistroPorEnum(this);
    }

}
