/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.view.menu;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabricaAcoes;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ComoMenuSB;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ComoSessaoDeMenuSB;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

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
public class MenuSBFW implements ComoMenuSB, Serializable {

    private final List<ComoSessaoDeMenuSB> sessoes;

    public MenuSBFW() {
        sessoes = new ArrayList<>();
    }

    @Override
    public ComoSessaoDeMenuSB addSessao(ComoSessaoDeMenuSB pSessao) {
        if (!sessoes.contains(pSessao)) {
            sessoes.add(pSessao);
        }
        return pSessao;
    }

    @Override
    public List<ComoSessaoDeMenuSB> getSessoes() {
        return sessoes;
    }

    @Override
    public boolean isTemMenu() {

        return getSessoes().size() > 0;
    }

    @Override
    public SessaoMenuSB addSessao(ComoFabricaAcoes pAcao) {
        SessaoMenuSB cadastroTipoServico = new SessaoMenuSB(pAcao.getRegistro());
        if (!sessoes.contains(cadastroTipoServico)) {
            sessoes.add(cadastroTipoServico);
        }
        return cadastroTipoServico;
    }

}
