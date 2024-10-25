package com.developer.E_commerce.Full.stack.project.Repository;

import com.developer.E_commerce.Full.stack.project.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepository extends JpaRepository<Admin,Long>
{
    @Query(value= "query", nativeQuery = true)
   Admin findByUsername(String username);
}
