/*
 *  Super-Bits.com CODE CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimplesSomenteLeitura;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfGrupoUsuario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

import java.util.List;

/**
 *
 *
 *
 * @author Salvio
 */
public interface ItfPermissao extends ItfBeanSimplesSomenteLeitura {

    public static enum TIPO_AUTENTICACAO {

        SOLICITAR_EMAIL, USUARIO_SENHA_SEM_CRIPTOGRAFIA
    }

    public ItfAcaoDoSistema getAcao();

    public String getDescricaoAcesso();

    public List<ItfGrupoUsuario> getGruposPermitidos();

    public List<ItfGrupoUsuario> getGruposNegados();

    public List<ItfGrupoUsuario> getGruposDisponiveis();

    public List<ItfUsuario> getUsuariosPermitidos();

    public List<ItfUsuario> getUsuariosNegados();

    public List<ItfUsuario> getUsuariosDisponiveis();

    public TIPO_AUTENTICACAO getTipoAutenticacao();

}
