package com.example.demo_01.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException() {
        super();
    }
    public BookNotFoundException(String message) {
        super(message);
    }
}
