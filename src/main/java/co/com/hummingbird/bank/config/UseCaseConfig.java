package co.com.hummingbird.bank.config;

import co.com.hummingbird.bank.model.account.AccountUseCase;
import co.com.hummingbird.bank.model.account.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public AccountUseCase accountUseCase(AccountService accountService) {
        return new AccountUseCase(accountService);
    }
}
