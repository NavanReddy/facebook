package com.facebook.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facebook.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
