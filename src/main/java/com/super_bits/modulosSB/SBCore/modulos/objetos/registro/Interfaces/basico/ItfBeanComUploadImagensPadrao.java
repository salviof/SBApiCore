/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import java.io.InputStream;

/**
 *
 * @author desenvolvedor
 */
public interface ItfBeanComUploadImagensPadrao
        extends ItfBeanComUploadImagemGrande,
        ItfBeanComUploadImagemPequena,
        ItfBeanComUploadImagemMedio {

    /**
     * Método utilizado para fazer uploads de imagens vinculado a este Objeto
     *
     * @param pStream
     * @return
     */
    public boolean uploadFotoTodosFormatos(InputStream pStream);

}
