package co.com.hummingbird.bank.controller;

import co.com.hummingbird.bank.model.account.AccountUseCase;
import co.com.hummingbird.bank.model.account.service.Account;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AccountController {

    AccountUseCase accountUseCase;

    @PostMapping("/api/account")
    public Account createAccount(@RequestBody Account account) {
        return accountUseCase.create(account);
    }
}
