/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Mensagens;

/**
 *
 * Tudo que interage alterando o sistema é considerado um agente do sistema
 *
 * O Super-Bits FrameWork, considera 3 tipos de agentes em um sistema:
 *
 * USUÁRIO, SISTEMA E DESENVOLVEDOR
 *
 * Sistema: Logs (em geral redireciona para a central de evetos
 * -ItfCentralEventos)
 *
 * @see FabTipoAgenteDoSistema.USUARIO
 * @see com.super_bits.modulosSB.SBCore.modulos.logeventos.ItfCentralEventos
 *
 *
 *
 *
 * @author sfurbino
 *
 *
 */
public enum FabTipoAgenteDoSistema {

    /**
     *
     * O usuaŕio representa uma pessoa que está utilizando o sistema
     *
     * - > Em Breaking Bad seria o Pink
     *
     */
    USUARIO,
    /**
     *
     * Indica o Sistema em sí.. (ContainerJavaEE por exemplo)
     *
     * -> Em Breaking bad seria a o governo e a sociedade
     *
     */
    SISTEMA,
    /**
     *
     *
     * Representa a equipe que cria a forma como o sistema deve funcionar.
     *
     *
     * -> em Breaking bad representa o Waltter
     *
     */
    DESENVOLVEDOR
}
