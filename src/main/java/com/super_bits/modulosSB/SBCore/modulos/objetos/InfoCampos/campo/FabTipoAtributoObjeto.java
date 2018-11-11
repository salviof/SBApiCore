/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfFabTipoComponenteVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabColunasTela;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualEndereco;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualFormularioDeAcao;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualGrupoCampo;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualGruposCampo;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualInputs;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualSeletorItem;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualSeletorItens;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualSubItens;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabcompVisualEnums;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;

/**
 *
 * @author sfurbino
 */
public enum FabTipoAtributoObjeto implements ItfFabrica {

    /**
     * Indica o campo que Descreve o Item em uma ou duas palavras. --> Esta
     * anotação é obrigatória em um Item Simples
     */
    AAA_NOME,
    /**
     * Indica um nome completo do Item
     */
    AAA_NOME_LONGO,
    /**
     * Indica um campo que armazena um caminho local para uma imagem Pequena
     */
    IMG_PEQUENA,
    /**
     * Indica um campo que armazena um caminho local para uma imagem média
     */
    IMG_MEDIA,
    /**
     * Indica um campo que armazena um caminho local para uma imagem grande
     */
    IMG_GRANDE,
    /**
     * Indica um Descritivo do Item (uma explicação mais detalhada do que ele
     * signigica), para descritivo de uma ou duas palavras utiliza o AAA_NOME
     */
    AAA_DESCRITIVO,
    /**
     * Indica o ID do Item, pode ser substituído pelo @Id do javax.persistence
     */
    ID,
    /**
     * Indica uma quantidade
     */
    QUANTIDADE,
    /**
     * Indica a latitude para posicionamento geográfico no google maps.
     */
    LATITUDE,
    /**
     * Indica a longitude para posiscionamento geografico no google maps
     */
    Longitude,
    /**
     * Indica um local no mapa
     */
    LC_LOGRADOURO,
    /**
     * Indica um campo de CEP
     */
    LCCEP,
    /**
     * Indica um Bairro
     */
    LC_BAIRRO,
    /**
     * Indica uma cidade
     */
    LC_CIDADE,
    /**
     * Localidade representa um agrupamento de cidades
     */
    LC_LOCALIDADE,
    /**
     * Indica um estado, unidade Federativa (Item que extenda
     * ItfUnidadeFederativa)
     */
    LC_UNIDADE_FEDERATIVA,
    /**
     * Indica um campo de senha
     */
    SENHA,
    /**
     * Indica um campo de senha com segurança máxima
     */
    SENHA_SEGURANCA_MAXIMA,
    /**
     * Indica um complemento de endereço
     */
    LC_COMPLEMENTO_E_NUMERO,
    LC_COMPLEMENTO,
    /**
     *
     */
    @Deprecated
    LC_CAMPO_ABERTO,
    /**
     * Indica um Código HTML
     */
    HTML,
    HTML_TEMPLATE,
    /**
     * Indica um valor para utilizar em gráficos
     */
    CHART_VALOR,
    /**
     * Indica um Label para gráficos
     */
    CHART_LABEL,
    /**
     * Indca uma categoria para gráficos
     */
    CHART_CATEGORIA,
    /**
     * Indica a exibição de um calendário
     */
    @Deprecated
    CALENDARIO,
    /**
     * Indica um timeStamp (no caso de Entidades Persistidas, o @Temporal deve
     * ser configurado)
     */
    DATAHORA,
    /**
     * Indica uma data (no caso de Entidades Persistidas, o @Temporal deve ser
     * configurado)
     */
    DATA,
    /**
     * Indca uma Hora (no caso de Entidades Persistidas, o @Temporal deve ser
     * configurado)
     */
    HORA,
    /**
     * Indica um telefone fixo nacional ex:(11 3224-0000)
     */
    TELEFONE_FIXO_NACIONAL,
    /**
     * Indica um telefone fixo internacional ex: (55 11 3224-0000)
     */
    TELEFONE_FIXO_INTERNACIONAL,
    /**
     * Indica um telefone celular, exemplo: 11 97777-7777
     */
    TELEFONE_CELULAR,
    /**
     * Indica um telefone Generico (aceita qualquer numero)
     */
    TELEFONE_GENERICO,
    /**
     * Indica uma moeda brasileira
     */
    MOEDA_REAL,
    /**
     * Indica dollar
     */
    MOEDA_DOLAR,
    /**
     * Indica uma porcentagem
     */
    PERCENTUAL,
    /**
     * TipoAtributoObjetoSB que apresenta um conjunto de Opçoes a serem
     * selecionadas
     */
    OBJETO_DE_UMA_LISTA,
    /**
     *
     */
    ENUM_FABRICA,
    /**
     * TipoAtributoObjetoSB que apresenta um conjunto de Opçoes a serem
     * adicionadas em uma lista
     */
    LISTA_OBJETOS_PUBLICOS,
    LISTA_OBJETOS_PARTICULARES,
    /**
     * Texto simples
     */
    TEXTO_SIMPLES,
    /**
     * Verdadeiro ou falso
     */
    VERDADEIRO_FALSO,
    /**
     * Indica uma cor em hexadecimal
     */
    COR,
    /**
     * Indica um e-mail
     */
    EMAIL,
    /**
     * Indica um site
     */
    SITE,
    /**
     * Indica uma url (Site com Http:// ou Https://)
     */
    URL,
    /**
     * Indica um responsável por uma empresa
     */
    RESPONSAVEL,
    /**
     * Indica um nome Completo
     */
    NOME_COMPLETO,
    /**
     * Indica um Cadastro Nacional de Pessoa Juridica
     */
    CNPJ,
    /**
     * Indica um cadastro de pessoa Física
     */
    CPF,
    /**
     * Indica ainscrição estadual de uma empresa
     */
    INSCRICAO_ESTADUAL,
    /**
     * Indica a inscrição municipal de uma empresa
     */
    INSCRIACAO_MUNICIPAL,
    /**
     * Indica um registro de Timestamp com a data da ultima alteração (caso o
     * registro seja persistido deve acompanhar a anotação @Persistence do
     * javax.persistence)
     */
    REG_DATAALTERACAO,
    /**
     * Indica um registro de Timestamp com a data de cadastro do registro
     * registro seja persistido deve acompanhar a anotação @Persistence do
     * javax.persistence)
     */
    REG_DATAINSERCAO,
    /**
     * Indica o usuário que realizou a ultima alteração neste registro
     */
    REG_USUARIO_ALTERACAO,
    /**
     * Indica o usuário que realizou o cadastro deste regsitro
     */
    REG_USUARIO_INSERCAO,
    /**
     * Boolean indicando se a Entidade está ativa ou desativada
     */
    REG_ATIVO_INATIVO,
    /**
     * Indica um código de barras
     */
    CODIGO_DE_BARRAS,
    ICONE,
    SEGURANCA_ATIVA,
    /**
     * Indica um arquivo da entidade
     */
    ARQUIVO_DE_ENTIDADE,
    /**
     * Indica um campo de Localizacao (Que implementa ItfLocalizacao)
     */
    LC_LOCALIZACAO,
    /**
     * TipoAtributoObjetoSB especial, que indica uma separação
     */
    CAMPO_SEPARADOR,
    GRUPO_CAMPO,
    GRUPOS_DE_CAMPO,
    FORMULARIO_DE_ACAO,
    TIPO_PADRAO_POR_DECLARACAO,
    STATUS_ENUM;

