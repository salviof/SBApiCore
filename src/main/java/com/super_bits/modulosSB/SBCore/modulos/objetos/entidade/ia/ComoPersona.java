/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.ia;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;
import java.util.List;

/**
 * Persona do CRM: amplia {@link ItfPersona} com as instruções compartilhadas e
 * o avatar.
 *
 * @author salvio
 */
public interface ComoPersona extends ComoEntidadeSimples {

    public List<? extends ComoInstrucaoIA> getInstrucoesCompartilhadas();

    public String getImagemAvatarPersona();

    public void setImagemAvatarPersona(String imagemAvatarPersona);

    public abstract String getDescricao();

    public abstract void setDescricao(String descricao);

    public abstract String getTonalidade();

    public abstract void setTonalidade(String tonalidade);

    public abstract String getObjetivo();

    public abstract void setObjetivo(String objetivo);

    public abstract String getRegrasResposta();

    public abstract void setRegrasResposta(String regrasResposta);

    public abstract int getLimitePalavras();

    public abstract void setLimitePalavras(int limitePalavras);

    public abstract String getContexto();

    public abstract void setContexto(String contexto);

    public abstract String getInstrucoesAdicionais();

    public abstract void setInstrucoesAdicionais(String instrucoesAdicionais);

    public abstract String getTipoPersona();

    public abstract void setTipoPersona(String tipoPersona);

    public abstract String getPublicoAlvo();

    public abstract void setPublicoAlvo(String publicoAlvo);

    public abstract String getIdioma();

    public abstract void setIdioma(String idioma);

    public abstract String getTipoRespostasPadrao();

    public abstract void setTipoRespostasPadrao(String tipoRespostasPadrao);

    public abstract String getPalavrasProibidas();

    public abstract void setPalavrasProibidas(String palavrasProibidas);

    public abstract boolean isAtivo();

    public abstract void setAtivo(boolean ativo);

    public abstract String getTextoModelFileIA();

    public abstract void setTextoModelFileIA(String textoModelFileIA);

}
