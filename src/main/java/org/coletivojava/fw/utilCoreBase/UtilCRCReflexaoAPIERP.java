/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.utilCoreBase;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfValidacao;
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfApiErpSuperBits;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import org.reflections.ReflectionUtils;
import com.super_bits.modulosSB.SBCore.modulos.erp.FabPacotesCRCBase;
import java.util.HashMap;
import java.util.Map;
import com.super_bits.modulosSB.SBCore.modulos.erp.InfoApiERPCarameloCode;

/**
 *
 * @author desenvolvedor
 */
public abstract class UtilCRCReflexaoAPIERP {

    private static Map<ItfApiErpSuperBits, Object> mapaServicosErpRegistrados = new HashMap<>();

    public static Class getAnotacaoApi(ItfApiErpSuperBits pApi) {
        String caminhoCompleto = getPacoteApiClasseAnotacao(pApi)
                + "."
                + getNomeClasseAnotacaoImplementacao(pApi);
        Class classeValidacao = (Class<? extends ItfValidacao>) ReflectionUtils.forName(caminhoCompleto);
        return classeValidacao;
    }

    public static String getNomeClasseAnotacaoImplementacao(ItfApiErpSuperBits pApi) {
        InfoApiERPCarameloCode infoApi = getInformacoesApi(pApi);
        String slug = UtilCRCStringsMaiuculoMinusculoSimples.getPrimeiraLetraMaiusculo(infoApi.slugInicial());
        String nomeAnotacaoApi = slug + UtilCRCStringEnumECaixaAlta.getCamelCaseDoEnumPrimeiraLetraMaiusucula((Enum) pApi);
        return nomeAnotacaoApi;
    }

    public static String getSlugTipoImplementacao(ItfApiErpSuperBits pApi) {
        InfoApiERPCarameloCode infoApi = getInformacoesApi(pApi);
        String slug = UtilCRCStringsMaiuculoMinusculoSimples.getPrimeiraLetraMaiusculo(infoApi.slugInicial());
        return slug;
    }

    public static String getSlugEntidade(Class pClasse) {
        String nome = pClasse.getSimpleName();
        if (nome.startsWith("Itf")) {
            nome = nome.substring(3, nome.length());
        }
        nome = UtilCRCStringsMaiuculoMinusculoSimples.getPrimeiraLetraMaiusculo(nome);
        return nome;
    }

    public static String getNomeAnotacaoImplementacaoProducao(ItfApiErpSuperBits pApi) {

        String nomeAnotacaoApi = UtilCRCStringEnumECaixaAlta.getCamelCaseDoEnumPrimeiraLetraMaiusucula((Enum) pApi);
        return nomeAnotacaoApi;

    }

    public static String getNomeClasseAnotacaoImplementacaoPadrao(ItfApiErpSuperBits pApi) {
        InfoApiERPCarameloCode infoApi = getInformacoesApi(pApi);
        String slug = UtilCRCStringsMaiuculoMinusculoSimples.getPrimeiraLetraMaiusculo(infoApi.slugInicial());
        String nomeAnotacaoApi = slug + UtilCRCStringEnumECaixaAlta.getCamelCaseDoEnumPrimeiraLetraMaiusucula((Enum) pApi) + "Padrao";
        return nomeAnotacaoApi;

    }

    public static String getNomeClasseAnotacaoImplementacaoTestes(ItfApiErpSuperBits pApi) {
        InfoApiERPCarameloCode infoApi = getInformacoesApi(pApi);
        String slug = UtilCRCStringsMaiuculoMinusculoSimples.getPrimeiraLetraMaiusculo(infoApi.slugInicial());
        String nomeAnotacaoApi = slug + UtilCRCStringEnumECaixaAlta.getCamelCaseDoEnumPrimeiraLetraMaiusucula((Enum) pApi) + "Testes";
        return nomeAnotacaoApi;

    }

