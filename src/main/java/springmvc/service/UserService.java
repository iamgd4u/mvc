package springmvc.service;

import springmvc.dao.UserDao;
import springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public int createUser(User user){

        return userDao.saveUser(user);
    }
}
