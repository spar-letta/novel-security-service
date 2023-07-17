package com.javenock.jwtauthservice.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtResponse {

    private long id;
    private String name;
    private String token;
    private List<String> roles;
}