package com.isetjb.service;

import com.isetjb.entities.AppRole;
import com.isetjb.entities.AppUser;

public interface AccountService {
public AppUser saveUser(AppUser user);
public AppRole saveRole(AppRole role);
public void addRoleToUser(String username, String roleName);
public AppUser findUserByUsername(String username);
}
