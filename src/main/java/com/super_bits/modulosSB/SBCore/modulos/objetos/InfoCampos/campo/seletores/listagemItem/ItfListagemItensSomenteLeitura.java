/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores.listagemItem;

import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimplesSomenteLeitura;

/**
 *
 * @author desenvolvedor
 * @param <T>
 */
public interface ItfListagemItensSomenteLeitura<T extends ComoEntidadeSimplesSomenteLeitura> {

    public List<T> getListaObjetosSelecionados();

    public void setListaObjetosSelecionados(List<T> pLista);

    public int getIndiceItemSelecionado();

    public void setIndiceItemSelecionado(int pItem);

}
