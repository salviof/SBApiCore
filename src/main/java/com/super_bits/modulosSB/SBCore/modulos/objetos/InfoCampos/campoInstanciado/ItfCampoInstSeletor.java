/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfGrupoCampos;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores.ItfSeletorGenerico;

import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfCampoInstSeletor {

    public void atualizarListaCompleta();

    public List filtrarPorAutoComplet(String pParametro);

    public String getFiltro();

    public int getMinimoParaPesquisa();

    public ItfSeletorGenerico getSeletor();

    public void listarPrimeiros50();

    public void setFiltro(String pFiltro);

    public void limparFiltro();

    public ItfGrupoCampos getGrupoCampoExibicao();

}
