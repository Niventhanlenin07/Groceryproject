package com.Groceries.Grocery.Repositories;

import com.Groceries.Grocery.Models.personModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Set;

@Repository
public interface personRepo extends JpaRepository<personModel,Long> {

    List<personModel> findByRole(String Role);
}
