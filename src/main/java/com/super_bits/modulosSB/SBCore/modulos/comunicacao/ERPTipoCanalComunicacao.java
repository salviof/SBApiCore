/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.comunicacao;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoDaFabrica;
import com.super_bits.modulosSB.SBCore.modulos.erp.InfoApiERPCarameloCode;
import org.coletivojava.fw.utilCoreBase.UtilCRCReflexaoAPIERP;

/**
 *
 * @author desenvolvedor
 */
@InfoApiERPCarameloCode(descricaoApi = "Apis de mídia de comunicação", nomeApi = "TransporteComunicacao", slugInicial = "MsgDisparo")
public enum ERPTipoCanalComunicacao implements ItffabricaCanalComunicacao<ItfDisparoComunicacao> {

    @InfoObjetoDaFabrica(nomeObjeto = "E-mail", classeObjeto = TipoTransporteSBNativo.class)
    EMAIL,
    @InfoObjetoDaFabrica(nomeObjeto = "SMS", classeObjeto = TipoTransporteSBNativo.class)
    SMS,
    @InfoObjetoDaFabrica(nomeObjeto = "Menu Intranet", classeObjeto = TipoTransporteSBNativo.class)
    INTRANET_MENU,
    @InfoObjetoDaFabrica(nomeObjeto = "Intranet Modal", classeObjeto = TipoTransporteSBNativo.class)
    INTRANET_BLOQUEIO_TELA,
    @InfoObjetoDaFabrica(nomeObjeto = "Api Personalizada", classeObjeto = TipoTransporteSBNativo.class)
    API_PERSONALIZADA,
    @InfoObjetoDaFabrica(nomeObjeto = "Whatszup", classeObjeto = TipoTransporteSBNativo.class)
    WHATZAUP,
    @InfoObjetoDaFabrica(nomeObjeto = "Matrix", classeObjeto = TipoTransporteSBNativo.class)
    MATRIX,
    @InfoObjetoDaFabrica(nomeObjeto = "Mobile", classeObjeto = TipoTransporteSBNativo.class)
    MOBILE,
    /**
     * O Modo automático se vira para encontrar o usuário, exemplo: se tiver uma
     * sessao do usuário conectada envia via modal, se não encontrar, tenta
     * watzap, se não encontrar, registra em notificações e envia um e-mail
     */
    @InfoObjetoDaFabrica(nomeObjeto = "Automático", classeObjeto = TipoTransporteSBNativo.class)
    AUTOMATICO;

    @Override
    public TipoTransporteSBNativo getRegistro() {
        return (TipoTransporteSBNativo) ItffabricaCanalComunicacao.super.getRegistro();

    }

    @Override
    public ItfDisparoComunicacao getImplementacaoDoContexto() {
        return (ItfDisparoComunicacao) UtilCRCReflexaoAPIERP.getImplementacaoDoContexto(this);
    }

    @Override
    public Class getInterface() {
        return ItfDisparoComunicacao.class;

    }

    public boolean isTipoTransporteImplementado() {
        return UtilCRCReflexaoAPIERP.isClasseImplementadaNoContexto(this);
    }

}
