package com.college.myown.api;

import com.college.myown.dao.UserRepository;
import com.college.myown.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private UserRepository userRepo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @PostMapping("add")
    public String addUser(@RequestBody User user)
    {
        String pass=user.getPasswo();
        String encptPass=passwordEncoder.encode(pass);
        user.setPasswo(encptPass);

        userRepo.save(user);
        return "User Added to the Database";
    }
    @GetMapping("/getUserDetails")
    public List<User> getUserDetails()
    {
        return userRepo.findAll();
    }





}
