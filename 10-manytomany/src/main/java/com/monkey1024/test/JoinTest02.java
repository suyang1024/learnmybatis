package com.monkey1024.test;

import com.monkey1024.bean.Course;
import com.monkey1024.dao.CourseDao;
import com.monkey1024.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JoinTest02 {

    private SqlSession sqlSession;
    private CourseDao courseDao;

    @Before
    public void init() {
        sqlSession = MyBatisUtil.getSqlSession();
        courseDao = sqlSession.getMapper(CourseDao.class);
    }

    @After
    public void close() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void selectCourseById() {
        Course course = courseDao.selectCourseById(1001);
        System.out.println(course);
    }
}
