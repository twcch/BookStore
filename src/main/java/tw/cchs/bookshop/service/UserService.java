package tw.cchs.bookshop.service;

import tw.cchs.bookshop.dto.UserRegisterRequest;
import tw.cchs.bookshop.model.User;

public interface UserService {

    public Integer register(UserRegisterRequest userRegisterRequest);

    public User getUserById(Integer userId);

}
