package com.example.EducationLoan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EducationLoan.model.LoanApplicationModel;

public interface LoanRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
