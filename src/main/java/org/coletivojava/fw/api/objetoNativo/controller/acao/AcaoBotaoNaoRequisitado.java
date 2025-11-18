/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.controller.acao;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoController;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoControllerEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoSecundaria;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.modulo.FabModuloSistemaCore;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoGerenciarEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.fabricas.FabTipoAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.fabricas.FabTipoAcaoSistemaGenerica;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabricaAcoes;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import org.coletivojava.fw.api.objetoNativo.ObjetoNativoCoreDoSistema;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreStringFiltrosSimples;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

/**
 *
 * @author SalvioF
 */
public class AcaoBotaoNaoRequisitado extends ObjetoNativoCoreDoSistema implements ComoAcaoDoSistema {

    @InfoCampo(tipo = FabTipoAtributoObjeto.ID)
    private Long id;
    @InfoCampo(tipo = FabTipoAtributoObjeto.NOME)
    private String nomeAcao;
    @InfoCampo(tipo = FabTipoAtributoObjeto.ICONE)
    private String iconeAcao;
    @InfoCampo(tipo = FabTipoAtributoObjeto.COR)
    private String cor;
    @InfoCampo(tipo = FabTipoAtributoObjeto.DESCRITIVO)
    private String descricao;

    @Override
    public void setNomeAcao(String pNome) {
        nomeAcao = pNome;
    }

    @Override
    public String getNomeAcao() {
        return nomeAcao;
    }

    @Override
    public String getIconeAcao() {
        return iconeAcao;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String pDescricao) {
        descricao = pDescricao;
    }

    @Override
    public boolean isPrecisaPermissao() {
        return false;
    }

    @Override
    public void setIconeAcao(String pIcone) {
        iconeAcao = pIcone;
    }

    @Override
    public Long getId() {
        return (long) getNomeAcao().hashCode();
    }

    @Override
    public void setModuloAcaoSistema(ItfModuloAcaoSistema pmodulo) {
        throw new UnsupportedOperationException("O módulo desta ação é somente leitura"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItfModuloAcaoSistema getModulo() {

        return FabModuloSistemaCore.MODULO_SISTEMA.getRegistro();
    }

    @Override
    public boolean isConfigurado() {
        return true;
    }

    @Override
    public String getNomeUnico() {
        return UtilSBCoreStringFiltrosSimples.gerarUrlAmigavel(getModulo().getNome()) + "." + UtilSBCoreStringFiltrosSimples.gerarUrlAmigavel(getNomeAcao());
    }

    @Override
    public String getNomeEnumOriginal() {
        return UtilSBCoreStringFiltrosSimples.gerarUrlAmigavel(getModulo().getNome()) + "." + UtilSBCoreStringFiltrosSimples.gerarUrlAmigavel(getNomeAcao());
    }

    @Override
    public FabTipoAcaoSistema getTipoAcaoSistema() {
        return FabTipoAcaoSistema.ACAO_DO_SISTEMA;
    }

    @Override
    public ComoFabricaAcoes getEnumAcaoDoSistema() {
        return null;
    }

    @Override
    public void configurarPropriedadesBasicas(ComoAcaoDoSistema pAcaoDoSistema) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getIdDescritivoJira() {
        return "Ação padrão do Sistema";
    }

    @Override
    public void setIdDescritivoJira(String pIdJira) {
        throw new UnsupportedOperationException("O descritivo desta ação é somente leitura"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrecisaPermissao(boolean pPermissao) {
        throw new UnsupportedOperationException("A permissão desta ação é somente leitura");
    }

    @Override
    public FabTipoAcaoSistemaGenerica getTipoAcaoGenerica() {
        return FabTipoAcaoSistemaGenerica.CONTROLLER_PERSONALIZADO;
    }

    @Override
    public boolean isUmaAcaoFormulario() {
        return false;
    }

    @Override
    public boolean isTemAcaoPrincipal() {
        return false;
    }

    @Override
    public boolean isUmaAcaoGenerica() {
        return false;
    }

    @Override
    public boolean isUmaAcaoGestaoDominio() {
        return false;
    }

    @Override
    public boolean isUmaAcaoSessaoMenu() {
        return false;
    }

    @Override
    public boolean isUmaAcaoDeEntidade() {
        return false;
    }

    @Override
    public boolean isUmaAcaoController() {
        return false;
    }

    @Override
    public String getNomeDominio() {
        return "Sistema";
    }

    @Override
    public ItfAcaoFormulario getComoFormulario() {
        throw new UnsupportedOperationException("Esta ação não é uma ação de formulário");
    }

    @Override
    public ItfAcaoFormularioEntidade getComoFormularioEntidade() {
        throw new UnsupportedOperationException("Esta ação não é uma ação de formulário");
    }

    @Override
    public ItfAcaoGerenciarEntidade getComoGestaoEntidade() {
        throw new UnsupportedOperationException("Esta ação não é uma ação de Gestão");
    }

    @Override
    public ComoAcaoController getComoController() {
        throw new UnsupportedOperationException("Esta ação não é uma ação de Controller");
    }

    @Override
    public ComoAcaoSecundaria getComoSecundaria() {
        throw new UnsupportedOperationException("Esta ação não é uma ação secundária");
    }

    @Override
    public ComoAcaoControllerEntidade getComoControllerEntidade() {
        throw new UnsupportedOperationException("Esta ação não é uma ação de Controller");
    }

    @Override
    public ItfAcaoGerenciarEntidade getAcaoDeGestaoEntidade() {
        throw new UnsupportedOperationException("Esta ação não é uma ação de Gestão");
    }

    @Override
    public boolean isAcaoTemModal() {
        return false;
    }

    @Override
    public String getIcone() {
        return iconeAcao;

    }

    @Override
    public void setNome(String pNome) {
        nomeAcao = pNome;
    }

    @Override
    public String getNome() {
        return nomeAcao;
    }

    @Override
    public void setId(Long pID) {
        id = pID;
    }

}
