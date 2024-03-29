package com.itshaala.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
@EnableWebMvc
public class SpringBeanConfiguration {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver ivr = new InternalResourceViewResolver();
        ivr.setPrefix("/WEB-INF/view/");
        ivr.setSuffix(".jsp");
        return ivr;
    }

}
