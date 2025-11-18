package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.ItfMensagem;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import java.util.ArrayList;
import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

public interface ComoEntidadeSimples extends ComoEntidadeSimplesSomenteLeitura,
        ComoTemIDUnico,
        ComoDominio,
        ComoTemUploadImagensPadrao {

    public String getNomeUnicoSlug();

    public boolean validar();

    public void setNome(String pNome);

    public List<ItfMensagem> validarComMensagens();

    /**
     *
     * @param prcampo
     *
     * @param pNomeArquivo
     * @param pStream
     * @return
     */
    public boolean uploadArquivoDeEntidade(ItfCampoInstanciado prcampo, byte[] pStream, String pNomeArquivo);

    public boolean isTemImagemPequenaAdicionada();

    public String getSlugIdentificador();

    public default List<ComoAcaoDoSistema> getAcoesDisponiveis() {
        if (this instanceof ComoTemStatus) {

            return ((ComoTemStatus) this).getAcoesDoStatus();
        }

        return new ArrayList();
    }

}
