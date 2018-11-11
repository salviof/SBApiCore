/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.objetoNativo.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfTipoComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfTipoRespostaComunicacao;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import java.util.List;
import org.coletivojava.fw.api.objetoNativo.ObjetoNativoCoreDoSistema;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreComunicacao;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreStringsCammelCaseSimples;

/**
 *
 * @author desenvolvedor
 */
@InfoObjetoSB(tags = {"tipo comunicação"}, plural = "Tipos de Comunicação")
public class TipoComunicacao extends ObjetoNativoCoreDoSistema implements ItfTipoComunicacao {

    public static final String MENSAGEM_PADRAO_COMUNICACAO = "Mensagem padrão (Falta Implementar)";

    @InfoCampo(tipo = FabTipoAtributoObjeto.AAA_NOME)
    private final String nome;
    @InfoCampo(tipo = FabTipoAtributoObjeto.ID)
    private final int id;
    private final FabTipoComunicacao fabTipoComunicacao;
    private final List<TipoRespostaComunicacao> respostasPossiveis;
    private String mensagemModeloPredefinida;
    private String assunto;

    public String gerarMensagemPadrao() {
        return MENSAGEM_PADRAO_COMUNICACAO;
    }

    public TipoComunicacao(FabTipoComunicacao pTipo) {
        fabTipoComunicacao = pTipo;
        respostasPossiveis = (List) UtilSBCoreComunicacao.getTipoRespostas(fabTipoComunicacao);
        nome = UtilSBCoreStringsCammelCaseSimples.getTextoByCammel(fabTipoComunicacao.toString());
        id = fabTipoComunicacao.ordinal() + 1;
    }

    @Override
    public FabTipoComunicacao getFabTipoComunicacao() {
        return fabTipoComunicacao;
    }

    @Override
    public String getMensagemModeloPredefinida() {
        if (mensagemModeloPredefinida == null || mensagemModeloPredefinida.isEmpty()) {
            return gerarMensagemPadrao();
        } else {
            return mensagemModeloPredefinida;
        }

    }

    /**
     *
     * @param mensagemPersonalizada
     */
    @Override
    public void setMensagemPersonalizada(String mensagemPersonalizada) {
        this.mensagemModeloPredefinida = mensagemPersonalizada;
    }

    @Override
    public List<ItfTipoRespostaComunicacao> getTipoRespostasPossiveis() {
        return (List) respostasPossiveis;
    }

    @Override
    public String getIcone() {
        switch (fabTipoComunicacao) {
            case NOTIFICAR:
                return "fa fa-info-circle ";

            case PERGUNTAR_SIM_OU_NAO:
                return "fa fa-question-circle-o";

            case PERGUNTAR_SIM_NAO_IGNORAR:
                return "fa fa-question-circle-o";

            case PERGUNTAR_SIM_NAO_MAIS_TARDE:
                return "fa fa-question-circle-o";

            case PERGUNTAR_SIM_NAO_CANCELAR:
                return "fa fa-question-circle-o";

            case SOLICITAR_AUTORIZACAO:
                return "fa fa-exclamation-triangle";

            case ENVIAR_INFORMACOES_CANCELAR:
                return "fa fa-exclamation-triangle";
            case PERSONALIZADA:
                return "fa fa-info-circle ";

            case CONFIRMAR_CANCELAR:
                return "fa fa-keyboard-o ";

            case OK_CANCELAR:
                return "fa fa-exclamation-triangle";
            default:
                return "fa fa-info-circle ";

        }

    }

    @Override
    public String getAssuntoModeloPredefinido() {
        if (assunto == null) {
            assunto = getMensagemModeloPredefinida();
        }
        return assunto;
    }

    @Override
    public void setNome(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int pID) {

    }

}
