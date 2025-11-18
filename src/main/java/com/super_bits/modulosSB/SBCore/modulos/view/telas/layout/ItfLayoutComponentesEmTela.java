/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.telas.layout;

import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComoComponenteVisualSBEmLayout;

/**
 *
 * @author desenvolvedor
 */
public interface ItfLayoutComponentesEmTela {

    void adicionarComponente(ComoComponenteVisualSBEmLayout pComponente, String identificacaoColuna);

    public ItfColunaTela getColunaByNome(String pNome);

    public ItfColunaTela getColunaByNomeCompleto(String pNomeCampoCompleto);

    public List<ItfColunaTela> getColunas();

    public ItfGridLayoutTela getGridLayoutTela();

    public List<ItfLinhaTela> getLinhas();

    public ItfColunaTela getUltimaColuna();

}
