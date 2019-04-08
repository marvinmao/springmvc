package com.mvn.marvinmao.service.impl;

import com.mvn.marvinmao.annotation.MarvinService;
import com.mvn.marvinmao.service.MarvinMaoService;

@MarvinService("MarvinMaoServiceImpl")
public class MarvinMaoServiceImpl implements MarvinMaoService {

    public String query(String name, String age) {

        return "{name=" + name + ",age=" + age + "}";
    }

    public String insert(String param) {
        // TODO Auto-generated method stub
        return "insert successful.....";
    }

    public String update(String param) {
        // TODO Auto-generated method stub
        return "update successful.....";
    }

}
