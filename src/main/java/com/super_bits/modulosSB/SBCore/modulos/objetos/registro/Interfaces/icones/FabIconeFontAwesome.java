/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones;

/**
 *
 * @author salvioF
 */
public enum FabIconeFontAwesome implements ItfFabricaIcone {
    ICONE_PERSONALIZADO,
    REG_NOVO, REG_EDITAR, REG_VALIDAR, REG_REMOVER,
    REG_ATUALIZAR, REG_ENVIAR, REG_BAIXAR, REG_GERENCIAR, REG_VISUALIZAR, REG_SALVAR, REG_PESQUISA_AVANCADA,
    REG_AGRUPAR_REGISTROS, REG_LISTAR, REG_PROXIMO, REG_ANTERIOR, REG_PESQUISAR, REG_SELECIONAR_ITEM,
    ESCRITORIO_DOCUMENTO_TEXTO,
    PESSOA_CORACAO,
    COMERCIO_PRESENTE,
    /**
     * Icone BitiCoins
     */
    COMERCIO_BITCOINS,
    COMERCIO_APERTO_DE_MAO,
    TECNOLOGIA_BATERIA,
    SISTEMA_HOME,
    SISTEMA_ACESSO_NEGADO,
    SISTEMA_USUARIO,
    SISTEMA_CARTAO_DE_ACESSO,
    SISTEMA_ENGRENAGEM,
    COMUNICACAO_OK,
    COMNUNICACAO_NAO_ESTA_OK,
    COMUNICACAO_AVIAO_DE_PAPEL;

    @Override
    public itfIcone getRegistro() {
        return getIcone();
    }

    @Override
    public itfIcone getIcone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
