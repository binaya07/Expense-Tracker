package com.lsu.expensetracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsu.expensetracker.models.User;
import com.lsu.expensetracker.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
    private UserRepository repository;

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return repository.findById(id);
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
    
    public boolean login(User user) {
    	List<User> users = repository.findByEmail(user.getEmail());
    	if (users.size() > 0) {
    		String pwd = users.get(0).getPassword();
    		if (pwd.equals(user.getPassword().strip())) {
    			return true;
    		}
    	}
    	return false;
    }

}
