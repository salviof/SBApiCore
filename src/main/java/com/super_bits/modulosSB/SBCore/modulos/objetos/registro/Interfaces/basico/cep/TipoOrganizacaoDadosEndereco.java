/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;

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

            if (campoRaiz.getValor() instanceof ItfLocal) {
                return LOCALIZACAO_POSTAVEL;
            }
            if (pCampoInstanciado.getTipoCampoSTR().equals(FabTipoAtributoObjeto.LC_UNIDADE_FEDERATIVA.toString())) {
                if (pCampoInstanciado.getObjetoDoAtributo() instanceof ItfCidade) {
                    return LOCALIZACAO_POSTAVEL;
                }
            }

            if (pCampoInstanciado.getTipoCampoSTR().equals(FabTipoAtributoObjeto.LC_CIDADE.toString())) {
                if (pCampoInstanciado.getObjetoDoAtributo() instanceof ItfBairro) {
                    return LOCALIZACAO_POSTAVEL;
                }
            }

            if (pCampoInstanciado.getObjetoDoAtributo() instanceof ItfLocal) {
                return LOCALIZACAO_POSTAVEL;
            }

        } else {
            if (pCampoInstanciado.getValor() instanceof ItfLocalPostagem) {
                return LOCALIZACAO_POSTAVEL;
            }

            return DINAMICO;
        }
        return DINAMICO;
    }

    public ItfCampoInstanciado getCampoInstanciadoPorTipo(ItfBeanSimples pEntidadePai, FabTipoAtributoObjeto pTipoAtributo, String pNomeCampoLocalizacaoOuEntidadeDinamica) {
        try {
            switch (this) {
                case LOCALIZACAO_POSTAVEL:
                    ItfBeanSimples entidade = pEntidadePai;
                    String nomeCampoLocalizacao = pNomeCampoLocalizacaoOuEntidadeDinamica;
                    ItfCampoInstanciado campoInstanciado = pEntidadePai.getCampoInstanciadoByNomeOuAnotacao(pNomeCampoLocalizacaoOuEntidadeDinamica);
                    ItfLocalPostagem localizacao = null;
                    if (campoInstanciado.getValor() instanceof ItfLocalPostagem) {
                        localizacao = (ItfLocalPostagem) campoInstanciado.getValor();
                    } else {
                        if (campoInstanciado.getValor() instanceof ItfBeanSimples) {
                            ItfBeanSimples objPai = (ItfBeanSimples) campoInstanciado.getValor();
                            if (objPai.isTemCampoAnotado(FabTipoAtributoObjeto.LC_LOCALIZACAO)) {
                                localizacao = (ItfLocalPostagem) objPai.getCampoInstanciadoByAnotacao(FabTipoAtributoObjeto.LC_LOCALIZACAO).getValor();
                            }
                            switch (pTipoAtributo) {

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
                        case Longitude:
                        case LC_BAIRRO:
                        case LC_COMPLEMENTO_E_NUMERO:

                        case LC_CAMPO_ABERTO:
                        case LC_LOGRADOURO:
                            ItfCampoInstanciado campoDireto = localizacao.getCampoInstanciadoByAnotacao(pTipoAtributo);
                            return campoDireto;
                        case LC_LOCALIZACAO:
                            ItfCampoInstanciado cLocalizacao = pEntidadePai.getCampoInstanciadoByNomeOuAnotacao(pNomeCampoLocalizacaoOuEntidadeDinamica);
                            if (campoInstanciado.getValor() instanceof ItfLocalPostagem) {
                                return cLocalizacao;
                            } else {
                                if (campoInstanciado.getValor() instanceof ItfBeanSimples) {
                                    ItfBeanSimples objPai = (ItfBeanSimples) campoInstanciado.getValor();
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
                    ItfLocalPostagem localizacaoSimples = (ItfLocalPostagem) pEntidadePai.getCampoInstanciadoByNomeOuAnotacao(pNomeCampoLocalizacaoOuEntidadeDinamica);
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
                    ItfLocalPostagem ls = (ItfLocalPostagem) pEntidadePai.getCampoInstanciadoByNomeOuAnotacao(pNomeCampoLocalizacaoOuEntidadeDinamica);
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

    public ItfBeanSimples getBeanDeArmazenamento(ItfCampoInstanciado pCampoInstanciado) {
        ItfBeanSimples beanArmazenamentoAssitente = null;
        try {
            TipoOrganizacaoDadosEndereco tipoOrganizacao = TipoOrganizacaoDadosEndereco.getTipoOrganizacaoByCampoInstanciado(pCampoInstanciado);

            switch (tipoOrganizacao) {
                case LOCALIZACAO_POSTAVEL:
                    if (pCampoInstanciado.getCampoInstanciadoRaiz() == null) {
                        return (ItfBeanSimples) pCampoInstanciado.getValor();
                    } else {
                        beanArmazenamentoAssitente = (ItfBeanSimples) pCampoInstanciado.getCampoInstanciadoRaiz().getValor();
                    }

                    break;

                case LOCALIZACAO_SIMPLES:
                    beanArmazenamentoAssitente = (ItfBeanSimples) pCampoInstanciado.getCampoInstanciadoRaiz().getValor();
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

    public ItfBeanSimples getBeanPai(ItfCampoInstanciado pCampoInstanciado) {
        if (pCampoInstanciado.getCampoInstanciadoRaiz() != null) {
            return (ItfBeanSimples) pCampoInstanciado.getCampoInstanciadoRaiz().getObjetoDoAtributo();
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
                    if (pCampoInstanciado.getValor() instanceof ItfLocal) {
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
