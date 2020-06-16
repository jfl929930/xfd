import com.qfedu.Utils.MyBatisUtil;
import com.qfedu.dao.GreadeDao;
import com.qfedu.dao.StuDao;
import com.qfedu.entity.Greade;
import com.qfedu.entity.Stu;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestStuDao {
    public static void main (String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();

        //List<Stu> stus = sqlSession.getMapper(StuDao.class).selectAllStu();
        //for (Stu stu : stus) {
        //    System.out.println(stu);
        //}

        //Stu rrr = sqlSession.getMapper(StuDao.class).selectStuByName("rrr");
        //System.out.println(rrr);

        //Stu rrr = sqlSession.getMapper(StuDao.class).selectStuByNameAndId("rrr", 6);
        //System.out.println(rrr);

        //int i = sqlSession.getMapper(StuDao.class).delStuById(8);
        //System.out.println(i);
        //if (i > 0){
        //    sqlSession.commit();
        //}else {
        //    sqlSession.rollback();
        //}


        //sqlSession.getMapper(StuDao.class).selectStuByNameAndId("rrr", 6);

        //List<Stu> stus = sqlSession.getMapper(StuDao.class).selectStuByLike("r");
        //for (Stu stu : stus) {
        //    System.out.println(stu);
        //}

        //int pageNo = 1;
        //int pageSize = 3;
        //int begin = (pageNo - 1) * pageSize;
        //List<Stu> stus = sqlSession.getMapper(StuDao.class).selectStuByPage(begin, pageSize);
        //for (Stu stu : stus) {
        //    System.out.println(stu);
        //}

        //List<Stu> stus = MyBatisUtil.getMapper(StuDao.class).selectAllStu();
        //for (Stu stu : stus) {
        //    System.out.println(stu);
        //}

        //Stu stu = MyBatisUtil.getMapper(StuDao.class).getStuAndGreade(15);
        //System.out.println(stu);


       // List<Greade> greadeAndStu = MyBatisUtil.getMapper(GreadeDao.class).getGreadeAndStu();
       // for (Greade greade : greadeAndStu) {
       //     System.out.println(greade);
       // }

        List<Stu> stuCourse = MyBatisUtil.getMapper(StuDao.class).getStuCourse();
        System.out.println(stuCourse);
    }
}
