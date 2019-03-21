/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.servicosCore;

/**
 *
 * Os serviços do SBCore, são serviço basicos, existentes na maioria dos
 * sistemas de informação
 *
 * Exemplo: Serviço de Sesssão, Comunicação, Permissões, Acesso a Dados,
 * Consulta de CEP,gestão de Visualização, dentre outros.
 *
 * As classes fornecedoras destes serviços são injetadas de forma "manual" uma
 * única vêz ao inicializar o sistema,
 *
 * Desta forma não temos impacto em performance, e podemos implementar a
 * execução dos serviços de formas distintas de acordo com com o contexto de
 * execução como: Estado da aplicação (Desenvolvimento, Homologação, e
 * Produção), projeto e disposivo.
 *
 *
 *
 * @author salviof@gmail.com
 */
public interface ItfServicoCoreSB {

}
