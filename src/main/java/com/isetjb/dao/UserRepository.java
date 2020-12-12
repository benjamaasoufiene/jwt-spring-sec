package com.isetjb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isetjb.entities.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Long>{
 public AppUser findByUsername(String username);
}
