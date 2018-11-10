/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoSecundaria;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoGerenciarEntidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.cep.LocalizacaoInputAssistente;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.cep.TipoOrganizacaoDadosEndereco;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.ErroPreparandoObjeto;
import java.util.List;

/**
 *
 *
 * Um ben generico é o Object do mundo Framework Superbits.
 *
 * O bean generico sbrescreve os metodos tostring, proporcionando a utilização
 * do metodo equals de acordo com a regra de negócio dá poderes de validação e
 * informações complementares para exibição do campo, seja em um projeto Web,
 * desktop\JavaSwing, Mobile, e outros.
 *
 *
 * para as propriedades
 *
 *
 * @author sfurbino
 */
public interface ItfBeanGenerico extends ItfBeanGenericoSomenteLeitura {

    public void adicionarJustificativaExecucaoAcao(ItfAcaoDoSistema pAcao, String pJustificativa);

    public String getJustificativa(ItfAcaoDoSistema pAcao);

    public void prepararNovoObjeto(Object... parametros) throws ErroPreparandoObjeto;

    public List<ItfCampoInstanciado> getCamposInstanciados();

    public void adicionarSubItem(String pNomeCampo);

    public LocalizacaoInputAssistente getAssistenteLocalizacao(ItfCampoInstanciado pCampoInst, TipoOrganizacaoDadosEndereco pTipo);

    public void adicionarAssitenteLocalizacao(LocalizacaoInputAssistente pLocalizacao);

    public void copiaDados(Object pObjetoReferencia);

    public default List<ItfAcaoSecundaria> getAcoesDoContexto(ItfAcaoGerenciarEntidade pGestao) {
        return pGestao.getAcoesVinculadasDoContexto(this);
    }

}
