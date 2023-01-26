/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.fabricas;

/**
 *
 * @author desenvolvedor
 */
public enum FabTipoAcaoSistema {

    /**
     *
     * Ações do sistema são representam os botões do sistema, e operações que
     * alteram o estado dos objetos as ações do sistema podem ser extendidas
     * para outros tipos, como:
     *
     * AcaoFormulário @see # AcaoDeGestao AcaoControler Acao_selecao_de_Acao
     *
     */
    ACAO_DO_SISTEMA,
    /**
     *
     * Ações do tipo Fomulário de entidade são ações para edição, visualização e
     * listagens de campos de um determinado objeto.
     *
     * O SLUG QUE DETERMINA UMA AÇÃO DE FORMULÁRIO É O FRM  <br>
     * A anotação que identifica é a @infoTipoAcaoFormulario
     *
     * Toda ação de formulário possui um xhtml vinculado, e no caso de um
     * formulário de entidade pode conter queis os campos serão exibidos, e seu
     * agrupamento
     *
     */
    ACAO_ENTIDADE_FORMULARIO,
    /**
     *
     * As açoes de formulário são açoes que possuem um xhtml vinculado a elas
     * <br>
     * O SLUG QUE DETERMINA UMA AÇÃO DE FORMULÁRIO É O FRM  <br>
     * A anotação que identifica é a @infoTipoAcaoFormulario
     *
     *
     */
    ACAO_FORMULARIO,
    /**
     *
     * As Ações de formulario modal, são ações que possuem um formulário que
     * deve ser exibido em um modal
     *
     * O SLUG QUE DETERMINA UMA AÇÃO DE FORMULÁRIO É O FRM_MODAL  <br>
     * A anotação que identifica é a @infoTipoAcaoFormulario
     *
     */
    ACAO_ENTIDADE_FORMULARIO_MODAL,
    /**
     *
     * As Ações de entidade agrupam uma série de ações com determinado própósito
     * para manipulação de um objeto
     *
     * O SLUG QUE DETERMINA UMA AÇÃO DE GESTÃO É O MB  <br>
     * A anotação que identifica é a @infoTipoAcaoGestaoEntidade
     *
     *
     */
    ACAO_ENTIDADE_GERENCIAR,
    /**
     * Una ação de entidade controller, é uma ação que executa uma alteração
     * permanente em um objeto
     *
     * O SLUG QUE DETERMINA UMA AÇÃO DE GESTÃO É O _CTR_  <br>
     * A anotação que identifica é a @InfoTipoAcaoController
     *
     *
     */
    ACAO_ENTIDADE_CONTROLLER,
    /**
     * Uma ação controller é uma ação que executam alguma alteração permanente
     * no sistema
     *
     * O SLUG QUE DETERMINA UMA AÇÃO DE GESTÃO É O _CTR_  <br>
     * A anotação que identifica é a @InfoTipoAcaoController
     *
     */
    ACAO_CONTROLLER,
    /**
     * Uma ação de seleção é utilizada para listar uma série de ações onde uma
     * deve ser selecionada
     *
     * #TODO->Este tipo de ação ainda não foi homologado.
     */
    ACAO_SELECAO_DE_ACAO;

    /**
     *
     * Retorna a String utilizada para Identificar o tipo de ação pelo nome do
     * enum
     *
     * @return
     */
    public String getStringIdentificadora() {

        switch (this) {

            case ACAO_ENTIDADE_FORMULARIO:
            case ACAO_FORMULARIO:
                return "FRM";
            case ACAO_ENTIDADE_FORMULARIO_MODAL:
                return "FRM_MODAL";
            case ACAO_ENTIDADE_GERENCIAR:
                return "MB";
            case ACAO_ENTIDADE_CONTROLLER:
            case ACAO_CONTROLLER:
                return "CTR";
            case ACAO_SELECAO_DE_ACAO:
                return "FRM_SELETOR";
            case ACAO_DO_SISTEMA:
                return "ACAO_SB_FW";

            default:
                throw new AssertionError(this.name());

        }

    }

}
