/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.view.menu;

import com.super_bits.modulosSB.SBCore.modulos.view.menu.ItfMenuSB;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ItfSessaoDeMenuSB;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * ATENÇÃO A DOCUMENTAÇÃO DA CLASSE É OBRIGATÓRIA O JAVADOC DOS METODOS PUBLICOS
 * SÃO OBRIGATÓRIOS E QUANDO EXISTIR UMA INTERFACE DOCUMENTADA UMA REFERENCIA
 * DEVE SER CRIADA, A SINTAXE DE REFERENCIA É: @see_ NomeDAClasse#Metodo
 * DOCUMENTE DE FORMA OBJETIVA E EFICIENTE, NÃO ESQUEÇA QUE VOCÊ FAZ PARTE DE
 * UMA EQUIPE.
 *
 * @author <a href="mailto:salviof@gmail.com">Salvio Furbino</a>
 * @since 08/01/2016
 * @version 1.0
 *
 */
public class MenuSBFW implements ItfMenuSB, Serializable {

    private final List<ItfSessaoDeMenuSB> sessoes;

    public MenuSBFW() {
        sessoes = new ArrayList<>();
    }

    @Override
    public void addSessao(ItfSessaoDeMenuSB pSessao) {
        sessoes.add(pSessao);

    }

    @Override
    public List<ItfSessaoDeMenuSB> getSessoes() {
        return sessoes;
    }

    @Override
    public boolean isTemMenu() {

        return getSessoes().size() > 0;
    }

}
