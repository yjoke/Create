package com.example.startaliyun;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.SchemaOutputResolver;

@SpringBootApplication
public class StartaliyunApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartaliyunApplication.class, args);
        System.out.println("hello");
    }

}
