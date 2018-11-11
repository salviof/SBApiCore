/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfValidacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.ItfPropriedadesReflexaoCampos;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfGrupoCampos;

import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.ErroValidacao;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfComponenteVisualSB;

/**
 *
 * @author sfurbino
 */
public interface ItfCampoInstanciado extends ItfAtributoObjetoSB, ItfCampoInstanciadoBase {

    /**
     *
     * @return O nome declarado no campo na classe
     */
    public String getNomeCamponaClasse();

    /**
     * Retorna o nome do campo Raiz.NomeDocampoNaClasse
     *
     * @return
     */
    public String getNomeCompostoIdentificador();

    /**
     *
     * Leva em conta anotações da Java Bean Validation (JSR 303) e Infocampo
     *
     * @return Valida o valor do campo utilizando as anotações
     *
     */
    public boolean validarCampo();

    public boolean validarCampo(Object pValor);

    /**
     *
     * @return True se Vazio ou nulo
     */
    public boolean isVazio();

    /**
     *
     * Um campo não instanciado, refere-se a um campo que não está acessível
     * porque não foi instanciado
     *
     * exemplo: você tenta acessar o campo Avó.mae.filha e a mãe é = a null,
     * porque a avó nem teve filha do gênero feminino, em vez de receber um
     * nuloPonto Exception vc recebe um campo não instanciado.
     *
     * @return true se o valor não pôde ser alcançado
     */
    public boolean isUmCampoNaoInstanciado();

    /**
     *
     * @return O label do campo sem carcteres Especiais
     */
    public String getLabelSlug();

    /**
     *
     * Retorna o id do campo de lista ex: O campo objetoMor.subobjetos[2]
     * retornaria 2
     *
     * @return O indice da lista
     */
    public int getIndiceValorLista();

    /**
     *
     * Seta um indice específico para um campo de lista em vez e retornar a
     * lista inteira, passa retornar um único objeto representado pela lista
     *
     * caso o indice não exista, retornará um CampoNãoinstanciado
     *
     * @param pIndice O indice que deseja setar
     */
    public void setIndiceValorLista(int pIndice);

    /**
     *
     * Retorna o nome da classe + _ + nome da declaração do campo na classe
     *
     * @param pComponente
     * @return um nome único para identificar o compoenente no html
     */
    public String getNomeUnicoParaIDHtml(ItfComponenteVisualSB pComponente);

    public String getPrefixoUnicoParaIDHtml();

    /**
     *
     * @return O xhtml que representa a exibição do campo
     */
    public ItfComponenteVisualSB getComponenteVisualPadrao();

    /**
     *
     * @return Retorna o componente de exibição compacto padrão do componente
     */
    public ItfComponenteVisualSB getComponenteVisualPadraoCompacto();

    /**
     *
     * Caso seja nulo, retorna o XHTML padrão, Caso seja o XHTML de outra
     * família de compoentes retorna o xhtml avisando que eles não são
     * compatíveis
     *
     * Caso contrário, retona o XHTML do componente enviado como paramentro
     *
     *
     * @param pComponente
     * @return
     */
    public ItfComponenteVisualSB getComponenteDiferenciado(ItfComponenteVisualSB pComponente);

    public boolean isTemDescricao();

    /**
     *
     *
     *
     * > dispara exceção caso o campo não seja do tipo arquivo de Entidade
     *
     * @return Classe instanciada para manipulação de arquivo de Entidade
     */
    public ItfCampoInstArquivoEntidade getComoArquivoDeEntidade();

    public ItfCampoInstTemplate getComoTemplate();

    public ItfCampoInstSeletorItens getComoSeltorItens();

    public ItfCampoIsntanciadoSubItens getComoSubItens();

    public ItfCampoInstanciadoEnumFabricaObjeto getComoEnumFabricaObjeto();

    public ItfCampoInstSeletorItem getComoCampoSeltorItem();

    /**
     *
     * > dispara exceção caso o campo não seja do tipo localização
     *
     * @return Classe instanciada para manipulação de endereco
     */
    public ItfAssistenteDeLocalizacao getComoCampoLocalizacao();

    public ItfCampoInstSeletor getComoCampoComListaDeOpcoes();

    /**
     *
     * @return Verdadeiro se for um campo de arquivo de entidade
     */
    public boolean isUmCampoArquivoEntidade();

    /**
     *
     * @return Verdadeiro se for um campo do Framework de Localização
     */
    public boolean isUmCampoCampoLocalizacao();

    public ItfCampoInstanciado getCampoInstanciadoRaiz();

    public void setCampoInstanciadoRaiz(ItfCampoInstanciado pCampoInstanciado);

    public boolean isCampoNaoInstanciado();

    public boolean isUmValorNuloOuEmBranco();

    public ItfPropriedadesReflexaoCampos getPropriedadesRefexao();

    public String getValorTextoFormatado();

    /**
     *
     * @return Verdadeiro se for uma lista particular (Em geral um manyToOne)
     */
    public boolean isUmaListagemParticular();

    public ItfGrupoCampos getGrupoCampoExibicao();

    public default void setValorSeValido(Object pValor) throws ErroValidacao {
        if (validarCampo(pValor)) {
            if (isTemValidadacaoLogica()) {
                if (getObjetoDoAtributo().getId() == 0) {
                    getValidacaoLogica().validarModoNovo(pValor);
                } else {
                    getValidacaoLogica().validarModoEdicao(pValor);
                }

            }
        } else {
            setValor(pValor);
        }
    }

    public void preenchimentoAleatorio();

    public boolean contem(Object pParametro, int pIndice);

    public boolean contem(Object pParametro);

    public ItfValidacao getValidacaoLogica();

}
