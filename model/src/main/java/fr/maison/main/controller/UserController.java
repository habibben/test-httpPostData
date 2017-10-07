package fr.maison.main.controller;

import fr.maison.main.dao.IUserRepository;
import fr.maison.main.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.MimeMappings;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    IUserRepository userRepository;

    @RequestMapping(value = "/saveUser",
                    consumes = MediaType.APPLICATION_JSON_VALUE,
                    method = RequestMethod.POST)
    @CrossOrigin("http://localhost:8081")
    public void saveUser(@RequestBody User user){

        userRepository.save(user);
    }

}
