/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.view.telas;

import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoSessao;
import java.util.List;

/**
 *
 * @author salvio
 */
public interface ItfDefinicaoUrlHostDeSessao
        extends Serializable {

    public String gerarUrlDeAcesso(ComoSessao pAcesso);

    public List<String> getListaURlsPermitidas();

}
