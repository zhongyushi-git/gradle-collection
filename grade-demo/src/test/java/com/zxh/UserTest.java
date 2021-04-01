package com.zxh;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test3() {
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean对象
        UserService userService = (UserService) context.getBean("userService");
        //调用方法
        userService.getList();
    }
}
