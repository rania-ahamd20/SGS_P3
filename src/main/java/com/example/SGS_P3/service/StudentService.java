package com.example.SGS_P3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> getAllStudentUsernames() {
        String query = "SELECT username FROM students";
        return jdbcTemplate.queryForList(query, String.class);
    }

    public List<String> getAllCourses() {
        String query = "SELECT course_name FROM courses";
        return jdbcTemplate.queryForList(query, String.class);
    }

    public List<Integer> getMarksForStudentInCourse(int studentId, int courseId) {
        String query = "SELECT mark FROM grades_2 WHERE student_id = ? AND course_id = ?";
        return jdbcTemplate.queryForList(query, Integer.class, studentId, courseId);
    }
}
