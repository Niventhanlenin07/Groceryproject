package com.Groceries.Grocery.Repositories;

import com.Groceries.Grocery.Models.ordersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface orderRepo extends JpaRepository<ordersModel,Long> {
}
