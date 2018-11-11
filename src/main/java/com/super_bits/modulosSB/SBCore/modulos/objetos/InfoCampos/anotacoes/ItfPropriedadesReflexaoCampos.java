/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoLisgagemOpcoesCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.TIPO_PRIMITIVO;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfAtributoObjetoEditavel;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfAtributoObjetoSB;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfPropriedadesReflexaoCampos {

    /**
     *
     * @return True se foi construido com anotações, Falso se foi construido
     * manualmente
     */
    public boolean isConstruidoComAnotacoes();

    /**
     *
     * @return O Atributo Gerado
     */
    public ItfAtributoObjetoSB getAtributoGerado();

    public FabTipoLisgagemOpcoesCampo getTipoListagem();

    public Class<? extends ItfFabrica> getFabricaCriacaoOpcoes();

    public Object getObjetoDoAtributo();

    public String getCaminhoListagemOpcoes();

    @Deprecated
    public String getLabel();

    public void aplicarAnotacoesEmAtributo(final ItfAtributoObjetoEditavel pAtributoConfiguravel);

    public boolean isUmCampoListavel();

    public Class getEntidadeLista();

    public FabTipoAtributoObjeto getFabTipoAtributo();

    public Class getClasseDeclaracaoAtributo();

    public Class getClasseOrigemAtributo();

    public TIPO_PRIMITIVO getTipoPrimitivo();

    public List<String> getTemplateCampos();

}
