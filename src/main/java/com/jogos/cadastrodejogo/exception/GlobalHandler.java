package com.jogos.cadastrodejogo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandler {

    @ExceptionHandler(JogoNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage jogoNaoEncontradoException(JogoNaoEncontradoException e){
        return new ErrorMessage(404, HttpStatus.NOT_FOUND.toString(), e.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorMessage methodArgumentNotValidException(MethodArgumentNotValidException e){
        return new ErrorMessage(400, HttpStatus.BAD_REQUEST.toString(), e.getBindingResult().getFieldError().getDefaultMessage());
    }
}
