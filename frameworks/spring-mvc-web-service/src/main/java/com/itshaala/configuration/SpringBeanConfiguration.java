package com.itshaala.configuration;


import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
@EnableWebMvc
@PropertySource(value = "WEB-INF/application.properties")
@AllArgsConstructor
public class SpringBeanConfiguration {
    Environment environment;

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver ivr = new InternalResourceViewResolver();
        ivr.setPrefix("/WEB-INF/view/");
        ivr.setSuffix(".jsp");
        return ivr;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(environment.getProperty("mysql.db.url"));
        dataSource.setUsername(environment.getProperty("mysql.username"));
        dataSource.setPassword(environment.getProperty("mysql.password"));
        dataSource.setDriverClassName(environment.getProperty("mysql.driver.class.name"));
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }
}
