/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico;

/**
 *
 * @author desenvolvedor
 */
public interface ItfBeanConteudoWebDinamico extends ItfBeanNormal {

    /**
     *
     * Uma imagem responsiva deve ocupar toda area horizontal da pagina
     *
     * @return
     */
    public default String getImagemResponsiva() {
        return getImgGrande();
    }

    /**
     * Imagem deve aparecer apenas no ambiente mobile,esta imagem sobrescreve a
     * imagem responsiva no ambiente mobile caso exista
     *
     * @return
     */
    public default String getImagemMobile() {
        return getImgPequena();
    }

    /**
     ** Imagem deve aparecer apenas no ambiente desktop,esta imagem sobrescreve
     * a imagem responsiva no ambiente dektop caso exista
     *
     * @return
     */
    public default String getImagemDesktop() {
        return getImgMedia();
    }

    public default String getConteudo() {
        return getDescritivo();
    }

    public default String getTitulo() {
        return getNome();
    }

    public String getVideoTrailer();

    public String getVideo();

    public default boolean isTemImagem() {
        return isTemImagemPequenaAdicionada() || isTemImagemGrandeAdicionada() || isTemImagemMedioAdicionada();
    }

    public default String getUrlImagemPrincipal() {
        if (isTemImagemGrandeAdicionada()) {
            return getImgGrande();
        }
        if (isTemImagemMedioAdicionada()) {
            return getImgMedia();
        }
        if (isTemImagemPequenaAdicionada()) {
            return getImgPequena();
        }
        return null;
    }

}
