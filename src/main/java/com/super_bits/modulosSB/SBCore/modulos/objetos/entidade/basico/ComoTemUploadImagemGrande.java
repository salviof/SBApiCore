/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico;

import java.io.InputStream;

/**
 *
 * @author desenvolvedor
 */
public interface ComoTemUploadImagemGrande {

    /**
     * Método utilizado para fazer uploads de imagem de entidade tamanho Grande
     *
     * @param pStream
     *
     * @return
     */
    public boolean uploadFotoTamanhoGrande(InputStream pStream);

}
