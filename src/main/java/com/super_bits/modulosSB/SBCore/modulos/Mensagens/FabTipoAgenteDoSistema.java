/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Mensagens;

/**
 *
 * Tudo que é capaz de abrir uma sessão na aplicação, e receber mensagens é
 * considerado um agente do sistema.
 *
 * O Super-Bits FrameWork, considera 3 tipos de agentes em um sistema:
 *
 *
 * @see FabTipoAgenteDoSistema#USUARIO
 * @see FabTipoAgenteDoSistema#SISTEMA
 * @see FabTipoAgenteDoSistema#DESENVOLVEDOR
 *
 * Obs: Sim, nos orgulhamos de ter o desenvolvedor com oum dos agentes do
 * sistema, e consideramos isso, um diferencial poderoso e inclusivo.
 *
 * @author salviof@gmail.com
 */
public enum FabTipoAgenteDoSistema {

    /**
     *
     * O usuaŕio <br/>
     *
     * Caso de uso: Usuário loga e cadastra um cliente.
     *
     */
    USUARIO,
    /**
     *
     * (Representa o ContainerJavaEE) <br/>
     * Caso de uso: Execução de Ações programadas, Registro de Logs, e outros
     *
     */
    SISTEMA,
    /**
     *
     * Pode chamar de Deus, se você for um bit de computador que acredita no
     * criacionismo <br/>
     *
     * Caso de uso:Agente sistema, ou agente usuário, solicita Reparos ao agente
     * desenvolvedor, Agente Sistema exibe informações técnicas ao agente
     * Desenolvedor ao executar um Junit
     *
     * Agente desenvolvedor, entra no sistema e altera uma configuração de um
     * módulo, acessa ferramentas de desenovolvimento
     *
     */
    DESENVOLVEDOR
}
