package com.itshaala.util;

import com.itshaala.constants.DbConstants;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

import java.util.Objects;

import static com.itshaala.constants.DbConstants.*;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
@PropertySource("application.properties")
@AllArgsConstructor
public class SpringConfiguration {

    Environment environment;

   /* @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(MYSQL_URL);
        dataSource.setUsername(MYSQL_USERNAME);
        dataSource.setPassword(MYSQL_PASSWORD);
        dataSource.setDriverClassName(MYSQL_DRIVER_CLASS_NAME);
        return dataSource;
    }*/

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(environment.getProperty("mysql.dev.url"));
        dataSource.setDriverClassName(Objects.requireNonNull(environment.getProperty("mysql.dev.driver.class")));
        dataSource.setUsername(environment.getProperty("mysql.dev.username"));
        dataSource.setPassword(environment.getProperty("mysql.dev.password"));
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }
}
