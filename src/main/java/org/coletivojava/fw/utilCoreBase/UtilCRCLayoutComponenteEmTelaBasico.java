/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.utilCoreBase;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfGrupoCampos;

/**
 *
 * @author desenvolvedor
 */
public class UtilCRCLayoutComponenteEmTelaBasico {

    public static final double VALOR_UNIDADE_COLUNA_PORCENTAGEM = 100 / 12;
    public static final String NOME_COLUNA_BOTOES = "colunaBotoes";

    public static String gerarIDLayout(ItfGrupoCampos pGrupoCampo) {
        // Class objeto = getClassePorCampos(pGrupoCampo.getCampos());

        //   String idLayot = objeto.getSimpleName() + "." + pGrupoCampo.getNomeIdentificadorSlug();
        return String.valueOf(pGrupoCampo.getId());
    }

    public static int getPrioridadePadraoPorTipoCampo(FabTipoAtributoObjeto pTipoATributo) {
        switch (pTipoATributo) {
            case NOME:
            case IMG_PEQUENA:
            case NOME_LONGO:
            case DESCRITIVO:
                return 0;
            case IMG_MEDIA:
            case ID:
            case CHART_VALOR:
            case DATA:
                return 1;
            case LC_LOGRADOURO:
            case CALENDARIO:
            case SITE:
            case VERDADEIRO_FALSO:
            case NOME_COMPLETO:
            case EMAIL:
            case ENUM_FABRICA:
            case CNPJ:
                return 2;
            case OBJETO_DE_UMA_LISTA:

            case SENHA:
            case TELEFONE_CELULAR:
            case MOEDA_REAL:
            case QUANTIDADE:
            case TELEFONE_FIXO_INTERNACIONAL:
            case INSCRICAO_ESTADUAL:
            case TELEFONE_FIXO_NACIONAL:
            case HTML_TEMPLATE:
            case PERCENTUAL:
            case LISTA_OBJETOS_PUBLICOS:

            case LISTA_OBJETOS_PARTICULARES:

            case INSCRIACAO_MUNICIPAL:
            case MOEDA_DOLAR:
            case HTML:
            case TELEFONE_GENERICO:
            case COR:
            case TEXTO_SIMPLES:
            case CHART_LABEL:
            case CHART_CATEGORIA:
            case DATAHORA:
            case HORA:
            case URL:
            case CPF:

            case CODIGO_DE_BARRAS:

            case ICONE:

                return 3;
            case SENHA_SEGURANCA_MAXIMA:
            case IMG_GRANDE:
            case LATITUDE:
            case LONGITUDE:
            case RESPONSAVEL:
            case LC_BAIRRO:

            case LC_LOCALIDADE:
            case LC_CIDADE:
            case LCCEP:
            case LC_COMPLEMENTO_E_NUMERO:
            case TIPO_PADRAO_POR_DECLARACAO:
            case LC_CAMPO_ABERTO:
            case LC_UNIDADE_FEDERATIVA:
            case REG_DATAALTERACAO:
            case REG_DATAINSERCAO:
            case REG_USUARIO_INSERCAO:
            case REG_ATIVO_INATIVO:
            case REG_USUARIO_ALTERACAO:
                return 4;

            case SEGURANCA_ATIVA:

            case ARQUIVO_DE_ENTIDADE:

            case LC_LOCALIZACAO:

            case CAMPO_SEPARADOR:

            case GRUPO_CAMPO:

            case GRUPOS_DE_CAMPO:

            case FORMULARIO_DE_ACAO:
                return 5;

            default:
                throw new AssertionError(pTipoATributo.name());

        }
    }
}
