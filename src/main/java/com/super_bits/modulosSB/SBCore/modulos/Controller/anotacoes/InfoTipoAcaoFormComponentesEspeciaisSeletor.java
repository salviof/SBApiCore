/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualSeletorItem;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 *
 *
 * @author Salvio Furbino
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface InfoTipoAcaoFormComponentesEspeciaisSeletor {

    /**
     *
     * @return
     */
    public String[] campos();

    public FabCompVisualSeletorItem[] componente();

}
