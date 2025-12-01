/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.fabrica;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import java.io.Serializable;
import org.coletivojava.fw.utilCoreBase.UtilCRCFabrica;
import org.coletivojava.fw.utilCoreBase.UtilCRCReflexaoObjetoSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoStatus;

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
public interface ComoFabrica extends Serializable {

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
        return UtilCRCFabrica.getRegistroPorEnum(this);
    }

    public default boolean isPermitidoAlterarObjeto() {
        Class classe = null;
        try {
            classe = UtilCRCFabrica.getClasseEntidadePorEnum(this);
        } catch (Throwable t) {
            classe = getRegistro().getClass();
        }
        if (ComoStatus.class.isAssignableFrom(classe)) {
            return false;
        }
        InfoObjetoSB infoObjeto = UtilCRCReflexaoObjetoSimples.getInfoClasseObjeto(classe);
        return infoObjeto.permitidoAlterarObjetoDaFabrica();

    }

}
