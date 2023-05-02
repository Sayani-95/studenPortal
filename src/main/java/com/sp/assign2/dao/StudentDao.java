package com.sp.assign2.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sp.assign2.model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDao {
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int addStudent(Student student) {
        return jdbcTemplate.update("insert into student (name, age, course, grade) VALUE (?, ?, ?, ?)", student.getName(), student.getAge(), student.getCourse(), student.getGrade());
    }

    public Student getStudent(int id) {
        try {
            return jdbcTemplate.queryForObject("select * from student where id = ?", new Object[]{id}, new BeanPropertyRowMapper<>(Student.class));
        } catch (Exception exception) {
            return null;
        }
    }

    public int update(Student student) {
        int update = jdbcTemplate.update("update student set name = ?, age = ?, course = ?, grade=? where id = ?", student.getName(), student.getAge(), student.getCourse(), student.getGrade(),student.getId());
        return update;
    }
    public int deleteStudent(int id) {
        return jdbcTemplate.update("delete from student where id = ?", id);
    }

    public List<Student> list() {
        return jdbcTemplate.query("select * from student", (resultSet, student) -> new Student(resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3),resultSet.getString(4),resultSet.getDouble(5)));
    }
    
//    public List<Student> list() {
//        return jdbcTemplate.query("select * from student", new RowMapper<Student>() {
//            public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {
//                int id = resultSet.getInt(1);
//                String Name = resultSet.getString(2);
//                int Age = resultSet.getInt(3);
//                String Course = resultSet.getString(4);
//                double grade = resultSet.getDouble(5);
//                return new Student(id, Name,Age,Course,grade);
//            }
//        });
//    }

}
