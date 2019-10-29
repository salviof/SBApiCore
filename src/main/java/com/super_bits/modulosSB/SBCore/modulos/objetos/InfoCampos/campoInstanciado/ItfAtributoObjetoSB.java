/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampoVerdadeiroOuFalso;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfGrupoCampos;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfTipoAtributoSBSomenteLeitura;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;

import java.util.List;

/**
 *
 * Um Atributo de Objeto possui todas as propriedades nescessárias para exibição
 * de um campo, idependente do tipo
 *
 * @author Sálvio Furbino
 */
public interface ItfAtributoObjetoSB extends ItfTipoAtributoSBSomenteLeitura {

    /**
     *
     * @return A classe do Atributo declaro exemplo: String, int, em caso de
     * Lista tipada, retorna o tipo
     */
    public String getNomeClasseAtributoDeclarado();

    public void setNomeClasseAtributoDeclarado(String pObjetoEntidade);

    /**
     *
     * @return Nome da classe do objeto ao qual o atributo faz parte
     */
    public String getNomeClasseOrigemAtributo();

    public void setNomeClasseOrigemAtributo(String pObjeto);

    /**
     *
     * @return Caminho relativo para listagem de opções em caso da manytoone ou
     * manytomany,<br> exemplo um caminho listagem='filiais' em um manyToOne
     * filialPrincipal, vai buscar a pripriedade filiais no objeto para criar a
     * lista de opções
     *
     */
    public String getCaminhoListagem();

    /**
     *
     * @return Opções disponíveis para selecionar
     */
    public List<ItfBeanSimples> getListaDeOpcoes();

    /**
     *
     * @return Retorna os campos que devem ser exibidos em um subformulário ou
     * listagem de opções
     */
    public ItfGrupoCampos getGrupoSubCamposExibicao();

    /**
     *
     * @return As palavras chave disponíveis em campos de Template
     */
    public List<String> getTemplateCamposDinamicos();

    /**
     *
     * @return Texto exibido caso positivo (Tipicamente Utilizado para campos
     * Verdadeiro ou Falso) configurado através da anotação @see
     * {@link InfoCampoVerdadeiroOuFalso }
     *
     */
    public String getTextoPositivo();

    /**
     * @return Texto exibido caso negativo (Tipicamente Utilizado para campos
     * Verdadeiro ou Falso) configurado através da anotação @see
     * {@link InfoCampoVerdadeiroOuFalso }
     */
    public String getTextoNegativo();

    /**
     * @return Icone exibido caso positivo (Tipicamente Utilizado para campos
     * Verdadeiro ou Falso) configurado através da anotação @see
     * {@link InfoCampoVerdadeiroOuFalso }
     *
     */
    public String getIconePositivo();

    /**
     * @return Icone exibido caso negativo (Tipicamente Utilizado para campos
     * Verdadeiro ou Falso) configurado através da anotação @see
     * {@link InfoCampoVerdadeiroOuFalso }
     */
    public String getIconeNegativo();

    public boolean isValorCampoUnico();

    @Override
    public String getLabel();

    /**
     *
     * @return Verdadeiro se Houver Validador Lógico
     */
    public boolean isTemValidadacaoLogica();

    /**
     *
     *
     * @return Verdadeiro se Houver Valor Logico
     */
    public boolean isUmValorLogico();

    /**
     *
     * @return Verdadeiro se Houver Lista Dinamica
     */
    public boolean isUmaListaDinamica();

    public boolean isPermitirCadastroManualEndereco();

}
