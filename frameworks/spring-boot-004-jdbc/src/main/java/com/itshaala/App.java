package com.itshaala;

import com.itshaala.configuration.SpringBeanConfiguration;
import com.itshaala.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);

        String query = "select * from course";
        jdbcTemplate.query(query, rs -> {
            List<Course> courses = new ArrayList<>();
            while (rs.next()) {
                Course course = Course.builder()
                        .id(rs.getInt("id"))
                        .course_name(rs.getString("course_name"))
                        .price(rs.getInt("price"))
                        .build();
                courses.add(course);
            }
            return courses;
        }).forEach(System.out::println);


    }
}
