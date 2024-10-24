package com.Groceries.Grocery.Controllers;
import com.Groceries.Grocery.DTOs.personDTO;
import com.Groceries.Grocery.Models.personModel;
import com.Groceries.Grocery.Services.personService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class personControl {
    @Autowired
    private personService personserv;
    @RequestMapping("/Persons")
    public List<personDTO> getallpersons(){
        return personserv.getallpersons();
    }
    @RequestMapping("/Persons/{id}")
    public personDTO getidbypersons(@PathVariable("id")Long id){
        return personserv.getidbypersons(id);
    }
    @RequestMapping("/Person/{role}")
    public List<personDTO> getrolebypersons(@PathVariable("role")String role){
        return personserv.getrolebypersons(role);
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
    public String deleteperson(@PathVariable("id") Long id){
        return personserv.deleteperson(id);
    }
}
