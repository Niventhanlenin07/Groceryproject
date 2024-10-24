package com.Groceries.Grocery.Controllers;

import com.Groceries.Grocery.Services.returnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class returnControl {
    @Autowired
    private returnService returnserv;
}
