package com.developer.E_commerce.Full.stack.project.Service.impl;

import com.developer.E_commerce.Full.stack.project.Model.Admin;
import com.developer.E_commerce.Full.stack.project.Repository.AdminRepository;
import com.developer.E_commerce.Full.stack.project.Repository.RoleRepository;
import com.developer.E_commerce.Full.stack.project.Service.AdminService;
import com.developer.E_commerce.Full.stack.project.dto.AdminDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class AdminServiceImpl implements AdminService
{
    @Autowired
    private AdminRepository adminRepository;
     @Autowired
     private RoleRepository roleRepository;

    @Override
    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    @Override
    public Admin save(AdminDto adminDto) {
        Admin admin = new Admin();
        admin.setFirstName(adminDto.getFirstname());
        admin.setLastName(adminDto.getLastname());
        admin.setUsername(adminDto.getUsername());
        admin.setPassword(adminDto.getPassword());
        admin.setRoles(Arrays.asList(roleRepository.findByName("ADMIN")));
        return adminRepository.save(admin);
    }
}
