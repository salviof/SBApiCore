/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.utilCoreBase;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoDaFabrica;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeVinculadoAEnum;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoStatus;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;

/**
 *
 * @author desenvolvedor
 */
public abstract class UtilCRCFabrica {

    public static List<ComoEntidadeSimples> listaRegistros(Class<? extends ComoFabrica> pFabrica) {
        List<ComoEntidadeSimples> lista = new ArrayList<>();

        for (Object obj : pFabrica.getEnumConstants()) {
            ComoEntidadeSimples registro = (ComoEntidadeSimples) ((ComoFabrica) obj).getRegistro();
            lista.add(registro);

        }
        return lista;

    }

    public static Class<? extends ComoEntidadeSimples> getClasseEntidadePorEnum(ComoFabrica pEnumFabrica) {
        Class classe = pEnumFabrica.getClass();
        try {
            Field campo = classe.getDeclaredField(pEnumFabrica.toString());

            InfoObjetoDaFabrica infoObjeto = campo.getAnnotation(InfoObjetoDaFabrica.class);
            if (infoObjeto == null) {
                throw new UnsupportedOperationException("Para utilizar a implementação padrão do getRegistro() é nescessário anotar o enum com  " + InfoObjetoDaFabrica.class.getSimpleName() + "verifique os atributos da fabrica" + pEnumFabrica.getClass().getSimpleName());
            }
            if (infoObjeto.classeObjeto() == void.class) {
                throw new UnsupportedOperationException("Não é possível utilizar a implementação padrão do getRegistro, sem especificar a classe vinculada a esta fabrica");
            }
            return infoObjeto.classeObjeto();
        } catch (Throwable t) {
            throw new UnsupportedOperationException("Não é possível utilizar a implementação padrão do getRegistro, sem especificar a classe vinculada a esta fabrica");
        }

    }

    public static InfoObjetoDaFabrica getDadosDoRegistro(ComoFabrica pEnumFabrica) {
        Class classe = pEnumFabrica.getClass();
        try {
            Field campo = classe.getDeclaredField(pEnumFabrica.toString());

            InfoObjetoDaFabrica infoObjeto = campo.getAnnotation(InfoObjetoDaFabrica.class);
            return infoObjeto;
        } catch (Throwable t) {
            throw new UnsupportedOperationException("Não é possível encontrar o InfoObjetoDaFabrica do item");
        }
    }

    public static ComoEntidadeSimples getRegistroPorEnum(ComoFabrica pEnumFabrica) {

        Class classe = pEnumFabrica.getClass();
        try {
            Field campo = classe.getDeclaredField(pEnumFabrica.toString());
            InfoObjetoDaFabrica infoObjeto = campo.getAnnotation(InfoObjetoDaFabrica.class);

            ComoEntidadeSimples novoObjeto = (ComoEntidadeSimples) getClasseEntidadePorEnum(pEnumFabrica).newInstance();
            if (infoObjeto.nomeObjeto().isEmpty()) {
                novoObjeto.setNome(pEnumFabrica.toString());

            } else {
                novoObjeto.setNome(infoObjeto.nomeObjeto());
            }

            if (infoObjeto.id() == 0) {
                novoObjeto.setId((long) ((Enum) pEnumFabrica).ordinal() + 1);
            } else {
                novoObjeto.setId((long) infoObjeto.id());
            }
            if (novoObjeto instanceof ComoEntidadeVinculadoAEnum) {
                ((ComoEntidadeVinculadoAEnum) novoObjeto).setEnumVinculado(pEnumFabrica);
            }

            return novoObjeto;
        } catch (Throwable T) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro criando registro a paritr de enum" + pEnumFabrica + T.getMessage(), T);
            throw new UnsupportedOperationException("Erro ao criar Um novo objeto utilizando a implementação Default do ComoFabrica ");
        }

    }

    public static ComoStatus getStatusPorEnum(ComoFabrica pEnumFabrica) {

        Class classe = pEnumFabrica.getClass();
        try {
            Field campo = classe.getDeclaredField(pEnumFabrica.toString());
            InfoObjetoDaFabrica infoObjeto = campo.getAnnotation(InfoObjetoDaFabrica.class);
            if (infoObjeto == null) {
                throw new UnsupportedOperationException("Para utilizar a implementação padrão do getRegistro() é nescessário anotar o enum com  " + InfoObjetoDaFabrica.class.getSimpleName());
            }
            if (infoObjeto.classeObjeto() == void.class) {
                throw new UnsupportedOperationException("Não é possível utilizar a implementação padrão do getRegistro, sem especificar a classe vinculada a esta fabrica");
            }

            ComoStatus novoObjeto = (ComoStatus) infoObjeto.classeObjeto().newInstance();
            if (infoObjeto.nomeObjeto().isEmpty()) {
                novoObjeto.setNome(pEnumFabrica.toString());

            } else {
                novoObjeto.setNome(infoObjeto.nomeObjeto());
            }

            if (infoObjeto.id() == 0) {
                novoObjeto.setId((long) ((Enum) pEnumFabrica).ordinal() + 1);
            } else {
                novoObjeto.setId(infoObjeto.id());
            }
            if (!(novoObjeto instanceof ComoStatus)) {
                throw new UnsupportedOperationException("A classe que representa um status não iplementa " + ComoStatus.class.getSimpleName());
            }
            if (novoObjeto instanceof ComoStatus) {
                ((ComoStatus) novoObjeto).setEnumVinculado(pEnumFabrica);
            }

            return novoObjeto;
        } catch (Throwable T) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro criando registro a paritr de enum" + pEnumFabrica + T.getMessage(), T);
            throw new UnsupportedOperationException("Erro ao criar Um novo objeto utilizando a implementação Default do ComoFabrica ");
        }

    }

}
