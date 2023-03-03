package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.book;
import com.example.demo.Repositories.bookrepo;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {

	 @Autowired
	  bookrepo serviceRepository;
	@Autowired
	   ApiService service;
	 
	 @GetMapping("/getbooks")
	   List<book> getList(){
		 return serviceRepository.findAll();
	 }
	 @PostMapping("/postbook")
	  public book create(@RequestBody book b) {
		 return serviceRepository.save(b);
	 }
	 
	 @GetMapping("/getbooks/{id}")
	 public Optional<book> getbyid(@PathVariable int id){
		
		return service.getbook(id);
	 }
	 
	 @PutMapping("/book")
	 public String update(@RequestBody book b) {
		 return service.updateDetails(b);
	 }
	 
	 @DeleteMapping("/book")
	 public String delete(@RequestParam int id) {
		 return service.deleteDetails(id);
	 }
}
