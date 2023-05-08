package com.example.EducationLoan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EducationLoan.model.LoanApplicationModel;
import com.example.EducationLoan.model.UserModel;
import com.example.EducationLoan.repository.LoanRepo;
import com.example.EducationLoan.repository.UserRepo;

@Service
public class Eservice {
	@Autowired
	public LoanRepo lrep;
	@Autowired
	public UserRepo uRepo;
	public List<UserModel> getalldet() {
		// TODO Auto-generated method stub
		return uRepo.findAll();
	}
	public UserModel postdet(UserModel um) {
		// TODO Auto-generated method stub
		return uRepo.save(um);
	}
	public void deledet(int id) {
		// TODO Auto-generated method stub
	  uRepo.deleteById(id);
	}
	public UserModel putdet(UserModel um) {
		// TODO Auto-generated method stub
		return uRepo.saveAndFlush(um);
	}
	public List<LoanApplicationModel> getalldetloan() {
		// TODO Auto-generated method stub
		return lrep.findAll();
	}
	public LoanApplicationModel postdetloan(LoanApplicationModel um) {
		// TODO Auto-generated method stub
		return lrep.save(um);
	}
	public void deledetloan(int id) {
		// TODO Auto-generated method stub
		lrep.deleteById(id);
		
	}
	public LoanApplicationModel putdetloan(LoanApplicationModel um) {
		// TODO Auto-generated method stub
		return lrep.saveAndFlush(um);
	}
	

}
