package edu.nf.dip;

import edu.nf.dip.impl.UserDaoImpl;

public class Main {
    public static void main(String[] args) {
        UserDao dao=new UserDaoImpl();
        UserService service=new UserService();
        service.setUserDao(dao);
        service.add();
    }
}
