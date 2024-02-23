package com.itshaala.dao;


import com.itshaala.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class StudentDao {

    JdbcTemplate jdbcTemplate;

    public List<Student> getAllStudents() {
        String query = "select * from it_shaala.student";
        List<Student> students = jdbcTemplate.query(query, rs -> {
            List<Student> studentList = new ArrayList<>();
            while (rs.next()) {
                Student student = Student.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .phone(rs.getString("phone"))
                        .email(rs.getString("email"))
                        .address(rs.getString("address"))
                        .build();
                studentList.add(student);
            }
            return studentList;
        });
        return students;
    }
}
