package main.com.ioc;

public class UserService {
    public UserDao dao;

    public void  setDao(UserDao dao){
        this.dao = dao;
    }
    public void add(){
        System.out.println("service");
        dao.add();
    }
}
