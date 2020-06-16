package com.qfedu.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    private  static SqlSessionFactory factory;
    //保证成虚的运行只使用一个线程
    private static final ThreadLocal<SqlSession> SQL_SESSION_THREAD_LOCAL= new ThreadLocal<SqlSession>();

    static {
        try {
            //获得读取mybitas配置文件的流对象
            InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
            //构建SqlSession链接对象的工厂
            factory = new SqlSessionFactoryBuilder().build(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        SqlSession sqlSession = SQL_SESSION_THREAD_LOCAL.get();
        if (sqlSession == null) {
            //通过工厂获得链接对象
            sqlSession = factory.openSession();
            SQL_SESSION_THREAD_LOCAL.set(sqlSession);
        }
        return sqlSession;
    }

    //释放资源，当再次进入此类时需再次创建sqlsession
    public static void close() {
        getSqlSession().close();
        SQL_SESSION_THREAD_LOCAL.remove();
    }

    public static void commit() {
        getSqlSession().commit();
        close();
    }
    public static void rollback() {
        getSqlSession().rollback();
        close();
    }
    public static <T> T  getMapper(Class<T> t) {
        return getSqlSession().getMapper(t);
    }

}
