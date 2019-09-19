package com.monkey1024.test;

import com.monkey1024.bean.Player;
import com.monkey1024.bean.Team;
import com.monkey1024.dao.PlayerDao;
import com.monkey1024.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


public class JoinTest01 {

    private SqlSession sqlSession;
    private PlayerDao playerDao;

    @Before
    public void init() {
        sqlSession = MyBatisUtil.getSqlSession();
        playerDao = sqlSession.getMapper(PlayerDao.class);
    }

    @After
    public void close() {
        if(sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void selectPlayerById() {
        Player player = playerDao.selectPlayerById(1);
        System.out.println(player);
    }

    @Test
    public void selectPlayers() {
        List<Player> players = playerDao.selectPlayers();
        players.forEach(player -> System.out.println(player));
    }



}
