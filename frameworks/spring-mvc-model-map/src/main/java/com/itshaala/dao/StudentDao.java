package com.itshaala.dao;


import com.itshaala.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class StudentDao {

    JdbcTemplate jdbcTemplate;

    public List<Student> getAllStudents() {
        String query = "select * from it_shaala.student";
        return jdbcTemplate.query(query, rs -> {
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
    }

    public Student getStudentById(int id) {
        return jdbcTemplate.queryForObject("select * from it_shaala.student where id=" + id + " limit 1",
                (rs, rowNum) -> Student.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .phone(rs.getString("phone"))
                        .email(rs.getString("email"))
                        .address(rs.getString("address"))
                        .build());
    }

    public List<Student> getAllStudentsByName(String name) {
        String query = "select * from it_shaala.student where name like '" + name + "%'";
        return jdbcTemplate.query(query, rs -> {
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
    }

    public List<Student> getAllStudentsByAllFields(Student student) {
        String query = "select * from it_shaala.student where id like ? OR name like ? or  email like ? or phone like ? or address like ?";
        PreparedStatementSetter pss = (ps -> {
            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getEmail());
            ps.setString(4, student.getPhone());
            ps.setString(5, student.getAddress());
        });
        ResultSetExtractor<? extends List<Student>> rm = rs -> {
            List<Student> studentList = new ArrayList<>();
            while (rs.next()) {
                Student student1 = Student.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .phone(rs.getString("phone"))
                        .email(rs.getString("email"))
                        .address(rs.getString("address"))
                        .build();
                studentList.add(student1);
            }
            return studentList;
        };
        return jdbcTemplate.query(query, pss, rm);
    }

    public void addStudent(Student student) {
        String query = "insert into student(id, name, email, phone, address) values(?,?,?,?,?)";
        jdbcTemplate.update(query, ps -> {
            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getEmail());
            ps.setString(4, student.getPhone());
            ps.setString(5, student.getAddress());
        });
    }

    public void deleteStudentById(int id) {
        String query = "delete from student where id=?";
        jdbcTemplate.update(query, ps -> {
            ps.setInt(1, id);
        });
    }
}
