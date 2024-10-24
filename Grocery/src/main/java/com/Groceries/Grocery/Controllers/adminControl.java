package com.Groceries.Grocery.Controllers;

import com.Groceries.Grocery.Services.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class adminControl {
    @Autowired
    private adminService adminserv;
}
