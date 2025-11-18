/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.analiseDados;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ComoMapaSubstituicao {

    void adicionarImagem(String palavraChave, String valor);

    void adicionarPalavraChave(String palavra, String valor);

    void adicionarPalavrasChaveDoObjeto(ComoEntidadeSimples pObjeto);

    void adicionarPalavrasChaveDoObjeto(String prefixo, ComoEntidadeSimples pObjeto);

    /**
     *
     * @return Lista de Palavra chave dispon
     */
    List<String> getpalavrasChave();

    String substituirEmString(String pString);

}
