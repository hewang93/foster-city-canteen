// Trying another commit/push
//
package com.visa.ncg.canteen;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class AccountRepositoryTest {

    @Test
    public void findAllShouldReturn2Accounts() {
        List<Account> accounts = new ArrayList<>();

        Account a1 = new Account();
        a1.setId(1L);
        Account a2 = new Account();
        a2.setId(2L);
        accounts.add(a1);
        accounts.add(a2);

        AccountRepository repo = new AccountRepository(accounts);
        assertThat(repo.findAll())
                .hasSize(2);
    }

    @Test
    public void findOneTest(){
        List<Account> accounts = new ArrayList<>();

        Account account = new Account();

        account.setId(1L);
        accounts.add(account);
        System.out.println("accountid"+ account.getID());

        AccountRepository repo = new AccountRepository(accounts);
        Account a = repo.findOne(1L);

        assertThat(a.getID())
                .isEqualTo(account.getID());
    }


}
