/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.utilCoreBase;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanVinculadoAEnum;
import java.util.UUID;

/**
 *
 * @author desenvolvedor
 */
public abstract class UtilSBCoreGeradorDeIDSimples {

    public static Long gerarIdUnicoObejtoVinculadoAFabrica(ItfBeanVinculadoAEnum pObjeto) {
        return (long) (pObjeto.getClass().getSimpleName() + "." + pObjeto.getEnumVinculado().toString()).hashCode();
    }

    public static Long gerarIdAcaoDoSistema(ItfAcaoDoSistema pAcao) {

        return UtilSBControllerSimples.gerarIDAcaoDoSistema(pAcao.getEnumAcaoDoSistema());
    }

    public static String getIdentificadorUnico() {
        String uniqueID = UUID.randomUUID().toString();
        return uniqueID;
    }

    public static String getIdentificadorUnicoNumerosLetras() {
        String uniqueID = UUID.randomUUID().toString();
        return uniqueID.replace("-", "0");
    }

}
