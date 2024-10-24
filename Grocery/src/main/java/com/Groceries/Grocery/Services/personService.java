package com.Groceries.Grocery.Services;
import com.Groceries.Grocery.DTOs.addressDTO;
import com.Groceries.Grocery.DTOs.personDTO;
import com.Groceries.Grocery.Models.personModel;
import com.Groceries.Grocery.Repositories.personRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personService {
    @Autowired
    private personRepo personrepo;

    public List<personDTO> getallpersons() {
        List<personModel> personlist = personrepo.findAll();
        return personlist.stream().map(this::getpersons).toList();
    }
    private personDTO getpersons(personModel person){
        addressDTO address=new addressDTO();
        if(person.getAddress()!=null){
            address.setCity(person.getAddress().getCity());
            address.setCountry(person.getAddress().getCountry());
        }
        personDTO dto=new personDTO();
        dto.setId(person.getId());
        dto.setFirst_name(person.getFirst_name());
        dto.setRole(person.getRole());
        dto.setNumber(person.getNumber());
        dto.setCity(address.getCity());
        dto.setCountry(address.getCountry());
        return dto;
    }
    public personDTO getidbypersons(Long id) {
        personModel person=personrepo.findById(id).orElseThrow();
        return getidpersons(person);
    }
    private personDTO getidpersons(personModel person){
        addressDTO address=new addressDTO();
        if(person.getAddress()!=null){
            address.setCity(person.getAddress().getCity());
            address.setCountry(person.getAddress().getCountry());
        }
        personDTO dto=new personDTO();
        dto.setId(person.getId());
        dto.setFirst_name(person.getFirst_name());
        dto.setRole(person.getRole());
        dto.setNumber(person.getNumber());
        dto.setCity(address.getCity());
        dto.setCountry(address.getCountry());
        return dto;
    }
    public List<personDTO> getrolebypersons(String role) {
        List<personModel>personModelList= personrepo.findByRole(role);
        return personModelList.stream().map(this::getrolepersons).toList();
    }
    private personDTO getrolepersons(personModel person){
        addressDTO address=new addressDTO();
        if(person.getAddress()!=null){
            address.setCity(person.getAddress().getCity());
            address.setCountry(person.getAddress().getCountry());
        }
        personDTO dto=new personDTO();
        dto.setId(person.getId());
        dto.setFirst_name(person.getFirst_name());
        dto.setRole(person.getRole());
        dto.setNumber(person.getNumber());
        dto.setCity(address.getCity());
        dto.setCountry(address.getCountry());
        return dto;
    }

    public personModel createperson(personModel person) {
        System.out.println("Persons details saved");
        return personrepo.save(person);
    }

    public personModel updateperson(personModel incomingperson) {
        System.out.println("Persons details updated");
        return personrepo.save(incomingperson);
    }

    public String deleteperson(Long id) {
        personrepo.deleteById(id);
        return "Delete successfully...";
    }

}
