/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.objetos.MapaObjetosProjetoAtual;

/**
 *
 * @author desenvolvedor
 */
public interface ItfBeanSimplesSomenteLeitura extends ItfBeanIDUnicoSomenteLeitura {

    public String getNomeCurto();

    public String getNome();

    public String getIconeDaClasse();

    public default String getXhtmlVisao() {
        return MapaObjetosProjetoAtual.getVisualizacaoDoObjeto(this.getClass());
    }

    public default String getXhtmlVisaoMobile() {
        return MapaObjetosProjetoAtual.getVisualizacaoDoObjeto(this.getClass());
    }

    public default String getXhtmlVisao(int numeroColunas) {
        return MapaObjetosProjetoAtual.getVisualizacaoDoObjeto(this.getClass());
    }

}
