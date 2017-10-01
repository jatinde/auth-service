package com.cloudnative.authservice;

import com.cloudnative.authservice.model.Account;
import com.cloudnative.authservice.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class SampleDataCLR implements CommandLineRunner {

    private final AccountRepository accountRepository;

    public SampleDataCLR(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        /*Stream.of("jatinder,jatinder","lovely,lovely")
                .map(cred -> cred.split(","))
                .forEach(tpl -> this.accountRepository.save(
                        new Account(tpl[0], tpl[1], true)));*/
    }
}
