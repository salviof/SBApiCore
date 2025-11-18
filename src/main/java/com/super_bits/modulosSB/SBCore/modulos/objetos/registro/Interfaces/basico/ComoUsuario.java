package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import java.util.Date;
import java.util.List;

public interface ComoUsuario extends ComoTemEndereco {

    public String getEmail();

    public String getSenha();

    @Override
    public String getNome();

    public ComoGrupoUsuario getGrupo();

    public void setGrupo(ComoGrupoUsuario grupo);

    public List<ComoGrupoUsuario> getGruposAdicionais();

    public Date getDataCadastro();

    public String getApelido();

    @Override
    public boolean isAtivo();

    public String getTipoUsuario();

}
