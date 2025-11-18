/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.controller.modulo;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.modulo.ComoFabricaModulo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;

import java.util.ArrayList;
import java.util.List;
import org.coletivojava.fw.api.objetoNativo.ObjetoNativoCoreDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabrica;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

/**
 *
 * @author desenvolvedor
 */
@InfoObjetoSB(plural = "Modulos", tags = {"Módulo"})
public class ModuloTransiente extends ObjetoNativoCoreDoSistema implements ItfModuloAcaoSistema {

    @InfoCampo(tipo = FabTipoAtributoObjeto.ID)
    private Long id;
    @InfoCampo(tipo = FabTipoAtributoObjeto.NOME)
    private String nome;
    @InfoCampo(tipo = FabTipoAtributoObjeto.DESCRITIVO)
    private String descricao;

    private ComoFabricaModulo fabModulo;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long pID) {
        id = pID;
    }

    @Override
    public void setDescricao(String pDescricao) {
        descricao = pDescricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public List<ComoAcaoDoSistema> getAcoes() {
        return new ArrayList<>();
    }

    @Override
    public List<ComoAcaoDoSistema> getAcoesGestaoMB() {
        return new ArrayList<>();
    }

    @Override
    public boolean isUmModuloNativo() {
        return true;
    }

    @Override
    public ComoFabricaModulo getEnumVinculado() {
        return (ComoFabricaModulo) fabModulo;
    }

    @Override
    public void setEnumVinculado(ComoFabrica pFabrica) {
        fabModulo = (ComoFabricaModulo) pFabrica;
    }

}
