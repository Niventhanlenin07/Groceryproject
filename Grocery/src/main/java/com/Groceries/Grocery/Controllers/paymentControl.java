package com.Groceries.Grocery.Controllers;

import com.Groceries.Grocery.Services.paymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class paymentControl {
    @Autowired
    private paymentService paymentserv;
}
