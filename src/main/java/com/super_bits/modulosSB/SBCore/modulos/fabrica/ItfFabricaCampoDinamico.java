/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.fabrica;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampoDinamico;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.ItfPropriedadesReflexaoCampos;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfAtributoObjetoEditavel;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfAtributoObjetoSB;
import java.lang.reflect.Field;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetos.log.LogPadraoSB;

/**
 *
 * @author desenvolvedor
 */
public interface ItfFabricaCampoDinamico extends ItfFabrica {

    public default boolean configurarDadoDinamico(ItfAtributoObjetoEditavel pDadoDinamico, ItfPropriedadesReflexaoCampos pAnotacoes) {
        try {

            Field campo = this.getClass().getDeclaredField(this.toString());
            InfoCampo pInfoCampo = campo.getAnnotation(InfoCampo.class);
            InfoCampoDinamico campoDinamico = campo.getAnnotation(InfoCampoDinamico.class);

            pInfoCampo.tipo().configuraPropriedadesBasicas(pDadoDinamico);
            return true;
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro configurando TipoDAdoDinamico", t);
            return false;
        }

    }

    public default InfoCampo getInfoCampo() {
        try {
            Field campo = this.getClass().getDeclaredField(this.toString());
            InfoCampo pInfoCampo = campo.getAnnotation(InfoCampo.class);
            return pInfoCampo;
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro obtendo Info Campo do campo dinamico" + this.toString(), t);
            return null;
        }
    }

    public default Object getAnotacao0(Class pClasse) {
        try {
            Field campo = this.getClass().getDeclaredField(this.toString());
            Object anotacaoDeclarada = campo.getAnnotation(pClasse);
            return anotacaoDeclarada;
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro obtendo Info Campo do campo dinamico" + this.toString(), t);
            return null;
        }
    }

}
