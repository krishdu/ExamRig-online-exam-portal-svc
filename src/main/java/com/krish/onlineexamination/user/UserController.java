package com.krish.onlineexamination.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * get all user
     * @return list of {@link User}
     */
    @GetMapping("/user")
    public List<User> getAllUser() {
        return (List<User>) this.userRepository.findAll();
    }

    /**
     * get user detail by its email
     * @param email
     * @return {@link User}
     */
    @GetMapping("/user/{email}")
    public User getUserDetails(@PathVariable("email") String email) {
        return this.userRepository.findByEmail(email);
    }

    /**
     * to add a new user
     * @param user
     * @return {@link User}
     */
    @PostMapping("/user")
    public User addNewUser(@RequestBody User user) {
        return this.userRepository.save(user);
    }
}
