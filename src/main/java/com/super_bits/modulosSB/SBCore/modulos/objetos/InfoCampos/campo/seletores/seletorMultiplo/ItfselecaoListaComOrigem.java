/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores.seletorMultiplo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores.ItfSeletorGenerico;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores.listagemItem.ItfListagemItensSomenteLeitura;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimplesSomenteLeitura;

/**
 *
 * @author desenvolvedor
 * @param <T>
 */
public interface ItfselecaoListaComOrigem<T extends ComoEntidadeSimplesSomenteLeitura> extends
        ItfSeletorGenerico<T>, ItfListagemItensSomenteLeitura<T> {

    public void atualizaPickListViewContexto();

}
