/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo;

import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormCamposAtualizaComponentePeloId;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormCamposAtualizaForm;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormCamposAtualizaGrupoDoCampo;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormCamposLabelAlternativo;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormCamposSomenteLeitura;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;

import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfGrupoCampos extends ItfBeanSimples {

    public void adicionarCampo(ItfCampoExibicaoFormulario pCampo);

    public void configurarAtualizacaoAreaEspecifica();

    public void configurarAtualizacaoDeFormulario(InfoTipoAcaoFormCamposAtualizaForm pInfoGrupo);

    public void configurarAtualizacaoGrupo(InfoTipoAcaoFormCamposAtualizaGrupoDoCampo pInfoGrupo);

    public void configurarLabelsDinamicos(InfoTipoAcaoFormCamposLabelAlternativo pLabelDinamico);

    public void configurarSomenteLeitura(InfoTipoAcaoFormCamposSomenteLeitura pLabelDinamico);

    public void configurarAtualizacaoPorID(InfoTipoAcaoFormCamposAtualizaComponentePeloId pInfoGrupo);

    public List<ItfCampoExibicaoFormulario> getCampos();

    /**
     * Utilize getNomeIdentificadorSlug()
     *
     * @return
     * @deprecated
     */
    @Deprecated
    public String getIdNomeGrupoCampo();

    public String getNomeGrupo();

    public String getNomeIdentificadorSlug();

    public ItfCampoExibicaoFormulario[] getCamposArray();

    public int getResponsividade();

    public boolean isUmCampoComNome();

    public default String getClasseOrganizadorContainers() {
        int qtdCampos = getCampos().size();
        if (qtdCampos <= 3) {
            return "OrganizadorContainerEsquerda";
        } else {
            return "OrganizadorContainer";
        }
    }

    @Deprecated
    public ItfCampoExibicaoFormulario getCampoInfoExibicaoByIndex(int pIndex);

}
