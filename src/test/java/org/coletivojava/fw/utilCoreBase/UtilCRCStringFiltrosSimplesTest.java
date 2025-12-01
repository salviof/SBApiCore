/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coletivojava.fw.utilCoreBase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sfurbino
 */
public class UtilCRCStringFiltrosSimplesTest {

    /**
     * Test of gerarUrlAmigavel method, of class UtilCRCStringFiltrosSimples.
     */
    @Test
    public void testGerarUrlAmigavel() {
        String teste = "A,B@C%d&e#f- 1 2 3 4 5";

        String resultado = UtilCRCStringFiltrosSimples.removeCaracteresEspeciais(teste);
        assertEquals("Não retirou os caracteres especiais corretamente", "ABCdef_1_2_3_4_5", resultado);

    }

}
