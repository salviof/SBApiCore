/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.InfoGrupoCampo;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetos.log.LogPadraoSB;

/**
 *
 * @author desenvolvedor
 */
public enum FabTipoAnotacaoCampo implements ItfFabrica {

    INFOCAMPO,
    INFOCAMPO_MODELO,
    NAO_NULO,
    PASSADO,
    FUTURO,
    MAXIMO,
    MINIMO,
    TAMANHO,
    DIGITOS,
    REGEX,
    VERDADERO,
    MUITOS_PARA_UM,
    MUITOS_PARA_MUITOS,
    UM_PARA_MUITOS,
    GRUPO_CAMPOS,
    VERDADEIRO_FALSO,
    INFO_CAMPO_LOCALIZACAO,
    COLUMN,
    INFO_CAMPO_VALIDADOR_LOGICO,
    INFO_CAMPO_VALOR_LOGICO,
    INFO_CAMPO_LISTA_DINAMICA;
    private static final Map<Class, FabTipoAnotacaoCampo> mapaTipoPorClasse = new HashMap<>();

    @Override
    public Class getRegistro() {

        switch (this) {
            case INFOCAMPO:
                return InfoCampo.class;
            case NAO_NULO:
                return NotNull.class;
            case PASSADO:
                return Past.class;
            case FUTURO:
                return Future.class;
            case MAXIMO:
                return Max.class;
            case MINIMO:
                return Min.class;
            case TAMANHO:
                return Size.class;
            case DIGITOS:
                return Digits.class;
            case REGEX:
                return Pattern.class;
            case VERDADERO:
                return AssertTrue.class;
            case MUITOS_PARA_UM:
                return ManyToOne.class;
            case UM_PARA_MUITOS:
                return OneToMany.class;
            case MUITOS_PARA_MUITOS:
                return ManyToMany.class;
            case GRUPO_CAMPOS:
                return InfoGrupoCampo.class;
            case INFOCAMPO_MODELO:
                return InfoCampoModeloDocumento.class;
            case VERDADEIRO_FALSO:
                return InfoCampoVerdadeiroOuFalso.class;
            case COLUMN:
                return Column.class;
            case INFO_CAMPO_LOCALIZACAO:
                return InfoCampoLocalizacao.class;
            case INFO_CAMPO_VALIDADOR_LOGICO:
                return InfoCampoValidadorLogico.class;
            case INFO_CAMPO_VALOR_LOGICO:
                return InfoCampoValorLogico.class;
            case INFO_CAMPO_LISTA_DINAMICA:
                return InfoCampoListaDinamica.class;

            default:
                throw new AssertionError(this.name());

        }

    }

    /**
     *
     * _>Evita problema de anotação instanciada como proxy
     *
     * @param pAnotacaoInstanciada
     * @return
     */
    public static FabTipoAnotacaoCampo getTipoByAnotacaoInstanciada(Object pAnotacaoInstanciada) {
        if (pAnotacaoInstanciada instanceof InfoCampo) {
            return INFOCAMPO;
        }
        if (pAnotacaoInstanciada instanceof NotNull) {
            return NAO_NULO;
        }
        if (pAnotacaoInstanciada instanceof Past) {
            return PASSADO;
        }
        if (pAnotacaoInstanciada instanceof Future) {
            return FUTURO;
        }
        if (pAnotacaoInstanciada instanceof Max) {
            return MAXIMO;
        }
        if (pAnotacaoInstanciada instanceof Min) {
            return MINIMO;
        }
        if (pAnotacaoInstanciada instanceof Size) {
            return TAMANHO;
        }
        if (pAnotacaoInstanciada instanceof Digits) {
            return DIGITOS;
        }
        if (pAnotacaoInstanciada instanceof Pattern) {
            return REGEX;
        }
        if (pAnotacaoInstanciada instanceof AssertTrue) {
            return VERDADERO;
        }
        if (pAnotacaoInstanciada instanceof ManyToMany) {
            return MUITOS_PARA_MUITOS;
        }

        if (pAnotacaoInstanciada instanceof ManyToOne) {
            return MUITOS_PARA_UM;
        }
        if (pAnotacaoInstanciada instanceof OneToMany) {
            return UM_PARA_MUITOS;
        }

        //   if (pAnotacaoInstanciada.toString().contains("@Calculo")) {
        //       return VALOR_CALCULADO;
        //    }
        //   if (pAnotacaoInstanciada.toString().contains("@Lista")) {
        //    }
        if (pAnotacaoInstanciada instanceof InfoGrupoCampo) {
            return GRUPO_CAMPOS;
        }

        if (pAnotacaoInstanciada instanceof InfoCampoVerdadeiroOuFalso) {
            return VERDADEIRO_FALSO;
        }

        if (pAnotacaoInstanciada instanceof InfoCampoModeloDocumento) {
            return INFOCAMPO_MODELO;
        }

        if (pAnotacaoInstanciada instanceof Column) {
            return COLUMN;
        }
        if (pAnotacaoInstanciada instanceof InfoCampoLocalizacao) {
            return INFO_CAMPO_LOCALIZACAO;
        }

        if (pAnotacaoInstanciada instanceof InfoCampoValidadorLogico) {
            return INFO_CAMPO_VALIDADOR_LOGICO;
        }
        if (pAnotacaoInstanciada instanceof InfoCampoValorLogico) {
            return INFO_CAMPO_VALOR_LOGICO;
        }
        if (pAnotacaoInstanciada instanceof InfoCampoListaDinamica) {
            return INFO_CAMPO_LISTA_DINAMICA;
        }

        // Verificar outras anotacoes
        return null;

    }

    public static FabTipoAnotacaoCampo getTipoByClasse(Class pClasse) {
        try {
            if (pClasse == null) {
                throw new UnsupportedOperationException("Enviou classe nula para reflexão");
            }
            FabTipoAnotacaoCampo tipo = mapaTipoPorClasse.get(pClasse);

            if (tipo != null) {

                for (FabTipoAnotacaoCampo fab : values()) {
                    if (pClasse.getSimpleName().equals(fab.getRegistro().getSimpleName())) {
                        mapaTipoPorClasse.put(fab.getRegistro(), fab);
                        return mapaTipoPorClasse.get(pClasse);
                    }
                }
                throw new UnsupportedOperationException("Esta classe não é conhecida como uma Classe de campos");
            } else {
                return tipo;
            }
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro obtendo tipo de anotação de atributo pela classe " + pClasse.getSimpleName(), t);
            return null;
        }

    }

}
