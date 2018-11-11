/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimplesSomenteLeitura;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfCampoInstanciadoEnumFabricaObjeto {

    ItfBeanSimplesSomenteLeitura getBeanSelecionado();

    ItfCampoInstanciado getCampoInstanciado();

    Class getClasseEnumFab();

    List<ItfBeanSimplesSomenteLeitura> getListaOpcoesObjeto();

    List<Integer> getListaOpcoesOrdinal();

    List<String> getListaOpcoesString();

    int getOrdinalSelecionado();

    String getStringSelecionada();

    void setBeanSelecionado(ItfBeanSimplesSomenteLeitura pBeanSelecionado);

    void setOrdinalSelecionado(int ordinalSelecionado);

    void setStringSelecionada(String pStringSelecionada);

}
