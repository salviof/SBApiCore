package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.ItfMensagem;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import java.util.ArrayList;
import java.util.List;

public interface ItfBeanSimples extends ItfBeanSimplesSomenteLeitura,
        ItfBeanIDUnico,
        ItfBeanInstanciado,
        ItfBeanComUploadImagensPadrao {

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

    public default List<ItfAcaoDoSistema> getAcoesDisponiveis() {
        if (this instanceof ItfBeanComStatus) {
            return ((ItfBeanComStatus) this).getAcoesDoStatus();
        }

        return new ArrayList();
    }

}
