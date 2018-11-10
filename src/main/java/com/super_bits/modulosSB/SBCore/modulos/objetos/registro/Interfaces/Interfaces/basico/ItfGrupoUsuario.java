/*
 *  Super-Bits.com CODE CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.Interfaces.basico;

import com.super_bits.modulosSB.SBCore.UtilGeral.UtilSBCoreStringSlugs;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import java.lang.reflect.Field;
import java.util.List;

/**
 *
 * @author Salvio
 */
public interface ItfGrupoUsuario extends ItfBeanSimplesSomenteLeitura, ItfBeanInstanciado {

    public String getDescricao();

    public List<? extends ItfUsuario> getUsuarios();

    public ItfFabricaAcoes getPaginaInicial();

    public boolean isAtivo();

    public ItfModuloAcaoSistema getModuloPrincipal();

    public String getNomeUnico();

    public default String getEmail() {
        try {
            Field campo = getCampoReflexaoByAnotacao(FabTipoAtributoObjeto.EMAIL);
            if (campo != null) {

                String valor = (String) campo.get(this);
                if (valor != null) {
                    return valor;
                }
            }
            return UtilSBCoreStringSlugs.gerarSlugSimples(getNome()) + "@" + UtilSBCoreStringSlugs.gerarSlugSimples(getModuloPrincipal().getNome());
        } catch (Throwable t) {
            return UtilSBCoreStringSlugs.gerarSlugSimples(getNome()) + "@" + UtilSBCoreStringSlugs.gerarSlugSimples(getModuloPrincipal().getNome());

        }

    }
}
