/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coletivojava.fw.api.objetoNativo.log;

import com.super_bits.modulosSB.SBCore.modulos.tratamentoErros.ItfErroSBServico;
import java.io.Serializable;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.layout.PatternLayout;
import org.coletivojava.fw.api.objetoNativo.mensagem.MensagemProgramador;
import org.coletivojava.fw.api.tratamentoErros.FabErro;

/**
 *
 * @author desenvolvedor
 */
@Plugin(name = "Log4j2ColetivoJava",
        category = "Core",
        elementType = "appender", printObject = true)
public class Log4j2ColetivoJava extends AbstractAppender {

    private static volatile Log4j2ColetivoJava instance;

    public Log4j2ColetivoJava(final String name, final Filter filter, final Layout<? extends Serializable> layout) {
        super(name, filter, layout);
    }

    @PluginFactory
    public static Log4j2ColetivoJava createAppender(@PluginAttribute("name") String name,
            @PluginAttribute("ignoreExceptions") boolean ignoreExceptions,
            @PluginElement("Layout") Layout layout,
            @PluginElement("Filters") Filter filter) {
        if (layout == null) {
            layout = PatternLayout.createDefaultLayout();
        }

        instance = new Log4j2ColetivoJava(name, filter, layout);

        return instance;
    }

    public static Log4j2ColetivoJava getInstance() {
        return instance;
    }

    @Override
    public void append(final LogEvent event) {
        // do something custom
        ItfErroSBServico servicoErro = LogPadraoSB.getNovaInstancia();
        if (servicoErro == null) {
            System.out.println(event.getLevel());
            System.out.println(event.getMessage().getFormattedMessage());
            if (event.getThrown() != null) {
                System.out.println(event.getThrown().getMessage());
            }
        } else {
            if (event.getLevel().equals(Level.ERROR)) {
                servicoErro.configurar(new MensagemProgramador(event.getMessage().getFormattedMessage()), FabErro.SOLICITAR_REPARO, event.getThrown());
                servicoErro.executarErro();
            } else {
                //   System.out.println(event.getLevel().name());
                //   System.out.println(event.getMessage().getFormattedMessage());
            }
        }

    }
}
