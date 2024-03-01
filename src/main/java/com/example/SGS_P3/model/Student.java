package com.example.SGS_P3.model;

public class Student {
    private int studentId;
    private String username;
    private String password;

    public Student() {
    }

    public Student(int studentId, String username, String password) {
        this.studentId = studentId;
        this.username = username;
        this.password = password;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
