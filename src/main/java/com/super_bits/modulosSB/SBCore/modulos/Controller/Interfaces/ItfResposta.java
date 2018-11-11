/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces;

import com.super_bits.modulosSB.SBCore.modulos.Mensagens.ItfMensagem;
import java.util.List;

/**
 *
 *
 * O Objeto de resposta é o objeto padrão de resposta do protocolo de
 * comunicação SuperBits
 *
 * Toda ação de controller precisa retornar uma resposta.
 *
 *
 * Nele podem ser anexadas diversas mensagens do tipo: AVISO, ALERTA e Erro
 *
 * Caso uma mensagem de erro seja adicionada o sucesso da resposta retorna
 * falso..
 *
 * Além do atributo sucesso,(que só retorna falso em caso de erro) a resposta
 * também possui um resultado final que pode ser Alerta,Falhou, ou Sucesso
 *
 * As respostas podem acompanhar (Quase sempre) um retorno, que é um objeto que
 * pode ter sido gerado a partir da execução do método. Para fins de
 * organização, padronização e felicidade, quando acontece um erro é recomendado
 * que o retorno seja null
 *
 * Caso nenhuma mensagem seja adicionada e a mensagem seja disparada para o
 * usuário, a mensagem padrão é: a ação nomeDaAcaoExecutada foi executada com
 * sucesso
 *
 *
 * @author sfurbino
 */
public interface ItfResposta {

    public static enum Resultado {

        /**
         * Quando nenhum alerta ou falha acontece, é sucesso.
         */
        SUCESSO,
        /**
         * Ouve mensagens de Alerta na resposta
         */
        ALERTA,
        /**
         * Vair ficar pra próxima, a ação não foi executrada, acontece, fica
         * sussa...
         */
        FALHOU
    }

    /**
     *
     * O resultado da resposta que pode ser SUCESSO, ALERTA OU FALHA
     *
     * @return
     */
    public Resultado getResultado();

    /**
     * REtorna todas as mensagens adicionadas na resposta
     *
     * @return
     */
    public List<ItfMensagem> getMensagens();

    /**
     *
     * O tipo retorno é a classe do objeto que espera ser retornado
     *
     * Esta informação é coletada nos constructors da resposta.
     *
     * Ex.: Quando você instancia com getNovaREspostaChecaNulo, já é esperado
     * que o tipo de retorno seja do objeto que vc está checando se é nulo, mas
     * você pode alterar este parametro a qualquer momento.
     *
     * @return A Classe representante do objeto que deve ser retornado com a
     * resposta
     */
    public Class getTipoRetorno();

    /**
     *
     * Em geral o Objeto gerado pela ação, mas pode ser qualquer coisa, até
     * listas
     *
     * @return Objeto de resposta
     */
    public Object getRetorno();

    /**
     *
     * Seta o Objeto de retorno dispara as mensagens, e retorna a prórpia
     * resposta, ideal para usar com return no método da ação, quando tudo
     * ocorre bem e você já tem o objeto resultante desta ação.1
     *
     * @param pObjetoResultante Objeto retornado junto a resposta
     * @return A própria resposta com novoo objeto resultante
     */
    public ItfResposta setRetornoDisparaERetorna(Object pObjetoResultante);

    public ItfResposta setRetorno(Object pObjetoResultante);

    /**
     *
     * @param pMensagem
     * @return
     */
    public ItfResposta addMensagemAvisoDisparaERetorna(String pMensagem);

    /**
     *
     * @param pMensagem
     * @return
     */
    public ItfResposta addMensagemDisparaERetorna(ItfMensagem pMensagem);

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
     */
    public ItfResposta addMensagemErroDisparaERetorna(String pMensagem);

    /**
     *
     * Adiciona uma nova mensagem de Alerta, dispara para o usuário todas as
     * mensagens adicionadas, e retorna a própria resposta
     *
     * @param pMensagem Texto do novo Alerta
     * @return A própria resposta com o novo alerta
     */
    public ItfResposta addMensagemAlertaDisparaERetorna(String pMensagem);

    /**
     *
     * Dispara todas as mensagens para o usuário,
     *
     * Obs: Return
     *
     * @return Retorna o Próprio objeto resposta (pra maior comodidade ao sair
     * com return disparando mensagens para o usuário)
     */
    public ItfResposta dispararMensagens();

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
    public ItfResposta addMensagem(ItfMensagem pMensagem);

    /**
     *
     * Adiciona um alerta a resposta
     *
     * @param Pmensagem Texto do alerta
     * @return A pŕopria resposta com o novo alerta
     */
    public ItfResposta addAlerta(String Pmensagem);

    /**
     *
     * Adiciona um aviso a resposta
     *
     * @param Pmensagem Texto do aviso
     * @return a pŕopria resposta, como o novo aviso
     */
    public ItfResposta addAviso(String Pmensagem);

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
    public ItfResposta addErro(String Pmensagem);

    /**
     *
     * @return
     */
    public boolean isTemAlerta();

    /**
     *
     * Quando não existem mensgens de erro retorna verdadeiro
     *
     * @return verdadeiro se não houver mensagens de erro
     */
    public boolean isSucesso();

    /**
     *
     * @return
     */
    public String getUrlDestino();

    public boolean isTemUrlDestino();

    /**
     *
     * @param pDestino
     */
    public void setUrlDestino(String pDestino);

    /**
     *
     * @param pDestinoSucesso
     */
    public void setUrlDestinoSucesso(String pDestinoSucesso);

    /**
     *
     * @param pDestinoFalha
     */
    public void setUrlDestinoFalha(String pDestinoFalha);

}
