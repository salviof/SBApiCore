/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimplesSomenteLeitura;

/**
 *
 * Um tipo de campo classifica os tipo de Atributos (ou campos) conhecidos pelo
 * sistema, ou criados dinamicamente.
 *
 *
 * @author Salvio Furbino
 */
public interface ItfTipoAtributoSBSomenteLeitura extends ItfBeanSimplesSomenteLeitura {

    /**
     *
     * @return enum do Tipo de campo conhecido (em FabCampo)
     */
    public FabTipoAtributoObjeto getFabricaTipoAtributo();

    /**
     *
     * @return Retorna o Valor do Campo
     */
    public TIPO_PRIMITIVO getTipoPrimitivoDoValor();

    public TIPO_ORIGEM_VALOR_CAMPO getOrigemValor();

    /**
     *
     * @return Tipo de visualização do campo
     */
    public String getTipoVisualizacao();

    /**
     * Utilize Label Padrão, este método morrerá..
     *
     * @return Label do campo (para formulários de cadastro)
     */
    @Deprecated
    public String getLabel();

    public String getLabelPadrao();

    /**
     *
     * @return True caso não deva ser editado
     */
    public boolean isSomenteLeitura();

    /**
     *
     * @return Retorna o Label, formatado sem espaço e caracteres especiais
     */
    public String getIdComponente();

    /**
     *
     * @return DEscrição do campo (para formulários de cadastro-> usado como
     * dicas sobre o campo
     */
    public String getDescricao();

    /**
     *
     * @return MAscara do campo (Utiliza regex para criar uma mascara)
     */
    public String getMascara();

    /**
     *
     * @return Valor padrão ..
     */
    public String getValorPadrao();

    /**
     *
     * @return Verdadeiro se o campo for obrigatório e falso caso contrário
     */
    public boolean isObrigatorio();

    /**
     *
     * @return Valor maximo do campo (numero de caracteres para letras, e valor
     * para numeros)
     */
    public int getValorMaximo();

    /**
     *
     * @return Valor minino (numero de caracters para letras, e valor para
     * números)
     */
    public int getValorMinimo();

    /**
     *
     *
     *
     * @return Campo regex para validação de valores
     */
    public String getValidacaoRegex();

    /**
     *
     * Verifica se o regex é diferente de nulo ou em branco e retorna true caso
     * tenha alguma
     *
     * @return
     */
    public boolean isTemValidacaoRegex();

    /**
     *
     * Verifica se o campo minimo
     *
     * @return
     */
    public boolean isTemValidacaoMinimo();

    /**
     * Verifica se o campo maximo possui valor maior que 0 e retorna true
     *
     * @return
     */
    public boolean isTemValidacaoMaximo();

    /**
     * Verifica se a mascara é nula ou isEmpy e retorna true no caso de possuir
     * alguma mascara
     *
     * @return
     */
    public boolean isTemMascara();

    /**
     * retorna se é um numeral de acordo com o tipo primitivo
     *
     * @return
     */
    public boolean isNumeral();

    /**
     * Retorna se é moeda *
     *
     * @return
     */
    public boolean isMoeda();

    /**
     * Retorna o caracter com separador decimal *
     *
     *
     * @return
     */
    public char getSeparadorDecimal();

    /**
     * REtornar o separador de milhar exemplo 1.000 Separador->'.' *
     *
     *
     * @return
     */
    public char getSeparadorMilhar();

    /**
     *
     * Retorna a quantidade de casas decimais (após a virgula) 10,000 ->3 casas
     * *
     *
     * @return
     */
    public int getNumeroDeCasasDecimais();

    /**
     *
     * @return A mascara do campo substituindo # por 0, e '?' , 'u' e 'l' por a
     *
     */
    public String getMascaraJqueryMode();

    /**
     *
     * @return O Tipo Campo no formato String
     */
    public String getTipoCampoSTR();

    /**
     *
     *
     * @return A frase que vai aparecer caso a informação não seja validada
     */
    public String getFraseValidacao();

    /**
     *
     * @return true caso o valor digitado seja criado pelo usuário
     */
    public boolean isUmValorLivre();

    /**
     *
     * @return True caso uma lista de Opções seja enviada para escolha do
     * usuário
     */
    public boolean isUmValorComLista();

    /**
     *
     * @return true caso o usuário tenha que criar uma lista de valores a sua
     * escolha
     */
    public boolean isUmValorMultiploLivre();

    /**
     *
     * @return true caso o usuário tenha que selecionar diversos valores dentre
     * detreminadas opções
     */
    public boolean isUmValorMultiploComLista();

    /**
     *
     * @return True caso seja um campo dinamico (Que armazena tudo em formato
     * String)
     */
    public boolean isUmCampoDinamico();

    /**
     *
     * @return Caso true, atualiza o valor antes de salvar
     */
    public boolean isAtualizarValorLogicoAoPersistir();

}
