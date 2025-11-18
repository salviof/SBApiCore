/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoEntidade;
import java.util.ArrayList;
import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

/**
 *
 * @author desenvolvedor
 */
public interface ComoTemStatus extends ComoEntidadeSimplesSomenteLeitura {

    public ComoStatus getStatusPrincipal();

    public default List<ComoAcaoDoSistema> getAcoesDoStatus() {
        if (getStatusPrincipal() == null) {
            return new ArrayList<>();
        }
        return getStatusPrincipal().getEnumVinculado().opcoesPorStatus();
    }

}
