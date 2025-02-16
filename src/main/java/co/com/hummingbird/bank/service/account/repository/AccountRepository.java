package co.com.hummingbird.bank.service.account.repository;

import co.com.hummingbird.bank.service.account.entity.AccountDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountDTO, String> {
}
