package com.Groceries.Grocery.Services;

import com.Groceries.Grocery.Repositories.paymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class paymentService {
    @Autowired
    private paymentRepo paymentrepo;
}
