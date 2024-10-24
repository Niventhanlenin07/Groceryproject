package com.Groceries.Grocery.Services;

import com.Groceries.Grocery.Repositories.cartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cartService {
    @Autowired
    private cartRepo carrepo;
}
