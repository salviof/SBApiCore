/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.utilCoreBase;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanVinculadoAEnum;

/**
 *
 * @author desenvolvedor
 */
public abstract class UtilSBCoreGeradorDeIDSimples {

    public static int gerarIdUnicoObejtoVinculadoAFabrica(ItfBeanVinculadoAEnum pObjeto) {
        return (pObjeto.getClass().getSimpleName() + "." + pObjeto.getEnumVinculado().toString()).hashCode();
    }

    public static int gerarIdAcaoDoSistema(ItfAcaoDoSistema pAcao) {

        return UtilSBControllerSimples.gerarIDAcaoDoSistema(pAcao.getEnumAcaoDoSistema());
    }

}
