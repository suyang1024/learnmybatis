package com.monkey1024.dao;

import com.monkey1024.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    List<Student> selectIf(Student student);

    List<Student> selectIf2(@Param("_name") String name, @Param("_age") int age);

    List<Student> selectWhere(Student student);

    List<Student> selectChoose(Student student);

    List<Student> selectArray(int[] ids);

    List<Student> selectList(List<Integer> ids);

    List<Student> selectListStudent(List<Student> students);
}
