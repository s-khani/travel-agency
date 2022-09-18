package com.sda.travelagency.controller.advisor;

import com.sda.travelagency.dto.ErrorResponse;
import com.sda.travelagency.exception.TripNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.time.LocalDateTime;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@Slf4j
@RestControllerAdvice
public class TripControllerAdvisor {

    @ResponseStatus(NOT_FOUND)
    @ExceptionHandler(TripNotFoundException.class)
    public ErrorResponse handleNotFoundTrips(TripNotFoundException exc) {
        log.warn("handling not found trip", exc);

        return new ErrorResponse(LocalDateTime.now(),
                404,
                exc.getMessage(),
                ServletUriComponentsBuilder.fromCurrentRequest().build().toString());
    }

    @ResponseStatus(BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResponse handleBadRequest(MethodArgumentNotValidException exc){
        log.warn("unexpected validation exception occurred :)",exc);
        return new ErrorResponse(LocalDateTime.now(),
                BAD_REQUEST.value(),
                exc.getMessage(),
                ServletUriComponentsBuilder.fromCurrentRequest().toUriString()
        );
    }
}

