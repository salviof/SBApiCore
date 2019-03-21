/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.servicosCore;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.ItfPropriedadesReflexaoCampos;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores.listagemItem.ItfListagemItensSomenteLeitura;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores.listagemItem.ItflistagemItemEditavel;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores.seletorMultiplo.ItfselecaoListaComOrigem;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.seletores.seletorUnicoObjeto.ItfSelecaoObjetoDeUmaLista;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.estrutura.ItfInfoStatusObjetoAplicacaoContexto;

import java.util.List;

/**
 * ############################################################# <br/>
 * Esta Interface assina um dos serviços do núcleo SBCore
 * <br/>
 * Veja todos os serviços disponíveis digitando SBCore.getServico...
 * ############################################################# <br/>
 *
 * A função deste serviço e obter dados complementares a um atributo de objeto,
 * a importancia maior deste serviço se dá nos campos vinculados a listas de
 * opões
 *
 *
 * @author salviof@gmail.com
 */
public interface ItfCentralAtributosDeObjetos extends ItfServicoCoreSB {

    /**
     *
     * Obs: as anotações do campo são enviadas separadamente, para utilização de
     * campos dinâmicos
     *
     * @param pCampoInstanciado
     *
     * @return
     */
    public List getListaOpcoesCampoInstanciado(ItfCampoInstanciado pCampoInstanciado);

    public List getListaOpcoesCampo(ItfPropriedadesReflexaoCampos pCampo);

    /**
     *
     *
     *
     *
     * @param pCampoInstanciado
     *
     * @param pFiltro
     * @param pCampos
     * @return
     */
    public List getListaOpcoesCampoInstanciado(ItfCampoInstanciado pCampoInstanciado, String pFiltro, String... pCampos);

    public int getNumeroMaximoRegistros(ItfCampoInstanciado pCampoInstanciado);

    /**
     *
     * ATENÇÃO-> A classe informada aqui, deve conter um constructor com um
     * campo instanciado como parametro
     *
     * @return
     */
    public Class<? extends ItfSelecaoObjetoDeUmaLista> getClasseSelecaoItem();

    /**
     *
     * @return
     */
    public Class<? extends ItfListagemItensSomenteLeitura> getClasseListaRegistrosSomenteLeitura();

    /**
     *
     * @return
     */
    public Class<? extends ItflistagemItemEditavel> getClasseListaRegistrosEditavel();

    /**
     *
     * ATENÇÃO-> A classe informada aqui, deve conter um constructor com um
     * campo instanciado como parametro
     *
     *
     * @return
     */
    public Class<? extends ItfselecaoListaComOrigem> getClasseSelecaoItens();

    public void atualizarInformacoesDeObjeto(ItfInfoStatusObjetoAplicacaoContexto pObjeto);

}
