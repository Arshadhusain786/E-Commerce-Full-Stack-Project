package com.developer.E_commerce.Full.stack.project.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdminDto
{
    @Size(min=3,max=10,message = "Invalid first name!(3-10 characters)")
    @Length
    private String firstname;

    @Size(min=3,max=10,message = "Invalid first name!(3-10 characters)")
    private String lastname;

    private String username;

    @Size(min=3,max=10,message = "Invalid first name!(3-10 characters)")
    private String password;

    private String repeatPassword;
}
