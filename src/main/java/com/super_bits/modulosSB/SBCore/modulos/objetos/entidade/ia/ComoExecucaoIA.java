/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.ia;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoUsuario;
import java.util.Date;
import java.util.List;

/**
 * Registro de uma chamada à IA: quem executou, com qual persona e instruções, o
 * model file enviado e o consumo de tokens.
 *
 * @author salvio
 */
public interface ComoExecucaoIA extends ComoEntidadeSimples {

    public String getTipoEntidade();

    public Date getDataHora();

    public void setDataHora(Date dataHora);

    public ComoUsuario getUsuario();

    public ComoTipoExecucaoIA getTipoExecucao();

    public ComoPersona getPersona();

    public List<? extends ComoInstrucaoIA> getInstrucoes();

    public String getEntidadeAlvoNome();

    public void setEntidadeAlvoNome(String entidadeAlvoNome);

    public String getEntidadeAlvoCodigo();

    public void setEntidadeAlvoCodigo(String entidadeAlvoCodigo);

    public ComoEntidadeSimples getEntidadeVinculada();

    public void setEntidadeVinculada(ComoEntidadeSimples entidadeVinculada);

    public String getNovaMensagem();

    public void setNovaMensagem(String novaMensagem);

    public String getNovaResposta();

    public void setNovaResposta(String novaResposta);

    public String getDialogoJson();

    public void setDialogoJson(String dialogoJson);

    public String getSystemPromptMD();

    public void setSystemPromptMD(String systemPromptMD);

    public long getTokensInput();

    public void setTokensInput(long tokensInput);

    public long getTokensOutput();

    public void setTokensOutput(long tokensOutput);

    public double getValorGasto();

    public void setValorGasto(double valorGasto);

    public String getHashUltimaExecucaoSucesso();

    public void setHashUltimaExecucaoSucesso(String hashUltimaExecucaoSucesso);

}
