package com.visa.ncg.canteen;

public class NegativeOrZeroTransferException extends RuntimeException {
    public NegativeOrZeroTransferException() {
        super();
    }

    public NegativeOrZeroTransferException(String message) {
        super(message);
    }
}
