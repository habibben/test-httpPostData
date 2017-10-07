package fr.maison.main.controller;

import fr.maison.main.dao.IUserRepository;
import fr.maison.main.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    IUserRepository userRepository;

    @RequestMapping("/saveUser")
    @CrossOrigin("http://localhost:8081")
    public void saveUser(User user){
        userRepository.save(user);
    }

}
