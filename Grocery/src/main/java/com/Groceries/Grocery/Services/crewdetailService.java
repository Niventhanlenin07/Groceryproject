package com.Groceries.Grocery.Services;

import com.Groceries.Grocery.Repositories.crewdetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class crewdetailService {
    @Autowired
    private crewdetailsRepo crewdetailsrepo;
}
