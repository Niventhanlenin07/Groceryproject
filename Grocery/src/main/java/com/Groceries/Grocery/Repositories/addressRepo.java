package com.Groceries.Grocery.Repositories;

import com.Groceries.Grocery.Models.addressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface addressRepo extends JpaRepository<addressModel,Long> {
}
