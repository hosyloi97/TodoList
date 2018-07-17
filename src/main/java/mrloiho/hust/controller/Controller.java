package mrloiho.hust.controller;

import mrloiho.hust.model.User;
import mrloiho.hust.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    UserService userService;

    //------------Get All Users--------------------------------------------------------
    @GetMapping("/user")
    public List<User> listAllUsers() {
        List<User> users = userService.findAll();
        return users;
    }

//    //-------------------Get Single User By Id--------------------------------------------------------
//    @GetMapping("/user/{id}")
//    public User getUserById(@PathVariable("id") String id) throws IOException {
//        return userService.findById(id);
//    }

    @GetMapping("/user/{username}")
    public User getUserByUsername(@PathVariable("username") String username) throws IOException{
        return userService.findUserByUsername(username);
    }
    //-------------------Create a User--------------------------------------------------------
    @PostMapping("/user")
    public Boolean createUser(@RequestBody User user) {
        boolean rs = false;
        userService.create(user);
        rs = true;
        return rs;
    }

    //------------------- Update a User --------------------------------------------------------
    @PutMapping(value = "/user/{username}")
    public Boolean updateUser(@PathVariable("username") String username, @RequestBody User user) {
        boolean rs = false;
        User currentUser = userService.findUserByUsername(username);
        if (currentUser == null) {
            return rs;
        }
        currentUser.setPassword(user.getPassword());
        currentUser.setUsername(user.getUsername());
        userService.update(currentUser);

        rs = true;
        return rs;
    }

    //------------------- Delete a User --------------------------------------------------------
    @DeleteMapping(value = "/user/{username}")
    public boolean deleteUser(@PathVariable("username") String id) {
        User user = userService.findUserByUsername(id);
        boolean rs = false;
        if (user == null) {
            return rs;
        }
        userService.delete(id);
        rs = true;
        return rs;
    }

    //------------------- Delete all User --------------------------------------------------------
    @DeleteMapping(value = "/user")
    public boolean deleteAllUsers() {
        boolean rs = false;
        {
            userService.deleteAll();
            rs = true;
        }
        return rs;
    }
}
