package com.qfedu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private Integer cid;
    private  String c_name;
    private List<Stu> stuList;
}
