/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.telas.layout;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfComponenteVisualSBEmLayout;
import org.coletivojava.fw.api.objetoNativo.view.componente.ComponenteVisualEmLayout;

/**
 *
 * @author desenvolvedor
 */
public interface ItfColunaTela {

    ComponenteVisualEmLayout getComponenteVinculado();

    Long getId();

    int getPesoLarguraCalculado();

    int getPesoLarguraIdeal();

    double getPorcentagemCalculada();

    double getPorcentagemIdeal();

    double getUnidadePesoLayoutAtual();

    void incrementarTamanhoColuna();

    boolean isUmComponenteAtributoObjeto();

    void setComponenteVinculado(ItfComponenteVisualSBEmLayout componenteVinculado);

    void setId(Long id);

    void setPesoLarguraCalculado(int pesoLarguraCalculado);

    void setPesoLarguraIdeal(int pesoLarguraIdeal);

    void setPorcentagemCalculada(int porcentagemCalculada);

    void setPorcentagemIdeal(double porcentagemIdeal);

    void setUnidadePesoLayoutAtual(double unidadePesoLayoutAtual);

}
