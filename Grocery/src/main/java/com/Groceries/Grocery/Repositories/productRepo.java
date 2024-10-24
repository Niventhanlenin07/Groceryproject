package com.Groceries.Grocery.Repositories;

import com.Groceries.Grocery.Models.productModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productRepo extends JpaRepository<productModel,Long> {
    List<productModel> findByCatagory(String catagory);
}
