package com.Groceries.Grocery.Controllers;

import com.Groceries.Grocery.Services.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class orderControl {
    @Autowired
    private orderService orderserv;
}
