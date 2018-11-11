/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.utilCoreBase;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfValidacao;
import com.super_bits.modulosSB.SBCore.modulos.erp.ApiColetivoJavaFW;
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfApiErpSuperBits;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import org.reflections.ReflectionUtils;

/**
 *
 * @author desenvolvedor
 */
public abstract class UtilSBCoreReflexaoAPIERP {

    private static final String ENDERECO_BASE_PACOTE_API = "org.coletivoJava.fw.api.erp";

    private static final String ENDERECO_BASE_PACOTE_IMPLEMENTACAO = "org.coletivoJava.fw.erp.implementacao";

    public static Class getAnotacaoApi(ItfApiErpSuperBits pApi) {
        Class classeValidacao = (Class<? extends ItfValidacao>) ReflectionUtils.forName(
                getNomeClasseAnotacaoImplementacao(pApi)
                + "."
                + getNomeClasseAnotacaoImplementacao(pApi));
        return classeValidacao;
    }

    public static String getNomeClasseAnotacaoImplementacao(ItfApiErpSuperBits pApi) {

        String nomeAnotacaoApi = UtilSBCoreStringEnumECaixaAlta.getCamelCaseDoEnumPrimeiraLetraMaiusucula((Enum) pApi);
        return nomeAnotacaoApi;

    }

    public static String getNomeClasseAnotacaoImplementacaoPadrao(ItfApiErpSuperBits pApi) {

        String nomeAnotacaoApi = UtilSBCoreStringEnumECaixaAlta.getCamelCaseDoEnumPrimeiraLetraMaiusucula((Enum) pApi);
        return nomeAnotacaoApi;

    }

    public static String getNomeClasseAnotacaoImplementacaoTestes(ItfApiErpSuperBits pApi) {

        String nomeAnotacaoApi = UtilSBCoreStringEnumECaixaAlta.getCamelCaseDoEnumPrimeiraLetraMaiusucula((Enum) pApi);
        return nomeAnotacaoApi;

    }

    public static String getPacoteApiClasseAnotacao(ItfApiErpSuperBits pApi) {
        ApiColetivoJavaFW infoApi = getInformacoesApi(pApi);
        String enderecoPacote = ENDERECO_BASE_PACOTE_API + "." + infoApi.nomeApi().toLowerCase();
        return enderecoPacote;
    }

    public static ApiColetivoJavaFW getInformacoesApi(ItfApiErpSuperBits pApi) {
        return pApi.getClass().getAnnotation(ApiColetivoJavaFW.class);
    }

    public static Class getClasseImplementacaoDoContexto(ItfApiErpSuperBits pApi) {
        try {
            Class anotacaoImplementacao = null;
            List<Class> classeImplementacao;
            if (UtilSBCoreContextoSimples.isContextoExecucaoJunit()) {
                anotacaoImplementacao = ReflectionUtils.forName(getNomeClasseAnotacaoImplementacaoTestes(pApi));
                List<Class> opcoes = UtilSBCoreReflexaoSimples.getClassesComEstaAnotacao(anotacaoImplementacao, ENDERECO_BASE_PACOTE_IMPLEMENTACAO);
                return opcoes.get(0);
            } else {
                anotacaoImplementacao = ReflectionUtils.forName(getNomeClasseAnotacaoImplementacao(pApi));
                classeImplementacao = UtilSBCoreReflexaoSimples.getClassesComEstaAnotacao(anotacaoImplementacao, ENDERECO_BASE_PACOTE_IMPLEMENTACAO);
                if (classeImplementacao.isEmpty()) {
                    anotacaoImplementacao = ReflectionUtils.forName(getNomeClasseAnotacaoImplementacaoPadrao(pApi));
                    classeImplementacao = UtilSBCoreReflexaoSimples.getClassesComEstaAnotacao(anotacaoImplementacao, ENDERECO_BASE_PACOTE_IMPLEMENTACAO);
                    return classeImplementacao.get(0);
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
