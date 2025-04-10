/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.telas;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabColunasTela;

/**
 *
 * @author desenvolvedor
 */
public interface ItfTipoTela {

    public FabColunasTela getColunas();

    public Long getId();

    public String getNome();

    public int getxMaximo();

    public int getxMinimo();

    public int getyMaximo();

    public int getyMinimo();

    void setColunas(FabColunasTela colunas);

    void setId(Long id);

    void setNome(String nome);

    void setxMaximo(int xMaximo);

    void setxMinimo(int xMinimo);

    void setyMaximo(int yMaximo);

    void setyMinimo(int yMinimo);

}
