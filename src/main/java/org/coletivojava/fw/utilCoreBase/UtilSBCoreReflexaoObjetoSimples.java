/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.utilCoreBase;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoPreparacaoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanGenerico;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimplesSomenteLeitura;
import java.lang.reflect.Method;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import org.coletivojava.fw.api.tratamentoErros.ErroPreparandoObjeto;

/**
 *
 * @author desenvolvedor
 */
public class UtilSBCoreReflexaoObjetoSimples {

    public static InfoPreparacaoObjeto getInfoPreparacaoObjeto(Class pClasse) {
        try {
            Method metodo = pClasse.getMethod("prepararNovoObjeto", Object[].class);
            InfoPreparacaoObjeto infoPreparacaoObjeto = metodo.getAnnotation(InfoPreparacaoObjeto.class);
            return infoPreparacaoObjeto;
        } catch (NoSuchMethodException | SecurityException t) {

            return null;
        }
    }

    /**
     * TODO Receber o parametro metodo, para suportar validação de preparação
     * por polimorfismo
     *
     * @param anotacaoInfoPreparacaoObjeto
     * @param parametros
     * @throws UnsupportedOperationException
     */
    public static void validarMetodoPrepararObjeto(ItfBeanSimplesSomenteLeitura pObjeto, InfoPreparacaoObjeto anotacaoInfoPreparacaoObjeto, Object... parametros) throws ErroPreparandoObjeto {

        if (parametros.length < anotacaoInfoPreparacaoObjeto.classesPrConstructorPrincipal().length) {
            throw new UnsupportedOperationException("A quantidade de parametros esperada, não confere, com a quantidade enviada" + "Enviado" + parametros.length + ", esperado " + anotacaoInfoPreparacaoObjeto.classesPrConstructorPrincipal().length);
        }
        int i = 1;
        for (Class classeObrigatoria : anotacaoInfoPreparacaoObjeto.classesPrConstructorPrincipal()) {
            //Contém para driblar proxy de classe do JPA
            boolean temImplmentacao = false;

            for (Object pr : parametros) {
                if (!temImplmentacao) {
                    temImplmentacao = UtilSBCoreReflexaoSimples.isClasseIgualOuExetende(pr.getClass(), classeObrigatoria);
                }
            }

            if (!temImplmentacao) {
                throw new ErroPreparandoObjeto(pObjeto, "O " + i
                        + "o parametro deveria ser do tipo " + classeObrigatoria.getSimpleName()
                        + " porém foi enviado um " + parametros[i - 1].getClass().getSimpleName());
            }
            i++;
        }

    }

    public static <T> T getParametroPrepararObjeto(ItfBeanSimplesSomenteLeitura objetoIniciado, Class<T> tipoObjeto, InfoPreparacaoObjeto anotacaoInfoPreparacaoObjeto, Object... parametros) throws ErroPreparandoObjeto {
        int i = 0;

        for (Object obj : parametros) {
            if (obj != null) {
                if (UtilSBCoreReflexaoSimples.isClasseIgualOuExetende(obj.getClass(), tipoObjeto)) {
                    return (T) obj;
                }
            }
        }

        throw new ErroPreparandoObjeto(objetoIniciado, "Parametro do tipo " + tipoObjeto.getSimpleName() + "não foi encontrado");
    }

    public static Object getObjeto(int indice, Object... parametros) {
        return parametros[indice].getClass().getSimpleName();
    }

    /**
     *
     * Retorna a primeira tag configurada como nome da entidade atravez da
     * anotação InfoClasse
     *
     * @param pClasse Classe analizada
     * @return Nome Humanizado da entidade
     */
    public static String getNomeDoObjetoPorAnotacaoInfoClasse(Class pClasse) {

        try {
            if (!pClasse.isAnnotationPresent(InfoObjetoSB.class)) {
                throw new UnsupportedOperationException("A classe " + pClasse + " não foi anotada com " + InfoObjetoSB.class.getSimpleName());
            }

            InfoObjetoSB info = (InfoObjetoSB) pClasse.getAnnotation(InfoObjetoSB.class);
            return info.tags()[0];
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("", t);
            return null;
        }

    }

    public static InfoObjetoSB getAnotacaoInfoObjetoDaClasse(Class pClasse) {

        try {
            if (!pClasse.isAnnotationPresent(InfoObjetoSB.class)) {
                throw new UnsupportedOperationException("A classe " + pClasse + " não foi anotada com " + InfoObjetoSB.class.getSimpleName());
            }

            InfoObjetoSB info = (InfoObjetoSB) pClasse.getAnnotation(InfoObjetoSB.class);
            return info;

        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro obtendo InfoObjeto", t);
            return null;
        }

    }

    public static String getIconeDoObjeto(Class pClasse) {

        try {
            if (!pClasse.isAnnotationPresent(InfoObjetoSB.class)) {
                throw new UnsupportedOperationException("A classe " + pClasse + " não foi anotada com " + InfoObjetoSB.class.getSimpleName());
            }

            InfoObjetoSB info = (InfoObjetoSB) pClasse.getAnnotation(InfoObjetoSB.class);
            return info.icone();
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro Obtendo icone do Objeto", t);
            return null;
        }

    }

    public static InfoObjetoSB getInfoClasseObjeto(Class pClasse) {

        try {
            if (!pClasse.isAnnotationPresent(InfoObjetoSB.class)) {
                throw new UnsupportedOperationException("A classe " + pClasse + " não foi anotada com " + InfoObjetoSB.class.getSimpleName());
            }

            InfoObjetoSB info = (InfoObjetoSB) pClasse.getAnnotation(InfoObjetoSB.class);
            return info;
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("", t);
            return null;
        }

    }

    public static String getNomeObjeto(Class<? extends ItfBeanGenerico> pClasse) {
        try {
            InfoObjetoSB info = pClasse.getAnnotation(InfoObjetoSB.class);

            return info.tags()[0];
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("O nome do objeto não foi definido para " + pClasse.getSimpleName(), t);
            return pClasse.getSimpleName();
        }
    }

    public static String getNomeObjetoPlural(Class<? extends ItfBeanGenerico> pClasse) {
        try {
            InfoObjetoSB info = pClasse.getAnnotation(InfoObjetoSB.class);

            return info.plural();
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("O plural do objeto não foi definodo para" + pClasse.getSimpleName(), t);
            return pClasse.getSimpleName();
        }
    }

}
