package nl.jenniferdemeijer.sewing_jwt.service;

import nl.jenniferdemeijer.sewing_jwt.model.Authority;
import nl.jenniferdemeijer.sewing_jwt.model.Account;
import nl.jenniferdemeijer.sewing_jwt.exceptions.RecordNotFoundException;
import nl.jenniferdemeijer.sewing_jwt.exceptions.UsernameNotFoundException;
import nl.jenniferdemeijer.sewing_jwt.repository.AccountRepository;
import nl.jenniferdemeijer.sewing_jwt.utils.RandomStringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Collection<Account> getUsers() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<Account> getUser(String username) {
        return accountRepository.findById(username);
    }

    @Override
    public boolean userExists(String username) {
        return accountRepository.existsById(username);
    }

    @Override
    public String createUser(Account account) {
        String randomString = RandomStringGenerator.generateAlphaNumeric(20);
        account.setApikey(randomString);
        Account newAccount = accountRepository.save(account);
        return newAccount.getUsername();
    }

    @Override
    public void deleteUser(String username) {
        accountRepository.deleteById(username);
    }

    @Override
    public void updateUser(String username, Account newAccount) {
        if (!accountRepository.existsById(username)) throw new RecordNotFoundException();
        Account account = accountRepository.findById(username).get();
        account.setPassword(newAccount.getPassword());
        accountRepository.save(account);
    }

    @Override
    public Set<Authority> getAuthorities(String username) {
        if (!accountRepository.existsById(username)) throw new UsernameNotFoundException(username);
        Account account = accountRepository.findById(username).get();
        return account.getAuthorities();
    }

    @Override
    public void addAuthority(String username, String authority) {
        if (!accountRepository.existsById(username)) throw new UsernameNotFoundException(username);
        Account account = accountRepository.findById(username).get();
        account.addAuthority(new Authority(username, authority));
        accountRepository.save(account);
    }

    @Override
    public void removeAuthority(String username, String authority) {
        if (!accountRepository.existsById(username)) throw new UsernameNotFoundException(username);
        Account account = accountRepository.findById(username).get();
        Authority authorityToRemove = account.getAuthorities().stream().filter((a) -> a.getAuthority().equalsIgnoreCase(authority)).findAny().get();
        account.removeAuthority(authorityToRemove);
        accountRepository.save(account);
    }

}