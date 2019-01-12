package com.zevrant.osd.client.ui.config;

import net.miginfocom.swing.MigLayout;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

@Configuration
public class GuiConfig {

    @Bean
    public LayoutManager migLayout(){
        return new MigLayout();
    }
}
