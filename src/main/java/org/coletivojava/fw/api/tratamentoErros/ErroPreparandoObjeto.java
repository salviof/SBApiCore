/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.tratamentoErros;

import org.coletivojava.fw.utilCoreBase.UtilCRCReflexaoObjetoSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimplesSomenteLeitura;

/**
 *
 * @author desenvolvedor
 */
public class ErroPreparandoObjeto extends Throwable {

    public ErroPreparandoObjeto(ComoEntidadeSimplesSomenteLeitura pObjeto, String pMensagem) {
        super("Erro preparando " + UtilCRCReflexaoObjetoSimples.getNomeDoObjetoPorAnotacaoInfoClasse(pObjeto.getClass()) + pMensagem);
    }

    public ErroPreparandoObjeto(ComoEntidadeSimplesSomenteLeitura pObjeto, NoSuchMethodException t) {
        super("Erro preparando " + UtilCRCReflexaoObjetoSimples.getNomeDoObjetoPorAnotacaoInfoClasse(pObjeto.getClass()), t);
    }

    public ErroPreparandoObjeto(ComoEntidadeSimplesSomenteLeitura pObjeto, SecurityException t) {
        super("Erro preparando " + UtilCRCReflexaoObjetoSimples.getNomeDoObjetoPorAnotacaoInfoClasse(pObjeto.getClass()), t);
    }

    public ErroPreparandoObjeto(ComoEntidadeSimplesSomenteLeitura pObjeto, UnsupportedOperationException t) {
        super("Erro preparando " + UtilCRCReflexaoObjetoSimples.getNomeDoObjetoPorAnotacaoInfoClasse(pObjeto.getClass()), t);
    }

    public ErroPreparandoObjeto(ComoEntidadeSimplesSomenteLeitura pObjeto, Exception t) {
        super("Erro preparando " + UtilCRCReflexaoObjetoSimples.getNomeDoObjetoPorAnotacaoInfoClasse(pObjeto.getClass()), t);
    }

    public ErroPreparandoObjeto(ComoEntidadeSimplesSomenteLeitura pObjeto, Throwable t) {
        super("Erro preparando " + UtilCRCReflexaoObjetoSimples.getNomeDoObjetoPorAnotacaoInfoClasse(pObjeto.getClass()), t);
    }

}
