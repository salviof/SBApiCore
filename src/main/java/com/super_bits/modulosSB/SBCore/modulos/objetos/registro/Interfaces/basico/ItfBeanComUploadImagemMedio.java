/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import java.io.InputStream;

/**
 *
 * @author desenvolvedor
 */
public interface ItfBeanComUploadImagemMedio {

    /**
     * Método utilizado para fazer uploads de imagem de entidade tamanho medio
     *
     * @param pStream
     *
     * @return
     */
    public boolean uploadFotoTamanhoMedio(InputStream pStream);
}
