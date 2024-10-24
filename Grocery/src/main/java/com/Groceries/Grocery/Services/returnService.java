package com.Groceries.Grocery.Services;

import com.Groceries.Grocery.Repositories.returnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class returnService {
    @Autowired
    private returnRepo returnrepo;
}
