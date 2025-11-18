/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.erp;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfValidacao;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreReflexaoAPIERP;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreReflexaoSimples;
import org.reflections.ReflectionUtils;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimplesSomenteLeitura;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;

/**
 *
 * Deve extender os enuns das apis conhecidas
 *
 * @author desenvolvedor
 * @param <T> Iterface de Implementação
 */
public interface ItfApiErpSuperBits<T> extends ComoFabrica {

    public Class<? extends T> getInterface();

    @Override
    public default Object getRegistro() {
        return ComoFabrica.super.getRegistro();
    }

    public default Class getAnotacao() {
        try {
            if (!this.getClass().isEnum()) {
                throw new UnsupportedOperationException(
                        "Esta interface deve estar   presente em umenum, ");
            }
            Class classeApi = UtilSBCoreReflexaoAPIERP.getAnotacaoApi(this);

            if (classeApi == null) {
                throw new UnsupportedOperationException(
                        "A anotação da api " + this.toString() + " não foi encontrada");
            }
            return classeApi;
        } catch (Throwable t) { //
            LogManager.getLogger(LogPadraoSB.class).error("Erro obtendo Anotação da  api  " + this.toString(), t);
            return null;
        }

    }

    public default T getImplementacaoDoContexto() {

        return (T) UtilSBCoreReflexaoAPIERP.getImplementacaoDoContexto(this);
    }

    public default <I extends ComoEntidadeSimples> I getDTO(String pJson, Class<? extends I> pItefaceObjeto) throws ErroJsonInterpredador {

        String classeDTOStr = UtilSBCoreReflexaoAPIERP.getPacoteApiDTO(this, pItefaceObjeto) + "." + UtilSBCoreReflexaoAPIERP.getNomeDTOClassePojo(pItefaceObjeto);
        Class classeValidacao = (Class<? extends ItfValidacao>) ReflectionUtils.forName(classeDTOStr);
        if (classeValidacao == null) {
            List<Class> interfacesSuportadas = getInterfacesDeEntidade();
            StringBuilder texto = new StringBuilder();
            interfacesSuportadas.stream().map(classe -> classe.getSimpleName().concat(" ")).forEach(texto::append);
            throw new ErroJsonInterpredador(this, pItefaceObjeto, pJson, "A classe de transferencia de dados não foi encontrada, as intefaces suportadas são:" + interfacesSuportadas.toString());

        }
        Constructor consTructorDTO;
        try {
            consTructorDTO = classeValidacao.getConstructor(String.class);
            I dto = (I) consTructorDTO.newInstance(pJson);
            return dto;
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            throw new ErroJsonInterpredador(this, pItefaceObjeto, pJson, ex);
        }
    }

    public default Class<? extends T> getClasseImplementacaoPadrao() {
        String nomeAotacao = UtilSBCoreReflexaoAPIERP.getNomeClasseAnotacaoImplementacaoPadrao(this);
        String nomeCanonico = UtilSBCoreReflexaoAPIERP.getPacoteApiClasseAnotacao(this)
                + "." + nomeAotacao;
        Class classeValidacao = (Class<? extends ItfValidacao>) ReflectionUtils.forName(nomeCanonico);
        return classeValidacao;
    }

    public default T getClasseImplementacaoTestes() {
        return (T) UtilSBCoreReflexaoAPIERP.getImplementacaoDoContexto(this);
    }

    public default ItfServicoLinkDeEntidadesERP getRepositorioLinkEntidadesByID() {
        /// Retorna a estratégia padrão: Se tiver implementando em um sistema com persistencia, usa o banco, se não usa um mapeamento dos ultimos 20 ids, se quiser implentar personalizado,
        // basta substituir a implementação padrão

        String classeDTOStr = "com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.erp.repositorioLinkEntidades.RepositorioLinkEntidadesGenerico";
        Class classeRepositorio = ReflectionUtils.forName(classeDTOStr);
        ItfServicoLinkDeEntidadesERP repostitorio;

        try {
            repostitorio = (ItfServicoLinkDeEntidadesERP) classeRepositorio.newInstance();
            return repostitorio;
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ItfApiErpSuperBits.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public default List<Class> getInterfacesDeEntidade() {
        List<Class> classes = new ArrayList<>();
        Class classeIntegracao = getInterface();
        for (Method metodo : classeIntegracao.getMethods()) {

            Class retorno = metodo.getReturnType();
            System.out.println("");
            if (retorno.getSimpleName().equals("List")) {
                ParameterizedType type = (ParameterizedType) metodo.getGenericReturnType();
                Class tipoDaLista = (Class) type.getActualTypeArguments()[0];
                retorno = tipoDaLista;
            }
            //  UtilSBCoreReflexaoAtributoDeObjetoSimples.getClassePrincipalDoCampo(pCampo)
            if (UtilSBCoreReflexaoSimples.isInterfaceIgualOuExetende(retorno, ComoEntidadeSimplesSomenteLeitura.class)) {
                if (!classes.contains(retorno)) {
                    classes.add(retorno);
                }

            }
        }
        return classes;
    }

}
