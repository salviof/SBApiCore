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

    Field getCampoFieldReflection();

    int getId();

    String getLabel();

    String getLabelDoCampo();

    List<String> getPartesCaminho();

    /**
     *
     *
     * @return O tipo do campo caso seja uma
     */
    Class getTipoCampo();

    TIPO_ORIGEM_VALOR_CAMPO getTipoRegistro();

    List<String> getTodasListas();

    List<String> getTodosCaminhosPossiveis();

    List<String> getTodosCaminhosPossiveisSemUltimoParametro();

    String getUltimoNome();

    boolean isUmCampoListavel();

    boolean isUmCampoSeparador();

    boolean isUmCampoVinculado();

    boolean isUmTipoComOutrasPropriedades();

    /**
     * Verifica se o campo é um campo com outras propriedades, podendo ser ou
     * não uma lista
     *
     * @return True quando o campo conter propriedades e for persistivel
     */
    boolean isUmaEntidade();

    void setCaminhoComleto(String caminhoComleto);

    void setId(int pID);

    boolean temUmTipoComOutrasPropriedades();

}
