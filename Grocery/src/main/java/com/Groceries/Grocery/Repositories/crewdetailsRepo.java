package com.Groceries.Grocery.Repositories;

import com.Groceries.Grocery.Models.crewdetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface crewdetailsRepo extends JpaRepository<crewdetailsModel,Long> {
}
