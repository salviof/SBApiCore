/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores.seletorUnicoObjeto;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores.ItfSeletorGenerico;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimplesSomenteLeitura;

/**
 *
 * @author desenvolvedor
 * @param <T>
 */
public interface ItfSelecaoObjetoDeUmaLista<T extends ItfBeanSimplesSomenteLeitura> extends ItfSeletorGenerico {

    public T getObjetoSelecionado();

    public void setObjetoSelecionado(T pObjeto);

}
