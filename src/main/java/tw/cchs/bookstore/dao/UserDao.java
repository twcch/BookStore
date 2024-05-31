package tw.cchs.bookstore.dao;

import tw.cchs.bookstore.dto.UserRegisterRequest;
import tw.cchs.bookstore.model.User;

public interface UserDao {

    public Integer createUser(UserRegisterRequest userRegisterRequest);

    public User getUserById(Integer userId);

    public User getUserByEmail(String email);

}
