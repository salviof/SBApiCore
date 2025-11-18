/*
 *  Super-Bits.com CODE CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.servicosCore;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfPermissao;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.FabTipoAgenteDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoSessao;

/**
 *
 * ############################################################# <br/>
 * Esta Interface assina um dos serviços do núcleo SBCore
 * <br/>
 * Veja todos os serviços disponíveis digitando SBCore.getServico...############################################################# <br/>


 Esta inteface manipula a sessão do agente do contexto de execução.
 *
 *
 * @see ComoServicoCoreSB
 * @see FabTipoAgenteDoSistema
 * @author Salviof@gmail.com
 */
public interface ComoControleDeSessao extends ComoServicoCoreSB {

    public abstract ComoSessao getSessaoAtual();

    public abstract void efetuarLogIn();

    public abstract void efetuarLogOut();

    public abstract void registrarAcao(ItfPermissao pAcesso);

    public abstract void logarEmailESenha(String usuario, String senha);

    public abstract void logarComoRoot();

    public abstract void logarComoAnonimo();

}
