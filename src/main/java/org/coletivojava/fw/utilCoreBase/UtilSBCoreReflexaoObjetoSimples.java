/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.utilCoreBase;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoPreparacaoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanGenerico;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;

import java.lang.reflect.Method;
import java.util.Optional;
import javax.persistence.DiscriminatorColumn;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetos.log.LogPadraoSB;

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
        } catch (Throwable t) {
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
    public static void validarMetodoPrepararObjeto(InfoPreparacaoObjeto anotacaoInfoPreparacaoObjeto, Object... parametros) throws UnsupportedOperationException {

        if (parametros.length < anotacaoInfoPreparacaoObjeto.classesPrConstructorPrincipal().length) {
            throw new UnsupportedOperationException("A quantidade de parametros esperada, não confere, com a quantidade enviada" + "Enviado" + parametros.length + ", esperado " + anotacaoInfoPreparacaoObjeto.classesPrConstructorPrincipal().length);
        }
        int i = 1;
        for (Class classe : anotacaoInfoPreparacaoObjeto.classesPrConstructorPrincipal()) {
            //Contém para driblar proxy de classe do JPA
            if (!parametros[i - 1].getClass().getSimpleName().contains(classe.getSimpleName())) {
                throw new UnsupportedOperationException("O " + i
                        + "o parametro deveria ser do tipo " + classe.getSimpleName()
                        + " porém foi enviado um " + parametros[i - 1].getClass().getSimpleName());
            }
            i++;
        }

    }

    public static <T> T getParametroPrepararObjeto(Class<T> tipoObjeto, InfoPreparacaoObjeto anotacaoInfoPreparacaoObjeto, Object... parametros) throws UnsupportedOperationException {
        int i = 0;
        for (Class classe : anotacaoInfoPreparacaoObjeto.classesPrConstructorPrincipal()) {

            if (tipoObjeto.getSimpleName().contains(classe.getSimpleName())) {
                return (T) parametros[i];
            }
            i++;

        }
        throw new UnsupportedOperationException("Parametro do tipo " + tipoObjeto.getSimpleName() + "não foi encontrado");
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

            return info.tags()[0];
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("O plural do objeto não foi definodo para" + pClasse.getSimpleName(), t);
            return pClasse.getSimpleName();
        }
    }

}
