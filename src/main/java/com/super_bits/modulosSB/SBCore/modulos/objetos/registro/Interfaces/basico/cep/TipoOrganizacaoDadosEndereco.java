/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;

import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoTemEndereco;

/**
 *
 * @author desenvolvedor
 */
public enum TipoOrganizacaoDadosEndereco {

    LOCALIZACAO_POSTAVEL,
    LOCALIZACAO_SIMPLES,
    DINAMICO,
    LOCALIZACAO_SIMPLES_COM_CEP_EM_ENTIDADE,
    SEM_ENDERECO;

    public static TipoOrganizacaoDadosEndereco getTipoOrganizacaoByCampoInstanciado(ItfCampoInstanciado pCampoInstanciado) {

        ItfCampoInstanciado campoRaiz = pCampoInstanciado.getCampoInstanciadoRaiz();
        if (campoRaiz != null) {

            if (campoRaiz.getValor() instanceof ComoLocal) {
                return LOCALIZACAO_POSTAVEL;
            }
            if (pCampoInstanciado.getTipoCampoSTR().equals(FabTipoAtributoObjeto.LC_UNIDADE_FEDERATIVA.toString())) {
                if (pCampoInstanciado.getObjetoDoAtributo() instanceof ComoCidade) {
                    return LOCALIZACAO_POSTAVEL;
                }
            }

            if (pCampoInstanciado.getTipoCampoSTR().equals(FabTipoAtributoObjeto.LC_CIDADE.toString())) {
                if (pCampoInstanciado.getObjetoDoAtributo() instanceof ComoBairro) {
                    return LOCALIZACAO_POSTAVEL;
                }
            }

            if (pCampoInstanciado.getObjetoDoAtributo() instanceof ComoLocal) {
                return LOCALIZACAO_POSTAVEL;
            }

        } else {
            if (pCampoInstanciado.getValor() instanceof ComoLocalPostagem) {
                return LOCALIZACAO_POSTAVEL;
            }

            return DINAMICO;
        }
        return DINAMICO;
    }

