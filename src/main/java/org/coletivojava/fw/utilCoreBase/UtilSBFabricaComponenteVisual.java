/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package org.coletivojava.fw.utilCoreBase;

import org.coletivojava.fw.api.objetoNativo.view.componente.ComponenteVisualBase;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.InfoComponenteVisual;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComoComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComoFabTipoComponenteVisual;

/**
 *
 * @author desenvolvedor
 */
public class UtilSBFabricaComponenteVisual {

    private static void loadInfoFabrica(ComponenteVisualBase componente, InfoComponenteVisual infoAnotacao, String pastaBase) {
        componente.setNome(infoAnotacao.nome());
        componente.setDescricao(infoAnotacao.descricao());
        componente.setClasseCSS(infoAnotacao.classesCSS());
        componente.setXhtmlJSF(pastaBase + infoAnotacao.xhtmlJSF());
        componente.setXhtmlAndroid(pastaBase + infoAnotacao.xhtmlAndroi());
        componente.setHtmlWordPress(pastaBase + infoAnotacao.htmlWordPress());
        componente.setDescricao(infoAnotacao.descricao());
        componente.setFamilia(FabFamiliaCompVisual.MENU);
        componente.setXhtmlJSF(pastaBase + infoAnotacao.xhtmlJSF());
        componente.setXhtmlAndroid(pastaBase + infoAnotacao.xhtmlAndroi());
        componente.setHtmlWordPress(pastaBase + infoAnotacao.htmlWordPress());
        componente.setXhtmlJsfCaminhoRelativo(infoAnotacao.xhtmlJSF());
        if (infoAnotacao.idHTMLObjetoPrincipal().isEmpty()) {
            componente.setIdHTMLObjetoPrincipal(infoAnotacao.classesCSS());
        }

    }

    public static void aplicarPropCompVisual(ComponenteVisualBase pComponente, ComoFabTipoComponenteVisual pFabrica) {
        try {
            Field campo = pFabrica.getClass().getField(pFabrica.toString());
            pComponente.setFabricaDoComponente(pFabrica);
            InfoComponenteVisual infoAnotacao = campo.getAnnotation(InfoComponenteVisual.class);
            String codigoId = pFabrica.getFamilia().ordinal() + String.valueOf(((Enum) pFabrica).ordinal());
            pComponente.setId((long) Integer.parseInt(codigoId));
            pComponente.setIdHTMLObjetoPrincipal(codigoId);
            loadInfoFabrica(pComponente, infoAnotacao, ComoFabTipoComponenteVisual.PASTA_TAG_LIBS);
            pComponente.setFamilia(pFabrica.getFamilia());
            pComponente.setNome(infoAnotacao.nome());
            pComponente.setNomeComponente(infoAnotacao.nome());
            pComponente.setIdHTMLObjetoPrincipal(infoAnotacao.idHTMLObjetoPrincipal());
            pComponente.setPesoLargura(infoAnotacao.pesoLargura().getQuantidade());
        } catch (NoSuchFieldException | SecurityException ex) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro aplicando dados do componente SB" + pFabrica, ex);
            throw new UnsupportedOperationException("Erro aplicando dados do componente");
        }

    }

    public static ComponenteVisualBase getComponenteVisual(ComoFabTipoComponenteVisual pFabrica) {
        ComponenteVisualBase componente = new ComponenteVisualBase();

        aplicarPropCompVisual(componente, pFabrica);

        return componente;

    }

    @Deprecated
    public static ComoComponenteVisualSB getComponenteVisualPersonalizado(ComoFabTipoComponenteVisual pFabrica) {
        ComponenteVisualBase componente = new ComponenteVisualBase();

        try {

            Field campo = pFabrica.getClass().getField(pFabrica.toString());
            try {
                Method ordinal = pFabrica.getClass().getMethod("ordinal");
                InfoComponenteVisual infoAnotacao = campo.getAnnotation(InfoComponenteVisual.class);
                loadInfoFabrica(componente, infoAnotacao, "");
                componente.setId((long) ordinal.invoke(pFabrica));
            } catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(UtilSBFabricaComponenteVisual.class.getName()).log(Level.SEVERE, null, ex);
            }
            return componente;
        } catch (NoSuchFieldException | SecurityException ex) {
            Logger.getLogger(UtilSBFabricaComponenteVisual.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;

    }

}
