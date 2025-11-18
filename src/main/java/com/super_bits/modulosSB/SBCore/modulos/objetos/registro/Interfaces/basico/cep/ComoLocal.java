/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;

/**
 *
 *
 * Define um local especifico do planeta.
 *
 *
 * @author desenvolvedor
 */
public interface ComoLocal extends ComoEntidadeSimples {

    public double getLongitude();

    public double getLatitude();

    public void setLatitude(double pLatitude);

    public void setLongitude(double pLongitude);

    public ComoBairro getBairro();

    public void setBairro(ComoBairro bairro);

    public String getComplemento();

    public void setComplemento(String pComplemento);

    public ComoLocalPostagem getComoLocalPostavel();

    public boolean isLocaPostavel();

}
