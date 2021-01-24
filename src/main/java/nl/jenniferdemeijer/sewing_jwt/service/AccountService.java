package nl.jenniferdemeijer.sewing_jwt.service;

import nl.jenniferdemeijer.sewing_jwt.model.Authority;
import nl.jenniferdemeijer.sewing_jwt.model.Account;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public interface AccountService {

    public abstract String createUser(Account account);
    public abstract void updateUser(String username, Account account);
    public abstract void deleteUser(String username);
    public abstract Collection<Account> getUsers();
    public abstract Optional<Account> getUser(String username);
    public abstract boolean userExists(String username);
    public abstract Set<Authority> getAuthorities(String username);
    public abstract void addAuthority(String username, String authority);
    public abstract void removeAuthority(String username, String authority);

}