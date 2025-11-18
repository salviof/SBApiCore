/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado;

import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimplesSomenteLeitura;

/**
 *
 * @author desenvolvedor
 */
public interface ItfCampoInstanciadoEnumFabricaObjeto {

    ComoEntidadeSimplesSomenteLeitura getBeanSelecionado();

    ItfCampoInstanciado getCampoInstanciado();

    Class getClasseEnumFab();

    List<ComoEntidadeSimplesSomenteLeitura> getListaOpcoesObjeto();

    List<Integer> getListaOpcoesOrdinal();

    List<String> getListaOpcoesString();

    int getOrdinalSelecionado();

    String getStringSelecionada();

    void setBeanSelecionado(ComoEntidadeSimplesSomenteLeitura pBeanSelecionado);

    void setOrdinalSelecionado(int ordinalSelecionado);

    void setStringSelecionada(String pStringSelecionada);

}
