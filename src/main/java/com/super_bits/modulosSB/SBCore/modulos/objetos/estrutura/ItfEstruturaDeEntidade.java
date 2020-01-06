/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.estrutura;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;

import java.lang.reflect.Field;
import java.util.List;

/**
 *
 * @author SalvioF
 */
public interface ItfEstruturaDeEntidade extends ItfBeanSimples {

    void adicionarCampo(Field pCampo);

    void adicionarEnum(String enums);

    void adicionarTags(String pTag);

    List<ItfEstruturaCampoDinamicoEntidade> getCalculos();

    ItfEstruturaCampoEntidade getCampoByNomeDeclarado(String pNome);

    /**
     * -> Utilize @see #adicionarCampo(Field pCampo) para adicionar um campo,
     * NAO utilize .add
     *
     * @return
     */
    List<ItfEstruturaCampoEntidade> getCampos();

    String getDescricao();

    String getIcone();

    List<String> getListaEnum();

    List<ItfListaDeEntidade> getListas();

    public List<ItfEstruturaCampoEntidade> getCamposComListaDinamica();

    public List<ItfEstruturaCampoEntidade> getCamposComValidadorLogico();

    public boolean isTemCampoListaDinamica();

    public boolean isTemCampoValorLogico();

    public boolean isTemCampoValidadoresLogicos();

    public List<ItfEstruturaCampoEntidade> getCamposComValorLogico();

    List<ItfLigacaoMuitosParaMuitos> getMuitosParaMuitos();

    List<ItfLigacaoMuitosParaUm> getMuitosParaUm();

    /**
     *
     * @return Nome da Entidade class.getSimpleName()
     */
    String getNomeEntidade();

    String getPlural();

    List<String> getTags();

    FabTipoBeanSBGenerico getTipoEntidade();

    List<ItfLigacaoUmParaMuitos> getUmParaMuitos();

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

    void setTipoEntidade(FabTipoBeanSBGenerico tipoEntidade);

    void setUmParaMuitos(List<ItfLigacaoUmParaMuitos> umParaMuitos);

}
