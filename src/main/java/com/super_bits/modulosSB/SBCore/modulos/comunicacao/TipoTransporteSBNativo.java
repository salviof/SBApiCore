/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanVinculadoAEnum;

import org.coletivojava.fw.api.objetoNativo.ObjetoNativoCoreDoSistema;

/**
 *
 *
 * @author desenvolvedor
 */
@InfoObjetoSB(plural = "Tipos de Transporte", tags = {"Tipo Transporte"})
public class TipoTransporteSBNativo extends ObjetoNativoCoreDoSistema implements ItfTipoCanalComunicacao, ItfBeanVinculadoAEnum {

    @InfoCampo(tipo = FabTipoAtributoObjeto.ID)
    private Long id;
    @InfoCampo(tipo = FabTipoAtributoObjeto.NOME)
    private String nome;
    @InfoCampo(tipo = FabTipoAtributoObjeto.DESCRITIVO)
    private String descricao;

    private ItffabricaCanalComunicacao tipoTransporte;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override

    public void setEnumVinculado(ItfFabrica pFabrica) {
        tipoTransporte = (ItffabricaCanalComunicacao) pFabrica;
    }

    @Override
    public ItfFabrica getEnumVinculado() {
        return tipoTransporte;
    }
}
