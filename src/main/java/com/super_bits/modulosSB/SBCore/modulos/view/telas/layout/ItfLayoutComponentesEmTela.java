/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.telas.layout;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfComponenteVisualSBEmLayout;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfLayoutComponentesEmTela {

    void adicionarComponente(ItfComponenteVisualSBEmLayout pComponente, String identificacaoColuna);

    public ItfColunaTela getColunaByNome(String pNome);

    public ItfColunaTela getColunaByNomeCompleto(String pNomeCampoCompleto);

    public List<ItfColunaTela> getColunas();

    public ItfGridLayoutTela getGridLayoutTela();

    public List<ItfLinhaTela> getLinhas();

    public ItfColunaTela getUltimaColuna();

}