    public void configuraPropriedadesBasicas(ItfTipoAtributoSB sbCampo) {

        sbCampo.setNome(this.toString().replace("_", " ").toLowerCase());
        switch (this) {
            case TEXTO_SIMPLES:
                break;
            case IMG_PEQUENA:
                break;
            case IMG_MEDIA:
                break;
            case IMG_GRANDE:
                break;
            case AAA_NOME:
                break;
            case AAA_NOME_LONGO:
                break;
            case AAA_DESCRITIVO:
                break;
            case ID:
                break;
            case LATITUDE:
                sbCampo.setDescricao("Representa a posição geografica de longitude");
                sbCampo.setFraseValidacao("A latitude deve conter um valor numérico");
                break;
            case Longitude:
                sbCampo.setDescricao("Representa a posição geografica de longitude");
                break;
            case LC_LOGRADOURO:
                break;
            case LCCEP:
                sbCampo.setMascara("#####-###");
                sbCampo.setValorMaximo(9);
                break;
            case LC_BAIRRO:
                break;
            case LC_CIDADE:
                break;

            case LC_COMPLEMENTO_E_NUMERO:
                sbCampo.setLabelPadrao("Núm. e Complemento");

                break;
            case LC_COMPLEMENTO:
                sbCampo.setLabelPadrao("Complemento");
            case HTML:
                break;
            case CHART_VALOR:
                break;
            case CHART_LABEL:
                break;
            case CHART_CATEGORIA:
                break;
            case CALENDARIO:
                // tipo primitivo Data mascara data
                //  sbCampo.setValidacaoRegex("^(((0[1-9]|[12]\\d|3[01])\\/(0[13578]|1[02])\\/((19|[2-9]\\d)\\d{2}))|((0[1-9]|[12]\\d|30)\\/(0[13456789]|1[012])\\/((19|[2-9]\\d)\\d{2}))|((0[1-9]|1\\d|2[0-8])\\/02\\/((19|[2-9]\\d)\\d{2}))|(29\\/02\\/((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$");
                sbCampo.setMascara("##/##/####");
                break;
            case TELEFONE_FIXO_NACIONAL:
                sbCampo.setLabelPadrao("Tel.");
                sbCampo.setValorMaximo(15);
                sbCampo.setValidacaoRegex("^$|^([(]?([0-9][0-9])[)]?[- | ]?)([2-6])([0-9]{3})([- | ]?)([0-9]{4})$"); // NOVO REGEX FIXO NACIONAL ^([(]?([0-9][0-9])[)]?[- | ]?)([2-9])([0-9]{3})([- | ]?)([0-9]{4})$
                sbCampo.setMascara("(##) ####-####");
                break;
            case MOEDA_REAL:
                // implementar: separadores, numero de casas decimais Sigla da moeda
                sbCampo.setSeparadorDecimal(',');
                sbCampo.setSeparadorMilhar('.');
                sbCampo.setNumeroDeCasasDecimais(2);
                break;
            case OBJETO_DE_UMA_LISTA:
                break;
            case LISTA_OBJETOS_PUBLICOS:
            case LISTA_OBJETOS_PARTICULARES:
                break;
            case COR: //regex
                sbCampo.setLabelPadrao("Cor");
                sbCampo.setValidacaoRegex("^$|^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$");
                break;
            case EMAIL:
                sbCampo.setLabelPadrao("E-mail");
                sbCampo.setValorMinimo(6);
                sbCampo.setValidacaoRegex("^$|^([\\w\\.\\-]+)@([\\w\\-]+)((\\.(\\w){2,3})+)$");
                break;
            case SITE:
                // REGEX
                sbCampo.setLabelPadrao("Site");
                //sbCampo.setValidacaoRegex("^((www.|ftp.)?)([\\w]{1,20}.)(com.|net)(br)?$");
                break;
            case URL:
                // regex
                sbCampo.setLabelPadrao("URL");
                sbCampo.setValidacaoRegex("^$|https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~#?&\\/=]*)");
                break;
            case RESPONSAVEL:
                //regex de nome completo
                sbCampo.setValorMinimo(8);
                //sbCampo.setValidacaoRegex("^[a-z A-Z ÉÚÍÓÁÈÙÌÒÀÕÃÑÊÛÎÔÂËYÜÏÖÄ][a-zéúíóáèùìòàõãñêûîôâëyüïöä]+( [a-z A-Z ÉÚÍÓÁÈÙÌÒÀÕÃÑÊÛÎÔÂËYÜÏÖÄ][a-zéúíóáèùìòàõãñêûîôâëyüïöä]+)+$");
                break;
            case CNPJ:
                // mascara (tipo primitivo numeral)
                sbCampo.setMascara("##.###.###/####-##");

                sbCampo.setValorMaximo(18);
                break;
            case CPF:
                //mascara(tipo primitivo numeral)
                sbCampo.setMascara("###.###.###-##");

                sbCampo.setValorMaximo(14);
                break;
            case INSCRICAO_ESTADUAL:
                // mascara (tipo primitivo numeral)
                sbCampo.setValorMaximo(15);

                break;
            case INSCRIACAO_MUNICIPAL:
                // mascara (tipo primitivo numeral)
                sbCampo.setValorMaximo(15);

                break;

            case LC_CAMPO_ABERTO:
                break;
            case QUANTIDADE:
                sbCampo.setNumeroDeCasasDecimais(0);
                // define tipo primitivo numerico

                break;
            case SENHA:
                // tamanho minimo 3
                sbCampo.setValorMinimo(3);
                break;
            case PERCENTUAL:
                sbCampo.setNumeroDeCasasDecimais(2);
                break;

            case TELEFONE_FIXO_INTERNACIONAL:
                // MAscara e Regex
                sbCampo.setValidacaoRegex("^$|^((55)\\s?)(\\(([1-9][0-9])\\)\\s?)(((9\\d|[2-9])\\d{3})\\-(\\d{4}))$");
                sbCampo.setMascara("##(##)a####-####");
                break;
            case TELEFONE_CELULAR:
                // MAscara e Regex
                sbCampo.setLabelPadrao("Cel.");
                // sbCampo.setValidacaoRegex("^([(]?([0-9][0-9])[)]?[- | ]?[9]?)([6-9])([0-9]{3})([- | ]?)([0-9]{4})$"); // NOVO REGEX CELULAR ^([(]?([0-9][0-9])[)]?[- | ]?[9]?)([6-9])([0-9]{3})([- | ]?)([0-9]{4})$
                sbCampo.setMascara("(##) #####-####");
                break;
            case REG_DATAALTERACAO:
                // tipo primitivo Data mascara data
                sbCampo.setLabelPadrao("Dt. Alteração");
                sbCampo.setValidacaoRegex("^$|^(((0[1-9]|[12]\\d|3[01])\\/(0[13578]|1[02])\\/((19|[2-9]\\d)\\d{2}))|((0[1-9]|[12]\\d|30)\\/(0[13456789]|1[012])\\/((19|[2-9]\\d)\\d{2}))|((0[1-9]|1\\d|2[0-8])\\/02\\/((19|[2-9]\\d)\\d{2}))|(29\\/02\\/((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$");
                sbCampo.setMascara("##/##/####");
                break;
            case REG_DATAINSERCAO:
                // tipo primitivo Data mascara data
                sbCampo.setLabelPadrao("Dt. Inclusão");
                sbCampo.setValidacaoRegex("^$|^(((0[1-9]|[12]\\d|3[01])\\/(0[13578]|1[02])\\/((19|[2-9]\\d)\\d{2}))|((0[1-9]|[12]\\d|30)\\/(0[13456789]|1[012])\\/((19|[2-9]\\d)\\d{2}))|((0[1-9]|1\\d|2[0-8])\\/02\\/((19|[2-9]\\d)\\d{2}))|(29\\/02\\/((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$");
                sbCampo.setMascara("##/##/####");
                break;
            case REG_USUARIO_ALTERACAO:
                sbCampo.setLabelPadrao("Usr. Alteração");
                break;
            case REG_USUARIO_INSERCAO:
                sbCampo.setLabelPadrao("Usr. Inserção");
                break;
            case LC_UNIDADE_FEDERATIVA:
                sbCampo.setLabelPadrao("UF");
                break;
            case MOEDA_DOLAR:
                //implementar: separadores, numero de casas decimais Sigla da moeda
                sbCampo.setSeparadorDecimal('.');
                sbCampo.setSeparadorMilhar(',');
                sbCampo.setNumeroDeCasasDecimais(2);
                break;
            case VERDADEIRO_FALSO:
                sbCampo.setSomenteLeitura(true);
                break;
            case SENHA_SEGURANCA_MAXIMA:
                // minimo 8
                sbCampo.setValorMinimo(8);
                break;
            case NOME_COMPLETO:
                // regex
                sbCampo.setValidacaoRegex("^$|^[a-z A-Z ÉÚÍÓÁÈÙÌÒÀÕÃÑÊÛÎÔÂËYÜÏÖÄ][a-zéúíóáèùìòàõãñêûîôâëyüïöä]+( [a-z A-Z ÉÚÍÓÁÈÙÌÒÀÕÃÑÊÛÎÔÂËYÜÏÖÄ][a-zéúíóáèùìòàõãñêûîôâëyüïöä]+)+$");
                sbCampo.setValorMinimo(8);
                break;
            case TELEFONE_GENERICO:
                //sbCampo.setValidacaoRegex("^(?:(?:\\+|00)?(55)\\s?)?(?:\\(?([1-9][0-9])\\)?\\s?)?(?:((?:9\\d|[2-9])\\d{3})\\-?(\\d{4}))$");
                sbCampo.setMascara("*##(##)#####-####");
                break;
            case CODIGO_DE_BARRAS:
                break;
            case DATAHORA:
                break;
            case DATA:
                break;
            case HORA:
                break;
            case REG_ATIVO_INATIVO:
                sbCampo.setLabelPadrao("Ativo");
                break;
            case ICONE:
                break;

            case SEGURANCA_ATIVA:
                break;
            case ARQUIVO_DE_ENTIDADE:
                sbCampo.setLabelPadrao("Arquivo");

                break;
            case LC_LOCALIZACAO:
                break;
            case CAMPO_SEPARADOR:
                break;
            case LC_LOCALIDADE:
                sbCampo.setLabelPadrao("Localidade");
                break;
            case HTML_TEMPLATE:
                break;
            case ENUM_FABRICA:
                break;
            case GRUPO_CAMPO:
                break;
            case GRUPOS_DE_CAMPO:
                break;
            case FORMULARIO_DE_ACAO:
                break;
            case TIPO_PADRAO_POR_DECLARACAO:

                break;

            default:
                break;
        }
    }

