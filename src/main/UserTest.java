package main;

import main.com.ioc.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void iocTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//      UserService user = (UserService) applicationContext.getBean("userService");
//      user.setName("易鑫");
        User user2 = (User) applicationContext.getBean("user");
        user2.add();
    }
}
