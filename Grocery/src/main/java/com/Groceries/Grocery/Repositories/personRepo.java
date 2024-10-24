package com.Groceries.Grocery.Repositories;
import com.Groceries.Grocery.DTOs.personDTO;
import com.Groceries.Grocery.Models.personModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface personRepo extends JpaRepository<personModel,Long> {
    List<personModel> findByRole(String role);
}
