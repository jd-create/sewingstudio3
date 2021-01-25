package nl.jenniferdemeijer.sewing_jwt.service;


import nl.jenniferdemeijer.sewing_jwt.model.Address;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public interface AddressService

{
   // String createAddress(Address address);


    //void updateAddress(String addressid, String street, String houseNumber, String city, Address address);
   // void deleteAddress(String addressid);
    Collection<Address> getAddresses();
    Optional<Address> getAddress(String addressid);
   //boolean addressExists(String addressid);
}
