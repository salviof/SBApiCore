/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCaminhoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCaminhoCampoInvalido;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;

import java.lang.reflect.Field;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfBeanReflexoes {

    /**
     *
     * Retorna os campos instanciados que foram invalidados
     *
     * @return campos instanciados que não foram validadados
     */
    public List<ItfCampoInstanciado> getCamposInstaciadosInvalidos();

    /**
     * -> Depreciado, utilize campoInstanciadoByNomeOuAnoitacao Retorna um campo
     * instanciado a partir do nome do campo, ou nome da anotação do campo
     *
     * Um campo instanciado possui todas propriedades de um campo nescessário
     * para exibição visual deste, e um métodos getValor, e setValor, que
     * permitem acessar e alterar o valor.
     *
     * Caso ocorra uma tentativa de acessar um campo instanciado nulo, ele será
     * instanciado automaticamente pelo sistema
     *
     *
     * @param pNome nome do campo declarado, ou nome Da anotação do tipo
     * InfoCampo que
     * @return O Objeto campo instanciado, contendo get e set para obter os
     * valores, Label, Tipo do campo, Validação e outras informaçoes importantes
     * sobre o campo
     */
    @Deprecated
    public ItfCampoInstanciado getCampoByNomeOuAnotacao(String pNome);

    /**
     *
     * Retorna um campo instanciado a partir do nome do campo, ou nome da
     * anotação do campo
     *
     * Um campo instanciado possui todas propriedades de um campo nescessário
     * para exibição visual deste, e um métodos getValor, e setValor, que
     * permitem acessar e alterar o valor.
     *
     * Caso ocorra uma tentativa de acessar um campo instanciado nulo, ele será
     * instanciado automaticamente pelo sistema
     *
     *
     * @param pNome nome do campo declarado, ou nome Da anotação do tipo
     * InfoCampo que
     * @return O Objeto campo instanciado, contendo get e set para obter os
     * valores, Label, Tipo do campo, Validação e outras informaçoes importantes
     * sobre o campo
     */
    public ItfCampoInstanciado getCampoInstanciadoByNomeOuAnotacao(String pNome);

    /**
     *
     * @see #getCampoInstanciadoByNomeOuAnotacao(java.lang.String)
     * @param pNomeOuANotacao
     */
    public default ItfCampoInstanciado getCPinst(String pNomeOuANotacao) {
        return getCampoInstanciadoByNomeOuAnotacao(pNomeOuANotacao);
    }

    public ItfCampoInstanciado getCampoInstanciadoByAnotacao(FabTipoAtributoObjeto pTipocampo);

    /**
     *
     * O mesmo que isto @see ItfBeanReflexoes#getCampoByNomeOuAnotacao porém com
     * paramentro caminhoCampo
     *
     * @param pNome
     * @return
     */
    public ItfCampoInstanciado getCampoByCaminhoCampo(ItfCaminhoCampo pNome);

    /**
     * Retorna os ->valores<- dos campos instanciados retornados nisto: @see
     * ItfBeanReflexoes#getCampoByNomeOuAnotacao porém com
     *
     *
     * @param pNome
     * @return
     */
    public Object getValorCampoByCaminhoCampo(ItfCaminhoCampo pNome);

    /**
     *
     * Retorna todas as entidades vinculadas ao bean para merg
     *
     * @return
     */
    public List<ItfCaminhoCampo> getEntidadesVinculadas();

    public ItfBeanSimples getBeanSimplesPorNomeCampo(String pNomeCampo);

    public ItfBeanSimples getItemPorCaminhoCampo(ItfCaminhoCampo pCaminho);

    public List<ItfBeanSimples> getListaPorCaminhoCampo(ItfCaminhoCampo pCaminho);

    /**
     *
     * Cria mensagens de campos inválidos para utilização em validação
     *
     *
     * @return Uma lista de Mensagens de inconformidades com a validação
     */
    public List<ItfCaminhoCampoInvalido> getCamposInvalidos();

    public Field getCampoReflexaoByAnotacao(FabTipoAtributoObjeto pInfoCampo);

    public String getNomeCampo(FabTipoAtributoObjeto pInfocampo);

}
