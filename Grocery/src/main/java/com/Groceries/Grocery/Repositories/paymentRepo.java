package com.Groceries.Grocery.Repositories;

import com.Groceries.Grocery.Models.paymentsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface paymentRepo extends JpaRepository<paymentsModel,Long> {
}
