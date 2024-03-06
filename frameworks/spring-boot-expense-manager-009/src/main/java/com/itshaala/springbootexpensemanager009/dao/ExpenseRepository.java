package com.itshaala.springbootexpensemanager009.dao;

import com.itshaala.springbootexpensemanager009.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
}
