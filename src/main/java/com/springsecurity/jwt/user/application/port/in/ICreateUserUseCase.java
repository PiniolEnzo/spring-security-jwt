package com.springsecurity.jwt.user.application.port.in;

public interface ICreateUserUseCase {
    public Long create(CreateUserCommand command);
}
