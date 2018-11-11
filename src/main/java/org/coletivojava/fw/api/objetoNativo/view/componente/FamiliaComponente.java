/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.view.componente;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfFabTipoComponenteVisual;

import java.util.ArrayList;
import java.util.List;
import org.coletivojava.fw.api.objetoNativo.ObjetoNativoCoreDoSistema;

/**
 *
 * @author salvioF
 */
@InfoObjetoSB(tags = {"Família do Componente"}, plural = "Famílias do componente", fabricaVinculada = FabFamiliaCompVisual.class)
public final class FamiliaComponente extends ObjetoNativoCoreDoSistema implements ItfBeanSimples {

    @InfoCampo(tipo = FabTipoAtributoObjeto.ID)
    private int id;
    @InfoCampo(tipo = FabTipoAtributoObjeto.AAA_NOME)
    private String nome;
    private FabFamiliaCompVisual fabrica;

    private List<ItfComponenteVisualSB> componentes;

    private Class fabricaDeCamposPadrao;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public boolean isLayoutCompativel(ItfComponenteVisualSB pComponente) {
        return true;
    }

    public FabFamiliaCompVisual getFabrica() {
        return fabrica;
    }

    public void setFabrica(FabFamiliaCompVisual fabrica) {
        this.fabrica = fabrica;
    }

    public boolean getIsUmComponenteDaFamilia(ItfComponenteVisualSB pComponente) {
        return true;

    }

    public boolean getIsUmXHTMLDAFamilia(String pXhtml) {
        return true;
    }

    public List<ItfComponenteVisualSB> getComponentes() {

        if (componentes == null || componentes.isEmpty()) {
            componentes = new ArrayList<>();
            for (Object obj : fabricaDeCamposPadrao.getEnumConstants()) {
                componentes.add(((ItfFabTipoComponenteVisual) obj).getRegistro());
            }
        }
        return componentes;

    }

    @Override
    public void setNome(String pNome) {
        nome = pNome;
    }

    @Override
    public void setId(int pID) {
        id = pID;
    }

}
