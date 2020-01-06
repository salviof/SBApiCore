/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.estrutura;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfTipoAtributoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.TIPO_DECLARACAO;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;

/**
 *
 * @author desenvolvedor
 */
public interface ItfEstruturaCampoEntidade extends ItfTipoAtributoSB, ItfBeanSimples {

    public String getClasseCampoDeclaradoOuTipoLista();

    public ItfEstruturaDeEntidade getEstruturaPai();

    public boolean isTemValorLogico();

    public boolean isTemListaDinamica();

    public boolean isTemValidadorLogico();

    public TIPO_DECLARACAO getTipoDeclaracao();

    public String getNomeDeclarado();

    public void setTipoDeclaracao(TIPO_DECLARACAO tipoDeclaracao);

    public void setEstruturaPai(ItfEstruturaDeEntidade estruturaPai);

    public void setNomeDeclarado(String nomeDeclarado);
}
