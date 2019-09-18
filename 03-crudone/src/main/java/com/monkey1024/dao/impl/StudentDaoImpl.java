package com.monkey1024.dao.impl;

import com.monkey1024.bean.Student;
import com.monkey1024.dao.StudentDao;
import com.monkey1024.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public void insertStudent(Student student) {
        //SqlSession继承了AutoCloseable接口，所以可以自动关闭
        try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
            //新增数据操作
            sqlSession.insert("insertStudent", student);
            //提交SqlSession
            sqlSession.commit();
        }
    }

    @Override
    public void deleteStudentById(int id) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
            sqlSession.delete("deleteStudentById", id);
            sqlSession.commit();
        }
    }

    @Override
    public void updateStudent(Student student) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
            sqlSession.update("updateStudent", student);
            sqlSession.commit();
        }
    }

    @Override
    public List<Student> selectAllStudents() {
        List<Student> students = null;
        try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
            students = sqlSession.selectList("selectAllStudents");
        }

        return students;
    }

    @Override
    public Student selectStudentById(int id) {
        Student student = null;
        try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
            student = sqlSession.selectOne("selectStudentById", id);
        }
        return student;
    }

    @Override
    public List<Student> selectStudentByKeyword(String keyword) {
        List<Student> students = null;

        try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
            students = sqlSession.selectList("selectStudentByKeyword", keyword);
        }

        return students;
    }

    @Override
    public Student selectStudentPwd(int id) {
        Student student = null;
        try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
            student = sqlSession.selectOne("selectStudentPwd", id);
        }
        return student;
    }
}
