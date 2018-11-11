/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo;

/**
 *
 * @author SalvioF
 */
public interface ItfCampoExibicaoFormulario extends ItfCaminhoCampo {

    public void setIdAtualizacao(String idAtualizacao);

    public boolean isSomenteLeitura();

    public void setSomenteLeitura(boolean b);

    public void setAtualizarFormAoAlterar(boolean atualizarFormAoAlterar);

    public void setAtualizarIdSelecionadoAoAlterar(boolean atualizarIdSelecionadoAoAlterar);

    public boolean isAtualizarFormAoAlterar();

    public boolean isAtualizarIdSelecionadoAoAlterar();

    public String getIdAtualizacao();

    public void setLabelAlternativo(String labelAlternativo);

    public String getLabelAlternativo();

    public void setAtualizarGrupoAoAlterar(boolean atualizarGrupoAoAlterar);

    public ItfCampoListagemExibicaoFormulario getComoCampoListagem();

    boolean isUmCampoFilhoDeLista();

    public boolean isUmCampoComLista();

    public ItfCaminhoCampo getCaminhoCampo();

    public String getIdentificadorGrupoCampo();

    public String getCaminhoCompletoComGrupoCampo();

}
