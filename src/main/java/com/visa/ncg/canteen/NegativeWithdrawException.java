package com.visa.ncg.canteen;

public class NegativeWithdrawException extends RuntimeException {
    public NegativeWithdrawException() {
        super();
    }

    public NegativeWithdrawException(String message) {
        super(message);
    }
}
