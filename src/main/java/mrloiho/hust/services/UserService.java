package mrloiho.hust.services;

import mrloiho.hust.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public void create(User user);

    public void update(User user);

    public void delete(String id);

    public void deleteAll();

//    public User findById(String id);

    public User findUserByUsername(String name);

    public List<User> findAll();
}
