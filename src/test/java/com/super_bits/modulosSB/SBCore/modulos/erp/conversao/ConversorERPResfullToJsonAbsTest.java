/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.erp.conversao;

import br.org.coletivoJava.fw.erp.implementacao.erpintegracao.model.conversor.ConversorERPResfullToJsonAbs;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;

/**
 *
 * @author salvio
 */
public class ConversorERPResfullToJsonAbsTest {

    public ConversorERPResfullToJsonAbsTest() {
    }

    /**
     * Test of getListAtributosDaLista method, of class
     * ConversorERPResfullToJsonAbs.
     */
    @Test
    public void testGetListAtributosDaLista() {
        ConversorERPResfullToJsonAbs conversor = new ConversorERPResfullToJsonAbs();

        Map<String, String> mapeamento = new HashMap<>();

        mapeamento.put("id", "@id");
        mapeamento.put("pessoa", "cliente");
        mapeamento.put("itenssazonais[]", "itens");
        mapeamento.put("itenssazonais[].valorsetup", "itens[].valorNegociado");
        mapeamento.put("itenssazonais[].tiposervico", "itens[].tipoServico");

        mapeamento.put("itemrecorrente[]", "itensRecorrentes");
        mapeamento.put("itemrecorrente[].valormensal", "itensRecorrentes[].valorNegociado");
        mapeamento.put("itemrecorrente[].tiposervico", "itensRecorrentes[].tipoServico");

        List<String> atributos = conversor.getListAtributosDaLista("itemrecorrente[].valormensal", mapeamento);

        atributos.stream().forEach(System.out::println);
    }

}
