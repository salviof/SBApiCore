/*
 *  Super-Bits.com CODE CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes;


import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimplesSomenteLeitura;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoGrupoUsuario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

/**
 *
 *
 *
 * @author Salvio
 */
public interface ItfPermissao extends ComoEntidadeSimplesSomenteLeitura {

    public static enum TIPO_AUTENTICACAO {

        SOLICITAR_EMAIL, USUARIO_SENHA_SEM_CRIPTOGRAFIA
    }

    public ComoAcaoDoSistema getAcao();

    public String getDescricaoAcesso();

    public List<ComoGrupoUsuario> getGruposPermitidos();

    public List<ComoGrupoUsuario> getGruposNegados();

    public List<ComoGrupoUsuario> getGruposDisponiveis();

    public List<ComoUsuario> getUsuariosPermitidos();

    public List<ComoUsuario> getUsuariosNegados();

    public List<ComoUsuario> getUsuariosDisponiveis();

    public TIPO_AUTENTICACAO getTipoAutenticacao();

}
