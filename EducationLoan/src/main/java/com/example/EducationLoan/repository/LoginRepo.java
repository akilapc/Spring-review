package com.example.EducationLoan.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EducationLoan.model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, Integer> {

}
