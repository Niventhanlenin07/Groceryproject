package com.Groceries.Grocery.Controllers;

import com.Groceries.Grocery.Models.personModel;
import com.Groceries.Grocery.Services.personService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class personControl {
    @Autowired
    private personService personserv;
    @RequestMapping("/Persons")
    public List<personModel> getallpersons(@RequestParam(value = "role",required = false) String Role){
        return personserv.getallpersons(Role);
    }
    @RequestMapping("/Persons/{id}")
    public Optional<personModel> getidbypersons(@PathVariable("id")Long id){
        return personserv.getidbypersons(id);
    }
    @PostMapping("/Persons")
    public personModel createperson(@RequestBody personModel person){
        return personserv.createperson(person);
    }
    @PutMapping("/Persons")
    public personModel updateperson(@RequestBody personModel incomingperson){
        return personserv.updateperson(incomingperson);
    }
    @DeleteMapping("/Persons/{id}")
    public String deleteperson(@PathVariable Long id){
        return personserv.deleteperson(id);
    }
}
