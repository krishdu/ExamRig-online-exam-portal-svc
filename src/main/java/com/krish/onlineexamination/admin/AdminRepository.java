package com.krish.onlineexamination.admin;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {

    /**
     * admin by name/email
     * @param name
     * @return {@link Admin }
     */
    public Admin findByName(String name);
}
