package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico;

import java.util.Date;
import java.util.List;

public interface ItfUsuario extends ItfBeanEnderecavel {

    public String getEmail();

    public String getSenha();

    @Override
    public String getNome();

    public ItfGrupoUsuario getGrupo();

    public void setGrupo(ItfGrupoUsuario grupo);

    public List<ItfGrupoUsuario> getGruposAdicionais();

    public Date getDataCadastro();

    public String getApelido();

    @Override
    public boolean isAtivo();

    public String getTipoUsuario();

}
