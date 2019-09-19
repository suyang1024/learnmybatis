package com.monkey1024.test;

import com.monkey1024.bean.Team;
import com.monkey1024.dao.TeamDao;
import com.monkey1024.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class JoinTest01 {

    private SqlSession sqlSession;
    private TeamDao teamDao;

    @Before
    public void init() {
        sqlSession = MyBatisUtil.getSqlSession();
        teamDao = sqlSession.getMapper(TeamDao.class);
    }

    @After
    public void close() {
        if(sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void selectTeamById() {
        Team team = teamDao.selectTeamById(1);
        System.out.println(team);
    }



}
