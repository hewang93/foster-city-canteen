package com.visa.ncg.canteen;

public class NegativeDepositException extends RuntimeException{
    public NegativeDepositException() {
        super();
    }

    public NegativeDepositException(String message) {
        super(message);
    }
}
