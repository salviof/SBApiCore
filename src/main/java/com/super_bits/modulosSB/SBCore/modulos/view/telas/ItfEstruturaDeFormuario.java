/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.telas;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfParametroRequisicao;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoGerenciarEntidade;
import java.util.List;

/**
 *
 * @author salvio
 */
public interface ItfEstruturaDeFormuario {

    public ItfAcaoGerenciarEntidade getAcaoGestaoVinculada();

    public List<ItfParametroRequisicao> getParametrosURL();

    public String getUrlPadrao();

}
