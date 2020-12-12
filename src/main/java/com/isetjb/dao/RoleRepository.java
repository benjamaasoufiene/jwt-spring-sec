package com.isetjb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isetjb.entities.AppRole;

public interface RoleRepository extends JpaRepository<AppRole, Long>{
 public AppRole findRoleByRoleName(String rolename);
}
