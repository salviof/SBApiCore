/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.TIPO_ORIGEM_VALOR_CAMPO;
import java.lang.reflect.Field;
import java.util.List;

/**
 *
 * @author SalvioF
 */
public interface ItfCaminhoCampo {

    /**
     *
     * Adiciona uma parte do caminho para o campo caminho.add(Parate)
     *
     * @param pParteCaminho
     */
    void addParteCaminho(String pParteCaminho);

    void defineNomeCompleto(String pCaminho, Class pClasse);

    void defineNomeCompleto(String pCaminho);

    public String getCaminhoComleto();

    /**
     *
     * @return O caminho em formato de uma string, exemplo:
     * usuario.localizacao.bairro
     */
    public String getCaminhoCompletoString();

    /**
     *
     * @return Cliente.nome, retorna Cliente
     */
    public String getCaminhoApenasClasseInicial();

    public String getCaminhoSemNomeClasse();

    public String getPrimeiroCaminhoSemNomeClasse();

    public String getNomePrimeiroAtributo();

    public Field getCampoFieldReflection();

    public int getId();

    public String getLabel();

    public String getLabelDoCampo();

    public List<String> getPartesCaminho();

    /**
     *
     *
     * @return O tipo do campo caso seja uma
     */
    public Class getTipoCampo();

    public TIPO_ORIGEM_VALOR_CAMPO getTipoRegistro();

    public List<String> getTodasListas();

    public List<String> getTodosCaminhosPossiveis();

    public List<String> getTodosCaminhosPossiveisSemUltimoParametro();

    public String getUltimoNome();

    public boolean isUmCampoListavel();

    public boolean isUmCampoSeparador();

    public boolean isUmCampoVinculado();

    public boolean isUmTipoComOutrasPropriedades();

    /**
     * Verifica se o campo é um campo com outras propriedades, podendo ser ou
     * não uma lista
     *
     * @return True quando o campo conter propriedades e for persistivel
     */
    public boolean isUmaEntidade();

    public void setCaminhoComleto(String caminhoComleto);

    public void setId(int pID);

    public boolean temUmTipoComOutrasPropriedades();

}
