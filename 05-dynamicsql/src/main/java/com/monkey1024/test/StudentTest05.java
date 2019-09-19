package com.monkey1024.test;

import com.monkey1024.bean.Student;
import com.monkey1024.dao.StudentDao;
import com.monkey1024.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest05 {

    private SqlSession sqlSession;
    private StudentDao studentDao;


    @Before
    public void init() {
        sqlSession = MyBatisUtil.getSqlSession();
        studentDao = sqlSession.getMapper(StudentDao.class);
    }

    @After
    public void close() {
        if(sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void selectIf() {
        Student student = new Student("周", 1, 1);
        List<Student> students = studentDao.selectIf(student);
        students.forEach(s -> System.out.println(s));
    }

    @Test
    public void selectIf2() {
        List<Student> students = studentDao.selectIf2("", 50);
        students.forEach(s -> System.out.println(s));
    }

    @Test
    public void selectWhere() {
        Student student = new Student("", 50, 1);
        List<Student> students = studentDao.selectWhere(student);
        students.forEach(s -> System.out.println(s));
    }

    @Test
    public void selectChoose() {
        Student student = new Student("周", 50, 1);
        List<Student> students = studentDao.selectChoose(student);
        students.forEach(s -> System.out.println(s));
    }

    @Test
    public void selectArray() {
        int[] ids = {1,2,3,4,5};
        List<Student> students = studentDao.selectArray(ids);
        students.forEach(s -> System.out.println(s));
    }

    @Test
    public void selectList() {
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        List<Student> students = studentDao.selectList(ids);
        students.forEach(s -> System.out.println(s));
    }

    @Test
    public void selectListStudent() {
        ArrayList<Student> ids = new ArrayList<>();
        ids.add(new Student(1));
        ids.add(new Student(2));
        ids.add(new Student(3));
        List<Student> students = studentDao.selectListStudent(ids);
        students.forEach(s -> System.out.println(s));
    }



}
