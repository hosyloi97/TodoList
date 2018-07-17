package mrloiho.hust.services;

import mrloiho.hust.model.User;
import mrloiho.hust.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepo;

    @Override
    public void create(User user) {
        userRepo.insert(user);
    }

    @Override
    public void update(User user) {
        userRepo.save(user);
    }

    @Override
    public void delete(String id) {
        userRepo.deleteById(id);
    }

    @Override
    public void deleteAll() {
        userRepo.deleteAll();
    }


//    @Override
//    public User findById(String id) {
////        return userRepo.findById(id);
//        User user = userRepo.findUserById(id);
//        return user;
//    }

    public User findUserByUsername(String name){
        return userRepo.findUserByUsername(name);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }
}
