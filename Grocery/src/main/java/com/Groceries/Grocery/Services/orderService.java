package com.Groceries.Grocery.Services;

import com.Groceries.Grocery.Repositories.orderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class orderService {
    @Autowired
    private orderRepo orderrepo;
}
