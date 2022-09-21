/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.ErroValidacao;
import com.super_bits.modulosSB.SBCore.modulos.view.widgetsFormulario.WidgetsFormulario;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfValidacao<T> {

    public List<WidgetsFormulario> validar(Object pValor) throws ErroValidacao;

    public ItfCampoInstanciado getCampoInstanciado();

    public default List<WidgetsFormulario> validarModoNovo(Object pValor) throws ErroValidacao {
        return validar(pValor);
    }

    public default List<WidgetsFormulario> validarModoEdicao(Object pValor) throws ErroValidacao {
        return validar(pValor);
    }

    public default T getObjetoDoAtributo() {
        return (T) getCampoInstanciado().getObjetoDoAtributo();
    }

    public default boolean isAtualizarTelaGrupoFieldSetDoCampo() {
        return false;
    }

    public default String[] atualizarTelaCampoEspecifico() {
        return new String[]{};
    }

    public default String getJavscriptPosValidacao() {
        return null;
    }

    @Deprecated
    public default boolean isApagarErroFormulario() {
        return false;
    }

}
