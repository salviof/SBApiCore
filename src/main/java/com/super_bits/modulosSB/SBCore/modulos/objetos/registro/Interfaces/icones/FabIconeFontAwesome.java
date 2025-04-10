/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones;

import org.coletivojava.fw.api.objetoNativo.view.icone.IconeSistema;

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

        IconeSistema icone = new IconeSistema();
        icone.setId((long) this.name().hashCode());
        switch (this) {
            case ICONE_PERSONALIZADO:
                icone.setNome("Icone indefinido");
                break;
            case REG_NOVO:
                icone.setNome("Registro- Novo");
                icone.setTagHtml("fa fa-plus");
                break;
            case REG_EDITAR:
                icone.setNome("Registro- Editar");
                icone.setTagHtml("fa fa-edit");
                break;
            case REG_ATUALIZAR:
                icone.setNome("Registro- Atualizar");
                icone.setTagHtml("fa fa-refresh");
                break;
            case REG_ENVIAR:
                icone.setNome("Registro- Enviar");
                icone.setTagHtml("fa fa-upload");
                break;
            case REG_BAIXAR:
                icone.setTagHtml("fa fa-download");
                icone.setNome("Registro - Baixar");
                break;
            case REG_GERENCIAR:
                icone.setNome("Registro - Gerenciar Entidade");
                icone.setTagHtml("fa fa-gear");
                break;
            case REG_VISUALIZAR:
                icone.setNome("REgistro - visualizar");
                icone.setTagHtml("fa fa-eye");
                break;
            case ESCRITORIO_DOCUMENTO_TEXTO:
                icone.setTagHtml("fa fa-file-word-o");
                icone.setNome("Escritorio documento texto");

                break;
            case PESSOA_CORACAO:
                icone.setTagHtml("fa fa-heart");
                icone.setNome("Pessoa coração");
                break;
            case COMERCIO_PRESENTE:
                icone.setTagHtml("fa fa-gift");
                icone.setNome("Comercio - presente");
                break;
            case COMERCIO_BITCOINS:
                icone.setNome("Coemrcio- bitcoins");
                icone.setTagHtml("fa fa-btc");
                break;
            case TECNOLOGIA_BATERIA:
                icone.setTagHtml("fa fa-battery-three-quarters");
                icone.setNome("Tecnologia ");
                break;
            case REG_SALVAR:
                icone.setNome("Registro - salvar");
                icone.setTagHtml("fa fa-save");
                break;
            case REG_AGRUPAR_REGISTROS:
                icone.setNome("Registro -Agrupar");
                icone.setTagHtml("fa fa-th-large");
                break;
            case SISTEMA_HOME:
                icone.setNome("Sistema Home");
                icone.setTagHtml("fa fa-home");
                break;
            case SISTEMA_ACESSO_NEGADO:
                icone.setNome("Sistema - Acesso Negado");
                icone.setTagHtml("fa fa-address-card-o   <i class=\"fa fa-ban fa-stack-2x text-danger\"></i>");
                break;
            case SISTEMA_CARTAO_DE_ACESSO:
                icone.setNome("Sistema - Cartão de Acesso");
                icone.setTagHtml("fa fa-address-card-o");
                break;
            case COMUNICACAO_OK:
                icone.setNome("Ok");
                icone.setTagHtml("fa fa-thumbs-o-up");
                break;
            case COMNUNICACAO_NAO_ESTA_OK:
                icone.setNome("Não OK");
                icone.setNome("fa fa-thumbs-o-down");
                break;
            case REG_LISTAR:
                icone.setNome("Registro- listar");
                icone.setTagHtml("fa fa-list-ol");
                break;
            case REG_VALIDAR:
                icone.setNome("Registro - Validar");
                icone.setTagHtml("fa fa-check");
                break;
            case SISTEMA_USUARIO:
                icone.setNome("Sistema- Usuário");
                icone.setTagHtml("fa fa-user");
                break;
            case COMUNICACAO_AVIAO_DE_PAPEL:
                icone.setNome("Comunicacao - E-mail");
                icone.setTagHtml("fa fa-paper-plane-o");
                break;

            case REG_PROXIMO:

                icone.setNome("Reg_Proximo");
                icone.setTagHtml("fa fa-arrow-right");

                break;
            case REG_ANTERIOR:

                icone.setNome("Reg_Voltar");
                icone.setTagHtml("fa fa-arrow-left");

                break;

            case REG_PESQUISAR:
                icone.setNome("Registro - Pequisar");
                icone.setTagHtml("fa fa-search");

                break;
            case SISTEMA_ENGRENAGEM:
                icone.setNome("Engrenagem");
                icone.setTagHtml("fa fa-cogs");
                break;
            case COMERCIO_APERTO_DE_MAO:
                icone.setNome("Comercio - Aperto de mão");
                icone.setTagHtml("fa fa-handshake-o");
                break;
            case REG_REMOVER:
                icone.setNome("Reg_Remover");
                icone.setTagHtml("fa fa-minus");
                break;
            case REG_PESQUISA_AVANCADA:
                icone.setNome("Reg_Pesquisa");
                icone.setTagHtml("fa fa-search-plus");
                break;
            case REG_SELECIONAR_ITEM:
                icone.setNome("Reg_SelecionarItem");
                icone.setTagHtml("fa fa-hand-pointer-o");

                break;
            default:

        }
        return icone;
    }

}
