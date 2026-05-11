package com.svem;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;


public class Main {
    public static void main(String[] args) throws Exception {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector(); // required in 10.x to init the connector

        String webappDir = new File("src/main/webapp").getAbsolutePath();
        Context ctx = tomcat.addWebapp("", webappDir);

        tomcat.start();
        System.out.println("Server running at http://localhost:8080");
        tomcat.getServer().await();
    }
}
