package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoGerenciarEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.ItfMensagem;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import java.io.File;
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

    public default boolean isTemImagemPequenaAdicionada() {
        return new File(SBCore.getCentralDeArquivos().getEndrLocalImagem(this, FabTipoAtributoObjeto.IMG_PEQUENA)).exists();
    }

    public String getSlugIdentificador();

}
