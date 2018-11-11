/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import java.io.Serializable;

/**
 *
 * @author desenvolvedor
 */
public interface ItfBeanGenericoSomenteLeitura extends ItfBeanComImagemPequena, Serializable {

    /**
     *
     * Configura o Id da entidade apartir do nome.
     *
     * Utilizado para integrar registros de APIS diferentes, como Apis de CEPS
     *
     * O método retira os espaços e caracteres especiais, coloca tudo minusculo,
     * e cria um hash correspontende ao id
     *
     */
    public int configIDPeloNome();

    public String getNomeDoObjeto();

    public String getNomeDoObjetoPlural();

    /**
     *
     *
     *
     * @param nomeDaLista
     */
    public void adicionarItemNaLista(String nomeDaLista);

    /**
     *
     * @param pCampo
     * @return
     */
    public boolean isTemCampoAnotado(FabTipoAtributoObjeto pCampo);

}
