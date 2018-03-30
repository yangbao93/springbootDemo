package cn.azuray;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@ComponentScan
@SpringBootApplication(scanBasePackages = "cn.azuray")
@MapperScan(basePackages = {"cn.azuray.dao"})
public class application {

    public static void main(String... args) {
        SpringApplication.run(application.class);
    }

}
