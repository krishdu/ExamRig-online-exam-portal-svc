package com.krish.onlineexamination.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    /**
     * get admin detail by admin_name
     * @param name
     * @return {@link Admin}
     */
    @GetMapping("/admin/{name}")
    public Admin getAdminDetails(@PathVariable("name") String name) {
        return this.adminRepository.findByName(name);
    }

}
