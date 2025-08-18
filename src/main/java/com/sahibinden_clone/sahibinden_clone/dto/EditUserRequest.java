package com.sahibinden_clone.sahibinden_clone.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EditUserRequest {
    @Email @NotBlank
    private String email;

    @NotBlank
    @Size(min = 7, max = 20)
    private String phone;

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
