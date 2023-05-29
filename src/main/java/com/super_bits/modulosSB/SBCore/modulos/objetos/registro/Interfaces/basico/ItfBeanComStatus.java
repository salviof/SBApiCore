/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoEntidade;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public interface ItfBeanComStatus extends ItfBeanSimplesSomenteLeitura {

    public ItfBeanStatus getStatusPrincipal();

    public default List<ItfAcaoDoSistema> getAcoesDoStatus() {
        if (getStatusPrincipal() == null) {
            return new ArrayList<>();
        }
        return getStatusPrincipal().getEnumVinculado().opcoesPorStatus();
    }

}
