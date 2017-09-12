package com.visa.ncg.canteen;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountDepositTest {

  @Test
  public void newAccountsHaveZeroBalance() throws Exception {
    Account account = new Account();

    assertThat(account.balance())
        .isZero();
  }

  @Test
  public void depositing10DollarsToNewAccountResultsInAccountHaving10Dollars() throws Exception {
    Account account = new Account();

    account.deposit(10);

    assertThat(account.balance())
        .isEqualTo(10);
  }

  @Test
  public void deposit5DollarsToAccountWith10DollarBalanceResultsIn15DollarBalance() throws Exception {
    Account account = new Account(10);

    account.deposit(5);

    assertThat(account.balance())
        .isEqualTo(15);
  }

  @Test
  public void withdraw3DollarsFromAccountHaving7DollarsResultsIn4DollarBalance() throws Exception {
    Account account = new Account(7);

    account.withdraw(3);

    assertThat(account.balance())
        .isEqualTo(4);
  }

}
