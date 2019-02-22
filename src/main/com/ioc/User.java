package main.com.ioc;

import org.springframework.stereotype.Component;

@Component(value = "user")
public class User {
    public String name;
    public void add(){
        System.out.println("add........");
    }
    public void setName(String name){
        this.name = name;
    }

//    public User(String name){
//        this.name = name;
//    }
}
