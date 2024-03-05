package com.itshaala.configuration;


import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@AllArgsConstructor
@PropertySource("classpath*:application.properties")
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringBeanConfiguration {
    Environment environment;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dmds = new DriverManagerDataSource();
        dmds.setUsername(environment.getProperty("mysql.username"));
        dmds.setPassword(environment.getProperty("mysql.password"));
        dmds.setUrl(environment.getProperty("mysql.url"));
        dmds.setDriverClassName(environment.getProperty("mysql.driver.class.name"));
        return dmds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }
}
