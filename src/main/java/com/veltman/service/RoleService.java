package com.veltman.service;

import com.veltman.model.Role;

import java.util.Set;

public interface RoleService {

    Set<Role> findAll();

    Role findByName(String name);

    void save(Role role);

    Role findById(Long id);

}
