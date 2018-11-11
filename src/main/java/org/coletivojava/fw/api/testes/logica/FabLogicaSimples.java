/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.api.testes.logica;

/**
 *
 * @author desenvolvedor
 */
public enum FabLogicaSimples {

    NAO_NULO,
    POSITIVO,
    NEGATIVO;

    public boolean executarLogica(Object pValor) {

        switch (this) {

            case NAO_NULO:
                return pValor != null;

            case POSITIVO:
                try {
                    return (Boolean) pValor;
                } catch (Throwable t) {
                    return false;
                }

            case NEGATIVO:
                try {
                    return !(Boolean) pValor;
                } catch (Throwable t) {
                    return false;
                }

            default:
                throw new AssertionError(this.name());

        }
    }

}