    public ItfCampoInstanciado getCampoInstanciadoPorTipo(ComoEntidadeSimples pEntidadePai, FabTipoAtributoObjeto pTipoAtributo, String pNomeCampoLocalizacaoOuEntidadeDinamica) {
        try {
            switch (this) {
                case LOCALIZACAO_POSTAVEL:
                    ComoEntidadeSimples entidade = pEntidadePai;
                    String nomeCampoLocalizacao = pNomeCampoLocalizacaoOuEntidadeDinamica;
                    ItfCampoInstanciado campoInstanciado = pEntidadePai.getCampoInstanciadoByNomeOuAnotacao(pNomeCampoLocalizacaoOuEntidadeDinamica);
                    ComoLocalPostagem localizacao = null;
                    if (campoInstanciado.getValor() instanceof ComoLocalPostagem) {
                        localizacao = (ComoLocalPostagem) campoInstanciado.getValor();
                    } else {
                        if (campoInstanciado.getValor() instanceof ComoEntidadeSimples) {
                            ComoEntidadeSimples objPai = (ComoEntidadeSimples) campoInstanciado.getValor();
                            if (objPai.isTemCampoAnotado(FabTipoAtributoObjeto.LC_LOCALIZACAO)) {
                                localizacao = (ComoLocalPostagem) objPai.getCampoInstanciadoByAnotacao(FabTipoAtributoObjeto.LC_LOCALIZACAO).getValor();
                            }
                            switch (pTipoAtributo) {

                            }

                        }
                    }
                    if (campoInstanciado.getFabricaTipoAtributo().isCampoLocalizacao()) {
                        if (localizacao == null) {
                            ComoEntidadeSimples objPai = (ComoEntidadeSimples) campoInstanciado.getObjetoDoAtributo();
                            if (objPai instanceof ComoTemEndereco && objPai.isTemCampoAnotado(FabTipoAtributoObjeto.LC_LOCALIZACAO)) {
                                localizacao = (ComoLocalPostagem) objPai.getCampoInstanciadoByAnotacao(FabTipoAtributoObjeto.LC_LOCALIZACAO).getValor();
                                if (localizacao == null) {
                                    if (pEntidadePai instanceof ComoTemEndereco) {
                                        ((ComoTemEndereco) pEntidadePai).instanciarNovoEndereco();
                                        localizacao = (ComoLocalPostagem) objPai.getCampoInstanciadoByAnotacao(FabTipoAtributoObjeto.LC_LOCALIZACAO).getValor();
                                    }
                                }
                            }
                        }
                    }

                    if (localizacao == null) {
                        campoInstanciado.getObjetoDoAtributo();
                    }
                    if (localizacao == null) {
                        throw new UnsupportedOperationException("Campo Localização relacionado não foi encontrado");
                    }
                    switch (pTipoAtributo) {

                        case LCCEP:
                        case LATITUDE:
                        case LONGITUDE:
                        case LC_BAIRRO:
                        case LC_COMPLEMENTO_E_NUMERO:

                        case LC_CAMPO_ABERTO:
                        case LC_LOGRADOURO:
                            ItfCampoInstanciado campoDireto = localizacao.getCampoInstanciadoByAnotacao(pTipoAtributo);
                            return campoDireto;
                        case LC_LOCALIZACAO:
                            ItfCampoInstanciado cLocalizacao = pEntidadePai.getCampoInstanciadoByNomeOuAnotacao(pNomeCampoLocalizacaoOuEntidadeDinamica);
                            if (campoInstanciado.getValor() instanceof ComoLocalPostagem) {
                                return cLocalizacao;
                            } else {
                                if (campoInstanciado.getValor() instanceof ComoEntidadeSimples) {
                                    ComoEntidadeSimples objPai = (ComoEntidadeSimples) campoInstanciado.getValor();
                                    if (objPai.isTemCampoAnotado(FabTipoAtributoObjeto.LC_LOCALIZACAO)) {
                                        return objPai.getCampoInstanciadoByAnotacao(FabTipoAtributoObjeto.LC_LOCALIZACAO);
                                    }
                                }
                            }

                        case LC_UNIDADE_FEDERATIVA:

                            if (localizacao.getBairro() != null && localizacao.getBairro().getCidade() != null) {
                                return localizacao.getBairro().getCidade().getCampoInstanciadoByAnotacao(FabTipoAtributoObjeto.LC_UNIDADE_FEDERATIVA);
                            } else {
                                return null;
                            }
                        case LC_CIDADE:
                            if (localizacao.getBairro() != null) {
                                return localizacao.getBairro().getCampoInstanciadoByAnotacao(FabTipoAtributoObjeto.LC_CIDADE);
                            } else {
                                return null;
                            }
                        default:
                            return entidade.getCampoInstanciadoByNomeOuAnotacao(pTipoAtributo.toString());

                    }

                case LOCALIZACAO_SIMPLES:
                    ComoLocalPostagem localizacaoSimples = (ComoLocalPostagem) pEntidadePai.getCampoInstanciadoByNomeOuAnotacao(pNomeCampoLocalizacaoOuEntidadeDinamica);
                    if (pTipoAtributo.equals(FabTipoAtributoObjeto.LCCEP)) {
                        return null;
                    } else {
                        return localizacaoSimples.getCampoInstanciadoByNomeOuAnotacao(pTipoAtributo.name());
                    }

                case DINAMICO:
                    if (pEntidadePai.isTemCampoAnotado(pTipoAtributo)) {
                        return pEntidadePai.getCampoInstanciadoByNomeOuAnotacao(pTipoAtributo.name());
                    } else {
                        return null;
                    }

                case LOCALIZACAO_SIMPLES_COM_CEP_EM_ENTIDADE:
                    ComoLocalPostagem ls = (ComoLocalPostagem) pEntidadePai.getCampoInstanciadoByNomeOuAnotacao(pNomeCampoLocalizacaoOuEntidadeDinamica);
                    if (pTipoAtributo.equals(FabTipoAtributoObjeto.LCCEP)) {
                        return pEntidadePai.getCampoInstanciadoByNomeOuAnotacao(FabTipoAtributoObjeto.LCCEP.toString());
                    } else {
                        throw new UnsupportedOperationException("Obtenção de campos de endereco por" + LOCALIZACAO_SIMPLES_COM_CEP_EM_ENTIDADE.toString());
                    }

                case SEM_ENDERECO:

                    return null;

                default:
                    throw new AssertionError(this.name());

            }
        } catch (Throwable t) {

            LogManager.getLogger(LogPadraoSB.class).error("Erro localizando campo de localização " + this.toString(), t);
            return null;
        }
    }

