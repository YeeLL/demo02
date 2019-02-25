package main.com.ioc;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("logUtils")
public class LogUtils {

    @Pointcut("execution(* main.dao.UserDao.add(..))")
    public void pointcut(){

    }

    @After("pointcut()")
    public void before(){
        System.out.println(System.currentTimeMillis()+"before");
    }


    public void after(){
        System.out.println(System.currentTimeMillis()+"after");
    }
}
