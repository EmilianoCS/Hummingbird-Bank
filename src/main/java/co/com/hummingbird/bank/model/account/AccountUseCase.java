package co.com.hummingbird.bank.model.account;

import co.com.hummingbird.bank.model.account.service.Account;
import co.com.hummingbird.bank.model.account.service.AccountService;
import lombok.AllArgsConstructor;

import java.util.Random;

@AllArgsConstructor
public class AccountUseCase {

    private AccountService accountService;

    public Account create(Account account) {
        return accountService.saveAccount(account.toBuilder()
                .id(generateAccountId())
                .balance(0)
                .build());
    }

    private String generateAccountId() {
        Random random = new Random();
        int part1 = random.nextInt(1000);
        int part2 = random.nextInt(1000000);
        int part3 = random.nextInt(100);

        return String.format("%03d-%06d-%02d", part1, part2, part3);
    }
}
