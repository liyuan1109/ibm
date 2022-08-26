package com.ftg.learn.util;

import lombok.Data;

import java.util.List;

@Data
public class ReturnData <T>{
    private int page;
    private int limit;
    private int code;   //默认code(0)
    private String msg; //success表示是否传输成功
    private Long count;
    private List<T> data;
}
