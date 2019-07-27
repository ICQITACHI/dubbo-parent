package com.jin;

import com.jin.bean.Users;
import com.jin.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 高山仰之可及，深渊度之可测
 */
public class TestDubboConsumer {

    public static void main(String[] args) throws Exception{
        ApplicationContext app = new ClassPathXmlApplicationContext("dubbo-consumer.xml");



        UsersService service  =(UsersService) app.getBean("usersService");
        List<Users> list = service.findUsers();

        System.out.println(list);

        System.in.read();//阻塞
    }
}
