/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.estrutura;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;

import java.lang.reflect.Field;
import java.util.List;

/**
 *
 * @author SalvioF
 */
public interface ItfEstruturaDeEntidade extends ComoEntidadeSimples, ComoEstruturaEntidadeSimples {

    void adicionarCampo(Field pCampo);

    void adicionarEnum(String enums);

    void adicionarTags(String pTag);

    public List<ItfEstruturaCampoDinamicoEntidade> getCalculos();

    public ItfEstruturaCampoEntidade getCampoByNomeDeclarado(String pNome);

    public List<String> getListaEnum();

    public List<ItfListaDeEntidade> getListas();

    public List<ItfEstruturaCampoEntidade> getCamposComListaDinamica();

    public List<ItfEstruturaCampoEntidade> getCamposComValidadorLogico();

    public boolean isTemCampoListaDinamica();

    public boolean isTemCampoValorLogico();

    public boolean isTemCampoValidadoresLogicos();

    public List<ItfEstruturaCampoEntidade> getCamposComValorLogico();

    public List<ItfLigacaoMuitosParaMuitos> getMuitosParaMuitos();

    List<ItfLigacaoMuitosParaUm> getMuitosParaUm();

    public FabTipoEntidadeGenerico getTipoEntidade();

    public List<ItfLigacaoUmParaMuitos> getUmParaMuitos();

    void setCalculos(List<ItfEstruturaCampoDinamicoEntidade> calculos);

    void setCampos(List<ItfEstruturaCampoEntidade> campos);

    void setDescricao(String descricao);

    void setIcone(String icone);

    void setListaEnum(List<String> listaEnum);

    void setListas(List<ItfListaDeEntidade> listas);

    void setMuitosParaMuitos(List<ItfLigacaoMuitosParaMuitos> muitosParaMuitos);

    void setMuitosParaUm(List<ItfLigacaoMuitosParaUm> muitosParaUm);

    void setNomeEntidade(String nomeEntidade);

    void setPlural(String plural);

    void setTags(List<String> tags);

    void setTipoEntidade(FabTipoEntidadeGenerico tipoEntidade);

    void setUmParaMuitos(List<ItfLigacaoUmParaMuitos> umParaMuitos);

    public String getModuloERP();

    public boolean isUmaEntidadeModuloERP();

}
