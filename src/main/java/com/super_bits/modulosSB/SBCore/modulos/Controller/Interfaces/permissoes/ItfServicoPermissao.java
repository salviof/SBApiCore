/*
 *  Super-Bits.com CODE CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes;

import com.super_bits.modulosSB.SBCore.modulos.servicosCore.ItfServicoCoreSB;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.token.ItfTokenAcessoDinamico;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.token.ItfTokenRecuperacaoEmail;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimplesSomenteLeitura;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfGrupoUsuario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

import com.super_bits.modulosSB.SBCore.modulos.view.menu.ItfMenusDeSessao;

import java.lang.reflect.Method;
import java.util.List;

/**
 * ############################################################# <br/>
 * Esta Interface assina um dos serviços do núcleo SBCore
 * <br/>
 * Veja todos os serviços disponíveis digitando SBCore.getServico...
 * ############################################################# <br/>
 *
 * A Central de permissões lida com as permissões para execução de ações da
 * aplicação
 *
 *
 * @author Salvio
 */
public interface ItfServicoPermissao extends ItfServicoCoreSB {

    /**
     *
     * Reconfigura as permissões da aplicação
     *
     * @return Todas as permissões configuradas
     */
    public List<ItfPermissao> configuraPermissoes();

    /**
     *
     * Encontra o usuário pelo e-mail
     *
     * @param pEmail
     * @return
     */
    public ItfUsuario getUsuarioByEmail(String pEmail);

    /**
     *
     * Utilize o método referenciado nesta documentação
     *
     * @see ItfControleDeSessao#
     * @param pEmail
     * @param pSenha
     *
     */
    public void logarEmailESenha(String pEmail, String pSenha);

    public List<ItfUsuario> configuraUsuarios();

    public Class[] getClassesController();

    public ItfMenusDeSessao definirMenu(ItfGrupoUsuario pGrupo);

    public void atualizarInformacoesDePermissoesDoSistema();

    public Method getMetodoByAcao(ItfAcaoDoSistema acao);

    public boolean isAcaoPermitidaUsuarioLogado(ItfAcaoDoSistema acao);

    public boolean isAcaoPermitidaUsuario(ItfUsuario pUsuario, ItfAcaoDoSistema acao);

    public boolean isObjetoPermitidoUsuario(ItfUsuario pUsuario, ItfBeanSimplesSomenteLeitura pObjeto);

    public boolean isPermitidoUsuario(ItfUsuario pUsuario, ItfPermissao pPermissao);

    /**
     *
     * @param pUsuario
     * @param pMinutosValidade 1 dia: 1440 uma semana: 10080, um mês: 40320
     * @return
     */
    public ItfTokenRecuperacaoEmail gerarTokenRecuperacaoDeSenha(ItfUsuario pUsuario, int pMinutosValidade);

    public ItfTokenAcessoDinamico gerarTokenDinamico(ItfFabricaAcoes pAcao, ItfBeanSimplesSomenteLeitura pItem, String pEmail);

    public boolean isTokenDinamicoExiste(ItfFabricaAcoes pAcao, ItfBeanSimplesSomenteLeitura pItem, String pEmail);

    public void persitirMergePermissoes();

}