    public ComoEntidadeSimples getBeanDeArmazenamento(ItfCampoInstanciado pCampoInstanciado) {
        ComoEntidadeSimples beanArmazenamentoAssitente = null;
        try {
            TipoOrganizacaoDadosEndereco tipoOrganizacao = TipoOrganizacaoDadosEndereco.getTipoOrganizacaoByCampoInstanciado(pCampoInstanciado);

            switch (tipoOrganizacao) {
                case LOCALIZACAO_POSTAVEL:
                    if (pCampoInstanciado.getCampoInstanciadoRaiz() == null) {
                        return (ComoEntidadeSimples) pCampoInstanciado.getValor();
                    } else {
                        beanArmazenamentoAssitente = (ComoEntidadeSimples) pCampoInstanciado.getCampoInstanciadoRaiz().getValor();
                    }

                    break;

                case LOCALIZACAO_SIMPLES:
                    beanArmazenamentoAssitente = (ComoEntidadeSimples) pCampoInstanciado.getCampoInstanciadoRaiz().getValor();
                    break;

                case DINAMICO:
                    beanArmazenamentoAssitente = pCampoInstanciado.getObjetoDoAtributo();
                    break;
                case SEM_ENDERECO:
                    beanArmazenamentoAssitente = null;
                    break;
                case LOCALIZACAO_SIMPLES_COM_CEP_EM_ENTIDADE:
                    break;
                default:
                    throw new AssertionError(tipoOrganizacao.name());

            }
            return beanArmazenamentoAssitente;

        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro determinando bean de armazenamento para Assistente de Endereco", t);
            return beanArmazenamentoAssitente;
        }
    }

    public ComoEntidadeSimples getBeanPai(ItfCampoInstanciado pCampoInstanciado) {
        if (pCampoInstanciado.getCampoInstanciadoRaiz() != null) {
            return (ComoEntidadeSimples) pCampoInstanciado.getCampoInstanciadoRaiz().getObjetoDoAtributo();
        } else {
            return pCampoInstanciado.getObjetoDoAtributo();
        }
    }

    public String getIdentificacaoMapaAssisteBean(ItfCampoInstanciado pCampoInstanciado) {
        switch (this) {
            case LOCALIZACAO_POSTAVEL:
            case LOCALIZACAO_SIMPLES_COM_CEP_EM_ENTIDADE:
            case LOCALIZACAO_SIMPLES:
                if (pCampoInstanciado.getCampoInstanciadoRaiz() != null) {
                    return pCampoInstanciado.getCampoInstanciadoRaiz().getNomeCamponaClasse();
                } else {
                    if (pCampoInstanciado.getValor() instanceof ComoLocal) {
                        return (String) pCampoInstanciado.getNomeCamponaClasse();
                    }
                }
            case DINAMICO:
                return pCampoInstanciado.getObjetoDoAtributo().getClass().getSimpleName();

            case SEM_ENDERECO:
                break;
            default:
                throw new AssertionError(this.name());

        }
        throw new UnsupportedOperationException("Imnpossível determinar a idetetificação do assistente de localizacao");
    }

}