    public TIPO_ORIGEM_VALOR_CAMPO getTipoOrigemPadrao() {
        switch (this) {
            case AAA_NOME:
            case AAA_NOME_LONGO:
            case AAA_DESCRITIVO:
            case ID:
            case LATITUDE:
            case Longitude:
            case LC_LOGRADOURO:
            case LCCEP:
            case SENHA:
            case LC_COMPLEMENTO_E_NUMERO:
            case LC_CAMPO_ABERTO:
            case SENHA_SEGURANCA_MAXIMA:
            case CHART_VALOR:
            case CHART_LABEL:
            case HTML:
            case CHART_CATEGORIA:
            case CALENDARIO:
            case DATAHORA:
            case DATA:
            case HORA:
            case TELEFONE_FIXO_NACIONAL:
            case TELEFONE_FIXO_INTERNACIONAL:
            case TELEFONE_GENERICO:
            case TELEFONE_CELULAR:
            case MOEDA_REAL:
            case MOEDA_DOLAR:
            case QUANTIDADE:
            case TEXTO_SIMPLES:
            case VERDADEIRO_FALSO:
            case PERCENTUAL:
            case EMAIL:
            case COR:
            case SITE:
            case URL:
            case RESPONSAVEL:
            case NOME_COMPLETO:
            case CNPJ:
            case CPF:
            case INSCRICAO_ESTADUAL:
            case INSCRIACAO_MUNICIPAL:
            case REG_DATAINSERCAO:
            case REG_USUARIO_INSERCAO:
            case REG_USUARIO_ALTERACAO:
            case REG_DATAALTERACAO:
            case REG_ATIVO_INATIVO:
            case CODIGO_DE_BARRAS:
            case ICONE:
            case SEGURANCA_ATIVA:
            case LC_LOCALIZACAO:
            case CAMPO_SEPARADOR:
            case ENUM_FABRICA:
            case LC_COMPLEMENTO:

                return TIPO_ORIGEM_VALOR_CAMPO.VALOR_LIVRE;
            case LC_BAIRRO:
            case LC_CIDADE:
            case LC_UNIDADE_FEDERATIVA:
            case OBJETO_DE_UMA_LISTA:
            case LC_LOCALIDADE:
            case GRUPO_CAMPO:
            case GRUPOS_DE_CAMPO:
            case FORMULARIO_DE_ACAO:
                return TIPO_ORIGEM_VALOR_CAMPO.VALOR_COM_LISTA;

            case LISTA_OBJETOS_PUBLICOS:
            case LISTA_OBJETOS_PARTICULARES:
                return TIPO_ORIGEM_VALOR_CAMPO.VALORES_COM_LISTA;
            case IMG_PEQUENA:
            case ARQUIVO_DE_ENTIDADE:
            case IMG_MEDIA:
            case IMG_GRANDE:
                return TIPO_ORIGEM_VALOR_CAMPO.ARQUIVO;
            case HTML_TEMPLATE:
                break;
            case TIPO_PADRAO_POR_DECLARACAO:
                break;

            default:
                return TIPO_ORIGEM_VALOR_CAMPO.VALOR_LIVRE;

        }
        return TIPO_ORIGEM_VALOR_CAMPO.VALOR_LIVRE;

    }

