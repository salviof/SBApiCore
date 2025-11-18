/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.view.componente;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVIsualInputsLayout;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComoFabTipoComponenteVisual;

/**
 *
 * Modos de exibição input: Esquerda, Topo, Mascara, sem Label etc..
 *
 * @author desenvolvedor
 */
@InfoObjetoSB(fabricaVinculada = FabCompVIsualInputsLayout.class, tags = {"Layout Input"}, plural = "Layouts Input", descricao = "Devide o modo de exibição de um input")
public class ComponenteVisualInputLayoutSB extends ComponenteVisualBase {

    private String estiloTabela;
    private String estiloLinhas;
    private String estiloColunas;
    private String estiloLinhasLeitura;
    private String estiloColunasLeitura;

    @Override
    public void setFabricaDoComponente(ComoFabTipoComponenteVisual fabricaDoComponente) {
        try {
            super.setFabricaDoComponente(fabricaDoComponente);
            FabCompVIsualInputsLayout enumInput = (FabCompVIsualInputsLayout) getFabricaDoComponente();
            estiloTabela = enumInput.estiloTabela();
            estiloLinhas = enumInput.estiloLinhas();

            estiloColunas = enumInput.estiloColunas();
            estiloColunasLeitura = enumInput.estiloColunasLeitura();
            estiloLinhasLeitura = enumInput.estiloLinhasLeitura();
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro configurando propriedades do componente input" + fabricaDoComponente, t);
        }

    }

    public String getEstiloTabela() {
        return estiloTabela;
    }

    public String getEstiloLinhas() {
        return estiloLinhas;
    }

    public String getEstiloColunas() {
        return estiloColunas;
    }

    public String getEstiloLinhasLeitura() {
        return estiloLinhasLeitura;
    }

    public String getEstiloColunasLeitura() {
        return estiloColunasLeitura;
    }

    public String getEstiloColuna(boolean somenteLeitura) {
        if (somenteLeitura) {
            return estiloColunasLeitura;
        } else {
            return estiloColunas;
        }
    }

    public String getEstiloLinha(boolean somenteLeitura) {
        if (somenteLeitura) {
            return estiloLinhasLeitura;
        } else {
            return estiloLinhas;
        }
    }

}
