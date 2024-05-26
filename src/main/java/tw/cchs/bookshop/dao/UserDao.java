package tw.cchs.bookshop.dao;

import tw.cchs.bookshop.dto.UserRegisterRequest;
import tw.cchs.bookshop.model.User;

public interface UserDao {

    public Integer createUser(UserRegisterRequest userRegisterRequest);

    public User getUserById(Integer userId);

}
