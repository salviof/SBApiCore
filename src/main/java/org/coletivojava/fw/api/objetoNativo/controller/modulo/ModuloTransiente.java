/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.controller.modulo;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.modulo.ItfFabricaModulo;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;

import java.util.ArrayList;
import java.util.List;
import org.coletivojava.fw.api.objetoNativo.ObjetoNativoCoreDoSistema;

/**
 *
 * @author desenvolvedor
 */
@InfoObjetoSB(plural = "Modulos", tags = {"Módulo"})
public class ModuloTransiente extends ObjetoNativoCoreDoSistema implements ItfModuloAcaoSistema {

    @InfoCampo(tipo = FabTipoAtributoObjeto.ID)
    private int id;
    @InfoCampo(tipo = FabTipoAtributoObjeto.AAA_NOME)
    private String nome;
    @InfoCampo(tipo = FabTipoAtributoObjeto.AAA_DESCRITIVO)
    private String descricao;

    private ItfFabricaModulo fabModulo;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int pID) {
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
    public List<ItfAcaoDoSistema> getAcoes() {
        return new ArrayList<>();
    }

    @Override
    public List<ItfAcaoDoSistema> getAcoesGestaoMB() {
        return new ArrayList<>();
    }

    @Override
    public boolean isUmModuloNativo() {
        return true;
    }

    @Override
    public ItfFabricaModulo getEnumVinculado() {
        return (ItfFabricaModulo) fabModulo;
    }

    @Override
    public void setEnumVinculado(ItfFabrica pFabrica) {
        fabModulo = (ItfFabricaModulo) pFabrica;
    }

}
