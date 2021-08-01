/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.comparadorObjeto;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author salviofurbino
 * @since 12/10/2019
 * @version 1.0
 */
public class ComparadorGenerico implements Comparator<ItfBeanSimples> {

    private FabTipoAtributoObjeto tipoAtributo;
    private final boolean ordemReversa;
    protected int valorPrimeiroMaior = 1;
    protected int valorPrimentoMenor = -1;
    protected String campoStr;

    public ComparadorGenerico(FabTipoAtributoObjeto pTipoComparacao, boolean pOrdemReversa) {
        tipoAtributo = pTipoComparacao;
        ordemReversa = pOrdemReversa;

        if (ordemReversa) {
            valorPrimeiroMaior = -1;
            valorPrimentoMenor = 1;
        }
        if (tipoAtributo == null) {
            throw new UnsupportedOperationException("Erro tipo de comparador não enviado");
        }
    }

    public ComparadorGenerico(String pCampo, boolean pOrdemReversa) {

        if (pCampo == null || pCampo.isEmpty()) {

            throw new UnsupportedOperationException("Erro atributo de comparação não enviado");

        }
        campoStr = pCampo;
        ordemReversa = pOrdemReversa;
        if (pOrdemReversa) {
            valorPrimeiroMaior = -1;
            valorPrimentoMenor = 1;
        }

    }

    @Override
    public int compare(ItfBeanSimples o1, ItfBeanSimples o2) {
        //primeiro menor envia negativo
        //segundo menor envia positivo
        // igual 0;
        Object valor1;
        Object valor2;
        ItfCampoInstanciado cp1;
        ItfCampoInstanciado cp2;
        if (tipoAtributo == null) {
            if (o1 != null) {
                tipoAtributo = o1.getCPinst(campoStr).getFabricaTipoAtributo();
            }
        }
        if (tipoAtributo == null) {
            if (o2 != null) {
                tipoAtributo = o2.getCPinst(campoStr).getFabricaTipoAtributo();
            }
        }
        if (o1 == null && o2 == null) {
            return valorPrimentoMenor;
        }
        if (o1 == null && o2 != null) {
            return 0;
        }
        if (o1 != null && o2 == null) {
            return valorPrimeiroMaior;
        }

        if (campoStr != null) {
            cp1 = o1.getCampoInstanciadoByNomeOuAnotacao(campoStr);
            cp2 = o2.getCampoInstanciadoByNomeOuAnotacao(campoStr);

        } else {
            cp1 = o1.getCampoInstanciadoByAnotacao(tipoAtributo);
            cp2 = o2.getCampoInstanciadoByAnotacao(tipoAtributo);
        }
        valor1 = cp1.getValor();
        valor2 = cp2.getValor();
        if ((valor1 == null || cp1.isCampoNaoInstanciado()) && (valor2 == null || cp2.isCampoNaoInstanciado())) {
            return 0;
        }
        if (valor1 == null || cp1.isCampoNaoInstanciado()) {
            return valorPrimentoMenor;
        }
        if (valor2 == null || cp2.isCampoNaoInstanciado()) {
            return valorPrimeiroMaior;
        }
        switch (tipoAtributo.getTipoPrimitivo()) {
            case INTEIRO:
                if (Integer.valueOf(valor1.toString()) > Integer.valueOf(valor2.toString())) {
                    if (!ordemReversa) {
                        return valorPrimentoMenor;
                    } else {
                        return valorPrimeiroMaior;
                    }

                }
                if (Integer.valueOf(valor1.toString()) < Integer.valueOf(valor2.toString())) {
                    if (!ordemReversa) {
                        return valorPrimeiroMaior;
                    } else {
                        return valorPrimentoMenor;
                    }
                }
                return 0;

            case NUMERO_LONGO:
                if (Long.valueOf(valor1.toString()) > Long.valueOf(valor2.toString())) {
                    return valorPrimeiroMaior;
                }
                if (Long.valueOf(valor1.toString()) < Long.valueOf(valor2.toString())) {
                    return valorPrimentoMenor;
                }
                return 0;

            case LETRAS:
                if (ordemReversa) {
                    return valor1.toString().compareToIgnoreCase(valor2.toString());
                } else {

                    return valor1.toString().compareToIgnoreCase(valor2.toString()) * -1;
                }

            case DATAS:
                Date data1 = (Date) valor1;
                Date data2 = (Date) valor2;
                if (data1.getTime() > data2.getTime()) {
                    if (!ordemReversa) {
                        return valorPrimeiroMaior;
                    } else {
                        return valorPrimentoMenor;
                    }
                }
                if (data1.getTime() < data2.getTime()) {
                    if (!ordemReversa) {
                        return valorPrimentoMenor;
                    } else {
                        return valorPrimeiroMaior;
                    }
                }
                return 0;

            case BOOLEAN:

                Boolean v1 = (Boolean) valor1;
                Boolean v2 = (Boolean) valor2;
                if (Objects.equals(v1, v2)) {
                    return 0;
                }
                if (v1) {
                    return valorPrimeiroMaior;
                } else {
                    return valorPrimentoMenor;
                }

            case DECIMAL:

                if (Double.valueOf(valor1.toString()) > Double.valueOf(valor2.toString())) {
                    return valorPrimeiroMaior;
                }
                if (Double.valueOf(valor1.toString()) < Double.valueOf(valor2.toString())) {
                    return valorPrimentoMenor;
                }
                return 0;

            case ENTIDADE:
                return new ComparadorGenerico(FabTipoAtributoObjeto.AAA_NOME, ordemReversa).compare((ItfBeanSimples) cp1.getValor(), (ItfBeanSimples) cp2.getValor());

            case OUTROS_OBJETOS:
                throw new UnsupportedOperationException("a comparação deste tipo de atributo não foi definida ");

            default:
                throw new AssertionError(tipoAtributo.getTipoPrimitivo().name());

        }

    }

}
