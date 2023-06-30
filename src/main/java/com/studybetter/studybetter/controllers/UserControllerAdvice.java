package com.studybetter.studybetter.controllers;

import com.studybetter.studybetter.exceptions.UserDoesntExistsException;
import com.studybetter.studybetter.exceptions.UsernameAlreadyInUseException;
import com.studybetter.studybetter.utils.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class UserControllerAdvice {


    @ExceptionHandler(UsernameAlreadyInUseException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorMessage usernameAlreadyInUseException() {
        return ErrorMessage.builder().message("Username already in use! Please choose another username!").generatedAt(LocalDateTime.now()).build();
    }

    @ExceptionHandler(UserDoesntExistsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorMessage userDoesntExistsException() {
        return ErrorMessage.builder().message("A user with the given username doesn't exist! Please enter a valid username or try to register.").generatedAt(LocalDateTime.now()).build();
    }

    @ExceptionHandler(BadCredentialsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorMessage badCredentialsException() {
        return ErrorMessage.builder().message("Invalid credentials! Please enter valid username and password!.").generatedAt(LocalDateTime.now()).build();
    }

}
