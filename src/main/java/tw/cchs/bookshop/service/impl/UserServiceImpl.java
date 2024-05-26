package tw.cchs.bookshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tw.cchs.bookshop.dao.UserDao;
import tw.cchs.bookshop.dto.UserRegisterRequest;
import tw.cchs.bookshop.model.User;
import tw.cchs.bookshop.service.UserService;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {

        return userDao.createUser(userRegisterRequest);

    }

    @Override
    public User getUserById(Integer userId) {

        return userDao.getUserById(userId);

    }

}
