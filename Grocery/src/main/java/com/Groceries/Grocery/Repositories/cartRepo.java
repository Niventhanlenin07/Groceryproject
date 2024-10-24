package com.Groceries.Grocery.Repositories;

import com.Groceries.Grocery.Models.cartModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cartRepo extends JpaRepository<cartModel,Long> {
}
