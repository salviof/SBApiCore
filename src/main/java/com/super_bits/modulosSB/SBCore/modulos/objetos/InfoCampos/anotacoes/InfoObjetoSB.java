package com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.FabricaObjetosRegistrados;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface InfoObjetoSB {

    public String[] tags();

    public String icone() default "fa fa-table";

    public String plural();

    boolean generoFeminino() default false;

    public String descricao() default "";

    public Class<? extends ItfFabrica> fabricaVinculada() default FabricaObjetosRegistrados.class;

    public boolean permitidoAlterarObjetoDaFabrica() default true;

}
