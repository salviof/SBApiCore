/*
 *  Super-Bits.com CODE CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.token.ItfTokenAcessoDinamico;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.token.ItfTokenRecuperacaoEmail;
import com.super_bits.modulosSB.SBCore.modulos.erp.FabTipoAgenteOrganizacao;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabricaAcoes;

import java.lang.reflect.Method;
import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.contato.ComoContatoHumano;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimplesSomenteLeitura;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoGrupoUsuario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;
import com.super_bits.modulosSB.SBCore.modulos.servicosCore.ComoServicoCoreSB;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ComoMenusDeSessao;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

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
public interface ItfServicoPermissao extends ComoServicoCoreSB {

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
    public ComoUsuario getUsuarioByEmail(String pEmail);

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

    public List<ComoUsuario> configuraUsuarios();

    public Class[] getClassesController();

    public ComoMenusDeSessao definirMenu(ComoGrupoUsuario pGrupo);

    public void atualizarInformacoesDePermissoesDoSistema();

    public Method getMetodoByAcao(ComoAcaoDoSistema acao);

    public boolean isAcaoPermitidaUsuarioLogado(ComoAcaoDoSistema acao);

    public boolean isAcaoPermitidaUsuario(ComoUsuario pUsuario, ComoAcaoDoSistema acao);

    public boolean isObjetoPermitidoUsuario(ComoUsuario pUsuario, ComoEntidadeSimplesSomenteLeitura pObjeto);

    public boolean isPermitidoUsuario(ComoUsuario pUsuario, ItfPermissao pPermissao);

    /**
     *
     * @param pUsuario
     * @param pMinutosValidade 1 dia: 1440 uma semana: 10080, um mês: 40320
     * @return
     */
    public ItfTokenRecuperacaoEmail gerarTokenRecuperacaoDeSenha(ComoUsuario pUsuario, int pMinutosValidade);

    public ItfTokenAcessoDinamico gerarTokenDinamico(ComoFabricaAcoes pAcao, ComoEntidadeSimplesSomenteLeitura pItem, String pEmail);

    public boolean isTokenDinamicoExiste(ComoFabricaAcoes pAcao, ComoEntidadeSimplesSomenteLeitura pItem, String pEmail);

    public void persitirMergePermissoes();

    public FabTipoAgenteOrganizacao getTipoAgente(ComoUsuario pUsuario);

    public ComoContatoHumano getContatoDoUsuario(ComoUsuario pUsuairo) throws ErroDadosDeContatoUsuarioNaoEncontrado;

}
