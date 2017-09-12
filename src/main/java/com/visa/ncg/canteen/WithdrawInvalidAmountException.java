package com.visa.ncg.canteen;

public class WithdrawInvalidAmountException extends RuntimeException{
    public WithdrawInvalidAmountException() {super();}

    public WithdrawInvalidAmountException(String message) {
        super(message);
    }

}
