/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.ia;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.coletivojava.fw.api.tratamentoErros.ErroPreparandoObjeto;

/**
 *
 * @author salvio
 */
public interface ComoFabricaExecucaoIA extends ComoFabrica {

    public default ComoExecucaoIA getExecucaoIAByEntidade(ComoEntidadeSimples pEntidade) {

        Class classeExecucao = getClasseExecucaoPorEntidade(pEntidade);
        ComoExecucaoIA execucao;
        try {
            execucao = (ComoExecucaoIA) classeExecucao.newInstance();
            execucao.prepararNovoObjeto(pEntidade);
            return execucao;
        } catch (InstantiationException | IllegalAccessException | ErroPreparandoObjeto ex) {
            Logger.getLogger(ComoFabricaExecucaoIA.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public Class<? extends ComoExecucaoIA> getClasseExecucaoPorEntidade(ComoEntidadeSimples pEntidade);
}
