/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico.cep;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico.ItfBeanLocalizavel;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico.ItfBeanSimples;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfCidade extends ItfBeanSimples {

    public ItfUnidadeFederativa getUnidadeFederativa();

    public void setUnidadeFederativa(ItfUnidadeFederativa pUnidadeFederativa);

    public List<ItfBairro> getBairros();

    public String getEstadoPontoNomeCidade();

    public ItfLocalidade getLocalidade();

    public void setLocalidade(ItfLocalidade pLocalidade);

}
