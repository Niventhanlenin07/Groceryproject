package com.Groceries.Grocery.Repositories;

import com.Groceries.Grocery.Models.returnsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface returnRepo extends JpaRepository<returnsModel,Long> {
}
