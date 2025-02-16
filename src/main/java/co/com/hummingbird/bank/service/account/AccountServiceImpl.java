package co.com.hummingbird.bank.service.account;

import co.com.hummingbird.bank.model.account.service.Account;
import co.com.hummingbird.bank.model.account.service.AccountService;
import co.com.hummingbird.bank.service.account.entity.AccountDTO;
import co.com.hummingbird.bank.service.account.mapper.AccountMapper;
import co.com.hummingbird.bank.service.account.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    @Override
    public Account saveAccount(Account account) {
        AccountDTO accountDTO = accountRepository.save(AccountMapper.modelToEntity(account));

        return AccountMapper.entityToModel(accountDTO);
    }
}