    public ItfFabTipoComponenteVisual getTipo_input_prime() {
        try {
            // TIPOS DE CAMPO QUE DEVEN USAR INPUT SIMPLES COM MASCARAS E REGEX
            switch (this) {

                case LC_LOGRADOURO:
                case LC_COMPLEMENTO_E_NUMERO:
                case LC_CAMPO_ABERTO:

                case SITE:

                case TELEFONE_FIXO_NACIONAL:
                case TELEFONE_FIXO_INTERNACIONAL:
                case TELEFONE_CELULAR:
                case TELEFONE_GENERICO:

                case NOME_COMPLETO:
                case CNPJ:
                case CPF:
                case INSCRICAO_ESTADUAL:
                case CHART_LABEL:
                case CHART_CATEGORIA:
                case INSCRIACAO_MUNICIPAL:
                case CODIGO_DE_BARRAS:
                case ICONE:
                case CAMPO_SEPARADOR:
                case URL:
                    return FabCompVisualInputs.TEXTO_COM_FORMATACAO;

                case IMG_PEQUENA:
                    return FabCompVisualInputs.IMAGEM_PEQUENA_DE_ENTIDADE;
                case IMG_MEDIA:
                    return FabCompVisualInputs.IMAGEM_MEDIO_DE_ENTIDADE;
                case IMG_GRANDE:
                    return FabCompVisualInputs.IMAGEM_GRANDE_DE_ENTIDADE;

                // TIPOS DE CAMPO QUE DEVEN USAR INPUT COM BARRA CONTENDO MINIMO E MAXIMO
                //    return FabCompVisualInputs.NUMERO_MINIMO_MAXIMO;
                // TIPOS DE CAMPO ONDE OPÇÕES DE ESCOLHA SERÃO EXIBIDOS
                case OBJETO_DE_UMA_LISTA:
                case LC_LOCALIDADE:
                    return FabCompVisualSeletorItem.COMBO;
                case LISTA_OBJETOS_PUBLICOS:
                    return FabCompVisualSeletorItens.PICKLIST;
                // TIPOS DE CAMPO VALIDAÇÃO DE SENHA
                case SENHA:
                case SENHA_SEGURANCA_MAXIMA:
                    return FabCompVisualInputs.SENHA;
                // TIPOS DE CAMPO QUE DEVEN USAR INPUT CEP
                case LCCEP:
                    return FabCompVisualEndereco.CEP;// TIPOS DE CAMPO QUE DEVEN USAR INPUT SELETOR DE COR
                case COR:
                    return FabCompVisualInputs.COR;
                // TIPOS DE CAMPO QUE DEVEN USAR INPUT DE HTML
                case HTML:
                    return FabCompVisualInputs.HTML;
                // TIPOS DE CAMPO QUE DEVEN USAR INPUT quantidade
                case QUANTIDADE:
                case LATITUDE:
                case CHART_VALOR:
                case Longitude:
                case PERCENTUAL:
                    return FabCompVisualInputs.QUANTIDADE;
                case AAA_DESCRITIVO:
                    return FabCompVisualInputs.TEXTMO_MULTIPLAS_LINHAS;
                case MOEDA_REAL:
                case MOEDA_DOLAR:
                    return FabCompVisualInputs.MOEDA;
                // TIPOS DE CAMPO QUE DEVEN USAR INPUT EMAIL
                case EMAIL:
                    return FabCompVisualInputs.EMAIL;
                // TIPOS DE CAMPO QUE DEVEN USAR INPUT CALENDAR  EXIBINDO APENAS DATA
                case DATA:
                case CALENDARIO:
                    return FabCompVisualInputs.DATA;
                //// TIPOS DE CAMPO QUE DEVEN USAR INPUT CALENDAR  EXIBINDO DATA E HORA
                case REG_DATAALTERACAO:
                case REG_DATAINSERCAO:

                case DATAHORA:
                case HORA:
                    return FabCompVisualInputs.DATA_HORA;

                case VERDADEIRO_FALSO:
                case REG_ATIVO_INATIVO:
                case SEGURANCA_ATIVA:
                    return FabCompVisualInputs.LIGADO_DESLIGADO;
                case LC_LOCALIZACAO:
                    return FabCompVisualEndereco.INFORMACAO_ENDERECO;

                case LC_UNIDADE_FEDERATIVA:
                    return FabCompVisualEndereco.UNIDADE_FEDERATIVA;
                case LC_BAIRRO:
                    return FabCompVisualEndereco.BAIRRO;
                case LC_CIDADE:
                    return FabCompVisualEndereco.CIDADE;
                case REG_USUARIO_ALTERACAO:
                case REG_USUARIO_INSERCAO:

                    return FabCompVisualInputs.ENTIDADE_SIMPLES;
                case ARQUIVO_DE_ENTIDADE:
                    return FabCompVisualInputs.ARQUIVO_DE_ENTIDADE;

                case TEXTO_SIMPLES:
                    return FabCompVisualInputs.TEXTO_SEM_FORMATACAO;
                case HTML_TEMPLATE:
                    return FabCompVisualInputs.HTML_TEMPLATE;

                case GRUPO_CAMPO:
                    return FabCompVisualGrupoCampo.GRUPO_DE_CAMPO_RESPONSIVO;

                case GRUPOS_DE_CAMPO:
                    return FabCompVisualGruposCampo.GRUPOS_DE_CAMPO_ACAO_FORMULARIO_RESPONSIVO;

                case FORMULARIO_DE_ACAO:
                    return FabCompVisualFormularioDeAcao.ACAO_REGISTRO_RESPONSIVO;
                case ENUM_FABRICA:
                    return FabcompVisualEnums.GRADE;
                case LISTA_OBJETOS_PARTICULARES:
                    return FabCompVisualSubItens.SUB_FORM_SIMPLES;

                default:
                    return FabCompVisualInputs.TEXTO_SEM_FORMATACAO;
            }

        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("ATENÇÃO erro determinando tipo de campo para:" + this.toString(), t);
        }
        throw new UnsupportedOperationException("a exibição para o campo do tipo" + this.toString() + "não foi prevista ainda");
    }

