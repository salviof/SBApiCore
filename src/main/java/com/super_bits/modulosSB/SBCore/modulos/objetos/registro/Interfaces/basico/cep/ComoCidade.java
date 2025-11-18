/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ComoCidade extends ComoEntidadeSimples {

    public ComoUnidadeFederativa getUnidadeFederativa();

    public void setUnidadeFederativa(ComoUnidadeFederativa pUnidadeFederativa);

    public List<ComoBairro> getBairros();

    public String getEstadoPontoNomeCidade();

    public ComoLocalidade getLocalidade();

    public void setLocalidade(ComoLocalidade pLocalidade);

}
