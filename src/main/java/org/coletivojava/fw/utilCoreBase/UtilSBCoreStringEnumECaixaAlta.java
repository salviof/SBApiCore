/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.utilCoreBase;

/**
 *
 * Utilitários para interpretar nomes em caixa alta, principalemte de nomeação
 * de enuns que seguem as boas práticas descritas em
 *
 * http://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 *
 *
 *
 * @author salvioF
 */
public class UtilSBCoreStringEnumECaixaAlta {

    /**
     *
     * NOME_LEGA_DO_MEU_ENUM_TESTE retornaria a string teste
     *
     * @return A ultima parte do enum
     */
    public static String getUltimaParteNomeEnumEmMinusculo(Enum valor) {
        String[] partes = valor.toString().split("_");
        if (partes.length > 1) {
            return partes[partes.length - 1].toLowerCase();
        } else {
            return valor.toString().toLowerCase();
        }

    }

    /**
     *
     * NOME_LEGA_DO_MEU_ENUM_TESTE retornaria a string teste
     *
     * @return A ultima parte do enum
     */
    public static String getUltimaParteNomeEnumPrimeiraEmMaiusculo(Enum valor) {
        String[] partes = valor.toString().split("_");
        if (partes.length > 1) {
            return UtilSBCoreStringsMaiuculoMinusculoSimples.getPrimeiraLetraMaiusculo(partes[partes.length - 1]);
        } else {
            return UtilSBCoreStringsMaiuculoMinusculoSimples.getPrimeiraLetraMaiusculo(valor.toString());
        }
    }

    public static String getFrasePorEnumIniciaisMaiusculas(Enum valor) {
        try {
            String[] partes = valor.toString().split("_");
            StringBuilder frase = new StringBuilder();
            int i = 0;
            for (String p : partes) {
                frase.append(UtilSBCoreStringsMaiuculoMinusculoSimples.getPrimeiraLetraMaiusculo(p));
                if (!(i >= partes.length - 1)) {
                    frase.append(" ");
                }
                i++;
            }
            return frase.toString();
        } catch (Throwable t) {
            return valor.toString();
        }
    }

    /**
     *
     * @param pEnumCaixaAlta "MEU_EMUM_CAIXA_ALTA"
     * @return MeuEnumCaixaAlta
     */
    public static String getCamelCaseDoEnumPrimeiraLetraMaiusucula(Enum pEnumCaixaAlta) {
        try {
            String[] partes = pEnumCaixaAlta.toString().split("_");
            StringBuilder palavraCammelCase = new StringBuilder();
            int i = 0;
            for (String p : partes) {
                palavraCammelCase.append(UtilSBCoreStringsMaiuculoMinusculoSimples.getPrimeiraLetraMaiusculo(p));
                i++;
            }
            return palavraCammelCase.toString();
        } catch (Throwable t) {
            return pEnumCaixaAlta.toString();
        }
    }

}
