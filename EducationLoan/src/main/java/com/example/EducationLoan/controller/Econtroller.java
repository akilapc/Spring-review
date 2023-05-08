package com.example.EducationLoan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EducationLoan.model.LoanApplicationModel;
import com.example.EducationLoan.model.UserModel;
import com.example.EducationLoan.service.Eservice;

@RestController
public class Econtroller {
	@Autowired
	public Eservice serv;
	
	
	@GetMapping("/user/getall")
	public List<UserModel> getalldet()
	{
		return serv.getalldet();
	}
	
	@PostMapping("/user/post")
	public UserModel postdet(@RequestBody UserModel um)
	{
		return serv.postdet(um);
	}
	
	@DeleteMapping("/user/delete/{id}")
	public String deledet(@PathVariable("id")int id)
	{
		serv.deledet(id);
		return "Deletion was successful";
	}
	
	@PutMapping("/user/update")
	public UserModel putdet(@RequestBody UserModel um)
	{
		return serv.putdet(um);
	}
	@GetMapping("/loan/getall")
	public List<LoanApplicationModel> getalldetloan()
	{
		return serv.getalldetloan();
	}
	
	@PostMapping("/loan/post")
	public LoanApplicationModel postdetloan(@RequestBody LoanApplicationModel um)
	{
		return serv.postdetloan(um);
	}
	
	@DeleteMapping("/loan/delete/{id}")
	public String deledetloan(@PathVariable("id")int id)
	{
		serv.deledetloan(id);
		return "Deletion was successful";
	}
	
	@PutMapping("/loan/update")
	public LoanApplicationModel putdetloan(@RequestBody LoanApplicationModel um)
	{
		return serv.putdetloan(um);
	}
	
	
	

}
