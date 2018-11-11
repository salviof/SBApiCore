/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.tratamentoErros;

/**
 *
 * @author sfurbino
 */
public enum FabErro {

    /**
     *
     * Gera um Log utilizando a central de logs, e em seguida gera uma nova
     * exceção
     *
     *
     */
    LANCAR_EXCECÃO,
    /**
     *
     * Faz um Log Apenas
     *
     */
    ARQUIVAR_LOG,
    /**
     *
     *
     * SOLICITA REPARO AO RESPONSÁVEL
     *
     */
    SOLICITAR_REPARO,
    /**
     * Paraliza a execução do sistema (Utilize com muita cautela, apenas onde
     * pré-configurações importantes do núcleo não tenham sido definidas)
     */
    PARA_TUDO;

    /*
     *
     * EXIBE A MENSAGEM DE ERRO PARA O USUÁRIO, NÃO GRAVA LOG, PODE OU NÃO
     * MANIFESTAR NO MODO EM DESENVOLVIMENTO
     */
}
