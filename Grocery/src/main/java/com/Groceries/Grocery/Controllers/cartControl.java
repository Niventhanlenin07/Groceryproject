package com.Groceries.Grocery.Controllers;

import com.Groceries.Grocery.Services.cartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cartControl {
    @Autowired
    private cartService cartserv;
}
