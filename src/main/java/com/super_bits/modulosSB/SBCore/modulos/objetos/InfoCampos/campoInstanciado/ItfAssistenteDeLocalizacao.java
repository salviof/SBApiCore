/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfBairro;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfCidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfLocal;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfUnidadeFederativa;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfAssistenteDeLocalizacao {

    public List<ItfCidade> metodoAutoCompleteCidade(String pCidadeTXT);

    public List<ItfUnidadeFederativa> metodoAutoCompleteEstado(String pNomeEstado);

    public List<ItfBairro> metodoAutoCompleteBairro(String pCidadeTXT);

    public ItfBairro getBairro();

    public void setBairro(ItfBairro pBairro);

    public String getCep();

    public void setCep(String pcep);

    public ItfCidade getCidade();

    public void setCidade(ItfCidade pCidade);

    public void setUnidadeFederativa(ItfUnidadeFederativa pUnidadeFerativa);

    public ItfUnidadeFederativa getUnidadeFederativa();

    public String getNomeLocal();

    public void setLogradouro(String pLogradouro);

    public String getLogradouro();

    public void setComplemento(String pComplemento);

    public String getComplemento();

    public void setNomeLocal(String pLocal);

    /**
     *
     * @return Objeto Local vinculado
     */
    public ItfLocal getLocal();

    /**
     *
     * @return Bairro é nulo?
     */
    public boolean isBairroNulo();

    /**
     *
     * @return Cidade é nula?
     */
    public boolean isCidadeNula();

    /**
     *
     * @return UF é nulo?
     */
    public boolean isUnidadeFederativaEstadoNulo();

    /**
     *
     * @return país é nulo?
     */
    public boolean isPaisnulo();

    /**
     *
     * @return cep é nulo?
     */
    public boolean isCepsnulo();

    /**
     *
     * @return True momento ideal coleta do bairro
     */
    public boolean isColetarBairroAgora();

    /**
     *
     * @return True momemento ideal coletar Unidade Federativa
     */
    public boolean isColetarEstadoAgora();

    /**
     *
     * @return True momento ideal Coleta cidade
     */
    public boolean isColetarCidadeAgora();

    /**
     *
     * @return True momento ideal coleta do CEP
     */
    public boolean isColetarCepAgora();

    /**
     *
     * @return True momento ideal coleta de logradouro
     */
    public boolean isColetarLogradouroAgora();

    /**
     *
     * @return True momento ideal coleta nome e Logradouro
     */
    public boolean isColetarNomeELogradouroAgora();

    /**
     *
     * @return True momento Ideal Coleta complemento
     */
    public boolean isColetarComplementoAgora();

    /**
     *
     * @return True quando O Estado e cidade já estão Selecionados
     */
    public boolean isPodeColetarBairro();

    /**
     *
     * @return True quando O estado já estiver selecionado
     */
    public boolean isPodeColetarCidade();

    /**
     *
     * @return True quando o Bairro estiver Selecionado (Normalmente esta
     * verificação não é nescessária)
     */
    public boolean isPodeColetarDescricaoLogradouro();

    /**
     * Seta nulo no Estado, cidade, e Bairro
     */
    public void limparEstado();

    /**
     * Seta nulo na cidade e bairro
     */
    public void limparCidade();

    /**
     * Seta nulo no bairro
     */
    public void limparBairro();

    /**
     * Seta nulo em cep,estado, cidade e bairro
     */
    public void limparCep();

    /**
     *
     * @return estado OK, e cidade Nula
     */
    public boolean isEstadoPreenchidoECidadeNula();

    /**
     *
     * @return Cidade ok, e Bairro nulo
     */
    public boolean isCidadePreenchidaEBairroNulo();

    /**
     * Atualiza o endereço, este método é chamado também ao alterar o cep e
     * encontrar-lo
     *
     * @return
     */
    public boolean atualizarEnderecoPorCep();

    public boolean isCepEncontradoObrigatorio();

    public default boolean aplicarCEP(String pCep) {
        setCep(pCep);
        return !isUnidadeFederativaEstadoNulo();

    }

    public default boolean isPermitidoCriarBairro() {
        //TODO: Inplementar leitura de anotação
        return true;
    }

    public String getIdentificacaoMapa();
}
