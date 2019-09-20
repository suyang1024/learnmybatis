package com.monkey1024.test;

import com.monkey1024.bean.Employee;
import com.monkey1024.dao.EmployeeDao;
import com.monkey1024.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class JoinTest01 {

    private SqlSession sqlSession;
    private EmployeeDao employeeDao;

    @Before
    public void init() {
        sqlSession = MyBatisUtil.getSqlSession();
        employeeDao = sqlSession.getMapper(EmployeeDao.class);
    }

    @After
    public void close() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void selectChildrenByPid() {
        List<Employee> employeeList = employeeDao.selectChildrenByPid(1002);

        employeeList.forEach((e) -> {
            System.out.println(e);
        });
    }

    @Test
    public void selectEmployeeById() {
        Employee employee = employeeDao.selectEmployeeById(1002);
        System.out.println(employee);
    }

    @Test
    public void selectLeaderById() {
        Employee employee = employeeDao.selectLeaderById(1005);
        System.out.println(employee);
    }



}
