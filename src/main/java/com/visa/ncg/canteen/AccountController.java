package com.visa.ncg.canteen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping("/api/accounts/{text}")
    public AccountResponse accountInfo(@PathVariable("text") String accountId){
        AccountResponse accountResp = new AccountResponse();
        Account account = accountRepository.findOne(Long.valueOf(accountId));
        accountResp.setId(account.getID());
        accountResp.setBalance(account.balance());

        return accountResp;

    }
}
