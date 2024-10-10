package com.Groceries.Grocery.Services;

import com.Groceries.Grocery.Models.personModel;
import com.Groceries.Grocery.Repositories.personRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class personService {
    @Autowired
    private personRepo personrepo;
    public List<personModel> getallpersons(String Role){
//        List<PersonDTO> list;
//        personrepo.findAll().forEach(rec -> {
//        PersonDTO dto = new PersonDTO;
////        dto.setAddress(rec.getAddress());
////        list.add(dto);
//        })

        List<personModel>personlist=new ArrayList<>();
        if(Role==null){
            personrepo.findAll().forEach(person->{personlist.add(person);});

        }else{
            return personrepo.findByRole(Role);
        }
        System.out.println("Get all persons details");
        return personlist;
    }
    public Optional<personModel> getidbypersons(Long id) {
        System.out.println("Get all persons details from given n points");
        return personrepo.findById(id);
    }
    public personModel createperson(personModel person){
        System.out.println("Persons details saved");
        return personrepo.save(person);
    }
    public personModel updateperson(personModel incomingperson){
        System.out.println("Persons details updated");
        return personrepo.save(incomingperson);
    }
    public String deleteperson(Long id){
        personrepo.deleteById(id);
        return "Delete successfully...";
    }
}
