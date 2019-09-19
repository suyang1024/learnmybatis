package com.monkey1024.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * DCL的单例模式
 */
public class MyBatisUtil {

    private static volatile SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {

        try {
            if(sqlSessionFactory == null) {
                //读取主配置文件
                InputStream input = Resources.getResourceAsStream("mybatis.xml");
                synchronized (MyBatisUtil.class) {
                    if (sqlSessionFactory == null) {
                        //创建SqlSessionFactory对象
                        sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return sqlSessionFactory.openSession();
    }
}
