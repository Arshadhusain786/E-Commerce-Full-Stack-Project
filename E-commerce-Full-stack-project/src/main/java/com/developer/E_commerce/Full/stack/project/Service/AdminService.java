package com.developer.E_commerce.Full.stack.project.Service;

import com.developer.E_commerce.Full.stack.project.Model.Admin;
import com.developer.E_commerce.Full.stack.project.dto.AdminDto;

public interface AdminService
{
 Admin findByUsername(String username);
 Admin save(AdminDto adminDto);

}
