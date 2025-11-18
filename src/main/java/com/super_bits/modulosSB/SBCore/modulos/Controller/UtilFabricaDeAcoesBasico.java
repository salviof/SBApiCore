/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoControllerAutoExecucao;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoSecundaria;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.FabTipoAutoExecucaoAcao;
import com.super_bits.modulosSB.SBCore.modulos.Controller.fabricas.FabTipoAcaoBase;
import com.super_bits.modulosSB.SBCore.modulos.Controller.fabricas.FabTipoAcaoSistema;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabricaAcoes;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

/**
 *
 * @author desenvolvedor
 */
public class UtilFabricaDeAcoesBasico {

    public static List<ComoAcaoDoSistema> gerarAcoesListaComEstesEnuns(ComoFabricaAcoes... pAcoes) {
        List<ComoAcaoDoSistema> acoes = new ArrayList();
        try {

            for (ComoFabricaAcoes acao : pAcoes) {
                ComoAcaoDoSistema registro = acao.getRegistro();
                acoes.add(registro);

            }
            return acoes;
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro montando lista de ações a partir de fabricas", t);
            return acoes;
        }

    }

    public static ComoAcaoDoSistema[] gerarAcoesArrayComEstesEnuns(ComoFabricaAcoes... pAcoes) {
        ComoAcaoDoSistema[] acoes = new ComoAcaoDoSistema[pAcoes.length];

        try {

            for (int i = 0; i < pAcoes.length; i++) {
                acoes[i] = pAcoes[i].getRegistro();
            }

            return acoes;
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro montando lista de ações a partir de fabricas", t);
            return acoes;
        }

    }

    public static boolean validaIntegridadeAcaoDoSistema(ComoAcaoDoSistema pAcaoDoSistema) {

        try {
            if (pAcaoDoSistema == null) {
                throw new UnsupportedOperationException("Tentativa de validade ação do sistema igual a nula");
            }
            if (pAcaoDoSistema.getEnumAcaoDoSistema() == null) {
                throw new UnsupportedOperationException("O enum da ação do sistema" + pAcaoDoSistema + " não foi definido");
            }

            if (pAcaoDoSistema.isUmaAcaoDeEntidade()) {

                if (pAcaoDoSistema.getEnumAcaoDoSistema().getEntidadeDominio() == null) {
                    throw new UnsupportedOperationException("A entidade vindulada da ação " + pAcaoDoSistema.getNomeUnico() + " não foi definido");
                }

            }
            if (pAcaoDoSistema.isUmaAcaoFormulario()) {
                if (((ItfAcaoFormulario) pAcaoDoSistema).getXhtml() == null) {
                    throw new UnsupportedOperationException("O Xhtml da ação de formulario" + pAcaoDoSistema.getNomeUnico() + " está nula");
                } else if (((ItfAcaoFormulario) pAcaoDoSistema).getXhtml().length() < 3) {
                    throw new UnsupportedOperationException("O xhtml da acao  de formulario" + pAcaoDoSistema.getNomeUnico() + "está em branco");
                }

                if (pAcaoDoSistema.isTemAcaoPrincipal()) {
                    if (((ComoAcaoSecundaria) pAcaoDoSistema).getAcaoPrincipal() == null) {
                        throw new UnsupportedOperationException("A ação secundária" + pAcaoDoSistema.getNomeUnico() + " principal não foi definida em ");
                    }
                }

                if (pAcaoDoSistema.getIconeAcao() == null) {
                    throw new UnsupportedOperationException("O icone da ação " + pAcaoDoSistema.getNomeUnico() + " não foi definido tipo da ação->" + pAcaoDoSistema.getTipoAcaoGenerica());
                }

            }
            if (pAcaoDoSistema.getTipoAcaoGenerica().getAcaoBase().equals(FabTipoAcaoBase.CONTROLLER)) {
                if (pAcaoDoSistema instanceof ComoAcaoControllerAutoExecucao) {
                    ComoAcaoControllerAutoExecucao acaoAutoexec = (ComoAcaoControllerAutoExecucao) pAcaoDoSistema;
                    if (acaoAutoexec.getTipoAutoExecucao() == null || acaoAutoexec.getTipoAutoExecucao().equals(FabTipoAutoExecucaoAcao.DESATIVADO)) {
                        throw new UnsupportedOperationException("O tipo de automação para ação " + pAcaoDoSistema.getNomeUnico() + " está desativado");
                    }
                }
            }
            return true;
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro validando ação ", t);
            return false;
        }
    }

    public static List<ComoAcaoDoSistema> getAcoesPorFabricas(ComoFabricaAcoes... pFabricas) {
        List<ComoAcaoDoSistema> acoes = new ArrayList<>();

        for (ComoFabricaAcoes fab : pFabricas) {
            acoes.add(fab.getRegistro());
        }
        return acoes;
    }

    public static String getNomeDominio(ComoFabricaAcoes pAcao) {

        String nomeAcao = pAcao.toString();
        String[] partes = nomeAcao.split("_");
        String dominio = "";
        boolean encontroupalavraChave = false;
        int contatdor = 0;
        for (String parte : partes) {

            for (FabTipoAcaoSistema tipo : FabTipoAcaoSistema.values()) {
                if (tipo.getStringIdentificadora() != null) {
                    if (parte.startsWith(tipo.getStringIdentificadora())) {
                        encontroupalavraChave = true;
                        break;
                    }
                }
            }
            if (encontroupalavraChave) {
                break;
            } else if (contatdor > 0) {
                dominio += "_" + parte;
            } else {
                dominio = parte;
            }
            contatdor++;
        }
        if (!encontroupalavraChave) {
            throw new UnsupportedOperationException("Impossível determinar o tipo de ação pelo nome declarado, da ação" + pAcao.toString() + " utilize as palavras chave: FRM, MB, e CTR para especificar o tipo de ação do sistema");
        }

        return dominio;
    }

    public static String getNomeAcaoPosSlugTipoAcao(ComoFabricaAcoes pAcao) {

        String nomeAcao = pAcao.toString();
        String[] partes = nomeAcao.split("_");
        String nomePosConfig = "";
        boolean encontroupalavraChave = false;
        int contatdor = 0;
        for (String parte : partes) {

            for (FabTipoAcaoSistema tipo : FabTipoAcaoSistema.values()) {
                if (tipo.getStringIdentificadora() != null) {
                    if (parte.startsWith(tipo.getStringIdentificadora())) {
                        encontroupalavraChave = true;
                        break;
                    }
                }
            }
            if (encontroupalavraChave) {
                if (contatdor == 0) {
                    // pula palavra chave
                } else if (contatdor > 1) {
                    nomePosConfig += "_" + parte;
                } else {
                    nomePosConfig = parte;
                }
                contatdor++;
            }

        }
        if (!encontroupalavraChave) {
            throw new UnsupportedOperationException("Impossível determinar o tipo de ação pelo nome declarado, da ação" + pAcao.toString() + " utilize as palavras chave: FRM, MB, e CTR para especificar o tipo de ação do sistema");
        }
        return nomePosConfig;
    }

}
