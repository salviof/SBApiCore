/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores;

import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimplesSomenteLeitura;

/**
 *
 * @author desenvolvedor
 * @param <T>
 */
public interface ItfSeletorGenerico<T extends ComoEntidadeSimplesSomenteLeitura> {

    public void atualizaOrigemPelaSelecao();

    public String getNomeOrigem();

    public void setNomeOrigem(String pNomeString);

    public void reloadOrigem();

    public void limparSelecao();

    public void selecionarTudo();

    public List<T> getOrigem();

    public void atualizarListaCompleta();

    public List filtrarPorAutoComplet(String pParametro);

    public String getFiltro();

    public void listarPrimeiros50();

    public void setFiltro(String pFiltro);

    public void limparFiltro();

    public int getMinimoParaPesquisa();

    public void setMinimoParaPesquisa(int minimoParaPesquisa);

}
