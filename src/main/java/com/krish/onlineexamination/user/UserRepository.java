package com.krish.onlineexamination.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

    /**
     * find User by email id
     * @param email
     * @return User
     */
    public User findByEmail(String email);
}
