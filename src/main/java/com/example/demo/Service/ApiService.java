package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.book;
import com.example.demo.Repositories.bookrepo;


@Service
public class ApiService {
	@Autowired
	bookrepo repository;
		public Optional<book> getbook(int id){
			return repository.findById(id);
		}

		public String updateDetails(book b) {
			repository.save(b);
			return "updated";
		}

		public String deleteDetails(int id) {
			repository.deleteById(id);
			return "Id deleted";
		}

}
