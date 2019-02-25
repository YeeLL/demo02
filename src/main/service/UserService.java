package main.service;

import main.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("userService")
public class UserService {
//    @Autowired
    public UserDao dao;

    public void  setDao(UserDao dao){
        this.dao = dao;
    }

    public void add(){
        System.out.println("service");
        dao.add();
    }
}
