package com.smart.luobo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class IndexDao {
    public String sayHello(String param){
        return "indexDao:" + param;
    }
}
