/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.utilCoreBase;


import java.util.UUID;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeVinculadoAEnum;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;

/**
 *
 * @author desenvolvedor
 */
public abstract class UtilCRCGeradorDeIDSimples {

    public static Long gerarIdUnicoObejtoVinculadoAFabrica(ComoEntidadeVinculadoAEnum pObjeto) {
        return (long) (pObjeto.getClass().getSimpleName() + "." + pObjeto.getEnumVinculado().toString()).hashCode();
    }

    public static Long gerarIdAcaoDoSistema(ComoAcaoDoSistema pAcao) {

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
