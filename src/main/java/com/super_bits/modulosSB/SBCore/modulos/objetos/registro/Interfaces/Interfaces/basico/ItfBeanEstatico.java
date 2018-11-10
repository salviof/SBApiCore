/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.UtilGeral.UtilSBCoreReflexaoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.TratamentoDeErros.FabErro;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.FabricaObjetosRegistrados;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;

/**
 *
 * Um Bean estático é um Objeto que será criado a apartir de uma fábrica, desta
 * forma é possível retornar o enum do objeto atravéz do método getFabricaObjeto
 *
 * -> Este tipo de objeto deve ser estático no quesito quantidade de registro,
 * pois o método getFabricaObjeto normalmente é utilizado para programação de
 * regra de negocio de acorodo com enum vinculado
 *
 * @author desenvolvedor
 */
public interface ItfBeanEstatico extends ItfBeanSimplesSomenteLeitura {

    /**
     * ->A Fabrica deve ser informada em:
     * @link InfoObjetoSB
     *
     * @return Enum referente ao Objeto
     */
    public default ItfFabrica getFabricaObjeto() {
        try {
            InfoObjetoSB info = UtilSBCoreReflexaoObjeto.getInfoClasseObjeto(this.getClass());

            Class<? extends ItfFabrica> classeFabrica = info.fabricaVinculada();
            if (classeFabrica == FabricaObjetosRegistrados.class) {
                throw new UnsupportedOperationException("Informe a fabrica vinculado ao objeto " + this.getClass().getSimpleName() + " com a anotação" + InfoObjetoSB.class.getSimpleName());
            }
            for (ItfFabrica fabrica : classeFabrica.getEnumConstants()) {
                if (getId() == ((ItfBeanSimplesSomenteLeitura) fabrica.getRegistro()).getId()) {
                    return fabrica;
                }
            }
            throw new UnsupportedOperationException("Nehum enum da fabrica foi encontrado com o id" + getId());
        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro obtendo enum de fabrica vinculado ao objeto" + this.getClass().getSimpleName(), t);
            return null;
        }

    }

}
