package com.example.EducationLoan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EducationLoan.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
