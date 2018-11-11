/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes;

import java.util.List;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author desenvolvedor
 */
public interface ItfAnotacoesCampo {

    public Digits getDigitos();

    public Future getFuturo();

    public InfoCampo getInfoCampo();

    public Max getMaximo();

    public Min getMinimo();

    public NotNull getNaonulo();

    public InfoCampoModeloDocumento getInfoModeloDocumeto();

    public Past getPassado();

    public Pattern getRegex();

    public Size getTamanho();

    public AssertTrue getVerdadeiro();

    public List<FabTipoAnotacaoCampo> getTiposAnotacoesRealizadas();

    public Object getAnotacao(FabTipoAnotacaoCampo pTipoAnotacao);

}
