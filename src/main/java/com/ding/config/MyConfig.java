package com.ding.config;

import com.ding.pojo.Animal;
import com.ding.pojo.Cat;
import com.ding.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

// 标识当前类为配置类 作用类等效于sping的xml配置文件
@Configuration
@ImportResource(locations = "classpath:spring.xml") // springboot默认不识别xml 通过该注解导入xml配置文件
@Import(value = {Animal.class, StudentConfig.class}) // 向ioc容器中导入一个bean id默认为类的全限定名
public class MyConfig {
    @Bean(name = "user") // 等效于xml配置文件的bean标签 bean的id默认是方法名称 也可以指定名称
    public User user() {
        return new User();
    }
    @Bean
    public Cat cat() {
        return new Cat();
    }
}
