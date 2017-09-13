package com.visa.ncg.canteen;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AccountTransferTest {
    @Test
    public void normalTransferTest() throws Exception {
        Account sourceAccount = new Account(20);
        Account destAccount = new Account(20);

        AccountTransferService transferService = new AccountTransferService();

        transferService.transfer(sourceAccount, destAccount, 10);

        assertThat(sourceAccount.balance())
                .isEqualTo(10);

        assertThat(destAccount.balance())
                .isEqualTo(30);
    }

    @Test
    public void transferZeroTest() throws Exception {
        Account sourceAccount = new Account(20);
        Account destAccount = new Account(20);

        AccountTransferService transferService = new AccountTransferService();

        assertThatThrownBy(() -> { transferService.transfer(sourceAccount, destAccount, 0); })
                .isInstanceOf(NegativeOrZeroTransferException.class);
    }

    @Test
    public void sourceInsufficientFundsTransfer() throws Exception {
        Account sourceAccount = new Account(20);
        Account destAccount = new Account(20);

        AccountTransferService transferService = new AccountTransferService();

        assertThatThrownBy(() -> { transferService.transfer(sourceAccount, destAccount, 30); })
                .isInstanceOf(InsufficientBalanceException.class);
    }

    @Test
    public void transferNegativeTest() throws Exception {
        Account sourceAccount = new Account(20);
        Account destAccount = new Account(20);

        AccountTransferService transferService = new AccountTransferService();

        assertThatThrownBy(() -> { transferService.transfer(sourceAccount, destAccount, -10); })
                .isInstanceOf(NegativeOrZeroTransferException.class);
    }
}
