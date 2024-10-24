package com.Groceries.Grocery.Services;

import com.Groceries.Grocery.DTOs.addressDTO;
import com.Groceries.Grocery.Models.addressModel;
import com.Groceries.Grocery.Repositories.addressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class addressService {
    @Autowired
    private addressRepo addressrepo;

    public List<addressModel> getallAddress() {
        return addressrepo.findAll();
    }
    public List<addressDTO> addressbyDto(){
        List<addressModel>address=addressrepo.findAll();
        return address.stream().map(this::getallAddress).toList();
    }
    private addressDTO getallAddress(addressModel add){
        addressDTO addresses=new addressDTO();
        addresses.setDoorNum(add.getDoornum());
        addresses.setCity(add.getCity());
        addresses.setDistrict(add.getDistrict());
        addresses.setCountry(add.getCountry());
        addresses.setPincode(add.getPincode());
        return addresses;
    }

    public addressDTO getaddbyid(long id) {
        addressModel address=addressrepo.findById(id).orElseThrow();
        return addressbyid(address);
    }
    private addressDTO addressbyid(addressModel add){
        addressDTO ad=new addressDTO();
        ad.setDoorNum(add.getDoornum());
        ad.setCity(add.getCity());
        ad.setDistrict(add.getDistrict());
        ad.setCountry(add.getCountry());
        ad.setPincode(add.getPincode());
        return ad;
    }

    public addressModel createaddress(addressModel address) {
        return addressrepo.save(address);
    }
    public addressModel updateaddress(addressModel incomingaddress) {
        return addressrepo.save(incomingaddress);
    }
}
