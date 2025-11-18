/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.modulo.ComoFabricaModulo;

import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeVinculadoAEnum;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;

/**
 *
 *
 *
 *
 * @author <a href="mailto:salviof@gmail.com">Salvio Furbino</a>
 * @since 19/12/2015
 * @version 1.0
 */
public interface ItfModuloAcaoSistema extends ComoEntidadeSimples, ComoEntidadeVinculadoAEnum {

    @Override
    public Long getId();

    @Override
    public String getNome();

    public String getDescricao();

    public List<ComoAcaoDoSistema> getAcoes();

    @Override
    public void setId(Long pID);

    @Override
    public void setNome(String pNome);

    public void setDescricao(String pDescricao);

    public List<ComoAcaoDoSistema> getAcoesGestaoMB();

    public boolean isUmModuloNativo();

    @Override
    public ComoFabricaModulo getEnumVinculado();

}
