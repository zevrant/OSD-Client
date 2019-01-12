package com.zevrant.osd.client.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class OsdClientUserInterface {


    public static void main(String[] args) {
        System.setProperty("java.awt.headless", Boolean.toString(false));
        SpringApplication.run(OsdClientUserInterface.class);


    }
}
