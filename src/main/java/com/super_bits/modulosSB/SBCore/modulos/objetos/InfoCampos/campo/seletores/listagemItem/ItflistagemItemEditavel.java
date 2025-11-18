/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores.listagemItem;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimplesSomenteLeitura;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

/**
 *
 * @author Salvio Furbino
 * @param <T>
 */
public interface ItflistagemItemEditavel<T extends ComoEntidadeSimplesSomenteLeitura> extends ItfListagemItensSomenteLeitura<T> {

    public void adicionarItem();

    public void removerItem();

    public void removerItem(int pId);

    public void removerItemSelecionadoPeloIndice();

    public void removerItem(ComoEntidadeSimples pItem);

    public ComoAcaoDoSistema getAcaoAdicionarItem();

    public ComoAcaoDoSistema getAcaoRemoverItem();

}
