package com.Groceries.Grocery.Controllers;

import com.Groceries.Grocery.Services.crewdetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class crewdetailsControl {
    @Autowired
    private crewdetailService crewdetailserv;
}
