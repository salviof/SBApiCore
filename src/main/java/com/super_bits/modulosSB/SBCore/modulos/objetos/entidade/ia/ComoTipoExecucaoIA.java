/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.ia;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoTemIcone;

/**
 * Tipo de execução de IA; define a instrução principal e o formato de saída
 * esperado.
 *
 * @author salvio
 */
public interface ComoTipoExecucaoIA extends ComoEntidadeSimples, ComoTemIcone {

    public String getDescricao();

    public void setDescricao(String descricao);

    @Override
    public String getIcone();

    public void setIcone(String icone);

    public String getInstrucaoPrincipal();

    public void setInstrucaoPrincipal(String instrucaoPrincipal);

    public String getStructuredOutputConfig();

    public void setStructuredOutputConfig(String structuredOutputConfig);

    public String getOutputConfigOpenIA();

    public void setOutputConfigOpenIA(String outputConfigOpenIA);

    public String getOutputConfigCpilot();

    public void setOutputConfigCpilot(String outputConfigCpilot);

    public String getOutputConfigDeepSeek();

    public void setOutputConfigDeepSeek(String outputConfigDeepSeek);

    public boolean isHabilitarPLaceHolders();

    public void setHabilitarPLaceHolders(boolean habilitarPLaceHolders);

}
