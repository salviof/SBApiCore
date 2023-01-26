/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes;

import com.super_bits.modulosSB.SBCore.modulos.Controller.acoesAutomatizadas.FabTipoAutoExecucaoAcao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoRespostaComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones.FabIconeFontAwesome;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * w
 *
 *
 *
 * @author desenvolvedor
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface InfoTipoAcaoController {

    /**
     * ->Em geral O nome da ação refere-se ao Label que vai aparecer no botão da
     * ação
     *
     * @return O nome Da ação
     */
    public String nomeAcao() default "";

    /**
     *
     *
     *
     * @return Classe do Icone que será utilizado
     */
    public String icone() default "";

    /**
     *
     * @return Entidade ou Bean Vinculada a ação
     */
    public Class entidade() default void.class;

    public String descricaoRetornoDoMetodo() default "";

    /**
     *
     * @return Quando true, o usuário precisará ter permissão declarada para
     * executar
     */
    public boolean precisaPermissao() default false;

    /**
     * Quando o campoJustificativa é diferente de nulo, este valor retorna true
     * automaticamente
     *
     * @return Quando true Apresenta um campo para justificar a execução da ação
     */
    public boolean precisaJustificativa() default false;

    /**
     *
     * @return nulo
     * @deprecated Utilize xhmtlModalConfirmacaoPersonalizado
     */
    @Deprecated()
    public String xhtmlDaAcao() default "";

    /**
     *
     * @return Descrição da ação
     */
    public String descricao() default "";

    /**
     *
     * @return Código da documentação do Jira
     */
    public String codigoJira() default "";

    /**
     *
     * @return O xhtml personalizado permite personalizar um modal, exibido
     * antes da execução da ação
     */
    public String xhtmlModalConfirmacaoPersonalizado() default "";

    /**
     *
     * @return Quando true exibe um modal de confirmação antes de executar a
     * ação
     */
    public boolean exibirModalConfirmacao() default false;

    public FabIconeFontAwesome iconeFonteAnsowame() default FabIconeFontAwesome.ICONE_PERSONALIZADO;

    public String campoJustificativa() default "";

    public FabTipoComunicacao comunicacao() default FabTipoComunicacao.PERSONALIZADA;

    public String fraseComunicação() default "";

    public FabTipoRespostaComunicacao[] respostasComunicacaoPersonalizada() default {};

    public FabTipoAutoExecucaoAcao autoExecucao() default FabTipoAutoExecucaoAcao.DESATIVADO;

}
