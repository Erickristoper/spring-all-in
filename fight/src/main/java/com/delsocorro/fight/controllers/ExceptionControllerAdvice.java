package com.delsocorro.fight.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.delsocorro.fight.exceptions.ErrorDetails;
import com.delsocorro.fight.exceptions.NoFightDrawException;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NoFightDrawException.class) 
    public ResponseEntity<?> noFightDrawExceptionHandler() {
        ErrorDetails ed = new ErrorDetails();
        ed.setMessage("No draw figths cannot proceed");
        return ResponseEntity.badRequest().body(ed);
    }
}
