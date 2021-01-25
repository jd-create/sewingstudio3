package nl.jenniferdemeijer.sewing_jwt.service;

import nl.jenniferdemeijer.sewing_jwt.exceptions.RecordNotFoundException;
import nl.jenniferdemeijer.sewing_jwt.model.Address;
import nl.jenniferdemeijer.sewing_jwt.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;
/*
    @Override
    public String createAddress(Address address) {
        Address newAddress = addressRepository.save(address);
        return newAddress.getAddressid();
    }

    @Override
    public void updateAddress(String addressid, String street, String houseNumber, String city, Address newAddress) {
        if(!addressRepository.existsById(addressid)) throw new RecordNotFoundException();
        Address address = addressRepository.findById(addressid).get();
        address.setStreet(newAddress.getStreet());
        address.setHouseNumber(newAddress.getHouseNumber());
        address.setCity(newAddress.getCity());
        addressRepository.save(address);

    }

    @Override
    public void deleteAddress(String addressid) {

    }*/

    @Override
    public Collection<Address> getAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Optional<Address> getAddress(String addressid) {
        return addressRepository.findById(addressid);
    }
/*
    @Override
    public boolean addressExists(String addressid) {
        return addressRepository.existsById(addressid);
    }*/
}
