package com.visa.ncg.canteen;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;


@Controller
public class AccountWebController {

    private AccountRepository accountRepository;

    public AccountWebController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping("/account/{id}")
    public String accountView(@PathVariable("id") String id, Model model) {
        Account account;
        AccountResponse accountResponse = new AccountResponse();

        account = accountRepository.findOne(Long.valueOf(id));

        accountResponse.setId(account.getID());
        accountResponse.setBalance(account.balance());
        accountResponse.setName(account.getName());

        model.addAttribute("account", accountResponse);
        return "account-view";
    }

    @GetMapping("/account")
    public String accountView(Model model){
        List<Account> account;
        List<AccountResponse> accountResponseList = new ArrayList<AccountResponse>();
        account = accountRepository.findAll();
        AccountResponse accountResponse;
        for(Account ac : account)
        {
            accountResponse = new AccountResponse();
            accountResponse.setId(ac.getID());
            accountResponse.setBalance(ac.balance());
            accountResponse.setName(ac.getName());
            accountResponseList.add(accountResponse);
        }
        System.out.println(accountResponseList.size());
        model.addAttribute("accounts", accountResponseList);

        return "all-accounts";
    }
}
