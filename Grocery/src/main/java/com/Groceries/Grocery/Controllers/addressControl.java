package com.Groceries.Grocery.Controllers;

import com.Groceries.Grocery.DTOs.addressDTO;
import com.Groceries.Grocery.Models.addressModel;
import com.Groceries.Grocery.Services.addressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class addressControl {
    @Autowired
    private addressService addressserv;
    @RequestMapping("/address")
    public List<addressModel>getallAddress(){
        return addressserv.getallAddress();
    }
    @RequestMapping("/dto/address")
    public List<addressDTO>addressbyDto(){
        return addressserv.addressbyDto();
    }
    @RequestMapping("/address/{id}")
    public addressDTO getaddbyid(@PathVariable("id")long id){
        return addressserv.getaddbyid(id);
    }
    @PostMapping("/address")
    public addressModel createaddress(@RequestBody addressModel address){
        return addressserv.createaddress(address);
    }
    @PutMapping("/address")
    public addressModel updateaddress(@RequestBody addressModel incomingaddress){
        return addressserv.updateaddress(incomingaddress);
    }
}
