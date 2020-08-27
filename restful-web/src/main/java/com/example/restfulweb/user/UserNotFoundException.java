package com.example.restfulweb.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// HTTP Status code
// 2XX -> 정상처리
// 4XX -> client 오류
// 5XX -> server 오류
@ResponseStatus(HttpStatus.NOT_FOUND) //404 NOT FOUND 반환
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
