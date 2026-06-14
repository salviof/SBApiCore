/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.analiseDados;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ComoMapaSubstituicao {

    public void adicionarImagem(String palavraChave, String valor);

    public void adicionarPalavraChave(String palavra, String valor);

    public void adicionarListaComSubCampo(String palavra, String valor);

    public void adicionarPalavrasChaveDoObjeto(ComoEntidadeSimples pObjeto);

    public void adicionarPalavrasChaveDoObjeto(String prefixo, ComoEntidadeSimples pObjeto);

    /**
     *
     * @return Lista de Palavra chave dispon
     */
    public List<String> getpalavrasChave();

    public String substituirEmString(String pString);

}