    public static String getPacoteImplementacaoERP(ItfApiErpSuperBits pApi) {
        InfoApiERPCarameloCode infoApi = getInformacoesApi(pApi);
        // String enderecoPacote = FabPacotesCRCBase.API_ERP.getPacoteCanonico() + "." + infoApi.nomeApi().toLowerCase();

        String enderecoPacote = null;
        if (infoApi.usarEstruturaDiretorioLegada()) {
            enderecoPacote = FabPacotesCRCBase.MODULOS_ERP_IMPLEMENTACAO_LEGADO.getPacoteCanonico() + "." + infoApi.nomeApi().toLowerCase();
        } else {
            enderecoPacote = FabPacotesCRCBase.MODULOS_ERP.getPacoteCanonico() + "." + infoApi.nomeApi().toLowerCase() + ".api.dominio";
        }

        return enderecoPacote;
    }

    public static String getPacoteApiClasseAnotacao(ItfApiErpSuperBits pApi) {
        InfoApiERPCarameloCode infoApi = getInformacoesApi(pApi);
        String enderecoPacote = null;
        if (infoApi.usarEstruturaDiretorioLegada()) {
            enderecoPacote = FabPacotesCRCBase.MODULOS_ERP_API_LEGADO.getPacoteCanonico() + "." + infoApi.nomeApi().toLowerCase();
        } else {
            enderecoPacote = FabPacotesCRCBase.MODULOS_ERP.getPacoteCanonico() + "." + infoApi.nomeApi().toLowerCase() + ".api.dominio";
        }

        return enderecoPacote;
    }

    public static String getPacoteApiDTO(ItfApiErpSuperBits pApi, Class pIntefaceDeEntidade) {
        String pacoteBase = getPacoteImplementacaoERP(pApi);
        String pacoteDTO = pacoteBase + ".json_bind_" + pApi.toString().toLowerCase()
                + "." + getSlugEntidade(pIntefaceDeEntidade);
        return pacoteDTO;
    }

    public static String getNomeDTOInterface(Class pInterface) {
        String slugEntidade = getSlugEntidade(pInterface);
        StringBuilder nome = new StringBuilder();
        nome.append("Itf");
        nome.append("DTO");
        nome.append(slugEntidade);
        return nome.toString();
    }

    public static String getNomeDTOClassePojo(Class pInterface) {
        String slugEntidade = getSlugEntidade(pInterface);
        StringBuilder nome = new StringBuilder();
        nome.append("DTO");
        nome.append(slugEntidade);
        return nome.toString();
    }

    public static String getNomeDTOProcessClassePojo(Class pInterface) {
        String slugEntidade = getSlugEntidade(pInterface);
        StringBuilder nome = new StringBuilder();
        nome.append("JsonBindDTO");
        nome.append(slugEntidade);
        return nome.toString();
    }

    public static InfoApiERPCarameloCode getInformacoesApi(ItfApiErpSuperBits pApi) {
        return pApi.getClass().getAnnotation(InfoApiERPCarameloCode.class);
    }

    public static boolean isClasseImplementadaNoContexto(ItfApiErpSuperBits pApi) {
        try {

            Class anotacaoImplementacao;

            List<Class> classesImplementacao;

            String pacoteImplementacao = getPacoteImplementacaoERP(pApi);

            if (UtilCRCContextoSimples.isContextoExecucaoJunit()) {
                String anotacaoImplementacaoTestes = getPacoteApiClasseAnotacao(pApi) + "." + getNomeClasseAnotacaoImplementacaoTestes(pApi);
                anotacaoImplementacao = ReflectionUtils.forName(anotacaoImplementacaoTestes);

                List< Class> opcoes = UtilCRCReflexaoSimples.getClassesComEstaAnotacao(anotacaoImplementacao, pacoteImplementacao, false);
                if (!opcoes.isEmpty()) {
                    mapaServicosErpRegistrados.put(pApi, opcoes.get(0).newInstance());
                    return true;
                }
            }
            String anotacaoImplementacaoContexto = getPacoteApiClasseAnotacao(pApi) + "." + getNomeClasseAnotacaoImplementacao(pApi);
            anotacaoImplementacao = ReflectionUtils.forName(anotacaoImplementacaoContexto);
            if (anotacaoImplementacao == null) {
                return false;
            }
            try {

                Class classe = Class.forName(getPacoteImplementacaoERP(pApi) + "." + getNomeClasseAnotacaoImplementacao(pApi) + "impl");
                if (classe != null) {
                    mapaServicosErpRegistrados.put(pApi, classe.newInstance());
                    return true;
                }
            } catch (Throwable t) {
                System.out.println(t.getMessage());
            }
            classesImplementacao = UtilCRCReflexaoSimples.getClassesComEstaAnotacao(anotacaoImplementacao, pacoteImplementacao, false);
            if (!classesImplementacao.isEmpty()) {
                mapaServicosErpRegistrados.put(pApi, classesImplementacao.get(0).newInstance());
                return true;

            }

            return false;
        } catch (Throwable t) {
            return false;
        }

    }