    public TIPO_PRIMITIVO getTipoPrimitivo() {

        switch (this) {
            case AAA_NOME:
            case AAA_NOME_LONGO:
            case AAA_DESCRITIVO:
            case LC_LOGRADOURO:
            case LCCEP:

            case SENHA:
            case SENHA_SEGURANCA_MAXIMA:
            case LC_COMPLEMENTO_E_NUMERO:
            case LC_COMPLEMENTO:
            case LC_CAMPO_ABERTO:
            case HTML:
            case CHART_LABEL:
            case CHART_CATEGORIA:
            case TELEFONE_FIXO_NACIONAL:
            case TELEFONE_FIXO_INTERNACIONAL:
            case TELEFONE_CELULAR:
            case TELEFONE_GENERICO:
            case COR:
            case EMAIL:
            case SITE:
            case URL:
            case RESPONSAVEL:
            case TEXTO_SIMPLES:
            case NOME_COMPLETO:
            case CNPJ:
            case CPF:
            case INSCRICAO_ESTADUAL:

            case INSCRIACAO_MUNICIPAL:
            case CAMPO_SEPARADOR:
            case ICONE:
            case HTML_TEMPLATE:
            case ARQUIVO_DE_ENTIDADE:
            case TIPO_PADRAO_POR_DECLARACAO:
            case IMG_PEQUENA:
            case IMG_MEDIA:
            case IMG_GRANDE:
            case CODIGO_DE_BARRAS:
                return TIPO_PRIMITIVO.LETRAS;

            case ID:
            case LATITUDE:
            case Longitude:
            case CHART_VALOR:
            case QUANTIDADE:

                return TIPO_PRIMITIVO.INTEIRO;

            case CALENDARIO:
            case DATAHORA:
            case DATA:
            case HORA:
            case REG_DATAALTERACAO:
            case REG_DATAINSERCAO:
                return TIPO_PRIMITIVO.DATAS;

            case MOEDA_REAL:
            case MOEDA_DOLAR:
            case PERCENTUAL:
                return TIPO_PRIMITIVO.DECIMAL;

            case VERDADEIRO_FALSO:
            case REG_ATIVO_INATIVO:
            case SEGURANCA_ATIVA:
                return TIPO_PRIMITIVO.BOOLEAN;

            case REG_USUARIO_ALTERACAO:
            case REG_USUARIO_INSERCAO:
            case LC_LOCALIZACAO:
            case OBJETO_DE_UMA_LISTA:
            case LISTA_OBJETOS_PUBLICOS:

            case GRUPO_CAMPO:

            case GRUPOS_DE_CAMPO:
            case LC_LOCALIDADE:
            case LC_BAIRRO:
            case LC_CIDADE:
            case LC_UNIDADE_FEDERATIVA:
            case FORMULARIO_DE_ACAO:
                return TIPO_PRIMITIVO.ENTIDADE;
            case ENUM_FABRICA:
                return TIPO_PRIMITIVO.OUTROS_OBJETOS;

            default:
                throw new AssertionError(this.name());

        }

    }

