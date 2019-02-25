package main.action;

import com.opensymphony.xwork2.ActionSupport;
import main.com.ioc.User;
import main.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserAction extends ActionSupport {


    @Override
    public String execute() throws Exception {
        System.out.println("action........");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserService user2 = (UserService) applicationContext.getBean("userService");
        user2.add();
        return NONE;
    }
}
