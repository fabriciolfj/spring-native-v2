package com.github.fabriciolfj.productservice.exceptions;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(final String msg) {
        super(msg);
    }
}
