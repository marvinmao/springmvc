package com.mvn.marvinmao.controller;

import com.mvn.marvinmao.annotation.MarvinController;
import com.mvn.marvinmao.annotation.MarvinQualifier;
import com.mvn.marvinmao.annotation.MarvinRequestMapping;
import com.mvn.marvinmao.annotation.MarvinRequestParam;
import com.mvn.marvinmao.service.MarvinMaoService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@MarvinController
@MarvinRequestMapping("/james")
public class MarvinMaoController {

    @MarvinQualifier("MarvinMaoServiceImpl")
    private MarvinMaoService jamesService;

    @MarvinRequestMapping("/query")
    public void query(HttpServletRequest request, HttpServletResponse response,
                      @MarvinRequestParam("name") String name,
                      @MarvinRequestParam("age") String age) {

        try {
            PrintWriter pw = response.getWriter();
            String result = jamesService.query(name, age);
            pw.write(result);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @MarvinRequestMapping("/insert")
    public void insert(HttpServletRequest request,
                       HttpServletResponse response) {
        try {
            PrintWriter pw = response.getWriter();
            String result = jamesService.insert("0000");

            pw.write(result);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @MarvinRequestMapping("/update")
    public void update(HttpServletRequest request,
                       HttpServletResponse response, String param) {
        try {
            PrintWriter pw = response.getWriter();
            String result = jamesService.update(param);

            pw.write(result);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
