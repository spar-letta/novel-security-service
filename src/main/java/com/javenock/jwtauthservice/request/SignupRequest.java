package com.javenock.jwtauthservice.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class SignupRequest {
    private String name;

    @Size(min = 3, max = 20)
    private String username;

    @Size(max = 50)
    @Email
    private String email;

    private Set<String> role;

    @Size(min = 6, max = 40)
    private String password;
}
