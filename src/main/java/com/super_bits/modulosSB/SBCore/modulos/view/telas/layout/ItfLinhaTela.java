/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.telas.layout;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfLinhaTela extends Serializable {

    public void adicionarColuna(ItfColunaTela pColuna);

    public String getClasseOrganizacao();

    public List<ItfColunaTela> getColunas();

    public int getColunasOcupadas();

    public int getColunasRestante();

}
