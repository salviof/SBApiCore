/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coletivojava.fw.api.objetoNativo.log;

import org.apache.logging.log4j.LogManager;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author desenvolvedor
 */
public class LogPadraoSBTest {

    public LogPadraoSBTest() {
    }

    @Test
    public void testGetNovaInstancia() {
        try {
            throw new UnsupportedOperationException("Colé Colé");
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("A ação não parece ser tdo tipo vinculada a entidade", t);
        }
    }

    @Test
    public void testRegistrarClasseErro() {
    }

}
