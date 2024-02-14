package com.itshaala.util;

import com.itshaala.constants.DbConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

import static com.itshaala.constants.DbConstants.*;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringConfiguration {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(MYSQL_URL);
        dataSource.setUsername(MYSQL_USERNAME);
        dataSource.setPassword(MYSQL_PASSWORD);
        dataSource.setDriverClassName(MYSQL_DRIVER_CLASS_NAME);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }
}
