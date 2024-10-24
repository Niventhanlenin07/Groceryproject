package com.Groceries.Grocery.Services;

import com.Groceries.Grocery.DTOs.productsDTO;
import com.Groceries.Grocery.Models.productModel;
import com.Groceries.Grocery.Repositories.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class productService {
    @Autowired
    private productRepo productrepo;
    public List<productsDTO> getallproducts() {
        List<productModel>productmodelList=productrepo.findAll();
        return productmodelList.stream().map(this::getallproduct).toList();
    }

    private productsDTO getallproduct(productModel productModel) {
        productsDTO products=new productsDTO();
        products.setProductName(productModel.getProductName());
        products.setBrandName(productModel.getBrandName());
        products.setNetWeight(productModel.getNetWeight());
        products.setProductPrice(productModel.getProductPrice());
        return products;
    }

    public Optional<productsDTO> getidbyproducts(long id) {
        productModel product=productrepo.findById(id).orElseThrow();
        return getallproductbyid(product);
    }

    private Optional<productsDTO> getallproductbyid(productModel productModel) {
        productsDTO products=new productsDTO();
        products.setProductName(productModel.getProductName());
        products.setBrandName(productModel.getBrandName());
        products.setNetWeight(productModel.getNetWeight());
        products.setProductPrice(productModel.getProductPrice());
        return Optional.of(products);
    }

    public List<productsDTO> productbycatagory(String catagory) {
        List<productModel>products=productrepo.findByCatagory(catagory);
        return products.stream().map(this::getproductbycatagory).toList();
    }

    private productsDTO getproductbycatagory(productModel productModel) {
        productsDTO p=new productsDTO();
        p.setProductName(productModel.getProductName());
        p.setBrandName(productModel.getBrandName());
        p.setNetWeight(productModel.getNetWeight());
        p.setProductPrice(productModel.getProductPrice());
        return p;
    }
}
