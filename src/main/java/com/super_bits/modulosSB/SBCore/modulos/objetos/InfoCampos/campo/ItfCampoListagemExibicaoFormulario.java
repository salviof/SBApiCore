/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo;

import java.util.List;

/**
 *
 * @author SalvioF
 */
public interface ItfCampoListagemExibicaoFormulario extends ItfCampoExibicaoFormulario {

    public List<ItfCaminhoCampoDaListaFormulario> getCamposDoSubFormulario();

    public void adicionarCampo(ItfCampoExibicaoFormulario pCampo);

    public ItfGrupoCampos getGrupoSubcampos();

}
