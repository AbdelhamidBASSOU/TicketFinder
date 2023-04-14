package com.malkfilipp.travelplanner.auth;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    private String fullName;
    private String username;
    private String password;
    private String email;
    private String phone;
}
