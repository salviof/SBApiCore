/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores.listagemItem;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimplesSomenteLeitura;
import java.util.List;

/**
 *
 * @author desenvolvedor
 * @param <T>
 */
public interface ItfListagemItensSomenteLeitura<T extends ItfBeanSimplesSomenteLeitura> {

    public List<T> getListaObjetosSelecionados();

    public void setListaObjetosSelecionados(List<T> pLista);

    public int getIndiceItemSelecionado();

    public void setIndiceItemSelecionado(int pItem);

}
