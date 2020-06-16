package com.qfedu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stu {
    private Integer stu_id;
    private String stu_name;
    private int stu_age;
    private Date stu_bir;
    private String stu_hobby;
    private int greadeid;
    private String stu_psw;
    private String imgPath;
    private Greade greade;
    private List<Course> courseList;

}
