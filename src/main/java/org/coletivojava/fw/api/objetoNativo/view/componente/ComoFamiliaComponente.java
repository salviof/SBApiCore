/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.coletivojava.fw.api.objetoNativo.view.componente;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComoComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import java.util.List;

/**
 *
 * @author salvio
 */
public interface ComoFamiliaComponente extends ComoEntidadeSimples {

    public List<ComoComponenteVisualSB> getComponentes();

    public FabFamiliaCompVisual getFabrica();

    public boolean getIsUmComponenteDaFamilia(ComoComponenteVisualSB pComponente);

    public boolean getIsUmXHTMLDAFamilia(String pXhtml);

    public String getNome();

    public boolean isLayoutCompativel(ComoComponenteVisualSB pComponente);

    public void setFabrica(FabFamiliaCompVisual fabrica);

}
