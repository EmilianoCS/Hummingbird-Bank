package co.com.hummingbird.bank.service.account.mapper;

import co.com.hummingbird.bank.model.account.service.Account;
import co.com.hummingbird.bank.service.account.entity.AccountDTO;

public class AccountMapper {

    public static AccountDTO modelToEntity(Account account) {
        return AccountDTO.builder()
                .id(account.getId())
                .firstName(account.getFirstName())
                .firstSurname(account.getFirstSurname())
                .documentId(account.getDocumentId())
                .balance(account.getBalance())
                .build();
    }

    public static Account entityToModel(AccountDTO accountDTO) {
        return Account.builder()
                .id(accountDTO.getId())
                .firstName(accountDTO.getFirstName())
                .firstSurname(accountDTO.getFirstSurname())
                .documentId(accountDTO.getDocumentId())
                .balance(accountDTO.getBalance())
                .build();
    }
}
