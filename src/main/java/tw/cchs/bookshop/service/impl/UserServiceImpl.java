package tw.cchs.bookshop.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import tw.cchs.bookshop.dao.UserDao;
import tw.cchs.bookshop.dto.UserLoginRequest;
import tw.cchs.bookshop.dto.UserRegisterRequest;
import tw.cchs.bookshop.model.User;
import tw.cchs.bookshop.service.UserService;

@Component
public class UserServiceImpl implements UserService {

    private final static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {

        // 檢查註冊的 email
        User user = userDao.getUserByEmail(userRegisterRequest.getEmail());

        if (user != null) {
            log.warn("該 email {} 已經被註冊", userRegisterRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        // 創建帳號
        return userDao.createUser(userRegisterRequest);

    }

    @Override
    public User login(UserLoginRequest userLoginRequest) {

        User user = userDao.getUserByEmail(userLoginRequest.getEmail());

        // 檢查帳號
        if (user == null) {
            log.warn("該 email {} 尚未註冊", userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        // 檢查密碼
        if (!user.getPassword().equals(userLoginRequest.getPassword())) {
            log.warn("該 email {} 的密碼不正確", userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        return user;

    }

    @Override
    public User getUserById(Integer userId) {

        return userDao.getUserById(userId);

    }

    @Override
    public User getUserByEmail(String email) {

        return userDao.getUserByEmail(email);

    }

}
