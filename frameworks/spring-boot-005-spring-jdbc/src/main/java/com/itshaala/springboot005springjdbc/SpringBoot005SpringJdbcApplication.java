package com.itshaala.springboot005springjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBoot005SpringJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBoot005SpringJdbcApplication.class, args);
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
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
