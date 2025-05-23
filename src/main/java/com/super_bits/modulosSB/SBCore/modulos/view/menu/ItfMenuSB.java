/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.menu;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import java.util.List;

/**
 *
 * Implementa um menu com Ações do sistema e Sessões
 *
 *
 * @author desenvolvedor
 */
public interface ItfMenuSB {

    /**
     * Adiciona uma sessao ao menu
     *
     * @param pSessao Uma sessao com todas suas ações
     */
    public ItfSessaoDeMenuSB addSessao(ItfSessaoDeMenuSB pSessao);

    public ItfSessaoDeMenuSB addSessao(ItfFabricaAcoes pAcao);

    /**
     *
     * Retorna uma sessão com ações, e sub-sessoes
     *
     * @return
     */
    public List<ItfSessaoDeMenuSB> getSessoes();

    public boolean isTemMenu();

}
