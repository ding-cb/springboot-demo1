package com.ding.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 自动生成get set tostring 方法
@AllArgsConstructor // 带所有参数的构造方法
@NoArgsConstructor // 无参构造方法
public class Emp {
    private String name;
    private String addr;
}
