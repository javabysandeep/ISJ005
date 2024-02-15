package com.itshaala.configuration;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@PropertySource(value = "application.properties")
@ComponentScan(basePackages = {"com.itshaala"})
@AllArgsConstructor
public class SpringBeanConfiguration {

    Environment environment;

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(environment.getProperty("mysql.dev.url"));
        dataSource.setDriverClassName(Objects.requireNonNull(environment.getProperty("mysql.dev.driver.class")));
        dataSource.setUsername(environment.getProperty("mysql.dev.username"));
        dataSource.setPassword(environment.getProperty("mysql.dev.password"));
        return dataSource;
    }
}
