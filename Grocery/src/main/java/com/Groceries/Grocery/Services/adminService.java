package com.Groceries.Grocery.Services;

import com.Groceries.Grocery.Repositories.adminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class adminService {
    @Autowired
    private adminRepo adminrepo;
}
