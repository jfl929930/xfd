package com.qfedu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Greade {
    private Integer gid;
    private String g_name;
    private List<Stu> stuList;
}
