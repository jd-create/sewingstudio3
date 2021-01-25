package nl.jenniferdemeijer.sewing_jwt.repository;

import nl.jenniferdemeijer.sewing_jwt.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {

}
