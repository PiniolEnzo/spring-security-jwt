package com.springsecurity.jwt.user.application.port.in;

import com.springsecurity.jwt.user.domain.model.Role;


import java.util.List;

public record CreateUserCommand (
        Long id,
        String firstName,
        String surname,
        String email,
        String password,
        List<Role> role
) { }
