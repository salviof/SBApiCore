/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.ItfMensagem;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;

/**
 *
 * @author SalvioF
 */
public interface ItfRespostaAcaoDoSistema extends ItfResposta {

    /**
     *
     * Configura um próximo formulário, para exibição, para que a ação possa ser
     * executada
     *
     * @param pFormulario Ação de formulário
     * @return A própria resposta contendo um formulário para exibição
     */
    public ItfRespostaAcaoDoSistema setProximoFormulario(ItfAcaoFormulario pFormulario);

    /**
     *
     * @return Proximo formulário para proceguir
     */
    public ItfAcaoFormulario getAcaoProximoFormulario();

    /**
     *
     * @return verdadeiro se houver proximo formulario
     */
    public boolean isTemProximoFormulario();

    /**
     *
     * @return A ação vinculada ao método
     */
    public ItfAcaoDoSistema getAcaoVinculada();

    /**
     *
     * Seta o Objeto de retorno dispara as mensagens, e retorna a prórpia
     * resposta, ideal para usar com return no método da ação, quando tudo
     * ocorre bem e você já tem o objeto resultante desta ação.1
     *
     * @param pObjetoResultante Objeto retornado junto a resposta
     * @return A própria resposta com novoo objeto resultante
     */
    @Override
    public ItfRespostaAcaoDoSistema setRetornoDisparaERetorna(Object pObjetoResultante);

    @Override
    public ItfRespostaAcaoDoSistema setRetorno(Object pObjetoResultante);

    /**
     *
     * @param pMensagem
     * @return
     */
    @Override
    public ItfRespostaAcaoDoSistema addMensagemAvisoDisparaERetorna(String pMensagem);

    /**
     *
     * @param pMensagem
     * @return
     */
    @Override
    public ItfRespostaAcaoDoSistema addMensagemDisparaERetorna(ItfMensagem pMensagem);

    /**
     *
     * Adiciona um novo erro a resposta, e dispara as mensagens adicionadas a
     * resposta para o usuário.
     *
     * Ideal para ser chamada junto com o return do método
     *
     * * Ao adicionar uma mensagem de erro o isSucesso retornará falso
     *
     * @param pMensagem Texto da mensagem de erro
     * @return a própria mensagem
     *
     */
    @Override
    public ItfRespostaAcaoDoSistema addMensagemErroDisparaERetorna(String pMensagem);

    /**
     *
     * Adiciona uma nova mensagem de Alerta, dispara para o usuário todas as
     * mensagens adicionadas, e retorna a própria resposta
     *
     * @param pMensagem Texto do novo Alerta
     * @return A própria resposta com o novo alerta
     */
    @Override
    public ItfRespostaAcaoDoSistema addMensagemAlertaDisparaERetorna(String pMensagem);

    /**
     *
     * Dispara todas as mensagens para o usuário,
     *
     * Obs: Return
     *
     * @return Retorna o Próprio objeto resposta (pra maior comodidade ao sair
     * com return disparando mensagens para o usuário)
     */
    @Override
    public ItfRespostaAcaoDoSistema dispararMensagens();

    /**
     *
     * Adiciona uma mensagem do tipo, AVISO, ALERTA, OU ERRO (voce pode
     * instanciar uma com FAbMensagens)
     *
     * Se prefirir você pode simplismente passar uma string via: addAlerta,
     * AddAviso e addErro. (sim isso é mais democrático que intercine)
     *
     *
     * @param pMensagem Mensagem adicionada a resposta
     * @return O prórprio objeto de resposta
     */
    @Override
    public ItfRespostaAcaoDoSistema addMensagem(ItfMensagem pMensagem);

    /**
     *
     * Adiciona um alerta a resposta
     *
     * @param Pmensagem Texto do alerta
     * @return A pŕopria resposta com o novo alerta
     */
    @Override
    public ItfRespostaAcaoDoSistema addAlerta(String Pmensagem);

    /**
     *
     * Adiciona um aviso a resposta
     *
     * @param Pmensagem Texto do aviso
     * @return a pŕopria resposta, como o novo aviso
     */
    @Override
    public ItfRespostaAcaoDoSistema addAviso(String Pmensagem);

    /**
     *
     * Adiciona um erro a resposta * Atenção, adicionar um erro torna o
     * isSucesso da resposta igual a falso <br/>
     *
     * é recomendável que este método seja chamado com return, afinal, se tem
     * erro não precisa continuar fazer mais nada. <br/>
     *
     * E não se esqueça: addErro é diferente de
     * AddMensagemDeErroDisparaERetorna, (este método NÃO DISPARA AS MENSAGENS)
     * <br/>
     *
     * Além disso ao adicionar uma mensgem de erro as mensagens de aviso são
     * excluídas
     *
     * @param Pmensagem Texto do erro (Neste mundo de erros para usuários
     * existem apenas regra de negocio, sem palavras técincas...)
     * @return A propria resposta com seu novo erro
     */
    @Override
    public ItfRespostaAcaoDoSistema addErro(String Pmensagem);

    public default ItfRespostaComGestaoDeEntityManager getComoRepostaGestaoEM() {
        try {
            return (ItfRespostaComGestaoDeEntityManager) this;
        } catch (Throwable t) {

            LogManager.getLogger(LogPadraoSB.class).error("A resposta não é compativel com gestão de entityManager" + getAcaoVinculada(), t);
            return null;
        }
    }

}
