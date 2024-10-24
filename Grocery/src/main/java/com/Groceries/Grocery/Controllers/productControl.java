package com.Groceries.Grocery.Controllers;

import com.Groceries.Grocery.DTOs.productsDTO;
import com.Groceries.Grocery.Models.productModel;
import com.Groceries.Grocery.Services.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class productControl {
    @Autowired
    private productService productserv;
    @RequestMapping("/products")
    public List<productsDTO>getallproducts(){
        return productserv.getallproducts();
    }

    @RequestMapping("/products/{id}")
    public Optional<productsDTO> getidbyproducts(@PathVariable("id")long id){
        return productserv.getidbyproducts(id);
    }
    @RequestMapping("/product/{catagory}")
    public List<productsDTO>productbycatagory(@PathVariable("catagory")String catagory){
        return productserv.productbycatagory(catagory);
    }

}
