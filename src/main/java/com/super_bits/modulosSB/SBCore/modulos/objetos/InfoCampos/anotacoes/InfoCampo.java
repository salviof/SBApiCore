package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabModoExibicaoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.TIPO_PRIMITIVO;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface InfoCampo {

    // TIPO CAMPO
    /**
     *
     * Informa o tipo de campo, o valor padrão é texto Simples O tipo de campo
     * estabelece mascaras regex e outros valores pré definidos, porém você pode
     * modificar algum aspécto utilizando os outros atributos desta classe
     *
     * @return
     */
    public FabTipoAtributoObjeto tipo() default FabTipoAtributoObjeto.TIPO_PADRAO_POR_DECLARACAO;

    /**
     *
     * Infoma o Label (nome do campo) do campo que será exibido nos formulários
     * de cadastro, ou visualização
     *
     * @return
     */
    public String label() default "";

    /**
     *
     * Configura uma mascara utilizando os parametros do MastkFormater do java
     * ou seja :
     *
     *
     * <table border=1 summary="Cadacteres válidos e suas descrições">
     * <tr>
     * <th>Character&nbsp;</th>
     * <th><p align="left">Description</p></th>
     * </tr>
     * <tr>
     * <td>#</td>
     * <td> Qualquer número valido, Utiliza <code>Character.isDigit</code>.</td>
     * </tr>
     * <tr>
     * <td>'</td>
     * <td> Caracter de used to escape any of the special formatting
     * characters.</td>
     * </tr>
     * <tr>
     * <td>U</td><td> Qualquer Letra, utiliza:
     * (<code>Character.isLetter</code>). Todas as letras minusculas serão
     * convertidas para maiusculas
     * </td>
     * </tr>
     * <tr><td>L</td><td>Qualquer caracter, utiliza
     * (<code>Character.isLetter</code>). Todos as letras serão convertidas para
     * minusculo</td>
     * </tr>
     * <tr><td>A</td><td>Qualquer letra ou numero, utiliza:
     * (<code>Character.isLetter</code> or <code>Character.isDigit</code>)</td>
     * </tr>
     * <tr><td>?</td><td>Qualquer letra(<code>Character.isLetter</code>).</td>
     * </tr>
     * <tr><td>*</td><td>Qualquer coisa</td></tr>
     * <tr><td>H</td><td>Caracteres ExaDecimais (0-9, a-f or A-F).</td></tr>
     * </table>
     *
     *
     *
     *
     * @return
     */
    public String Mask() default "";

    /**
     *
     * Configura o valor padrão para o campo
     *
     * @return
     */
    public String valorPadrao() default "";

    /**
     *
     * O campo também será considerado obrigatório com a anotação @NotNull, a
     * diferença caso setado sem o notnull, é que o banco será criado permitindo
     * not null, porém antes de salvar atravez das funções nativas do framework
     * esta verificação será sempre realizada
     *
     * @return True se o Campo for obrigatorio, falso para dispensável
     */
    public boolean obrigatorio() default false;

    /**
     *
     * @return @deprecated - Pretenção de criar permissões por aspecto do objeto
     * (Depreciado, não é legal)
     */
    @Deprecated
    public int acesso() default 1;

    /**
     * COnfigura o valor mínimo para validação, no caso de numericos, um @Min do
     * Validate também é aceito, e sobrescreve este valor <br>
     * -> para valores de texto o minimo refere-se ao número de caracteres;
     *
     * @return
     */
    public int valorMinimo() default 0;

    /**
     * Configura o valor maximo para validação, um @Max do validate também é
     * aceito, e sobrescreve este valor assim como o length do @Collun
     *
     * * -> para valores de texto o maximo refere-se ao número de caracteres;
     *
     * @return
     */
    public int valorMaximo() default 99999;

    /**
     *
     * Depreciado, mas pode voltar.. ;)
     *
     * @return
     */
    @Deprecated
    public ValorAceito[] valoresAceitos() default {};

    /**
     *
     * Informa o tipo primitivo do campo, que pode ser Letras, Numeros, ou Datas
     * o padrão são letras
     *
     * @return
     */
    public TIPO_PRIMITIVO tipoPrimitivo() default TIPO_PRIMITIVO.LETRAS;

    /**
     *
     * @return Os locais onde o campo poderá ser editado
     */
    @Deprecated
    public FabModoExibicaoCampo[] modosExibicao() default {FabModoExibicaoCampo.TODOS_MENOS_LISTA};

    /**
     *
     * @return Uma fabrica com as opções disponíveis
     */
    public Class fabricaDeOpcoes() default void.class;

    /**
     *
     * @return O caminho do campo para obter a lista
     */
    public String caminhoParaLista() default "";

    public String descricao() default "";

    /**
     *
     * Quando True Impede a edição do campo até mesmo em formulários
     *
     * @return True somente Leitura, False pode Editar
     */
    public boolean somenteLeitura() default false;

    /**
     *
     * Para um campo de arquivo determina a categoria do arquivo
     *
     * @return
     */
    public String categoria() default "";

    public String[] camposExibidosEmLista() default {};

    public Class entidadeOpcoesDisponiveis() default void.class;

    public String nomeOrigem() default "";

}
