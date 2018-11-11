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
            if (campoRaiz.getValor() instanceof ItfLocalPostagem) {
                return LOCALIZACAO_POSTAVEL;
            }
            if (campoRaiz.getValor() instanceof ItfLocal) {
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
        switch (this) {
            case LOCALIZACAO_POSTAVEL:
                ItfBeanSimples entidade = pEntidadePai;
                String nomeCampoLocalizacao = pNomeCampoLocalizacaoOuEntidadeDinamica;
                ItfLocalPostagem localizacao = (ItfLocalPostagem) pEntidadePai.getCampoInstanciadoByNomeOuAnotacao(pNomeCampoLocalizacaoOuEntidadeDinamica).getValor();
                switch (pTipoAtributo) {

                    case LATITUDE:

                    case Longitude:

                    case LC_LOGRADOURO:

                    case LCCEP:

                    case LC_BAIRRO:

                    case LC_COMPLEMENTO_E_NUMERO:

                    case LC_CAMPO_ABERTO:

                        ItfCampoInstanciado campoDireto = localizacao.getCampoInstanciadoByNomeOuAnotacao(pTipoAtributo.toString());
                        if (campoDireto == null) {
                            return null;
                        }
                        String strCampoDireto = campoDireto.getNomeCamponaClasse();
                        ItfCampoInstanciado cpVinculado = entidade.getCampoInstanciadoByNomeOuAnotacao(nomeCampoLocalizacao + "." + strCampoDireto);
                        return cpVinculado;

                    case LC_LOCALIZACAO:
                        return pEntidadePai.getCampoInstanciadoByNomeOuAnotacao(pNomeCampoLocalizacaoOuEntidadeDinamica);
                    case LC_UNIDADE_FEDERATIVA:
                        ItfCampoInstanciado campoBairro = localizacao.getCampoInstanciadoByNomeOuAnotacao(FabTipoAtributoObjeto.LC_BAIRRO.name());
                        if (campoBairro == null) {
                            return null;
                        }
                        ItfCampoInstanciado campoCidade = localizacao.getBairro().getCampoInstanciadoByNomeOuAnotacao(FabTipoAtributoObjeto.LC_CIDADE.name());
                        if (campoCidade == null) {
                            return null;
                        }
                        ItfCampoInstanciado campoUnidadeFederativa = localizacao.getBairro().getCidade().getCampoInstanciadoByNomeOuAnotacao(FabTipoAtributoObjeto.LC_UNIDADE_FEDERATIVA.name());
                        if (campoUnidadeFederativa == null) {
                            return null;
                        }

                        String strNomeBairro = campoBairro.getNomeCamponaClasse();
                        String strNomeCidade = campoCidade.getNomeCamponaClasse();
                        String strNomeUF = campoUnidadeFederativa.getNomeCamponaClasse();

                        ItfCampoInstanciado campoUFVinculado = entidade.getCampoInstanciadoByNomeOuAnotacao(
                                nomeCampoLocalizacao + "." + strNomeBairro + "." + strNomeCidade + "." + strNomeUF);

                        return campoUFVinculado;
                    case LC_CIDADE:
                        ItfCampoInstanciado campoBairoDaCidade = localizacao.getCampoInstanciadoByAnotacao(FabTipoAtributoObjeto.LC_BAIRRO);
                        if (campoBairoDaCidade == null) {
                            throw new UnsupportedOperationException("Impossível determinar o campo Bairro atravéz da classe de  localizacao" + localizacao.getClass().getSimpleName());
                        }
                        ItfCampoInstanciado campoCt = localizacao.getBairro().getCampoInstanciadoByAnotacao(FabTipoAtributoObjeto.LC_CIDADE);

                        if (campoCt != null) {

                            ItfCampoInstanciado campoCidadeVInculado = entidade.getCampoInstanciadoByNomeOuAnotacao(
                                    nomeCampoLocalizacao + "." + campoBairoDaCidade.getNomeCamponaClasse() + "." + campoCt.getNomeCamponaClasse());
                            return campoCidadeVInculado;
                        } else {
                            throw new UnsupportedOperationException("Impossível determinar o campo Cidade atravéz da classe de  localizacao" + localizacao.getClass().getSimpleName());
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
