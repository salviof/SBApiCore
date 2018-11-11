/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.utilCoreBase;

/**
 *
 * @author desenvolvedor
 */
public class UtilSBCoreDiretoriosSimples {

    public enum TIPO_ESTRUTURA_DIRETORIO {
        WINDOWS,
        LINUX
    }

    /**
     *
     * Ex: /home/superBits/superBitsDevops numero de casas = 1 retornaria
     * /home/superBits/
     *
     * @param pDiretorio
     * @param numeroCasas
     * @return
     */
    public static String getDiretorioMenosXCasas(String pDiretorio, int numeroCasas) {
        //#todo compatibilidade com diretorios windows

        String[] partes = pDiretorio.split("/");
        if (partes.length < numeroCasas) {
            return pDiretorio;
        }
        String resultado = "";
        int i = 0;
        for (int j = 0; j < partes.length - numeroCasas; j++) {
            if (j > 0) {
                resultado += "/" + partes[j];

            } else {
                resultado += partes[j];
            }

        }
        return resultado;
    }

    /**
     * *(ele não certifica se o ultimo nome é um arquivo ou diretorio,
     * simplismente retorna a ultima parte do diretorio)
     *
     * A ideia do metodo é ser simples e rápido, pois um simples objeto File
     * atenderia a solução
     *
     * @param pDiretorio
     * @return O nome do arquivo sem o diretorio
     */
    public static String getNomeArquivo(String pDiretorio) {
        //#todo compatibilidade com diretorios windows

        String[] partes = pDiretorio.split("/");

        return partes[partes.length - 1];

    }

    /**
     * *(ele não certifica se o ultimo nome é um arquivo ou diretorio,
     * simplismente retorna a ultima parte do diretorio)
     *
     * @param pCaminhoCompleto
     * @return O diretorio do arquivo Sem o nome do arquivo
     */
    public static String getDiretorioArquivo(String pCaminhoCompleto) {
        //#todo compatibilidade com diretorios windows

        String[] partes = pCaminhoCompleto.split("/");
        String caminho = "";
        for (int i = 0; i < partes.length - 1; i++) {
            if (i < partes.length - 2) {
                caminho += partes[i] + "/";
            } else {
                caminho += partes[i];
            }
        }

        return caminho;

    }

}
