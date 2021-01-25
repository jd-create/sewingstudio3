package nl.jenniferdemeijer.sewing_jwt.repository;

import nl.jenniferdemeijer.sewing_jwt.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, String> {

}
