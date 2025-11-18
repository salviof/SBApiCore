/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.fabrica;

import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoController;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoGestaoEntidade;

import com.super_bits.modulosSB.SBCore.modulos.Controller.fabricas.FabTipoAcaoBase;

import java.lang.reflect.Field;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

/**
 *
 * Interface para implementar fabricas de Modulos
 *
 * @author <a href="mailto:salviof@gmail.com">Salvio Furbino</a>
 * @since 16/12/2015
 * @version 1.0
 */
public interface ComoFabricaAcoes extends ComoFabrica {

    /**
     *
     * Retorna o mesmo que o getRegistro
     *
     * @return Uma ação do sistema
     */
    @Override
    public ComoAcaoDoSistema getRegistro();

    /**
     *
     * Retorna a Claase de entidade que a ação está vinculada,Depreciado, pois
     * será substituido por Anotacoes @InfoAcao
     *
     *
     *
     * @return A Classe referente a Entidade principal do Domínio
     */
    @Deprecated
    public default Class getEntidadeDominio() {
        try {
            Field campo = this.getClass().getField(this.toString());
            FabTipoAcaoBase tipoBase = getTipoBasico();
            switch (tipoBase) {
                case FORMULARIO:
                    InfoTipoAcaoFormulario infoForm = campo.getAnnotation(InfoTipoAcaoFormulario.class);
                    if (infoForm != null) {
                        if (infoForm.entidade() != void.class) {
                            return infoForm.entidade();
                        }
                    }
                    Class classeEntidadeGestao = getFabricaGestao().getEntidadeDominio();
                    if (classeEntidadeGestao != void.class) {
                        return classeEntidadeGestao;
                    }
                    break;
                case GESTAO:
                    InfoTipoAcaoGestaoEntidade infoGestao = campo.getAnnotation(InfoTipoAcaoGestaoEntidade.class);
                    if (infoGestao != null) {
                        Class claaseEtdDaGestao = infoGestao.entidade();
                        if (claaseEtdDaGestao != void.class) {
                            return claaseEtdDaGestao;
                        }
                    } else {
                        throw new UnsupportedOperationException("A anotação " + InfoTipoAcaoGestaoEntidade.class.getSimpleName() + "não fpo encontrada em " + getNomeUnico());
                    }
                    break;
                case CONTROLLER:
                    InfoTipoAcaoController infoCtr = campo.getAnnotation(InfoTipoAcaoController.class);
                    if (infoCtr != null) {
                        if (infoCtr.entidade() != void.class) {
                            return infoCtr.entidade();
                        }

                    }
                    Class classeGestao = getFabricaGestao().getEntidadeDominio();
                    if (classeGestao != void.class) {
                        return classeGestao;
                    }
                    break;
                default:
                    throw new AssertionError(tipoBase.name());

            }
            throw new UnsupportedOperationException("Não foi possível obter a entidade relacionada a fabrica" + getNomeUnico());
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro obtendo entidade de dominio por metodo padrão para " + getNomeUnico(), t);
            return null;
        }

    }

    public default ComoFabricaAcoes getFabricaGestao() {
        try {
            if (getTipoBasico() == FabTipoAcaoBase.GESTAO) {
                return this;
            }
            Field campo = this.getClass().getField(this.toString());
            Class claaseFabrica = this.getClass();
            Enum fabrica = (Enum) campo.get(this);
            int idFabrica = fabrica.ordinal();
            ComoFabricaAcoes ultimoEncontrado = null;
            for (Object obj : claaseFabrica.getEnumConstants()) {
                if (obj.toString().contains("_MB")) {
                    ultimoEncontrado = (ComoFabricaAcoes) obj;
                }
                Enum enumFabrica = (Enum) obj;
                if (enumFabrica.ordinal() >= idFabrica) {

                    return ultimoEncontrado;
                }
            }
            throw new UnsupportedOperationException("Nenhuma ação de gestão foi encontrada acima de " + getNomeUnico());
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro tentando Localizar gestão para ação" + getNomeUnico(), t);
            return null;
        }

    }

    /**
     *
     * @return FabExemplo.DOMINIO_EXEMPLO_FRM_VISUALIZAR
     */
    public default String getNomeUnico() {
        Enum fab = (Enum) this;
        return this.getClass().getSimpleName() + "." + fab.name();
    }

    /**
     *
     * @return Nome do módulo vinculado a ação
     */
    @Deprecated
    public String getNomeModulo();

    public default FabTipoAcaoBase getTipoBasico() {

        if (this.toString().contains("_FRM_")) {
            return FabTipoAcaoBase.FORMULARIO;
        }
        if (this.toString().contains("_MB")) {
            return FabTipoAcaoBase.GESTAO;
        }
        if (this.toString().contains("_CTR_")) {
            return FabTipoAcaoBase.CONTROLLER;
        }
        return null;
    }

}
