package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;

@Service
public interface RoleService {
    Role findRoleById(Integer id);

    List<Role> getAllRoles();

    void addRole(Role role);
}
