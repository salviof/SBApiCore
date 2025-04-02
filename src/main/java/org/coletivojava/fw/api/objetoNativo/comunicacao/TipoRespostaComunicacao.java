/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoRespostaComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfTipoRespostaComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;

import org.coletivojava.fw.api.objetoNativo.ObjetoNativoCoreDoSistema;
import org.coletivojava.fw.api.objetoNativo.controller.acao.AcaoBotaoNaoRequisitado;

/**
 *
 * @author desenvolvedor
 */
@InfoObjetoSB(tags = {"Resposta"}, plural = "respostas")
public class TipoRespostaComunicacao extends ObjetoNativoCoreDoSistema implements ItfTipoRespostaComunicacao {

    @InfoCampo(tipo = FabTipoAtributoObjeto.NOME)
    private String descricao;
    @InfoCampo(tipo = FabTipoAtributoObjeto.ID)
    private int id;
    private final FabTipoRespostaComunicacao fabricaTipoResposta;
    private ItfAcaoDoSistema botaoResposta;
    private String icone;
    private String cor;

    public TipoRespostaComunicacao(FabTipoRespostaComunicacao pTipo) {
        fabricaTipoResposta = pTipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public FabTipoRespostaComunicacao getFabricaTipoResposta() {
        return fabricaTipoResposta;
    }

    @Override
    public ItfAcaoDoSistema getBotaoResposta() {
        if (botaoResposta == null) {
            botaoResposta = new AcaoBotaoNaoRequisitado();
            botaoResposta.setNomeAcao(getDescricao());
            botaoResposta.setIconeAcao(getIcone());
        }
        return botaoResposta;
    }

    @Override
    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean isRespostasNegativa() {
        return ItfTipoRespostaComunicacao.super.isRespostasNegativa(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isRespostasPosiva() {
        return ItfTipoRespostaComunicacao.super.isRespostasPosiva(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNome(String pNome) {
        descricao = pNome;
    }

    @Override
    public String getNome() {
        return descricao;
    }

}
