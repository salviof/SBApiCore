package com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.estadoFormulario.FabEstadoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones.FabIconeFontAwesome;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface InfoTipoAcaoSelecaoDeAcao {

    public String nomeAcao() default "";

    public String icone() default "";

    public Class entidade() default void.class;

    public boolean precisaPermissao() default false;

    public String xhtmlDaAcao() default "";

    public String[] acoesDisponiveis() default {};

    public String descricao() default "";

    public String codigoJira() default "";

    public FabIconeFontAwesome iconeFonteAnsowame() default FabIconeFontAwesome.ICONE_PERSONALIZADO;

    public FabEstadoFormulario estadoFormulario() default FabEstadoFormulario.EDITAR;

}
