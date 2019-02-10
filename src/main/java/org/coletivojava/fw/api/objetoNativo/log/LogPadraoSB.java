/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coletivojava.fw.api.objetoNativo.log;

import com.super_bits.modulosSB.SBCore.modulos.tratamentoErros.ItfErroSBServico;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author desenvolvedor
 */
public class LogPadraoSB {

    private static Class<? extends ItfErroSBServico> classeErroDoContexto = null;

    public static ItfErroSBServico getNovaInstancia() {
        try {
            if (classeErroDoContexto == null) {
                Logger.getLogger("org.coletivojava.log4J2NaoConfigurado").log(Level.WARNING, "o serviço de tratamento de erro não foi definido");
                return null;
            }
            return (ItfErroSBServico) classeErroDoContexto.newInstance();
        } catch (IllegalAccessException | InstantiationException t) {
            Logger.getLogger("org.coletivojava.log4J2NaoConfigurado").log(Level.WARNING, "o serviço de tratamento de erro não foi definido");
            return null;
        }
    }

    public static void registrarClasseErro(Class<? extends ItfErroSBServico> pClasseErroService) {
        if (classeErroDoContexto != null) {
            throw new UnsupportedOperationException("A classe de erro já foi definida");
        } else {
            classeErroDoContexto = pClasseErroService;
        }
    }

}