    public boolean isCampoUmMoeda() {
        switch (this) {
            case MOEDA_REAL:
            case MOEDA_DOLAR:

                return true;
            default:
                return false;
        }

    }

    public boolean isCampoLocalizacao() {
        switch (this) {
            case LCCEP:
            case LC_BAIRRO:
            case LC_CIDADE:
            case LC_COMPLEMENTO_E_NUMERO:
            case LC_LOCALIDADE:
            case LC_COMPLEMENTO:
            case LC_LOCALIZACAO:
            case LC_LOGRADOURO:
            case LC_UNIDADE_FEDERATIVA:
            case LC_CAMPO_ABERTO:
                return true;
            default:
                return false;
        }
    }

    public boolean isCampoUmArquivoDeEntidade() {
        switch (this) {
            case ARQUIVO_DE_ENTIDADE:
            case IMG_GRANDE:
            case IMG_MEDIA:
            case IMG_PEQUENA:
                return true;
            default:
                return false;
        }
    }

    public boolean isUmCampoDeObjetoConhecido() {
        switch (this) {

            case LC_LOGRADOURO:

            case LCCEP:
            case LC_COMPLEMENTO:
            case LC_BAIRRO:

            case LC_CIDADE:

            case LC_LOCALIDADE:

            case LC_UNIDADE_FEDERATIVA:

            case LC_LOCALIZACAO:

            case CAMPO_SEPARADOR:

            case GRUPO_CAMPO:

            case GRUPOS_DE_CAMPO:

            case FORMULARIO_DE_ACAO:

                return true;
            default:
                return false;

        }

    }

    public boolean isUmCampoDeObjetoComListaDeOpcoes() {
        switch (this) {

            case LC_LOGRADOURO:

            case LC_BAIRRO:

            case LC_CIDADE:

            case LC_LOCALIDADE:

            case LC_UNIDADE_FEDERATIVA:

            case LC_LOCALIZACAO:

            case OBJETO_DE_UMA_LISTA:

                return true;
            default:
                return false;

        }
    }

    public String getValorAleatorioDesconforme() {
        throw new UnsupportedOperationException("Ainda nao implementado");
    }

    public int getPesoLarguraEspecifico() {

        switch (this) {
            case ID:

            case QUANTIDADE:
            case PERCENTUAL:

                return FabColunasTela.UM.getQuantidade();
            case TELEFONE_CELULAR:
            case TELEFONE_FIXO_NACIONAL:
            case TELEFONE_FIXO_INTERNACIONAL:
            case TELEFONE_GENERICO:
            case CNPJ:
            case MOEDA_REAL:
            case MOEDA_DOLAR:
                return FabColunasTela.DOIS.getQuantidade();

            default:
                return getTipo_input_prime().getRegistro().getPesoLargura();
        }

    }
}
