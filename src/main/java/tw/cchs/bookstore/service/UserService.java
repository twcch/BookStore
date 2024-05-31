package tw.cchs.bookstore.service;

import tw.cchs.bookstore.dto.UserLoginRequest;
import tw.cchs.bookstore.dto.UserRegisterRequest;
import tw.cchs.bookstore.model.User;

public interface UserService {

    public Integer register(UserRegisterRequest userRegisterRequest);

    public User login(UserLoginRequest userLoginRequest);

    public User getUserById(Integer userId);

    public User getUserByEmail(String email);

}
