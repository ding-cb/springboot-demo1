package com.ding;

import com.ding.config.MyConfig;
import com.ding.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * Hello world!
 * 春天，启动！
 * 可以扫描App类同级目录及其子目录的类
 */
@SpringBootApplication
public class App {
    public static void main( String[] args ) {
        System.out.println("ding");
        System.out.println("ding2");
        System.out.println("ding3");


        // 帮助我们初始化一个ioc容器
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
//        String[] beans = context.getBeanDefinitionNames();
//        Arrays.stream(beans).forEach(System.out::println);
//        int cntBeans = context.getBeanDefinitionCount();
//        System.out.println(cntBeans);
//        System.out.println( "Hello World!" );

        User user = context.getBean("user", User.class);
        System.out.println(user);
        System.out.println(context.getBean(MyConfig.class));

    }
}
