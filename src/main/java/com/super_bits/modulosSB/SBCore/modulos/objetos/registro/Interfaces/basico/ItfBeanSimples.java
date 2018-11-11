package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.Mensagens.ItfMensagem;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
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

}
