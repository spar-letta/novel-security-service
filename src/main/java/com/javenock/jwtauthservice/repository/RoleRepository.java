package com.javenock.jwtauthservice.repository;
import com.javenock.jwtauthservice.model.ERole;
import com.javenock.jwtauthservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}