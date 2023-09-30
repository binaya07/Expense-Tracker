package com.lsu.expensetracker.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lsu.expensetracker.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	List<User> findByEmail(String email);

}
