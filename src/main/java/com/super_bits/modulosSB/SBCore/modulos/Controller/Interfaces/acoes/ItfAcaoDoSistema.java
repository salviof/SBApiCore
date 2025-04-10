/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoGerenciarEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.fabricas.FabTipoAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.fabricas.FabTipoAcaoSistemaGenerica;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones.ItfBeanComIcone;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;

/**
 *
 * @author sfurbino
 */
public interface ItfAcaoDoSistema extends ItfBeanSimples, ItfBeanComIcone {

    public void setNomeAcao(String pNome);

    public String getNomeAcao();

    /**
     * ícone que representa a ação, os icones do answameFonts devem ser
     * configurados com um fa espaço, o nome do icone, ex: [fa fa-iconeLegal]
     *
     * @return icone da ação
     */
    public String getIconeAcao();

    /**
     *
     * Em alguns casos as açoes devem conter cores e os valores devem ser
     * setados em RGB Hexadecimal
     *
     * @return Cor da ação
     */
    public String getCor();

    /**
     *
     * Descrição detalhada da ação
     *
     * @return uma descrição detalhada da ação
     */
    public String getDescricao();

    public void setDescricao(String pDescricao);

    /**
     *
     * Indica se para executar esta ação é nescessário o administrador do
     * sistema conceder autorização
     *
     * @return
     */
    public boolean isPrecisaPermissao();

    @Override
    public void setId(Long pId);

    /**
     *
     * ícone que representa a ação, os icones do answameFonts devem ser
     * configurados com um fa espaço, o nome do icone, ex: [fa fa-iconeLegal]
     *
     * @param pIcone
     */
    public void setIconeAcao(String pIcone);

    /**
     *
     *
     * Indica o modulo da ação (este campo só é setado diretamente em uma ação
     * quando uma ação pai é igual a nulo (caso contŕario a ação do pai é
     * retornada no get...
     *
     *
     * @param pmodulo O modulo que a ação pertence
     */
    public void setModuloAcaoSistema(ItfModuloAcaoSistema pmodulo);

    public ItfModuloAcaoSistema getModulo();

    /**
     *
     * Indica se a ação foi criada apenas com constructor ou configurada com
     * icones e nomes específicos
     *
     * @return
     */
    public boolean isConfigurado();

    /**
     *
     * @return Uma identificação única para esta ação
     */
    public String getNomeUnico();

    /**
     *
     * @return String representando o enum que gerou a ação
     */
    public String getNomeEnumOriginal();

    /**
     * Tipo de ação é um tipo de ação conhecida do sistema
     *
     * @return
     */
    public FabTipoAcaoSistema getTipoAcaoSistema();

    /**
     *
     * @return O Enum do Tipo ItfFabricaAcoes que gerou a ação
     */
    public ItfFabricaAcoes getEnumAcaoDoSistema();

    /**
     * Configura campos como icone e nome da ação, igual a outra ação enviada
     * como parametro.
     *
     * @param pAcaoDoSistema A ação que os dados como nome e icone serão
     * copiados
     */
    @Deprecated
    public void configurarPropriedadesBasicas(ItfAcaoDoSistema pAcaoDoSistema);

    /**
     *
     * Obtem o ID do descritivo Jira
     *
     * @return
     */
    public String getIdDescritivoJira();

    /**
     *
     * Configura o ID do descritivo Jira
     *
     * @param pIdJira
     */
    public void setIdDescritivoJira(String pIdJira);

    /**
     *
     * Configura se esta ação é uma ação que precisa de permissão para ser
     * executada
     *
     * @param pPermissao
     */
    public void setPrecisaPermissao(boolean pPermissao);

    /**
     *
     * Uma ação generica pode ser @see FabTipoAcaoSistemaGenerica
     *
     * @return A ação generica desta ação
     */
    public FabTipoAcaoSistemaGenerica getTipoAcaoGenerica();

    /**
     *
     * @return Boolean informando se a ação tem um formulário vinculado
     */
    public boolean isUmaAcaoFormulario();

    /**
     *
     * @return Boolean informando se esta ação possui uma ação principal
     * configurada, normalmente uma ação principal refere-se a ação de gestão de
     * dominio da ação
     */
    public boolean isTemAcaoPrincipal();

    /**
     *
     * @return Boolean, informando se é uma ação Generica conhecida do sistema
     */
    public boolean isUmaAcaoGenerica();

    /**
     *
     * @return Informa se a ação é uma ação de gestão de dominio
     */
    public boolean isUmaAcaoGestaoDominio();

    /**
     *
     * @return Informa um boolean, se a ação é uma ação do tipo sessão
     */
    public boolean isUmaAcaoSessaoMenu();

    /**
     *
     * @return
     */
    public boolean isUmaAcaoDeEntidade();

    /**
     *
     * Retorna se é uma uma ação da camada de cotnroler (que executa alguma
     * alteração no banco de dados) os enuns das ações de controleer devem
     * conter _CTR_
     *
     * @return é Uma ação controller?
     */
    public boolean isUmaAcaoController();

    /**
     * Uma ação de auto execução é uma ação programada para ser executada de
     * maneira automática de tempos em tempos, o slug da ação automatica é
     * AUTO_EXEC, e é nescessário
     *
     * @return
     */
    public default boolean isUmaAcaoControllerAutoExecucao() {
        return (this instanceof ItfAcaoControllerAutoExecucao);
    }

    /**
     *
     * O nome do dominio é referente a primeira parte do nome da ação, antes das
     * palavras de marcação, como CTR, ou frm
     *
     * @return
     */
    public String getNomeDominio();

    /**
     *
     * @return Esta ação com o Tipo ItfAcaoFormulario
     */
    public ItfAcaoFormulario getComoFormulario();

    /**
     *
     * @return
     */
    public ItfAcaoFormularioEntidade getComoFormularioEntidade();

    public default ItfAcaoEntidade getComoAcaoDeEntidade() {
        try {
            return (ItfAcaoEntidade) this;
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("A ação não parece ser tdo tipo vinculada a entidade", t);

            return null;
        }

    }

    /**
     *
     * @return Esta ação com o Tipo ItrGerenciarEntidade
     */
    public ItfAcaoGerenciarEntidade getComoGestaoEntidade();

    /**
     *
     * @return Esta ação com o tipo Controller
     */
    public ItfAcaoController getComoController();

    /**
     *
     * @return A ação como uma ação secundaria
     */
    public ItfAcaoSecundaria getComoSecundaria();

    /**
     *
     * @return A ação como controller Entidade
     */
    public ItfAcaoControllerEntidade getComoControllerEntidade();

    /**
     *
     * @return
     */
    public ItfAcaoGerenciarEntidade getAcaoDeGestaoEntidade();

    public boolean isAcaoTemModal();

}
