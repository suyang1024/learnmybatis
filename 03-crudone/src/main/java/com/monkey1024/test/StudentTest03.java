package com.monkey1024.test;

import com.monkey1024.bean.Student;
import com.monkey1024.dao.StudentDao;
import com.monkey1024.dao.impl.StudentDaoImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class StudentTest03 {

    private StudentDao studentDao;

    @Before
    public void init() {
        studentDao = new StudentDaoImpl();
    }

    @Test
    public void insertStudent() {
        Student student = new Student("张学友", 51, 96.50);

        System.out.println(student);
        studentDao.insertStudent(student);
        System.out.println(student);
    }

    @Test
    public void deleteStudentById() {
        studentDao.deleteStudentById(3);
    }

    @Test
    public void updateStudent() {
        Student student = new Student(11,"周杰伦", 40, 90);
        studentDao.updateStudent(student);
    }

    @Test
    public void selectAllStudents() {
        List<Student> students = studentDao.selectAllStudents();
        students.forEach(s -> {
            System.out.println(s);
        });
    }

    @Test
    public void selectStudentByid(){
        Student student = studentDao.selectStudentById(1);
        System.out.println(student);
    }

    @Test
    public void selectStudentByKeyword(){
        List<Student> students = studentDao.selectStudentByKeyword("明");
        students.forEach(s -> {
            System.out.println(s);
        });
    }

    @Test
    public void selectStudentPwd(){
        Student student = studentDao.selectStudentPwd(1);
        System.out.println(student);
    }
}
