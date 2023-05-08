package com.example.EducationLoan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EducationLoan.model.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel, Integer> {

}
