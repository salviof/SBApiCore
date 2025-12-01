/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.view.componente;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCampoExibicaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCampoListagemExibicaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import org.coletivojava.fw.utilCoreBase.UtilCRCLayoutComponenteEmTelaBasico;

/**
 *
 * @author desenvolvedor
 */
public class ComponenteVisualSubListaEmLayout extends ComponenteVisualEmLayout {

    private final ItfCampoListagemExibicaoFormulario caminhoCampo;

    public ComponenteVisualSubListaEmLayout(ItfCampoInstanciado pCampoInstanciado, ItfCampoListagemExibicaoFormulario pCaminhoCampo) {
        super(pCampoInstanciado.getComponenteVisualPadrao(),
                pCaminhoCampo.getCaminhoCompletoComGrupoCampo(),
                UtilCRCLayoutComponenteEmTelaBasico.getPrioridadePadraoPorTipoCampo(pCampoInstanciado.getFabricaTipoAtributo()),
                getPesoLarguraByCampoInstanciado(pCampoInstanciado)
        );

        caminhoCampo = pCaminhoCampo;
    }

    public ItfCampoListagemExibicaoFormulario getCaminhoCampo() {
        return caminhoCampo;
    }

    @Override
    public boolean isUmComponenteAtributoDeObjeto() {
        return true;
    }

    public ItfCampoExibicaoFormulario getCampoExibicaoFormulario() {

        return caminhoCampo;
    }

}
