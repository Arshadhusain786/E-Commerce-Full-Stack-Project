package com.developer.E_commerce.Full.stack.project.Repository;

import com.developer.E_commerce.Full.stack.project.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>
{
   Role findByName(String name);
}
