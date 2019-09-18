package com.monkey1024.dao;

import com.monkey1024.bean.Student;

import java.util.List;

public interface StudentDao {
    void insertStudent(Student student);

    void deleteStudentById(int id);

    void updateStudent(Student student);

    List<Student> selectAllStudents();

    Student selectStudentById(int id);

    List<Student> selectStudentByKeyword(String keyword);

    Student selectStudentPwd(int id);
}
