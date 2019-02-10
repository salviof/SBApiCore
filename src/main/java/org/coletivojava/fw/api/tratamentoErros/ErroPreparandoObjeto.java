/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.tratamentoErros;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimplesSomenteLeitura;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreReflexaoObjetoSimples;

/**
 *
 * @author desenvolvedor
 */
public class ErroPreparandoObjeto extends Throwable {

    public ErroPreparandoObjeto(ItfBeanSimplesSomenteLeitura pObjeto, String pMensagem) {
        super("Erro preparando " + UtilSBCoreReflexaoObjetoSimples.getNomeDoObjetoPorAnotacaoInfoClasse(pObjeto.getClass()) + pMensagem);
    }

    public ErroPreparandoObjeto(ItfBeanSimplesSomenteLeitura pObjeto, NoSuchMethodException t) {
        super("Erro preparando " + UtilSBCoreReflexaoObjetoSimples.getNomeDoObjetoPorAnotacaoInfoClasse(pObjeto.getClass()), t);
    }

    public ErroPreparandoObjeto(ItfBeanSimplesSomenteLeitura pObjeto, SecurityException t) {
        super("Erro preparando " + UtilSBCoreReflexaoObjetoSimples.getNomeDoObjetoPorAnotacaoInfoClasse(pObjeto.getClass()), t);
    }

    public ErroPreparandoObjeto(ItfBeanSimplesSomenteLeitura pObjeto, UnsupportedOperationException t) {
        super("Erro preparando " + UtilSBCoreReflexaoObjetoSimples.getNomeDoObjetoPorAnotacaoInfoClasse(pObjeto.getClass()), t);
    }

    public ErroPreparandoObjeto(ItfBeanSimplesSomenteLeitura pObjeto, Exception t) {
        super("Erro preparando " + UtilSBCoreReflexaoObjetoSimples.getNomeDoObjetoPorAnotacaoInfoClasse(pObjeto.getClass()), t);
    }

    public ErroPreparandoObjeto(ItfBeanSimplesSomenteLeitura pObjeto, Throwable t) {
        super("Erro preparando " + UtilSBCoreReflexaoObjetoSimples.getNomeDoObjetoPorAnotacaoInfoClasse(pObjeto.getClass()), t);
    }

}
