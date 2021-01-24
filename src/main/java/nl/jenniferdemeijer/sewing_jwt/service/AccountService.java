package nl.jenniferdemeijer.sewing_jwt.service;

import nl.jenniferdemeijer.sewing_jwt.model.Authority;
import nl.jenniferdemeijer.sewing_jwt.model.Account;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public interface AccountService {

    String createUser(Account account);
    void updateUser(String username, Account account);
    void deleteUser(String username);
    Collection<Account> getUsers();
    Optional<Account> getUser(String username);
    boolean userExists(String username);
    Set<Authority> getAuthorities(String username);
    void addAuthority(String username, String authority);
    void removeAuthority(String username, String authority);

}