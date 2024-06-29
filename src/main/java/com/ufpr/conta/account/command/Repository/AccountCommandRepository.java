package com.ufpr.conta.account.command.Repository;

import com.ufpr.conta.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountCommandRepository extends JpaRepository<Account, Long> {
}