package com.monkey1024.dao;

import com.monkey1024.bean.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> selectChildrenByPid(int mgr);

    Employee selectEmployeeById(int id);
}
