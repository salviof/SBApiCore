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
import com.super_bits.modulosSB.SBCore.modulos.erp.ApiERPColetivoJavaFW;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author desenvolvedor
 */
public abstract class UtilSBCoreReflexaoAPIERP {

    private static Map<ItfApiErpSuperBits, Class> mapaServicosErpRegistrados = new HashMap<>();

    private static final String ENDERECO_BASE_PACOTE_API = "br.org.coletivoJava.fw.api.erp";

    private static final String ENDERECO_BASE_PACOTE_IMPLEMENTACAO = "br.org.coletivoJava.fw.erp.implementacao";

    public static Class getAnotacaoApi(ItfApiErpSuperBits pApi) {
        String caminhoCompleto = getPacoteApiClasseAnotacao(pApi)
                + "."
                + getNomeClasseAnotacaoImplementacao(pApi);
        Class classeValidacao = (Class<? extends ItfValidacao>) ReflectionUtils.forName(caminhoCompleto);
        return classeValidacao;
    }

    public static String getNomeClasseAnotacaoImplementacao(ItfApiErpSuperBits pApi) {
        ApiERPColetivoJavaFW infoApi = getInformacoesApi(pApi);
        String slug = UtilSBCoreStringsMaiuculoMinusculoSimples.getPrimeiraLetraMaiusculo(infoApi.slugInicial());
        String nomeAnotacaoApi = slug + UtilSBCoreStringEnumECaixaAlta.getCamelCaseDoEnumPrimeiraLetraMaiusucula((Enum) pApi);
        return nomeAnotacaoApi;

    }

    public static String getNomeAnotacaoImplementacaoProducao(ItfApiErpSuperBits pApi) {

        String nomeAnotacaoApi = UtilSBCoreStringEnumECaixaAlta.getCamelCaseDoEnumPrimeiraLetraMaiusucula((Enum) pApi);
        return nomeAnotacaoApi;

    }

    public static String getNomeClasseAnotacaoImplementacaoPadrao(ItfApiErpSuperBits pApi) {
        ApiERPColetivoJavaFW infoApi = getInformacoesApi(pApi);
        String slug = UtilSBCoreStringsMaiuculoMinusculoSimples.getPrimeiraLetraMaiusculo(infoApi.slugInicial());
        String nomeAnotacaoApi = slug + UtilSBCoreStringEnumECaixaAlta.getCamelCaseDoEnumPrimeiraLetraMaiusucula((Enum) pApi) + "Padrao";
        return nomeAnotacaoApi;

    }

    public static String getNomeClasseAnotacaoImplementacaoTestes(ItfApiErpSuperBits pApi) {
        ApiERPColetivoJavaFW infoApi = getInformacoesApi(pApi);
        String slug = UtilSBCoreStringsMaiuculoMinusculoSimples.getPrimeiraLetraMaiusculo(infoApi.slugInicial());
        String nomeAnotacaoApi = slug + UtilSBCoreStringEnumECaixaAlta.getCamelCaseDoEnumPrimeiraLetraMaiusucula((Enum) pApi) + "Testes";
        return nomeAnotacaoApi;

    }

    public static String getPacoteImplementacaoERP(ItfApiErpSuperBits pApi) {
        ApiERPColetivoJavaFW infoApi = getInformacoesApi(pApi);
        String enderecoPacote = ENDERECO_BASE_PACOTE_IMPLEMENTACAO + "." + infoApi.nomeApi().toLowerCase();
        return enderecoPacote;
    }

    public static String getPacoteApiClasseAnotacao(ItfApiErpSuperBits pApi) {
        ApiERPColetivoJavaFW infoApi = getInformacoesApi(pApi);
        String enderecoPacote = ENDERECO_BASE_PACOTE_API + "." + infoApi.nomeApi().toLowerCase();
        return enderecoPacote;
    }

    public static ApiERPColetivoJavaFW getInformacoesApi(ItfApiErpSuperBits pApi) {
        return pApi.getClass().getAnnotation(ApiERPColetivoJavaFW.class);
    }

    public static Class getClasseImplementacaoDoContexto(ItfApiErpSuperBits pApi) {
        try {

            Class implementacaoContexto = mapaServicosErpRegistrados.get(pApi);
            if (implementacaoContexto != null) {
                return implementacaoContexto;
            }
            Class anotacaoImplementacao;

            List<Class> classesImplementacao;
            if (UtilSBCoreContextoSimples.isContextoExecucaoJunit()) {
                String anotacaoImplementacaoTestes = getPacoteApiClasseAnotacao(pApi) + "." + getNomeClasseAnotacaoImplementacaoTestes(pApi);
                anotacaoImplementacao = ReflectionUtils.forName(anotacaoImplementacaoTestes);
                List<Class> opcoes = UtilSBCoreReflexaoSimples.getClassesComEstaAnotacao(anotacaoImplementacao, ENDERECO_BASE_PACOTE_IMPLEMENTACAO);
                if (!opcoes.isEmpty()) {
                    mapaServicosErpRegistrados.put(pApi, opcoes.get(0));
                    return getClasseImplementacaoDoContexto(pApi);
                }
            }
            String anotacaoImplementacaoContexto = getPacoteApiClasseAnotacao(pApi) + "." + getNomeClasseAnotacaoImplementacao(pApi);
            anotacaoImplementacao = ReflectionUtils.forName(anotacaoImplementacaoContexto);
            classesImplementacao = UtilSBCoreReflexaoSimples.getClassesComEstaAnotacao(anotacaoImplementacao, ENDERECO_BASE_PACOTE_IMPLEMENTACAO);
            if (classesImplementacao.isEmpty()) {
                anotacaoImplementacao = ReflectionUtils.forName(getNomeClasseAnotacaoImplementacaoPadrao(pApi));
                classesImplementacao = UtilSBCoreReflexaoSimples.getClassesComEstaAnotacao(anotacaoImplementacao, ENDERECO_BASE_PACOTE_IMPLEMENTACAO);
                if (!classesImplementacao.isEmpty()) {
                    mapaServicosErpRegistrados.put(pApi, classesImplementacao.get(0));
                    return getClasseImplementacaoDoContexto(pApi);
                }

            }

            throw new UnsupportedOperationException("Implementação para " + pApi + "não foi encontrada");
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro tentando obter classe que represente" + pApi, t);
            return null;
        }

    }

    public static Object getImplementacaoDoContexto(ItfApiErpSuperBits pApi) {
        try {
            return getClasseImplementacaoDoContexto(pApi).newInstance();
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