    public static Class getClasseImplementacaoDoContexto(ItfApiErpSuperBits pApi) {
        try {

            Class anotacaoImplementacao;
            String pacoteImplementacao = getPacoteImplementacaoERP(pApi);
            List<Class> classesImplementacao;
            if (UtilCRCContextoSimples.isContextoExecucaoJunit()) {
                String anotacaoImplementacaoTestes = getPacoteApiClasseAnotacao(pApi) + "." + getNomeClasseAnotacaoImplementacaoTestes(pApi);
                anotacaoImplementacao = ReflectionUtils.forName(anotacaoImplementacaoTestes);
                List<Class> opcoes = UtilCRCReflexaoSimples.getClassesComEstaAnotacao(anotacaoImplementacao, pacoteImplementacao, false);
                if (!opcoes.isEmpty()) {
                    mapaServicosErpRegistrados.put(pApi, opcoes.get(0).newInstance());
                    return opcoes.get(0);
                }
            }
            String anotacaoImplementacaoContexto = getPacoteApiClasseAnotacao(pApi) + "." + getNomeClasseAnotacaoImplementacao(pApi);
            anotacaoImplementacao = ReflectionUtils.forName(anotacaoImplementacaoContexto);
            if (anotacaoImplementacao == null) {
                throw new UnsupportedOperationException("Anotação " + anotacaoImplementacaoContexto + " não encontradada no classpath");
            }
            try {

                Class classe = Class.forName(getPacoteImplementacaoERP(pApi) + "." + getNomeClasseAnotacaoImplementacao(pApi) + "impl");
                if (classe != null) {
                    mapaServicosErpRegistrados.put(pApi, classe.newInstance());
                    return classe;
                }

            } catch (ClassNotFoundException pClasseNAoEncontrada) {
                System.out.println("classe não encontrada" + pClasseNAoEncontrada.getCause());
            } catch (Throwable t) {
                System.out.println(t.getMessage());
            }
            classesImplementacao = UtilCRCReflexaoSimples.getClassesComEstaAnotacao(anotacaoImplementacao, pacoteImplementacao, false);
            if (!classesImplementacao.isEmpty()) {

                return classesImplementacao.get(0);

            }

            throw new UnsupportedOperationException("Implementação para " + pApi + "  não foi encontrada, precisa anotar com" + anotacaoImplementacao.getSimpleName()
                    + " e estar localizada no pacote " + pacoteImplementacao);
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro tentando obter classe que represente" + pApi, t);
            return null;
        }

    }

    public static Object getImplementacaoDoContexto(ItfApiErpSuperBits pApi) {
        try {
            if (mapaServicosErpRegistrados.containsKey(pApi)) {
                return mapaServicosErpRegistrados.get(pApi);
            }
            Class classeImplementacao = getClasseImplementacaoDoContexto(pApi);
            if (classeImplementacao == null) {
                return null;
            }
            Object implmentacao = classeImplementacao.newInstance();
            mapaServicosErpRegistrados.put(pApi, implmentacao);
            return mapaServicosErpRegistrados.get(pApi);
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("erro obtendo implementaçlão do contexto" + pApi, t);
            return null;
        }

    }

    public static Object getImplementacaoPadraoDoContexto(ItfApiErpSuperBits pApi) {
        try {
            return getClasseImplementacaoDoContexto(pApi).newInstance();
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("erro obtendo implementaçlão do contexto" + pApi, t);
            return null;
        }
    }

    public static Object getImplementacaoTestesDoContexto(ItfApiErpSuperBits pApi) {
        try {
            return getClasseImplementacaoDoContexto(pApi).newInstance();
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("erro obtendo implementaçlão do contexto" + pApi, t);
            return null;
        }
    }

}
