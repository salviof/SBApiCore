/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimplesSomenteLeitura;
import java.util.List;

/**
 *
 * @author desenvolvedor
 * @param <T>
 */
public interface ItfSeletorGenerico<T extends ItfBeanSimplesSomenteLeitura> {

    public void atualizaOrigemPelaSelecao();

    public void atualizaPickListViewContexto();

    public String getNomeOrigem();

    public void setNomeOrigem(String pNomeString);

    public void reloadOrigem();

    public void limparSelecao();

    public void selecionarTudo();

    public List<T> getOrigem();

}
