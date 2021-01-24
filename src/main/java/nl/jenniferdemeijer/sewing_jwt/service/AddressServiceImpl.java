package nl.jenniferdemeijer.sewing_jwt.service;

import nl.jenniferdemeijer.sewing_jwt.model.Address;
import nl.jenniferdemeijer.sewing_jwt.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressServiceImpl implements AddressService{

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public String createAddress(Address address) {
        Address newAddress = addressRepository.save(address);
        return newAddress.getAddressid();
    }
}
