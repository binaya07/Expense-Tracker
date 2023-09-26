package com.lsu.expensetracker.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import com.lsu.expensetracker.models.User;
import com.lsu.expensetracker.services.UserService;

@Controller
@RequestMapping("/api/users")
public class UserController {

//	@Autowired
//    private UserService service;

//    @GetMapping
//    public List<User> getAllUsers() {
//        return service.getAllUsers();
//    }

//    @GetMapping("/{id}")
//    public User getUserById(@PathVariable Long id) {
//        return service.getUserById(id).orElse(null);
//    }
//
//    @PostMapping
//    public User saveUser(@RequestBody User User) {
//        return service.saveUser(User);
//    }
//
//    @PutMapping("/{id}")
//    public User updateUser(@PathVariable Long id, @RequestBody User User) {
//        if (service.getUserById(id).isPresent()) {
//            return service.saveUser(User);
//        }
//        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found.");
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteUser(@PathVariable Long id) {
//        service.deleteUser(id);
//    }
}
