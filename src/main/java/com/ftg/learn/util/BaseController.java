package com.ftg.learn.util;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController <E,T extends IService<E>>{
    @Autowired(required = false)
    public T service;
}
