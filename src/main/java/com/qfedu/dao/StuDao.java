package com.qfedu.dao;

import com.qfedu.entity.Stu;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public interface StuDao {
    List<Stu> selectAllStu();

    public Stu selectStuByName(String stu_name);

    Stu selectStuByNameAndId(@Param("stu_name") String stu_name, @Param("stu_id") int stu_id);

    int delStuById(int stu_id);

    List<Stu> selectStuByLike(String stu_name);

    List<Stu> selectStuByPage(@Param("begin") int begin, @Param("pageSize") int pagerSize);

    //List<Stu> selectStuByPageMap(Map map);
    Stu getStuAndGreade( Integer stu_id);
    List<Stu> getStuCourse();
}
