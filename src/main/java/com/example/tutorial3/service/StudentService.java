package com.example.tutorial3.service;

import java.util.List;

import com.example.tutorial3.model.StudentModel;

public interface StudentService {
    StudentModel selectStudent (String npm);
    List<StudentModel> selectAllStudents();
    public void addStudent(StudentModel student);
}
