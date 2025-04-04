/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;

/**
 *
 *
 * Define um local especifico do planeta.
 *
 *
 * @author desenvolvedor
 */
public interface ItfLocal extends ItfBeanSimples {

    public double getLongitude();

    public double getLatitude();

    public void setLatitude(double pLatitude);

    public void setLongitude(double pLongitude);

    public ItfBairro getBairro();

    public void setBairro(ItfBairro bairro);

    public String getComplemento();

    public void setComplemento(String pComplemento);

    public ItfLocalPostagem getComoLocalPostavel();

    public boolean isLocaPostavel();

}
