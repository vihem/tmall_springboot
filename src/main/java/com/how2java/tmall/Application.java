package com.how2java.tmall;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.how2java.tmall.util.PortUtil;
@SpringBootApplication
@EnableCaching
@EnableElasticsearchRepositories(basePackages = "com.how2java.tmall.es")
@EnableJpaRepositories(basePackages = {"com.how2java.tmall.dao", "com.how2java.tmall.pojo"})
public class Application {
//    static {
//        PortUtil.checkPort(6379,"Redis 服务端",false);
//        PortUtil.checkPort(9300,"ElasticSearch 服务端",true);
//        PortUtil.checkPort(5601,"Kibana 工具", true);
//    }
    // 前台链接： http://127.0.0.1:8080/tmall_springboot/home
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
