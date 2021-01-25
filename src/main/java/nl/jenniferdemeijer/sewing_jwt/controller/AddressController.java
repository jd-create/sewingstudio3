package nl.jenniferdemeijer.sewing_jwt.controller;
import nl.jenniferdemeijer.sewing_jwt.model.Address;
import nl.jenniferdemeijer.sewing_jwt.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping(value = "")
    public ResponseEntity<Object> getAddresses(){
        return ResponseEntity.ok().body(addressService.getAddresses());
    }

    @GetMapping(value = "/{addressid}")
    public ResponseEntity<Object> getAddress(@PathVariable("addressid") String addressid){
        return ResponseEntity.ok().body(addressService.getAddress(addressid));
    }
}
