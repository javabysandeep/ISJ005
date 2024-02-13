package com.itshaala.dao;

import com.itshaala.model.Course;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CourseDao {
    JdbcTemplate jdbcTemplate;

    public void addCourse(Course course) {
        String sql = "insert into course values(?,?,?) ";
        jdbcTemplate.update(sql);
    }
}
