/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado;

/**
 *
 * @author desenvolvedor
 */
public interface ItfCampoInstArquivoEntidade {

    /**
     *
     *
     *
     * @param pNomeArquivo
     * @param pStream
     * @return
     */
    public boolean uploadArquivo(String pNomeArquivo, byte[] pStream);

    public String getLinkBaixarArquivo();

    public String getLinkAbrirArquivo();

    public void prepararArquivo();

    public boolean isUsuarioLogadoTemPermissaoBaixarArquivo();

    public boolean isUsuarioLogadoTemPermissaoExcluirArquivo();

    public boolean isUsuarioLogadoTemPermissaoCriarArquivo();

    public boolean isPrecisaPermissao();

    public boolean isUsuarioLogadoTemAlterarArquivo();

    /**
     *
     * Verifica se o Arquivo existe e Retorna true ou falso
     *
     * @param pCampo
     * @return
     */
    public boolean isExisteArquivo();

    public String getCaminhoArquivoLocal();

    public ItfCampoInstanciado getCampoInstanciado();

    public void excluirArquivo();

    public byte[] getIntputTemporario();

}
