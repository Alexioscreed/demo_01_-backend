package com.example.demo_01.exception;

public class BookIdMismatchException extends RuntimeException {
    public BookIdMismatchException() {
        super();
    }
    public BookIdMismatchException(String message) {
        super(message);
    }
}
