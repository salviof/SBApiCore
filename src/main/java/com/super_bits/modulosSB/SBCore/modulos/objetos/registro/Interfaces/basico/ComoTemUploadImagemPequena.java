/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import java.io.InputStream;

/**
 *
 * @author desenvolvedor
 */
public interface ComoTemUploadImagemPequena {

    /**
     * Método utilizado para fazer uploads de imagem de entidade tamanho pequeno
     *
     * @param pStream
     *
     * @return
     */
    public boolean uploadFotoTamanhoPequeno(InputStream pStream);
}
